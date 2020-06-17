package app.syntaxation.connectingtowebservice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText ;
import android.widget.TextView ;
import android.widget.Button ;
import android.view.View ;

public class MainActivity extends AppCompatActivity {

    // Creating variables for widgets and objects
    TextView CelsiusText ;
    TextView ResultText ;

    EditText CelsiusInput ;

    Button ConvertButton ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Referencing to the widgets
        CelsiusText = (TextView) findViewById(R.id.CelsiusText) ;
        ResultText = (TextView) findViewById(R.id.ResultText) ;

        CelsiusInput = (EditText) findViewById(R.id.CelsiusInput) ;

        ConvertButton = (Button) findViewById(R.id.ConvertButton) ;
    }

    public void ConvertButtonClicked(View view){
        MyTask myTask = new MyTask(MainActivity.this , ResultText , CelsiusInput) ;
        myTask.execute();
    }
}
