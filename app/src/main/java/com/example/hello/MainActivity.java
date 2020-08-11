package com.example.hello;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "MainActivity created");

        Button frameLayout = findViewById(R.id.frame_layout);
        frameLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FrameActivity.class);
                startActivity(intent);
            }
        });

        Button constraintLayout = findViewById(R.id.button1);
        constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ConstrainActivity.class);
                startActivity(intent);
            }
        });

//        ActionBar actionBar = getSupportActionBar();
//        if (actionBar != null) {
//            actionBar.hide(); //隐藏标题栏
//        }
    }

}