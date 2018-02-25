package com.example.impact;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by rebeccafinne on 2018-02-03.
 */

public class StartFragement extends Fragment implements View.OnClickListener{

    private TextView situation1;
    private TextView situation2;


    public static StartFragement newInstance() {
        StartFragement fragment = new StartFragement();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.start_layout, container, false);

        situation1 = (TextView) rootView.findViewById(R.id.situation1);
        situation1.setOnClickListener(this);
        situation2 = (TextView) rootView.findViewById(R.id.situation2);
        situation2.setOnClickListener(this);

        return rootView;
    }

    @Override
    public void onClick(View view) {

        Intent intent = new Intent(getActivity(), SituationActivity.class);
        startActivity(intent);

    }
}
