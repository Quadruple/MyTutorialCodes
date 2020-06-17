package app.syntaxation.loginpageprototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    DatabaseHelper myDatabase ;

    TextView IDText ;
    TextView PasswordText ;

    EditText IDEditText ;
    EditText PasswordEditText ;

    Button SignUpButton ;
    Button LogInButton ;

    String IDBarText ;
    String PasswordBarText ;
    String LogInResult ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myDatabase = new DatabaseHelper(this , null , null , 1) ;

        IDText = (TextView) findViewById(R.id.IDText) ;
        PasswordText = (TextView) findViewById(R.id.PasswordText) ;

        IDEditText = (EditText) findViewById(R.id.IDEditText) ;
        PasswordEditText = (EditText) findViewById(R.id.PasswordEditText) ;

        SignUpButton = (Button) findViewById(R.id.SignUpButton) ;
        LogInButton = (Button) findViewById(R.id.LogInButton) ;
    }

    public void SignUpButtonClicked(View view) {
        Intent i = new Intent(this , SignUpPageActivity.class) ;
        startActivity(i) ;
    }

    public void LogInButtonClicked(View view) {
        // Getting the texts as a string from user's type
        IDBarText = IDEditText.getText().toString() ;
        PasswordBarText = PasswordEditText.getText().toString() ;

        // Getting the password from database and storing
        LogInResult = myDatabase.matchPassword(IDBarText) ;

        // Checking the match for ID and Pass from database
        if (LogInResult.equals(PasswordBarText)) {
            Toast.makeText(MainActivity.this , "Log In process is succesful." , Toast.LENGTH_LONG).show() ;
        }
        else {
            Toast.makeText(MainActivity.this , "Your password is wrong. Sorry, try again." , Toast.LENGTH_LONG).show() ;
        }
    }
}
