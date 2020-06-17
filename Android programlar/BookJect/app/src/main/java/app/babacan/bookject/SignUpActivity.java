package app.babacan.bookject;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {

    // Creating variables
    TextView signUpEmailText ;
    TextView signUpEmailCheckText ;
    TextView signUpPasswordText ;
    TextView signUpPasswordCheckText ;
    TextView signUpUsernameText ;
    TextView isEmailRegisteredWebServiceResult ;
    TextView isUsernameRegisteredWebServiceResult ;

    EditText signUpEmailInput ;
    EditText signUpEmailCheckInput ;
    EditText signUpPasswordInput ;
    EditText signUpPasswordCheckInput ;
    EditText signUpUsernameInput ;

    CheckBox signUpShowPasswordCheckBox ;

    Button signUpSignUpButton ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        // Referencing variables
        signUpEmailText = (TextView) findViewById(R.id.signUpEmailText) ;
        signUpEmailCheckText = (TextView) findViewById(R.id.signUpEmailCheckText) ;
        signUpPasswordText = (TextView) findViewById(R.id.signUpPasswordText) ;
        signUpPasswordCheckText = (TextView) findViewById(R.id.signUpPasswordCheckText) ;
        signUpUsernameText = (TextView) findViewById(R.id.signUpUsernameText) ;
        isEmailRegisteredWebServiceResult = (TextView) findViewById(R.id.isEmailRegisteredWebServiceResult) ;
        isEmailRegisteredWebServiceResult.setText("Bu e-mail zaten üye.");
        isUsernameRegisteredWebServiceResult = (TextView) findViewById(R.id.isUsernameRegisteredWebServiceResult) ;
        isUsernameRegisteredWebServiceResult.setText("Bu kullanıcı adı zaten mevcut zaten kayıtlı.");

        signUpEmailInput = (EditText) findViewById(R.id.signUpEmailInput) ;
        signUpEmailCheckInput = (EditText) findViewById(R.id.signUpEmailCheckInput) ;
        signUpPasswordInput = (EditText) findViewById(R.id.signUpPasswordInput) ;
        signUpPasswordCheckInput = (EditText) findViewById(R.id.signUpPasswordCheckInput) ;
        signUpUsernameInput = (EditText) findViewById(R.id.signUpUsernameInput) ;

        signUpShowPasswordCheckBox = (CheckBox) findViewById(R.id.signUpShowPasswordCheckBox) ;

        signUpSignUpButton = (Button) findViewById(R.id.signUpSignUpButton) ;

        // Setting up the on click listeners
        signUpSignUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // check if any edittext is empty
                // check if the email input is in correct format
                // check if the emails and password entered are matching
                // check if any space is included in the username
                // check if an email or username is already registered to the database
                // if all are OK add the email, password and username to database
                if (TextUtils.isEmpty(signUpEmailInput.getText().toString()) == false) {

                    if (TextUtils.isEmpty(signUpEmailCheckInput.getText().toString()) == false) {

                        if (TextUtils.isEmpty(signUpPasswordInput.getText().toString()) == false) {

                            if (TextUtils.isEmpty(signUpPasswordCheckInput.getText().toString()) == false) {

                                if (TextUtils.isEmpty(signUpUsernameInput.getText().toString()) == false) {

                                    if (isEmailValid(signUpEmailInput.getText().toString())) {

                                        if (signUpEmailInput.getText().toString().equals(signUpEmailCheckInput.getText().toString())) {

                                            if (signUpPasswordInput.getText().toString().equals(signUpPasswordCheckInput.getText().toString())) {

                                                if (isSpaceInUsername(signUpUsernameInput.getText().toString())) {

                                                    SignUpActivityWebServiceIsEmailRegistered checkTask = new SignUpActivityWebServiceIsEmailRegistered(SignUpActivity.this , signUpEmailInput , isEmailRegisteredWebServiceResult) ;
                                                    checkTask.execute() ;

                                                    // Waiting until the text view changes and than adding or not adding to database
                                                    final Handler handler = new Handler();
                                                    handler.postDelayed(new Runnable() {
                                                        @Override
                                                        public void run() {

                                                            // TODO : Handle the string when there is no connection
                                                            if (isEmailRegisteredWebServiceResult.getText().toString().equals("E-mailiniz üye olabilir.")) {

                                                                SignUpActivityWebServiceIsUsernameRegistered checkTask2 = new SignUpActivityWebServiceIsUsernameRegistered(SignUpActivity.this , signUpUsernameInput , isUsernameRegisteredWebServiceResult) ;
                                                                checkTask2.execute() ;

                                                                final Handler handler = new Handler() ;
                                                                handler.postDelayed(new Runnable() {
                                                                    @Override
                                                                    public void run() {

                                                                        if (isUsernameRegisteredWebServiceResult.getText().toString().equals("Kullanıcı adı kullanılabilir.")) {

                                                                            SignUpActivityWebServiceRegisterUser registerUser = new SignUpActivityWebServiceRegisterUser(SignUpActivity.this , signUpEmailInput , signUpPasswordInput , signUpUsernameInput) ;
                                                                            registerUser.execute() ;
                                                                            Toast.makeText(SignUpActivity.this , "Başarıyla kayıt oldunuz. Lütfen giriş yapınız." , Toast.LENGTH_LONG).show() ;
                                                                            Intent i = new Intent(SignUpActivity.this , MainActivity.class) ;
                                                                            startActivity(i) ;

                                                                        }else if (isUsernameRegisteredWebServiceResult.getText().toString().equals("Bu kullanıcı adı zaten kayıtlı.")){

                                                                            Toast.makeText(SignUpActivity.this , "Bu kullanıcı adı zaten kayıtlı." , Toast.LENGTH_LONG).show() ;

                                                                        }

                                                                    }
                                                                } , 500) ;

                                                            }else if (isEmailRegisteredWebServiceResult.getText().toString().equals("Bu e-mail zaten üye.")) {

                                                                Toast.makeText(SignUpActivity.this , "Bu e-mail zaten kayıtlı. Lütfen yeni bir email ile giriş yapın." , Toast.LENGTH_LONG).show();

                                                            }

                                                        }
                                                    }, 500);

                                                }else {

                                                    Toast.makeText(SignUpActivity.this , "Lütfen kullanıcı adınızda boşluk bırakmayınız." , Toast.LENGTH_LONG).show() ;

                                                }

                                            }else {

                                                Toast.makeText(SignUpActivity.this , "Şifreleriniz uyuşmuyor." , Toast.LENGTH_LONG).show() ;

                                            }

                                        }else {

                                            Toast.makeText(SignUpActivity.this , "E-mailleriniz uyuşmuyor." , Toast.LENGTH_LONG).show() ;

                                        }

                                    }else {

                                        Toast.makeText(SignUpActivity.this , "Lütfen geçerli bir e-mail adresi girin." , Toast.LENGTH_LONG).show() ;

                                    }

                                }else {

                                    Toast.makeText(SignUpActivity.this , "Lütfen bir kullanıcı adı girin." , Toast.LENGTH_LONG).show() ;

                                }

                            }else {

                                Toast.makeText(SignUpActivity.this , "Lütfen şifrenizi yeniden girin." , Toast.LENGTH_LONG).show() ;

                            }

                        }else {

                            Toast.makeText(SignUpActivity.this , "Lütfen bir şifre girin." , Toast.LENGTH_LONG).show() ;

                        }

                    }else {

                        Toast.makeText(SignUpActivity.this , "Lütfen e-mailinizi yeniden girin." , Toast.LENGTH_LONG).show() ;

                    }

                }else {

                    Toast.makeText(SignUpActivity.this , "Lütfen bir e-mail adresi girin." , Toast.LENGTH_LONG).show() ;

                }

            }
        });

        signUpShowPasswordCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Determining a boolean variable to store if the widget is checked or not
                boolean isChecked = ((CheckBox) view).isChecked() ;
                // Determine switch cases to control checkboxes one by one (since we only have one check box we dont need multiple cases)
                switch(view.getId()) {

                    case R.id.signUpShowPasswordCheckBox :
                        if (isChecked == false) {

                            // Showing the text inside
                            signUpPasswordInput.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            signUpPasswordCheckInput.setTransformationMethod(PasswordTransformationMethod.getInstance());

                        }else {

                            // Hiding the text inside
                            signUpPasswordInput.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                            signUpPasswordCheckInput.setTransformationMethod(HideReturnsTransformationMethod.getInstance());

                        }

                }

            }
        });

    }

    public boolean isEmailValid(String email) {

        return Patterns.EMAIL_ADDRESS.matcher(email).matches() ;

    }

    public boolean isSpaceInUsername(String username) {

        if (username.contains(" ")) {

            return false ;

        }else {

            return true ;

        }
    }
}
