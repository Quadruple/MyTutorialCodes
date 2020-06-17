package app.syntaxation.waitingfor10seconds;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View ;
import android.widget.TextView ;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void ClickToWait(View view) {
        long currentTime = System.currentTimeMillis() + 10000 ;
        while(System.currentTimeMillis() < currentTime) {
            synchronized (this) {
                try {
                    wait(currentTime - System.currentTimeMillis()) ;
                }catch(Exception e) {}
            }
        }
        TextView atakansText = (TextView) findViewById(R.id.atakansText) ;
        atakansText.setText("Wow mate. This app sucks.") ;
    }
}
