package com.example.spinzerburger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void loginMain(View mainLogin ){

        Intent Intent=new Intent(MainActivity.this,sign_in_activity.class);
        startActivity(Intent);
    }
    public void RegMain(View mainRegister){
        Intent Intent=new Intent(MainActivity.this,sign_up_Activity.class);
        startActivity(Intent);

    }
}