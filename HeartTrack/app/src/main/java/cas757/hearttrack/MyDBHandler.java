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
    public static final String COLUMN_FIRSTNAME = "firstname";
    public static final String COLUMN_LASTNAME = "lastname";
    public static final String COLUMN_SEX = "sex";
    public static final String COLUMN_EMAIL = "email";
    public static final String COLUMN_PHONENUMBER = "phonenumber";
    public static final String COLUMN_CHRONICCONDITION = "chroniccondition";
    public static final String COLUMN_ALLERGIES = "allergies";
    public static final String COLUMN_MEDICATION = "medication";
    public static final String COLUMN_VITAMINS = "vitamins";
    public static final String COLUMN_SUPPLEMENTS = "supplementss";
    public static final String COLUMN_PERSONALFIRSTNAME = "personalfirstname";
    public static final String COLUMN_PERSONALLASTNAME = "personallastname";
    public static final String COLUMN_PERSONALEMAIL = "personalemail";
    public static final String COLUMN_PERSONALPHONENUMBER = "personalphoneNumber";
    public static final String COLUMN_PHYSICIANFIRSTNAME = "physicianfirstname";
    public static final String COLUMN_PHYSICIANLASTNAME = "physicianlastName";
    public static final String COLUMN_PHYSICIANEMAIL = "physicianemail";
    public static final String COLUMN_PHYSICIANPHONENUMBER = "physicianphoneNumber";

    //constructor for database handler
    public MyDBHandler(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
    }


    //Creates a blank table on creation
    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE " + TABLE_PATIENTS + "(" +
                COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                COLUMN_FIRSTNAME + " TEXT," +
                COLUMN_LASTNAME + " TEXT," +
                COLUMN_SEX + " INT," +
                COLUMN_EMAIL + " TEXT," +
                COLUMN_PHONENUMBER + " INT," +
                COLUMN_CHRONICCONDITION + " TEXT," +
                COLUMN_ALLERGIES+ " TEXT," +
                COLUMN_MEDICATION + " TEXT," +
                COLUMN_VITAMINS + " TEXT," +
                COLUMN_SUPPLEMENTS + " TEXT," +
                COLUMN_PERSONALFIRSTNAME + " TEXT," +
                COLUMN_PERSONALLASTNAME + " TEXT," +
                COLUMN_PERSONALEMAIL + " TEXT," +
                COLUMN_PERSONALPHONENUMBER + " INT," +
                COLUMN_PHYSICIANFIRSTNAME + " TEXT," +
                COLUMN_PHYSICIANLASTNAME + " TEXT," +
                COLUMN_PHYSICIANEMAIL + " TEXT," +
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
        values.put(COLUMN_FIRSTNAME, patient.get_firstName()); //putting information into the content object
        values.put(COLUMN_LASTNAME, patient.get_lastName());
        values.put(COLUMN_SEX, patient.get_sex());
        values.put(COLUMN_EMAIL, patient.get_email());
        values.put(COLUMN_PHONENUMBER, patient.get_phoneNumber());
        values.put(COLUMN_CHRONICCONDITION, patient.get_chronicCondition());
        values.put(COLUMN_ALLERGIES, patient.get_allergies());
        values.put(COLUMN_MEDICATION, patient.get_medication());
        values.put(COLUMN_VITAMINS, patient.get_vitamins());
        values.put(COLUMN_SUPPLEMENTS, patient.get_Supplements());
        values.put(COLUMN_PERSONALFIRSTNAME, patient.get_relativeFirstName());
        values.put(COLUMN_PERSONALLASTNAME, patient.get_relativeLastName());
        values.put(COLUMN_PERSONALEMAIL, patient.get_relativeEmail());
        values.put(COLUMN_PERSONALPHONENUMBER, patient.get_relativePhoneNumber());
        values.put(COLUMN_PHYSICIANFIRSTNAME, patient.get_physicianFirstName());
        values.put(COLUMN_PHYSICIANLASTNAME, patient.get_physicianLastName());
        values.put(COLUMN_PHYSICIANEMAIL, patient.get_physicianEmail());
        values.put(COLUMN_PHYSICIANPHONENUMBER, patient.get_phoneNumber());

        SQLiteDatabase db = getWritableDatabase();
        db.delete(TABLE_PATIENTS, null, null); //clears table before adding a new patient to ensure only one person at a time.
        db.insert(TABLE_PATIENTS, null, values);
        db.close();
    }

    //delete a patient from the database
    public void deletePatient(String patient){
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("DELETE FROM " + TABLE_PATIENTS + " WHERE " + COLUMN_FIRSTNAME + "=\"" + patient + "\";" );

    }

    //print out inputted column from the database as a string
    public String databaseToString(String column){  //takes in column name of the column you want returned from the database.
        String dbString= "";
        SQLiteDatabase db = getWritableDatabase();
        String query = "SELECT "+ column + " FROM " + TABLE_PATIENTS + ";"  ;

        //Cursor point to a location in your results
        Cursor recordSet = db.rawQuery(query, null);
        recordSet.moveToFirst(); //puts the cursor at the first position
        if(recordSet.getString(recordSet.getColumnIndex(column)) != null){ ///returns an empty string if the database is empty.
            dbString = recordSet.getString(recordSet.getColumnIndex(column));
        }
/**
        while(!recordSet.isAfterLast()){ //add names to a list until reaches the end of the database
            if(recordSet.getString(recordSet.getColumnIndex("firstname")) != null){ ///may be an error on this line
                dbString += recordSet.getString(recordSet.getColumnIndex("name"));
                dbString += "\n";
            }
            recordSet.moveToNext();
        }
 **/
        db.close();
        return dbString;
    }
}
