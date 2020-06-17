package app.syntaxation.gesturehandling;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView ;
import android.view.MotionEvent ;
import android.view.GestureDetector ;
import android.support.v4.view.GestureDetectorCompat ;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener ,
GestureDetector.OnDoubleTapListener {

    private TextView atakanText ;
    private GestureDetectorCompat gdc ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        atakanText = (TextView) findViewById(R.id.atakanText) ;
        this.gdc = new GestureDetectorCompat(this , this) ;
        gdc.setOnDoubleTapListener(this) ;
    }
    // GESTURE OVERRIDING BEGINS !!!!!!

    @Override
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        atakanText.setText("Single Tap Happened") ;
        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent motionEvent) {
        atakanText.setText("Double Tap Happened") ;
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        atakanText.setText("Double Tap Event Happened") ;
        return true;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        atakanText.setText("Down Happened") ;
        return true;
    }

    @Override
    public void onShowPress(MotionEvent motionEvent) {
        atakanText.setText("Show Press Happened") ;
    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        atakanText.setText("Single Tap Up Happened") ;
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        atakanText.setText("Scroll Happened") ;
        return true;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
        atakanText.setText("Long Press Happened") ;
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        atakanText.setText("Fling Happened") ;
        return true;
    }
    // OVERRIDING GESTURE METHODS FINISHED !!!!!

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.gdc.onTouchEvent(event) ;
        return super.onTouchEvent(event);
    }
}
