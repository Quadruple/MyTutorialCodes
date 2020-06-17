package app.syntaxation.fragments;

import android.content.Context;
import android.os.Bundle ;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment ;
import android.view.LayoutInflater ;
import android.view.View ;
import android.view.ViewGroup ;
import android.widget.EditText ;
import android.widget.Button ;
import android.app.Activity ;

public class fragments_top extends Fragment {

    private static EditText topTextInput ;
    private static EditText bottomTextInput ;

    Fragments_topListener activityCommander ;

    public interface Fragments_topListener {
        public void createMeme(String top , String bottom) ;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            activityCommander = (Fragments_topListener) activity ;
        }catch(ClassCastException e) {
            throw new ClassCastException(activity.toString()) ;
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragments_editing , container , false) ;

        topTextInput = (EditText) view.findViewById(R.id.topTextInput) ;
        bottomTextInput = (EditText) view.findViewById(R.id.bottomTextInput) ;
        final Button memerbutton = (Button) view.findViewById(R.id.memerButton) ;

        memerbutton.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        buttonclicked(v) ;
                    }
                }
        );

        return view ;
    }

    public void buttonclicked(View view) {
        activityCommander.createMeme(topTextInput.getText().toString() , bottomTextInput.getText().toString());
    }
}
