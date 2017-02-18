package cas757.hearttrack;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.Cursor;
import android.content.Context;
import android.content.ContentValues;



public class MyDBHandler extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION =1; //every time you modify database, increase version number
    private static final String DATABASE_NAME = "patients.db";
    public static final String TABLE_PATIENTS = "patients";
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_NAME = "_name";

    public MyDBHandler(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
    }



    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE " + TABLE_PATIENTS + "(" +
                COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_NAME + " TEXT " +
                ");";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS" + TABLE_PATIENTS);
        onCreate(db);
    }

    //Add a new row to database
    public void addUser(Patient patient){
        ContentValues values = new ContentValues();
        values.put(COLUMN_NAME, patient.getName());
        SQLiteDatabase db = getWritableDatabase();
        db.insert(TABLE_PATIENTS, null, values);
        db.close();
    }

    //delete a patient from the database

    public void deletePatient(String patient){
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("DELETE FROM " + TABLE_PATIENTS + "WHERE " + COLUMN_NAME + "=\"" + patient + "\";" );
    }

    //print out the database as a string
    public String databaseToString(){
        String dbString= "";
        SQLiteDatabase db = getWritableDatabase();
        String query = "SELECT * FROM " + TABLE_PATIENTS + " Where 1";

        //Cursor point to a location in your results
        Cursor c = db.rawQuery(query, null);
        c.moveToFirst();

        while(!c.isAfterLast()){
            if(c.getString(c.getColumnIndex("patient")) != null){ ///may be an error on this line
                dbString += c.getString(c.getColumnIndex("patient"));
                dbString += "\n";
            }
        }
        db.close();
        return dbString;
    }
}
