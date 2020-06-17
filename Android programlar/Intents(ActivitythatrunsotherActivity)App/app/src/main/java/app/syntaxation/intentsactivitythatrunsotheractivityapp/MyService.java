package app.syntaxation.intentsactivitythatrunsotheractivityapp;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log ;

public class MyService extends Service {

    private static String TAG = "app.syntaxation.intentsactivitythatrunsotheractivityapp" ;

    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null ;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.i(TAG, "onStartCommand Method Called!") ;

        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i=0 ; i<5 ; i++) {
                    long futureTime = System.currentTimeMillis() + 5000 ;
                    while (System.currentTimeMillis() < futureTime) {
                        synchronized (this) {
                            try{
                                wait(futureTime - System.currentTimeMillis());
                                Log.i(TAG , "Service Is doing Something Right Now!") ;
                            }catch(Exception e) {}
                        }
                    }
                }
            }
        };

        Thread atakansThread2 = new Thread(r) ;
        atakansThread2.start() ;
        return Service.START_STICKY ;

    }

    @Override
    public void onDestroy() {
        Log.i(TAG, "onDestroy Method Called!") ;

    }
}
