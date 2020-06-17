package app.syntaxation.handlingthreads;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView ;
import android.view.View ;
import android.os.Handler ;
import android.os.Message;

public class MainActivity extends AppCompatActivity {

    Handler handler = new Handler() {
        public void handleMessage(Message msg) {
            TextView threadText = (TextView) findViewById(R.id.threadText) ;
           threadText.setText("Fine here bro. Whaddap ya?");
       }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void hitThisBadBoy(View view) {
        Runnable r = new Runnable() {
            public void run() {
                long waitingTime = System.currentTimeMillis() + 10000 ;
                while (System.currentTimeMillis() < waitingTime) {
                    synchronized (this) {
                        try{
                            wait(waitingTime - System.currentTimeMillis()) ;
                        }catch(Exception e) {}
                    }
                }
                handler.sendEmptyMessage(0) ;
            }
        };
        Thread atakansThread = new Thread(r) ;
        atakansThread.start();
    }

}
