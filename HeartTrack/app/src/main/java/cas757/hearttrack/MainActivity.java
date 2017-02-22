//Currently starting page of the application.

package cas757.hearttrack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;



public class MainActivity extends AppCompatActivity {

    //method thats called at the start of the activity
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Button patientInfoButton = (Button) findViewById(R.id.patientInfoButton); ///Not needed, creates a reference to the button in the java code

    }

    //method to changes pages - changes to the edit patient information page
    public void redirectToPatientInfo(View view){
        Intent  patientInfoIntent = new Intent(this,EditPatientInfo.class);
        startActivity(patientInfoIntent);
    }


}
