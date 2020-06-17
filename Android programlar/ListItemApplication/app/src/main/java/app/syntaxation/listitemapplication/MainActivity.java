package app.syntaxation.listitemapplication;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View ;
import android.widget.ArrayAdapter ;
import android.widget.AdapterView ;
import android.widget.ListAdapter ;
import android.widget.ListView ;
import android.widget.Toast ;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String foods[] = {"Bacon" , "Ham" , "Pizza" , "Fish" , "Hamburger" , "Potato" , "Tomato" , "Bug"} ;
        ListAdapter atakansAdapter0 = new CustomAdapter(this , foods) ;
        ListView atakansListView = (ListView) findViewById(R.id.atakansListView) ;
        atakansListView.setAdapter(atakansAdapter0);

        atakansListView.setOnItemClickListener(
                new AdapterView.OnItemClickListener(){
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String food = String.valueOf(adapterView.getItemAtPosition(i)) ;
                        Toast.makeText(MainActivity.this, food, Toast.LENGTH_LONG).show() ;
                    }
                }
        );
    }
}
