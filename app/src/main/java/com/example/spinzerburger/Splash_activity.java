package com.example.spinzerburger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ThemedSpinnerAdapter;

public class Splash_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread thread =new Thread(){
            @Override
            public void run() {
                super.run();
                try {
                   sleep(2000);
                }
                catch (Exception ex){
                    ex.printStackTrace();
                }
                finally {
                    Intent intent =new Intent(Splash_activity.this,MainActivity.class);
                    startActivity(intent);
                    finish();
                }

            }}; thread.start();
    }
}