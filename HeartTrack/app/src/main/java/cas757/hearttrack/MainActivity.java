package cas757.hearttrack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button patientInfoButton = (Button) findViewById(R.id.patientInfoButton); ///Not needed

    }

    public void redirectToPatientInfo(View view){
        Intent  patientInfoIntent = new Intent(this,EditPatientInfo.class);
        startActivity(patientInfoIntent);
    }
}
