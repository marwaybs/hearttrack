package cas757.hearttrack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class PatientInformationProfile extends AppCompatActivity {

    MyDBHandler dbHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_information_profile);
        dbHandler = new MyDBHandler(this, null, null, 1);

        TextView name = (TextView) findViewById(R.id.PIPName);
        name.setText(dbHandler.databaseToString("firstname"));
    }
}


///HOW TO PASS PATIENT NAME INTO THIS ACTIVITY?