package com.example.impact;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tafs1;
    private Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.make_impact_layout);

        intent = new Intent(this, SituationActivity.class);

        tafs1 = (TextView) findViewById(R.id.tafs1);
        tafs1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tafsSituation(v);
            }
        });
    }


    public void tafsSituation(View v){
        startActivity(intent);
    }
}
