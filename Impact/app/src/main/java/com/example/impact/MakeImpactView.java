package com.example.impact;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by rebeccafinne on 2018-02-03.
 */

public class MakeImpactView extends android.support.v4.app.Fragment implements View.OnClickListener{


    private TextView tafs1;
    private Intent intent;

    public static MakeImpactView newInstance() {
        MakeImpactView fragment = new MakeImpactView();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.make_impact_layout, container, false);


        TextView b = (TextView) v.findViewById(R.id.tafs1);
        b.setOnClickListener(this);
        return v;
    }


    @Override
    public void onClick(View view) {

        Intent intent = new Intent(getActivity(), SituationActivity.class);
        startActivity(intent);

    }
}
