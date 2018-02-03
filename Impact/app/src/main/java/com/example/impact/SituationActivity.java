package com.example.impact;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SituationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_situation);
    }

    //For close button
    public void close(View view) {
        super.onBackPressed();
    }
}
