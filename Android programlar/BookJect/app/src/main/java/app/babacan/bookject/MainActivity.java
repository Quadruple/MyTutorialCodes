package app.babacan.bookject;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Creating variables
    TextView emailText ;
    TextView passwordText ;
    TextView bookjectText ;
    TextView sloganText ;
    TextView mainActivityWebServiceResult ;

    EditText emailInput ;
    EditText passwordInput ;

    Button signUpButton ;
    Button logInButton ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Referencing variables
        emailText = (TextView) findViewById(R.id.emailText) ;
        passwordText = (TextView) findViewById(R.id.passwordText) ;
        bookjectText = (TextView) findViewById(R.id.bookjectText) ;
        sloganText = (TextView) findViewById(R.id.sloganText) ;
        mainActivityWebServiceResult = (TextView) findViewById(R.id.mainActivityWebServiceResult) ;

        emailInput = (EditText) findViewById(R.id.emailInput) ;
        passwordInput = (EditText) findViewById(R.id.passwordInput) ;
        // TODO : Make the password editText input secret

        signUpButton = (Button) findViewById(R.id.signUpButton) ;
        logInButton = (Button) findViewById(R.id.logInButton) ;

        // Setting up on click listeners
        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Sending user to signUp page
                Intent intent = new Intent(MainActivity.this , SignUpActivity.class) ;
                startActivity(intent) ;

            }
        });

        logInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Check if the password and email matches from the database
                MainActivityWebServiceMatchPassword passwordTask = new MainActivityWebServiceMatchPassword(MainActivity.this , emailInput , mainActivityWebServiceResult) ;
                passwordTask.execute() ;

                final Handler handler = new Handler() ;
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        if(passwordInput.getText().toString().equals(mainActivityWebServiceResult.getText().toString())) {

                            // TODO : Send user to the search page
                            Toast.makeText(MainActivity.this , "Hadi tartışmaları alevlendir." , Toast.LENGTH_LONG).show() ;

                        }else if(mainActivityWebServiceResult.getText().toString().equals("E-mail bulunamadı.")) {

                            Toast.makeText(MainActivity.this , "Girdiğiniz e-mail kayıtlı değil. Lütfen kontrol ediniz veya üye olunuz." , Toast.LENGTH_LONG).show() ;

                        }else{

                            Toast.makeText(MainActivity.this , "Kullanıcı adı veya şifreniz yanlış. Lütfen tekrar deneyin." , Toast.LENGTH_LONG).show() ;

                        }

                    }
                } , 500) ;

            }
        });
    }
}
