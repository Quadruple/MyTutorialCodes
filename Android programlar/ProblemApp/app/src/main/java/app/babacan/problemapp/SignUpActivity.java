package app.babacan.problemapp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button ;
import android.widget.EditText ;
import android.widget.TextView ;
import android.widget.CheckBox ;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {

    // Putting identifiers for widgets
    TextView signUpEmailText ;
    TextView signUpEmailCheckText ;
    TextView signUpPasswordInputText ;
    TextView signUpPasswordCheckInputText ;
    TextView webServiceResult ;
    EditText signUpEmailInput ;
    EditText signUpEmailCheckInput ;
    EditText signUpPasswordInput ;
    EditText signUpPasswordCheckInput ;
    CheckBox signUpShowPasswordCheckBox ;
    Button signUpSignUpButton ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        // Referencing widgets
        signUpEmailText = (TextView) findViewById(R.id.signUpEmailText) ;
        signUpEmailCheckText = (TextView) findViewById(R.id.signUpEmailCheckText) ;
        signUpPasswordInputText = (TextView) findViewById(R.id.signUpPasswordInputText) ;
        signUpPasswordCheckInputText = (TextView) findViewById(R.id.signUpPasswordCheckInputText) ;
        webServiceResult = (TextView) findViewById(R.id.webServiceResult) ;
        webServiceResult.setText("Bu email zaten kayıtlı.");
        signUpEmailInput = (EditText) findViewById(R.id.signUpEmailInput) ;
        signUpEmailCheckInput = (EditText) findViewById(R.id.signUpEmailCheckInput) ;
        signUpPasswordInput = (EditText) findViewById(R.id.signUpPasswordInput) ;
        signUpPasswordCheckInput = (EditText) findViewById(R.id.signUpPasswordCheckInput) ;
        signUpShowPasswordCheckBox = (CheckBox) findViewById(R.id.signUpShowPasswordCheckBox) ;
        signUpSignUpButton = (Button) findViewById(R.id.signUpSignUpButton) ;

        // Using CheckBox to show passwords
        signUpShowPasswordCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Determining a boolean variable to know if checked or not checked
                boolean ifChecked = ((CheckBox) view).isChecked() ;
                // Determine switch cases to control checkboxes one by one (since we only have one check box we dont need multiple cases)
                switch (view.getId()){

                    case R.id.signUpShowPasswordCheckBox :
                        if (ifChecked == false) {

                            // Showing the text inside
                            signUpPasswordInput.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            signUpPasswordCheckInput.setTransformationMethod(PasswordTransformationMethod.getInstance());

                        }else {

                            // Hiding the text inside to the default password edittext status
                            signUpPasswordInput.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                            signUpPasswordCheckInput.setTransformationMethod(HideReturnsTransformationMethod.getInstance());

                        }

                }

            }
        });

        // Applying needed tests
        signUpSignUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (TextUtils.isEmpty(signUpEmailInput.getText().toString()) == false) {


                    if (TextUtils.isEmpty(signUpEmailCheckInput.getText().toString()) == false) {


                        if (TextUtils.isEmpty(signUpPasswordInput.getText().toString()) == false) {


                            if (TextUtils.isEmpty(signUpPasswordCheckInput.getText().toString()) == false) {


                                if (signUpEmailInput.getText().toString().equals(signUpEmailCheckInput.getText().toString())) {


                                    if (signUpPasswordInput.getText().toString().equals(signUpPasswordCheckInput.getText().toString())) {


                                        if(isEmailValid(signUpEmailInput.getText().toString())) {

                                            // TODO: Remember checking if an input is really email.
                                            ConnectionToWebServiceTask2 myTask2 = new ConnectionToWebServiceTask2(SignUpActivity.this , signUpEmailInput , webServiceResult) ;
                                            myTask2.execute() ;

                                            // Waiting until the text view changes and than adding or not adding to database
                                            // TODO: Dont forget to make the textView invisible or gone.
                                            final Handler handler = new Handler();
                                            handler.postDelayed(new Runnable() {
                                                @Override
                                                public void run() {

                                                    if (webServiceResult.getText().toString().equals("Email önceden kayıtlı degil.")) {

                                                        ConnectionToWebServiceTask myTask = new ConnectionToWebServiceTask(SignUpActivity.this , signUpEmailInput , signUpPasswordInput) ;
                                                        myTask.execute() ;
                                                        Toast.makeText(SignUpActivity.this , "Başarıyla kayıt oldunuz. Sizi dinliyoruz." , Toast.LENGTH_LONG).show();

                                                    }else if (webServiceResult.getText().toString().equals("Bu email zaten kayıtlı.")) {

                                                        Toast.makeText(SignUpActivity.this , "Bu e-mail zaten kayıtlı. Lütfen yeni bir email ile giriş yapın." , Toast.LENGTH_LONG).show();

                                                    }

                                                }
                                            }, 1000);

                                        }else {

                                            Toast.makeText(SignUpActivity.this , "Lütfen geçerli bir e-mail girin." , Toast.LENGTH_LONG).show() ;

                                        }

                                    }else {

                                        Toast.makeText(SignUpActivity.this , "Şifreleriniz uyuşmuyor." , Toast.LENGTH_LONG).show() ;

                                    }

                                }else {

                                    Toast.makeText(SignUpActivity.this , "E-mailleriniz uyuşmuyor." , Toast.LENGTH_LONG).show() ;

                                }

                            }else {

                                Toast.makeText(SignUpActivity.this , "Lütfen şifrenizi onaylayın." , Toast.LENGTH_LONG).show() ;

                            }

                        }else {

                            Toast.makeText(SignUpActivity.this , "Lütfen şifrenizi girin." , Toast.LENGTH_LONG).show() ;

                        }

                    }else {

                        Toast.makeText(SignUpActivity.this , "E-malinizi onaylayın." , Toast.LENGTH_LONG).show() ;

                    }

                }else {

                    Toast.makeText(SignUpActivity.this , "Lütfen e-mailinizi girin." , Toast.LENGTH_LONG).show() ;

                }



            }
        });
    }

    boolean isEmailValid(CharSequence email) {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }

}