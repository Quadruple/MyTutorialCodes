package app.syntaxation.intentsactivitythatrunsotheractivityapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View ;
import android.content.Intent ;
import android.widget.EditText ;



public class ApplesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apples);
        Intent intent = new Intent(this, AtakansIntentService.class) ;
        startService(intent) ;
        Intent intent2 = new Intent(this, MyService.class) ;
        startService(intent2) ;
    }

    public void onClick(View view) {
        Intent i = new Intent(this , BaconsActivity.class) ;

        EditText applesMessage = (EditText) findViewById(R.id.applesMessage) ;
        String userMessage = applesMessage.getText().toString() ;
        i.putExtra("userMessage" , userMessage) ;


        startActivity(i) ;
    }
}
