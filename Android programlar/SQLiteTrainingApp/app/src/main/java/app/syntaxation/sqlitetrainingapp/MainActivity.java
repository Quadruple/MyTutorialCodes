package app.syntaxation.sqlitetrainingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    DatabaseHelper myDB ;
    EditText editName , editSurname , editMarks , editID ;
    Button btnAddData ;
    Button btnViewUpdate ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myDB = new DatabaseHelper(this) ;

        editName = (EditText) findViewById(R.id.NameEditText) ;
        editSurname = (EditText) findViewById(R.id.SurnameEditText) ;
        editMarks = (EditText) findViewById(R.id.MarkEditText) ;
        editID = (EditText) findViewById(R.id.IDEditText) ;
        btnAddData = (Button) findViewById(R.id.AddButton) ;
        btnViewUpdate = (Button) findViewById(R.id.UpdateButton) ;

        AddData() ;
    }

    public void UpdateData() {
        btnViewUpdate.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        boolean isUpdate = myDB.updateData(editID.getText().toString() , editName.getText().toString() , editSurname.getText().toString() , editMarks.getText().toString()) ;
                        if (isUpdate == true) {
                            Toast.makeText(MainActivity.this , "Data Updated" , Toast.LENGTH_LONG).show();
                        }
                        else
                            Toast.makeText(MainActivity.this , "Data Not Updated" , Toast.LENGTH_LONG).show();
                    }
                }
        );
    }

    public void AddData() {
        btnAddData.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        boolean isInserted = myDB.insertData(editName.getText().toString() , editSurname.getText().toString() , editMarks.getText().toString()) ;
                        if (isInserted == true)
                            Toast.makeText(MainActivity.this , "Data Inserted" , Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(MainActivity.this , "Data Not Inserted" , Toast.LENGTH_LONG).show();
                    }
                }
        );
    }
}
