package app.syntaxation.challangeforgestures;

import android.gesture.Gesture;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView ;
import android.widget.Button ;
import android.support.v4.view.GestureDetectorCompat ;
import android.view.GestureDetector ;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener ,
GestureDetector.OnDoubleTapListener {

    private TextView gestureMessage ;
    private GestureDetectorCompat gdc ;
    private Button gestureButton ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gestureMessage = (TextView) findViewById(R.id.gestureMessage) ;
        this.gdc = new GestureDetectorCompat(this , this) ;
        gestureButton = (Button) findViewById(R.id.gestureButton) ;
        gestureButton.setOnLongClickListener(
                new Button.OnLongClickListener() {
                    public boolean onLongClick(View view) {
                        gestureMessage.setText("Button was long clicked") ;
                        return true;
                    }
                }
        );
        gestureButton.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        gestureMessage.setText("Button was clicked") ;
                    }
                }
        );
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        gestureMessage.setText("Double tap event happened") ;
        return true;
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        gestureMessage.setText("Down happened") ;
        return true;
    }

    @Override
    public void onShowPress(MotionEvent motionEvent) {
        gestureMessage.setText("Press happened") ;
    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        gestureMessage.setText("Single Tap Up happened") ;
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        gestureMessage.setText("Scrolling happen") ;
        return true;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
        gestureMessage.setText("Long Press happened") ;
    }

    @Override
    public boolean onDoubleTap(MotionEvent motionEvent) {
        gestureMessage.setText("Double tap happened") ;
        return true ;
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        gestureMessage.setText("Fling happened") ;
        return true ;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.gdc.onTouchEvent(event) ;
        return super.onTouchEvent(event);
    }
}
