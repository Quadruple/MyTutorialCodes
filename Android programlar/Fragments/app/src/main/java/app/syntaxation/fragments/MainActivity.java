package app.syntaxation.fragments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements fragments_top.Fragments_topListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public void createMeme(String top, String bottom) {
        fragments_bottom bottomFragment = (fragments_bottom) getSupportFragmentManager().findFragmentById(R.id.fragment2) ;
        bottomFragment.setMemeText(top , bottom) ;
    }
}
