package app.babacan.problemapp;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class HomeFragmentClass extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Correct layout inflated
        View rootView = inflater.inflate(R.layout.home_bar, container, false);
        // returned a rootView
        return rootView;
    }

}
