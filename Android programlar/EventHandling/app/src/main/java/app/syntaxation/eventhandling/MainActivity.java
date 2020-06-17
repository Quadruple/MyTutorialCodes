package app.syntaxation.eventhandling;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button ;
import android.widget.TextView ;
import android.view.View ;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button atakanButton = (Button) findViewById(R.id.atakanButton) ;
        atakanButton.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick (View view) {
                        TextView atakanText = (TextView) findViewById(R.id.atakanText) ;
                        atakanText.setText("ULTAPP Bro clicked da Bro Button") ;
                    }
                }
        );
        atakanButton.setOnLongClickListener(
                new Button.OnLongClickListener() {
                    public boolean onLongClick(View view) {
                        TextView atakanText = (TextView) findViewById(R.id.atakanText) ;
                        atakanText.setText("ULTAPP Bro long clicked da Bro Button") ;
                        return true ;
                    }
                }
        );
    }
}
