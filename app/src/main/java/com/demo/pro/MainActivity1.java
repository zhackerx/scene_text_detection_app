package com.demo.pro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        if(savedInstanceState == null){
            Log.d("one","done mainactivity1");
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container,TranslateFragment.newInstance())
                    .commitNow();
        }



    }
}