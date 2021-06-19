package com.demo.pro;

import androidx.appcompat.app.AppCompatActivity;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;
import android.widget.ProgressBar;

import com.demo.pro.R;

public class StartScreen extends AppCompatActivity {
    ProgressBar splashProgress;
    int SPLASH_TIME = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_screen);

        splashProgress = findViewById(R.id.pbar);
        playProgress();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {Intent mySuperIntent = new Intent(StartScreen.this, MainActivity.class);
                startActivity(mySuperIntent);
                finish(); }
        }, SPLASH_TIME);
    }

    private void playProgress()
    {
        ObjectAnimator.ofInt(splashProgress, "progress", 100)
                .setDuration(5000)
                .start();
    }
}

