package app.babacan.problemapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.ShareCompat;
import android.support.v4.content.IntentCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button ;
import android.widget.TextView ;
import android.widget.EditText ;

public class MainActivity extends AppCompatActivity {

    // Determining widget variables
    TextView introductionIDText ;
    TextView introductionPasswordText ;
    TextView introductionSlogan ;
    EditText introductionIDInput ;
    EditText introductionPasswordInput ;
    Button introductionSignUpButton ;
    Button introductionLogInButton ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Referencing widgets to use them
        introductionIDText = (TextView) findViewById(R.id.introductionIDText) ;
        introductionPasswordText = (TextView) findViewById(R.id.introductionPasswordText) ;
        introductionSlogan = (TextView) findViewById(R.id.introductionSlogan) ;
        introductionIDInput = (EditText) findViewById(R.id.introductionIDInput) ;
        introductionPasswordInput = (EditText) findViewById(R.id.introductionPasswordInput) ;
        introductionSignUpButton = (Button) findViewById(R.id.introductionSignUpButton) ;
        introductionLogInButton = (Button) findViewById(R.id.introductionLogInButton) ;

        // Setting up onclicklisteners
        introductionLogInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // TODO: Before u get to the app main page check the user credentials from database
                // This is how you call a swipe tabs activity from another activity in intent
                Intent i = new Intent(getApplicationContext() , FixMenuActivity.class);
                startActivity(i) ;
            }
        });

        introductionSignUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , SignUpActivity.class) ;
                startActivity(intent);
            }
        });

    }
}
