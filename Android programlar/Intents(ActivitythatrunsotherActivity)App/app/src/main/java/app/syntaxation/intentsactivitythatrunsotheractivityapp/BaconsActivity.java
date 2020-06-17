package app.syntaxation.intentsactivitythatrunsotheractivityapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View ;
import android.content.Intent ;
import android.widget.TextView ;

public class BaconsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bacons);

        TextView baconsMessage = (TextView) findViewById(R.id.baconsMessage) ;
        Bundle dataStore = getIntent().getExtras() ;
        String theData = dataStore.getString("userMessage") ;
        if(theData==null) {
            return ;
        }
        baconsMessage.setText(theData);

    }

    public void onClick(View view) {
        Intent i = new Intent(this , ApplesActivity.class) ;
        startActivity(i) ;
    }

}