//Contains all methods and schema for database

package cas757.hearttrack;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.Cursor;
import android.content.Context;
import android.content.ContentValues;


//defing the database schema
public class MyDBHandler extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION =1; //every time you modify database, increase version number
    private static final String DATABASE_NAME = "patients.db";
    public static final String TABLE_PATIENTS = "patients";
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_FIRSTNAME = "firstName";
    public static final String COLUMN_LASTNAME = "lastName";
    public static final String COLUMN_SEX = "sex";
    public static final String COLUMN_EMAIL = "email";
    public static final String COLUMN_PHONENUMBER = "phoneNumber";
    public static final String COLUMN_CHRONICCONDITION = "chronicCondition";
    public static final String COLUMN_ALLERGIES = "allergies";
    public static final String COLUMN_MEDICATION = "medication";
    public static final String COLUMN_RELATIVEFIRSTNAME = "firstName";
    public static final String COLUMN_RELATIVELASTNAME = "lastName";
    public static final String COLUMN_RELATIVEEMAIL = "example@example.com";
    public static final String COLUMN_RELATIVEPHONENUMBER = "phoneNumber";
    public static final String COLUMN_PHYSICIANFIRSTNAME = "firstName";
    public static final String COLUMN_PHYSICIANLASTNAME = "lastName";
    public static final String COLUMN_PHYSICIANEMAIL = "email";
    public static final String COLUMN_PHYSICIANPHONENUMBER = "phoneNumber";

    //constructor for database handler
    public MyDBHandler(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
    }


    //Creates a blank table on creation
    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE " + TABLE_PATIENTS + "(" +
                COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT ," +
                COLUMN_FIRSTNAME + " TEXT " +
                COLUMN_LASTNAME + " TEXT " +
                COLUMN_SEX + " INT " +
                COLUMN_EMAIL + " TEXT " +
                COLUMN_PHONENUMBER + " INT " +
                COLUMN_CHRONICCONDITION + " STRING " +
                COLUMN_ALLERGIES+ " TEXT " +
                COLUMN_MEDICATION + " TEXT " +
                COLUMN_RELATIVEFIRSTNAME + " TEXT " +
                COLUMN_RELATIVELASTNAME + " TEXT " +
                COLUMN_RELATIVEEMAIL + " TEXT " +
                COLUMN_RELATIVEPHONENUMBER + " INT " +
                COLUMN_PHYSICIANFIRSTNAME + " TEXT " +
                COLUMN_PHYSICIANLASTNAME + " TEXT " +
                COLUMN_PHYSICIANEMAIL + " TEXT " +
                COLUMN_PHYSICIANPHONENUMBER + " INT " +
                ");";
        db.execSQL(query);
    }
    //method for when database schema is updated. Version number needs to be incremented every time an update occurs if keeping past information.
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS" + TABLE_PATIENTS);
        onCreate(db);
    }

    //Add a new row to database. Takes an instance of patient class and puts attributes from that object into database.
    public void addPatient(Patient patient){
        ContentValues values = new ContentValues(); //holds values to put into database
        values.put(COLUMN_FIRSTNAME, patient.getFirstName()); //putting information into the content object
        values.put(COLUMN_LASTNAME, patient.getLastName());
        values.put(COLUMN_SEX, patient.getSex());
        values.put(COLUMN_EMAIL, patient.getEmail());
        values.put(COLUMN_PHONENUMBER, patient.getPhoneNumber());
        values.put(COLUMN_CHRONICCONDITION, patient.getChronicCondition());
        values.put(COLUMN_ALLERGIES, patient.getAllergies());
        values.put(COLUMN_MEDICATION, patient.getMedication());
        values.put(COLUMN_RELATIVEFIRSTNAME, patient.getRelativeFirstName());
        values.put(COLUMN_RELATIVELASTNAME, patient.getRelativeLastName());
        values.put(COLUMN_RELATIVEEMAIL, patient.getRelativeEmail());
        values.put(COLUMN_RELATIVEPHONENUMBER, patient.getRelativePhoneNumber());
        values.put(COLUMN_PHYSICIANFIRSTNAME, patient.getPhysicianFirstName());
        values.put(COLUMN_PHYSICIANLASTNAME, patient.getPhysicianLastName());
        values.put(COLUMN_PHYSICIANEMAIL, patient.getPhysicianEmail());
        values.put(COLUMN_PHYSICIANPHONENUMBER, patient.getPhysicianPhoneNumber());
        SQLiteDatabase db = getWritableDatabase();
        db.insert(TABLE_PATIENTS, null, values);
        db.close();
    }

    //delete a patient from the database
    public void deletePatient(String patient){
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("DELETE FROM " + TABLE_PATIENTS + " WHERE " + COLUMN_FIRSTNAME + "=\"" + patient + "\";" );

    }

    //print out the database as a string
    //currently only prints name
    public String databaseToString(){
        String dbString= "";
        SQLiteDatabase db = getWritableDatabase();
        String query = "SELECT * FROM " + TABLE_PATIENTS + " WHERE 1";

        //Cursor point to a location in your results
        Cursor recordSet = db.rawQuery(query, null);
        recordSet.moveToFirst(); //puts the cursor at the first position

        while(!recordSet.isAfterLast()){ //add names to a list until reaches the end of the database
            if(recordSet.getString(recordSet.getColumnIndex("name")) != null){ ///may be an error on this line
                dbString += recordSet.getString(recordSet.getColumnIndex("name"));
                dbString += "\n";
            }
            recordSet.moveToNext();
        }
        db.close();
        return dbString;
    }
}
