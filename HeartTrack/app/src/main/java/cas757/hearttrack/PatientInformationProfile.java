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
        TextView email = (TextView) findViewById(R.id.PIPEmail);
        TextView birthday = (TextView) findViewById(R.id.PIPBirthday);
        TextView sex = (TextView) findViewById(R.id.PIPSex);




        name.setText(dbHandler.databaseToString("firstname"));
        email.setText(dbHandler.databaseToString("email"));
        sex.setText(dbHandler.databaseToString(("sex")));
    }
}
