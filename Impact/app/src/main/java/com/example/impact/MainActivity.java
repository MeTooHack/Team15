package com.example.impact;


import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {


    //Spideys shit
    private Button mFirebaseBtn;
    private DatabaseReference mDatabase;
    private FirebaseAdapter firebaseAdapter;
    private EditText mNameField;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //yes dis i Spideys shit
        firebaseAdapter = new FirebaseAdapter();


        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selectedFragment = null;

                switch (item.getItemId()){
                    case R.id.action_home:
                        selectedFragment = StartFragement.newInstance();
                        break;
                    case R.id.action_facts:
                        selectedFragment = FactFragment.newInstance();
                        break;
                    case R.id.action_makeimpact:

                        selectedFragment = MakeImpactView.newInstance();

                        break;
                    case R.id.action_practice:
                        selectedFragment = PracticeFragment.newInstance();

                        break;
                }
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frame_layout, selectedFragment);
                transaction.commit();
                return true;
            }


        });
        //Manually displaying the first fragment - one time only
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_layout, StartFragement.newInstance());
        transaction.commit();

        //Used to select an item programmatically
        //bottomNavigationView.getMenu().getItem(2).setChecked(true);




        //Spideys shit
        mFirebaseBtn = (Button) findViewById(R.id.firebase_btn);
        mDatabase = FirebaseDatabase.getInstance().getReference();

        mFirebaseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                // 1 - Create a child in root object
                // 2 - Assign some value to that child object


            }
        });
    }
}
