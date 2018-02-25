package com.example.impact;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by rebeccafinne on 2018-02-03.
 */

public class StartFragement extends Fragment implements View.OnClickListener{

    private TextView situation1;
    private TextView situation2;

    ArrayList<View> allSituations;

    private ListView situations;


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
        allSituations = ((LinearLayout) rootView.findViewById(R.id.startPage)).getTouchables();
        situations = (ListView) rootView.findViewById(R.id.list_item);

        // Initializing a new String Array
        String[] fruits = new String[] {
                "Cape Gooseberry",
                "Capuli cherry", "hej","hej","hej","hej","hej","hej","hej","hej","hej","hej","hej","hej"
        };

        // Create a List from String Array elements
        final List<String> fruits_list = new ArrayList<String>(Arrays.asList(fruits));

        // Create an ArrayAdapter from List
        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>
                (getContext(), android.R.layout.simple_list_item_1, fruits_list);

        // DataBind ListView with items from ArrayAdapter
        situations.setAdapter(arrayAdapter);





     /*   for(View t : allSituations){
            t.setOnClickListener(this);
        }*/
/*
        situation1 = (TextView) rootView.findViewById(R.id.situation1);
        situation1.setOnClickListener(this);
        situation2 = (TextView) rootView.findViewById(R.id.situation2);
        situation2.setOnClickListener(this);*/

        return rootView;
    }

    @Override
    public void onClick(View view) {

        Intent intent = new Intent(getActivity(), SituationActivity.class);
        startActivity(intent);

    }
}
