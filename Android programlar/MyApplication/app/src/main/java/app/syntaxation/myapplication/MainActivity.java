package app.syntaxation.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log ;
public class MainActivity extends AppCompatActivity {
    private static final String TAG = "atakansappstates" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG , "onCreate method working...") ;
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart method working...");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume method working...");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause method working...");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop method working...");
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart method working...");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy method working...");
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(TAG, "onSaveInstanceState method working...");
    }


    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(TAG, "onRestoreInstanceState method working...");
    }

}
