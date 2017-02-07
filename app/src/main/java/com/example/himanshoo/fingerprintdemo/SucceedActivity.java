package com.example.himanshoo.fingerprintdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SucceedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_succeed);

        getSupportActionBar().hide();
    }
}
