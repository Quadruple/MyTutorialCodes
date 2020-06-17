package app.syntaxation.intentsactivitythatrunsotheractivityapp;

import android.annotation.SuppressLint;
import android.content.Intent ;
import android.app.IntentService ;
import android.util.Log;

public class AtakansIntentService extends IntentService{

    private static final String TAG = "app.syntaxation.intentsactivitythatrunsotheractivityapp" ;

    public AtakansIntentService() {
        super("AtakansIntentService");
    }

    @SuppressLint("LongLogTag")
    @Override
    protected void onHandleIntent(Intent ıntent) {
        // This is what the service does
        Log.i(TAG, "The service has now started") ;
    }
}
