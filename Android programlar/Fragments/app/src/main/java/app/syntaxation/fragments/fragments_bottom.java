package app.syntaxation.fragments;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment ;
import android.view.View ;
import android.view.ViewGroup ;
import android.os.Bundle ;
import android.view.LayoutInflater ;
import android.widget.TextView ;

public class fragments_bottom extends Fragment{

    private static TextView topMemeText ;
    private static TextView bottomMemeText ;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.picture_fragments , container , false) ;
        topMemeText = (TextView) view.findViewById(R.id.topMemeText) ;
        bottomMemeText = (TextView) view.findViewById(R.id.bottomMemeText) ;
        return view ;
    }

    public void setMemeText(String top , String bottom) {
        topMemeText.setText(top);
        bottomMemeText.setText(bottom);
    }

}
