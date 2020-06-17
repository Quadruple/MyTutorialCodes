package app.syntaxation.videoplayingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.VideoView ;
import android.widget.MediaController ;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final VideoView atakansVideoView = (VideoView) findViewById(R.id.atakansVideoView) ;
        atakansVideoView.setVideoPath("https://www.youtube.com/watch?v=Gq3F-V-BQWA");


        MediaController mediaController = new MediaController(this) ;
        mediaController.setAnchorView(atakansVideoView);
        atakansVideoView.setMediaController(mediaController);

        atakansVideoView.start();
    }
}
