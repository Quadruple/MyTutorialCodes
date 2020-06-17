package app.babacan.bookject;


import android.content.Context;
import android.os.AsyncTask;
import android.widget.EditText;
import android.widget.TextView;
import org.ksoap2.SoapEnvelope ;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.AndroidHttpTransport;

public class MainActivityWebServiceMatchPassword extends AsyncTask<Void , Void , String>{

    // Determining variables
    Context context ;
    EditText emailInput ;
    String emailInputHolder ;
    TextView webServiceResult ;

    // Determining connection variables
    public static final String SOAP_ACTION = "http://tempuri.org/matchPasswordWithEmail" ;
    public static final String METHOD_NAME = "matchPasswordWithEmail" ;
    public static final String NAMESPACE = "http://tempuri.org/" ;
    public static final String URL = "http://10.0.2.2:43782/Service1.asmx" ;

    MainActivityWebServiceMatchPassword(Context context , EditText emailInput , TextView webServiceResult) {

        this.context = context ;
        this.emailInput = emailInput ;
        this.emailInputHolder = emailInput.getText().toString() ;
        this.webServiceResult = webServiceResult ;

    }

    @Override
    protected String doInBackground(Void... voids) {

        // Creating a request to send
        SoapObject request = new SoapObject(NAMESPACE , METHOD_NAME) ;
        request.addProperty("email" , emailInputHolder) ;

        // Setting the dotNet as true since the web service is asmx not wsdl, sending the request
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11) ;
        soapEnvelope.dotNet = true ;
        soapEnvelope.setOutputSoapObject(request);

        //Transporting the request
        AndroidHttpTransport aht = new AndroidHttpTransport(URL) ;
        try {

            aht.call(SOAP_ACTION , soapEnvelope) ;
            return soapEnvelope.getResponse().toString() ;

        }catch(Exception e) {

            e.printStackTrace();
            return "Bağlantınızla ilgili bir sorun oluştu. Lütfen tekrar deneyin." ;

        }

    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected void onPostExecute(String s) {
        webServiceResult.setText(s);
    }

    @Override
    protected void onProgressUpdate(Void... values) {
        super.onProgressUpdate(values);
    }
}
