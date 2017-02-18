package cas757.hearttrack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class PatientInfo extends AppCompatActivity {

    EditText nameEditText;
    TextView patients;
    MyDBHandler dbHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_info);
        nameEditText = (EditText) findViewById(R.id.nameEditText);
        patients = (TextView) findViewById(R.id.patients);
        dbHandler = new MyDBHandler(this, null, null, 1);
        printDatabase();
    }

    //Add a patient to the database
    public void addButtonClicked(View view){
        Patient patient = new Patient(nameEditText.getText().toString());
        dbHandler.addPatient(patient);
        printDatabase();
    }

    //Delete a patient from the database
    public void deleteButtonClicked(View view){
        String inputText = nameEditText.getText().toString();
        dbHandler.deletePatient(inputText);
        printDatabase();
    }

    public void printDatabase(){
        String dbString = dbHandler.databaseToString();
        patients.setText(dbString);
        nameEditText.setText("");
    }
}
