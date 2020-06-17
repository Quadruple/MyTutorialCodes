package app.babacan.problemapp;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.EditText ;
import android.widget.Toast;


public class AddProblemFragmentClass extends Fragment{

    // Determining variables for holding widgets
    TextView addProblemTitleText ;
    TextView addProblemProblemText ;
    TextView addProblemHashtagText ;
    TextView addProblemVotingText ;
    EditText addProblemTitleInput ;
    EditText addProblemProblemInput ;
    EditText addProblemHashtagInput ;
    RadioButton addProblemVotingRadioButtonYes ;
    RadioButton addProblemVotingRadioButtonNo ;
    Button addProblemAddButton ;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.add_problem_bar, container, false);

        // Referencing widgets for use
        addProblemTitleText = (TextView) rootView.findViewById(R.id.addProblemTitleText) ;
        addProblemProblemText = (TextView) rootView.findViewById(R.id.addProblemProblemText) ;
        addProblemHashtagText = (TextView) rootView.findViewById(R.id.addProblemHashtagText) ;
        addProblemVotingText = (TextView) rootView.findViewById(R.id.addProblemVotingText) ;

        addProblemTitleInput = (EditText) rootView.findViewById(R.id.addProblemTitleInput) ;
        addProblemProblemInput = (EditText) rootView.findViewById(R.id.addProblemProblemInput) ;
        addProblemHashtagInput = (EditText) rootView.findViewById(R.id.addProblemHashtagInput) ;

        addProblemVotingRadioButtonYes = (RadioButton) rootView.findViewById(R.id.addProblemVotingRadioButtonYes) ;
        addProblemVotingRadioButtonNo = (RadioButton) rootView.findViewById(R.id.addProblemVotingRadioButtonNo) ;

        addProblemAddButton = (Button) rootView.findViewById(R.id.addProblemAddButton) ;

        // Dont letting the user delete the hashtag sign # because it is needed
        // Listening the text of the edit text with text watcher
        addProblemHashtagInput.setText("#") ;
        Selection.setSelection(addProblemHashtagInput.getText() , addProblemHashtagInput.getText().length()) ;
        addProblemHashtagInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

                // Determining the prefix text
                String prefix = "#" ;
                // Checking the edittext text if the prefix is not there
                if (!editable.toString().startsWith(prefix)) {

                    // Determining strings to replace
                    String cleanString ;
                    String deletedPrefix = "" ;

                    if (editable.toString().startsWith(deletedPrefix)) {

                        cleanString = editable.toString().replaceAll(deletedPrefix , "") ;

                    }else {

                        cleanString = editable.toString().replaceAll(prefix , "") ;

                    }

                    addProblemHashtagInput.setText(prefix + cleanString) ;
                    addProblemHashtagInput.setSelection(prefix.length());

                }
            }
        });

        // TODO : Add the inputs to database
        addProblemAddButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (!checkHastag(addProblemHashtagInput.getText().toString())) {

                    Toast.makeText(getActivity() , "Hastag'iniz  birden fazla # veya boşluk içermemelidir. Lütfen Hashtag'inizi yeniden düzenleyin." , Toast.LENGTH_LONG).show() ;

                }

            }
        });

        return rootView;
    }

    // TODO : Check the hashtag string for also empty strings and only hashtag sign situation
    boolean checkHastag(String hashtagString) {

        // Determining a letter check string and integer
        String letterCheck ;
        int letterCounter = 0;
        int emptynessCounter = 0 ;

        for (int i = 0  ; i <= hashtagString.length() - 1 ; i++) {

            letterCheck = hashtagString.substring(i , i+1) ;
            if(letterCheck.equals("#")) {

                letterCounter++ ;

            }

            if (letterCheck.equals(" ")) {

                emptynessCounter++ ;

            }

        }

        if (letterCounter > 1 || emptynessCounter > 0) {

            return false ;

        }else {

            return true ;

        }

    }

}
