package app.syntaxation.connectingtowebservice;

import android.os.AsyncTask;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Context ;
import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.AndroidHttpTransport;

public class MyTask extends AsyncTask<Void , Void , String>{

    // Defining connection variables to web service and objects
    Context Context ;

    TextView ResultText ;

    EditText CelsiusInput ;

    String InputHolder ;

    private static final String SOAP_ACTION = "http://www.w3schools.com/xml/CelsiusToFahrenheit" ;
    private static final String METHOD_NAME = "CelsiusToFahrenheit" ;
    private static final String NAMESPACE = "http://www.w3schools.com/xml/" ;
    private static final String URL = "http://www.w3schools.com/xml/tempconvert.asmx" ;

    MyTask(Context Context , TextView ResultText , EditText CelsiusInput){
        // Matching the contexts for interacting with main activity
       this.Context = Context ;
        // Matching the result texts for displaying the fahrenheit result
        this.ResultText = ResultText ;
        // Matching the Celsius Inputs for transporting input from main activity
        this.CelsiusInput = CelsiusInput ;
        // Getting the input from MainActivity
        this.InputHolder = CelsiusInput.getText().toString() ;

    }

    // Sending input to web service and returning result as string
    // Preparing a request to send, connecting and transporting
    @Override
    protected String doInBackground(Void... voids) {

        // Creating a request to send
        SoapObject Request = new SoapObject(NAMESPACE , METHOD_NAME) ;
        Request.addProperty("Celsius" , InputHolder) ;

        // Setting the dotNet as true since the web service is asmx not wsdl, sending the request
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11) ;
        soapEnvelope.dotNet = true ;
        soapEnvelope.setOutputSoapObject(Request);

        // Trasporting the request
        AndroidHttpTransport aht = new AndroidHttpTransport(URL) ;
        try{
            aht.call(SOAP_ACTION , soapEnvelope) ;
            String resultString =  soapEnvelope.getResponse().toString() ;
            return resultString ;
        }catch(Exception e){
            e.printStackTrace() ;
            return "Some problem occured during the connection. Please try again." ;
        }
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    // Setting the result text to the result coming out from the doInBackground method
    @Override
    protected void onPostExecute(String result) {
       ResultText.setText(result);
    }

    @Override
    protected void onProgressUpdate(Void... values) {
        super.onProgressUpdate(values);
    }
}
