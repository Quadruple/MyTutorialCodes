package app.babacan.problemapp;

import android.os.AsyncTask ;
import android.widget.EditText ;
import android.content.Context ;
import android.widget.TextView;

import org.ksoap2.SoapEnvelope ;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.AndroidHttpTransport;

public class ConnectionToWebServiceTask2 extends AsyncTask<Void , Void , String>{

    Context context ;
    EditText emailInput ;
    String emailInputHolder ;
    TextView resultTextView ;

    private static final String SOAP_ACTION = "http://tempuri.org/ifEmailInDatabase" ;
    private static final String METHOD_NAME = "ifEmailInDatabase" ;
    private static final String NAMESPACE = "http://tempuri.org/" ;
    private static final String URL = "http://10.0.2.2:10201/Service1.asmx" ;

    ConnectionToWebServiceTask2(Context context , EditText emailInput , TextView resultTextView) {

        this.context = context ;
        this.emailInput = emailInput ;
        this.emailInputHolder = emailInput.getText().toString() ;
        this.resultTextView = resultTextView ;

    }

    @Override
    protected String doInBackground(Void... voids) {
        SoapObject Request = new SoapObject(NAMESPACE , METHOD_NAME) ;
        Request.addProperty("userEmail" , emailInputHolder) ;

        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11) ;
        soapEnvelope.dotNet = true ;
        soapEnvelope.setOutputSoapObject(Request) ;

        AndroidHttpTransport aht = new AndroidHttpTransport(URL) ;
        try {
            aht.call(SOAP_ACTION , soapEnvelope) ;
            String resultString = soapEnvelope.getResponse().toString() ;
            return resultString ;

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
        resultTextView.setText(s) ;
    }

    @Override
    protected void onProgressUpdate(Void... values) {
        super.onProgressUpdate(values);
    }
}
