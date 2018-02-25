package com.example.impact;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by rebeccafinne on 2018-02-03.
 */

public class MakeImpactView extends android.support.v4.app.Fragment implements View.OnClickListener{


    private Button meButton, otherButton;

    public static MakeImpactView newInstance() {
        MakeImpactView fragment = new MakeImpactView();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.make_impact_layout, container, false);

        meButton = (Button) v.findViewById(R.id.me_button);
        meButton.setOnClickListener(this);
        otherButton = (Button) v.findViewById(R.id.other_button);
        otherButton.setOnClickListener(this);

        TextView b = (TextView) v.findViewById(R.id.tafs1);
        b.setOnClickListener(this);
        TextView a = (TextView) v.findViewById(R.id.tafs2);
        a.setOnClickListener(this);
        TextView c = (TextView) v.findViewById(R.id.krank);
        c.setOnClickListener(this);
        TextView d = (TextView) v.findViewById(R.id.tafs3);
        d.setOnClickListener(this);
        return v;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public void onClick(View view) {

        if(view.getId() == R.id.tafs1){
            Intent intent = new Intent(getActivity(), SituationActivity.class);
            startActivity(intent);
        } else if(view.getId() == R.id.tafs2){
            Intent intent = new Intent(getActivity(), SituationActivity.class);
            startActivity(intent);

        }
        else if(view.getId() == R.id.tafs3){
            Intent intent = new Intent(getActivity(), SituationActivity.class);
            startActivity(intent);
        }  else if(view.getId() == R.id.me_button){
            meClicked(view);
        } else if(view.getId() == R.id.other_button){
            otherClicked(view);
        }

        else {
            Intent intent = new Intent(getActivity(), SituationActivity.class);
            startActivity(intent);
        }


    }

    public void meClicked(View v){
        meButton.setBackgroundColor(getResources().getColor(R.color.blue));
        otherButton.setBackgroundColor(getResources().getColor((R.color.white)));

        //Something about changing content of the situations
    }

    public void otherClicked(View v){
        otherButton.setBackgroundColor(getResources().getColor((R.color.blue)));
        meButton.setBackgroundColor(getResources().getColor(R.color.white));

        //Something about changing content of the situations


    }
}
