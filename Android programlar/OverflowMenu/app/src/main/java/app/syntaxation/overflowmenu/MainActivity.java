package app.syntaxation.overflowmenu;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }




    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        RelativeLayout main_layout = (RelativeLayout) findViewById(R.id.main_layout) ;

        switch(item.getItemId()) {
            case R.id.menu_red:
                if(item.isChecked())
                    item.setChecked(false) ;
                else
                    item.setChecked(true) ;
                main_layout.setBackgroundColor(Color.RED);
                return true ;
            case R.id.menu_green:
                if(item.isChecked())
                    item.setChecked(false) ;
                else
                    item.setChecked(true) ;
                main_layout.setBackgroundColor(Color.GREEN);
                return true ;
            case R.id.menu_yellow:
                if(item.isChecked())
                    item.setChecked(false) ;
                else
                    item.setChecked(true) ;
                main_layout.setBackgroundColor(Color.YELLOW);
                return true ;
            default:
                return super.onOptionsItemSelected(item) ;
        }

    }
}
