package app.syntaxation.loginpageprototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;



public class SignUpPageActivity extends AppCompatActivity {

    DatabaseHelper myDatabase ;

    TextView SignUpIDText ;
    TextView SignUpPasswordText ;
    TextView SignUpPasswordConfirmText ;

    EditText SignUpIDEditText ;
    EditText SignUpPasswordEditText ;
    EditText SignUpPasswordConfirmEditText ;

    Button SignUpSignUpButton ;

    String SignUpUserID ;
    String SignUpUserPassword ;
    String SignUpUserPasswordConfirm ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_page);

        myDatabase = new DatabaseHelper(this , null , null , 1) ;

        SignUpIDText = (TextView) findViewById(R.id.SignUpIDText) ;
        SignUpPasswordText = (TextView) findViewById(R.id.SignUpPasswordText) ;
        SignUpPasswordConfirmText = (TextView) findViewById(R.id.SignUpPasswordConfirmText) ;

        SignUpIDEditText = (EditText) findViewById(R.id.SignUpIDEditText) ;
        SignUpPasswordEditText = (EditText) findViewById(R.id.SignUpPasswordEditText) ;
        SignUpPasswordConfirmEditText = (EditText) findViewById(R.id.SignUpPasswordConfirmEditText) ;

        SignUpSignUpButton = (Button) findViewById(R.id.SignUpSignUpButton) ;
    }

    public void SignUpSignUpButtonClicked (View view) {

        SignUpUserID = SignUpIDEditText.getText().toString() ;
        SignUpUserPassword = SignUpPasswordEditText.getText().toString() ;
        SignUpUserPasswordConfirm = SignUpPasswordConfirmEditText.getText().toString() ;

        if (SignUpUserPassword.equals(SignUpUserPasswordConfirm)) {
            try {
                myDatabase.InsertIDandPassword(SignUpUserID , SignUpUserPassword);
                Toast.makeText(SignUpPageActivity.this , "Sign Up session completed. Please Log In now." , Toast.LENGTH_LONG).show() ;
                Intent i = new Intent(this , MainActivity.class) ;
                startActivity(i) ;
            }catch (Exception e) {
                Toast.makeText(SignUpPageActivity.this , "Some problem occured. Please try again" , Toast.LENGTH_LONG).show() ;
            }
        }
        else{
            Toast.makeText(SignUpPageActivity.this , "Your passwords does not match." , Toast.LENGTH_LONG).show() ;
            SignUpPasswordEditText.setText(null);
            SignUpPasswordConfirmEditText.setText(null) ;
        }
    }
}
