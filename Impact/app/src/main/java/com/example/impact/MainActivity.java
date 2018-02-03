package com.example.impact;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.action_home:
                        Toast.makeText(MainActivity.this, "Action Home clicked", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.action_facts:
                        Toast.makeText(MainActivity.this, "Action Facts clicked", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.action_makeimpact:
                        Toast.makeText(MainActivity.this, "Action Make Impact clicked", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.action_practice:
                        Toast.makeText(MainActivity.this, "Action Practice clicked", Toast.LENGTH_SHORT).show();
                        break;
                }
                return true;
            }
        });
    }
}
