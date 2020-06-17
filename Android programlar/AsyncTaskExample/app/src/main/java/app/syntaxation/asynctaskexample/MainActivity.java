package app.syntaxation.asynctaskexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView ;
import android.widget.Button ;

public class MainActivity extends AppCompatActivity {

    TextView DownloadText ;

    Button DownloadButton ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DownloadText = (TextView) findViewById(R.id.DownloadText) ;

        DownloadButton = (Button) findViewById(R.id.DownloadButton) ;
    }

    public void DownloadButtonClicked(View view) {
        MyTask myTask = new MyTask(MainActivity.this , DownloadText , DownloadButton) ;
        myTask.execute() ;
        DownloadButton.setEnabled(false) ;
    }
}
