package mbn.org.mathviz.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.support.design.widget.FloatingActionButton;
import android.view.View;
import android.widget.VideoView;

import mbn.org.mathviz.R;
import mbn.org.mathviz.dialog.ArthemeticOperationsDialog;

public class DisplayVisualizationActivity extends Activity {
    VideoView video;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addition);
       // getActionBar().setDisplayHomeAsUpEnabled(true);
        Intent intent = getIntent();
        String video_id = intent.getStringExtra("VIDEO_ID");
        video = findViewById(R.id.vidAddition);
        switch(video_id){
            case "addition":
                video.setVideoURI(Uri.parse("android.resource://" + getPackageName()+"/"+R.raw.addition));
                break;
            case "subtraction":
                video.setVideoURI(Uri.parse("android.resource://" + getPackageName()+"/"+R.raw.subtraction));
                break;
            case "multiplication":
                video.setVideoURI(Uri.parse("android.resource://" + getPackageName()+"/"+R.raw.multiplication));
                break;
            case "division":
                video.setVideoURI(Uri.parse("android.resource://" + getPackageName()+"/"+R.raw.division));
                break;
            default:
                break;
        }
        video.start();

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fabAddition);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                video.start();


            }
        });
    }

}
