package cas757.hearttrack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class EditPatientInfo extends AppCompatActivity {

    EditText firstName;
    EditText lastName;
    EditText sex;
    EditText email;
    EditText phoneNumber;
    EditText chronicCondition;
    EditText allergies;
    EditText medication;
    EditText vitamins;
    EditText supplements;
    EditText personalFirstName;
    EditText personalLastName;
    EditText personalEmail;
    EditText personalPhoneNumber;
    EditText physicianFirstName;
    EditText physicianLastName;
    EditText physicianEmail;
    EditText physicianPhoneNumber;

    MyDBHandler dbHandler;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_patient_info);

        firstName =  (EditText) findViewById(R.id.firstNameEditText);
        lastName =  (EditText) findViewById(R.id.lastNameEditText);
        sex =  (EditText) findViewById(R.id.sexEditText);
        email =  (EditText) findViewById(R.id.emailEditText);
        phoneNumber =  (EditText) findViewById(R.id.PhoneNumberEditText); //corrects to capital P when setting id for some reason
        chronicCondition =  (EditText) findViewById(R.id.chronicConditionsEditText);
        allergies =  (EditText) findViewById(R.id.allergiesEditText);
        medication =  (EditText) findViewById(R.id.medicationEditText);
        vitamins =  (EditText) findViewById(R.id.vitaminsEditText);
        supplements =  (EditText) findViewById(R.id.supplementsEditText);
        personalFirstName =  (EditText) findViewById(R.id.personalFirstNameEditText);
        personalLastName =  (EditText) findViewById(R.id.personalLastNameEditText);
        personalEmail =  (EditText) findViewById(R.id.personalEmailEditText);
        personalPhoneNumber =  (EditText) findViewById(R.id.personalPhoneNumberEditText);
        physicianFirstName =  (EditText) findViewById(R.id.physicianFirstNameEditText);
        physicianLastName =  (EditText) findViewById(R.id.physicianLastNameEditText);
        physicianEmail =  (EditText) findViewById(R.id.physicianEmailEditText);
        physicianPhoneNumber=  (EditText) findViewById(R.id.physicianPhoneNumberEditText);

        dbHandler = new MyDBHandler(this, null, null, 1);
    }

    public void submitButtonClicked(View view){
        Patient patient = new Patient(
                firstName.getText().toString(),
                lastName.getText().toString(),
                Integer.parseInt(sex.getText().toString()),
                email.getText().toString(),
                Integer.parseInt(phoneNumber.getText().toString()),
                chronicCondition.getText().toString(),
                allergies.getText().toString(),
                medication.getText().toString(),
                vitamins.getText().toString(),
                supplements.getText().toString(),
                personalFirstName.getText().toString(),
                personalLastName.getText().toString(),
                personalEmail.getText( ).toString(),
                Integer.parseInt(personalPhoneNumber.getText().toString()),
                physicianFirstName.getText().toString(),
                physicianLastName.getText().toString(),
                physicianEmail.getText().toString(),
                Integer.parseInt(physicianPhoneNumber.getText().toString())
        );
        dbHandler.addPatient(patient);
    }
}
