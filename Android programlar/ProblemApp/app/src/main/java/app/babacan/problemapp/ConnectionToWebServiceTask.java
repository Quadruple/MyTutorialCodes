package app.babacan.problemapp;

import android.os.AsyncTask ;
import android.widget.EditText ;
import android.content.Context ;
import org.ksoap2.SoapEnvelope ;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.AndroidHttpTransport;

public class ConnectionToWebServiceTask extends AsyncTask<Void , Void , String>{

    // Defining connection variables to web service and objects
    Context context ;

    EditText emailInput ;
    EditText passwordInput ;

    // These are created for holding the imaginary edittext inputs which are emailInput and passwordInput
    String emailInputHolder ;
    String passwordInputHolder ;

    private static final String SOAP_ACTION = "http://tempuri.org/insertIntoUserCredentials" ;
    private static final String METHOD_NAME = "insertIntoUserCredentials" ;
    private static final String NAMESPACE = "http://tempuri.org/" ;
    private static final String URL = "http://10.0.2.2:10201/Service1.asmx" ;

    // Creating the constructor for getting the input from SignUpActivity
    ConnectionToWebServiceTask(Context context , EditText emailInput , EditText passwordInput) {

        // Matching the contexts for interacting with SignUpActivity
        this.context = context ;

        // Matching the editText widgets like the signUpActivity
        this.emailInput = emailInput ;
        this.passwordInput = passwordInput ;

        // Transporting inputs from SignUpActivity
        this.emailInputHolder = emailInput.getText().toString() ;
        this.passwordInputHolder = passwordInput.getText().toString() ;

    }

    // Sending input to web service and returning result as string
    // Preparing a request to send, connecting and transporting
    @Override
    protected String doInBackground(Void... voids) {

        // Creating a request to send
        SoapObject Request = new SoapObject(NAMESPACE , METHOD_NAME) ;
        Request.addProperty("userEmail" , emailInputHolder) ;
        Request.addProperty("userPassword" , passwordInputHolder) ;


        // Setting the dotNet as true since the web service is asmx not wsdl, sending the request
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11) ;
        soapEnvelope.dotNet = true ;
        soapEnvelope.setOutputSoapObject(Request) ;



        //Transporting the request
        AndroidHttpTransport aht = new AndroidHttpTransport(URL) ;
        try {
            aht.call(SOAP_ACTION , soapEnvelope) ;
            return "" ;

        }catch(Exception e) {

            e.printStackTrace() ;
            return "Bağlantınızla ilgili bir sorun oluştu. Lütfen bağlantınızı kontrol edip yeniden deneyin." ;

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
