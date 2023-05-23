package com.example.secureugandaapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    private static final long SPLASH_DELAY = 3000; // 3 seconds delay

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Start the next activity after the delay
                Intent intent = new Intent(SplashActivity.this, LoginSignupActivity.class);
                startActivity(intent);
                finish(); // Finish the splash activity
            }
        }, SPLASH_DELAY);
    }
}
