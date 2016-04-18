package com.djcanadastudio.splash_demo;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    // Splash screen timer
    private static int SPLASH_TIME_OUT = 5000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                goToAnother();
            }
        }, SPLASH_TIME_OUT);
    }

    private void goToAnother() {
        Intent newIntent = new Intent(this, AnotherActivity.class);
        this.startActivity(newIntent);
        this.finish();
    }

}
