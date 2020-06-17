package app.syntaxation.boundserviceapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View ;
import android.widget.TextView;
import android.os.IBinder ;
import android.content.Context ;
import android.content.Intent ;
import android.content.ComponentName ;
import android.content.ServiceConnection ;
import app.syntaxation.boundserviceapplication.MyService.MyLocalBinder ;

public class MainActivity extends AppCompatActivity {

    MyService atakansService;
    boolean isBound = false ;

    public void showTime(View view) {
        String currentTime = atakansService.getCurrentTime() ;
        TextView atakansText = (TextView) findViewById(R.id.atakansText) ;
        atakansText.setText(currentTime) ;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent i = new Intent(this , MyService.class) ;
        bindService(i , atakansConnection , Context.BIND_AUTO_CREATE) ;
    }

    private ServiceConnection atakansConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName componentName, IBinder ıBinder) {
            MyLocalBinder binder = (MyLocalBinder) ıBinder ;
            atakansService = binder.getService() ;
            isBound = true ;
        }

        @Override
        public void onServiceDisconnected(ComponentName componentName) {
            isBound = false ;
        }
    } ;

}
