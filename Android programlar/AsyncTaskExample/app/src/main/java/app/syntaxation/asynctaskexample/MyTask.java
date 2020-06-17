package app.syntaxation.asynctaskexample;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.content.Context;
import android.widget.Button;
import android.widget.TextView;

public class MyTask extends AsyncTask<Void , Integer , String> {

    Context context ;
    TextView textView ;
    Button button ;
    ProgressDialog progressDialog ;

    MyTask(Context context , TextView textView , Button button){
        this.context = context ;
        this.textView = textView ;
        this.button = button ;
    }

    @Override
    protected String doInBackground(Void... voids) {
        int i = 0 ;
        synchronized (this) {
            while (i<10) {
                try {
                    wait(1500) ;
                    i++ ;
                    publishProgress(i);
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }

        return "Download completed.";
    }

    @Override
    protected void onPreExecute() {
        progressDialog = new ProgressDialog(context) ;
        progressDialog.setTitle("Download in progress...");
        progressDialog.setMax(10);
        progressDialog.setProgress(0);
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progressDialog.show();
    }

    @Override
    protected void onPostExecute(String result) {
        textView.setText(result) ;
        button.setEnabled(true);
        progressDialog.hide() ;
    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        int progress = values[0] ;
        progressDialog.setProgress(progress);
        textView.setText("Download in progress...") ;
    }
}