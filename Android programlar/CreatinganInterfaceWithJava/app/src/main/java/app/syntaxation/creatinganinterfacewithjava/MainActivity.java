package app.syntaxation.creatinganinterfacewithjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout ;
import android.widget.Button ;
import android.graphics.Color ;
import android.widget.EditText ;
import android.content.res.Resources ;
import android.util.TypedValue ;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        RelativeLayout atakanlayout = new RelativeLayout(this) ;
        atakanlayout.setBackgroundColor(Color.GREEN);
        RelativeLayout.LayoutParams buttondetails = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT ,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        ) ;
        buttondetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        buttondetails.addRule(RelativeLayout.CENTER_VERTICAL) ;
        Button atakanbutton = new Button(this) ;
        atakanbutton.setText("How awesome is this") ;
        atakanbutton.setBackgroundColor(Color.RED) ;
        atakanlayout.addView(atakanbutton , buttondetails) ;
        setContentView(atakanlayout) ;
        EditText datextfield = new EditText(this) ;
        datextfield.setId(1);
        atakanbutton.setId(2);
        RelativeLayout.LayoutParams textdetails = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT ,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        ) ;
        textdetails.addRule(RelativeLayout.ABOVE , atakanbutton.getId());
        textdetails.addRule(RelativeLayout.CENTER_HORIZONTAL) ;
        textdetails.setMargins(0 , 0 , 0 , 50);
        atakanlayout.addView(datextfield , textdetails);
        Resources res = getResources() ;
        int pixels = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP , 300 , res.getDisplayMetrics()) ;
        datextfield.setWidth(pixels) ;
    }
}
