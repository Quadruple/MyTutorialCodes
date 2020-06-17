package app.syntaxation.animationsandtransitions;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View ;
import android.view.ViewGroup;
import android.widget.RelativeLayout ;
import android.view.MotionEvent ;
import android.transition.TransitionManager ;

public class MainActivity extends AppCompatActivity {

    ViewGroup atakanLayout ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        atakanLayout = (ViewGroup) findViewById(R.id.atakanLayout) ;

        atakanLayout.setOnTouchListener(
                new RelativeLayout.OnTouchListener(){
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        moveButton() ;
                        return true ;
                    }
                }
        );

    }

    public void moveButton() {
        View atakanButton = (View) findViewById(R.id.atakanButton) ;

        TransitionManager.beginDelayedTransition(atakanLayout);

        // Changing the buttons position
        RelativeLayout.LayoutParams positionRules = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT , RelativeLayout.LayoutParams.WRAP_CONTENT) ;
        positionRules.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM , RelativeLayout.TRUE);
        positionRules.addRule(RelativeLayout.ALIGN_PARENT_RIGHT , RelativeLayout.TRUE);
        atakanButton.setLayoutParams(positionRules);


        // Enlarging the button
        ViewGroup.LayoutParams sizeRules = atakanButton.getLayoutParams() ;
        sizeRules.width = 450 ;
        sizeRules.height = 300 ;
        atakanButton.setLayoutParams(sizeRules);
    }

}
