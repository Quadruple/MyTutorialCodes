package app.babacan.bookject;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.EditText;
import org.ksoap2.SoapEnvelope ;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.AndroidHttpTransport;

public class SignUpActivityWebServiceRegisterUser extends AsyncTask<Void , Void , String>{

    // Defining imaginary widgets and context to match them with signUpActivity
    Context context ;
    EditText emailInput ;
    EditText passwordInput ;
    EditText usernameInput ;

    // Creating strings for holding the editText strings
    String emailInputHolder ;
    String passwordInputHolder ;
    String usernameInputHolder ;

    // Creating connection variables for webService consuming
    public static final String SOAP_ACTION = "http://tempuri.org/RegisterUser" ;
    public static final String METHOD_NAME = "RegisterUser" ;
    public static final String NAMESPACE = "http://tempuri.org/" ;
    public static final String URL = "http://10.0.2.2:43782/Service1.asmx" ;

    // Creating the constructor for getting the object from SignUpActivity
    SignUpActivityWebServiceRegisterUser(Context context , EditText emailInput , EditText passwordInput , EditText usernameInput) {

        // Matching all of them with SignUpActivity
        this.context = context ;
        this.emailInput = emailInput ;
        this.passwordInput = passwordInput ;
        this.usernameInput = usernameInput ;

        // Transporting inputs from SignUpActivity
        this.emailInputHolder = emailInput.getText().toString() ;
        this.passwordInputHolder = passwordInput.getText().toString() ;
        this.usernameInputHolder = usernameInput.getText().toString() ;

    }

    @Override
    protected String doInBackground(Void... voids) {

        //Creating request to send
        SoapObject request = new SoapObject(NAMESPACE , METHOD_NAME) ;
        request.addProperty("email" , emailInputHolder) ;
        request.addProperty("password" , passwordInputHolder) ;
        request.addProperty("username" , usernameInputHolder) ;

        // Setting the dotNet as true since the web service is asmx not wsdl, sending the request
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11) ;
        soapEnvelope.dotNet = true ;
        soapEnvelope.setOutputSoapObject(request) ;

        // Transporting the request
        AndroidHttpTransport aht = new AndroidHttpTransport(URL) ;
        try {

            aht.call(SOAP_ACTION , soapEnvelope) ;
            return soapEnvelope.getResponse().toString() ;

        }catch(Exception e) {

            e.printStackTrace() ;
            return "Bağlantınızla ilgili bir sorun oluştu. Lütfen yeniden deneyin." ;

        }

    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
    }

    @Override
    protected void onProgressUpdate(Void... values) {
        super.onProgressUpdate(values);
    }

}
