package mbn.org.mathviz.activity;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.TextView;

import mbn.org.mathviz.R;

public class SplashScreen extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 2300;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        ImageView imageView = findViewById(R.id.imageView2);
        Animation fade= AnimationUtils.loadAnimation(SplashScreen.this,R.anim.fade);
        imageView.setAnimation(fade);
        fade.start();

        new Handler().postDelayed(new Runnable() {

            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */

            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start your app main activity
                // Start home activity
                startActivity(new Intent(SplashScreen.this, MainActivity.class));
                // close splash activity
                finish();

            }
        }, SPLASH_TIME_OUT);
    }



}