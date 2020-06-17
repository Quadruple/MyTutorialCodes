package app.syntaxation.savingdatawithsqlite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText inputText;
    TextView displayText;
    MyDBHandler dataBaseHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputText = (EditText) findViewById(R.id.atakansInput);
        displayText = (TextView) findViewById(R.id.atakansText);
        dataBaseHandler = new MyDBHandler(this, null, null, 1);
        printDatabase();
    }

    public void addButtonClicked(View view) {
        Products product = new Products(inputText.getText().toString());
        dataBaseHandler.addProduct(product);
        printDatabase();
    }

    public void deleteButtonClicked(View view) {
        String productToDelete = inputText.getText().toString();
        dataBaseHandler.deleteProduct(productToDelete);
        printDatabase();
    }

    public void printDatabase() {
        String dbString = dataBaseHandler.databaseToString();
        displayText.setText(dbString);
        inputText.setText("");
    }

}
