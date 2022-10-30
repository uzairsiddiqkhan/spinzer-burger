package com.example.spinzerburger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class sign_up_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        getSupportActionBar().setTitle("Sign up");


    }
    public void tvLogin(View tvLogin){
        Intent intent=new Intent(this,sign_in_activity.class);
        startActivity(intent);
    }
}