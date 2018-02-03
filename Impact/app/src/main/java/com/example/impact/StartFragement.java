package com.example.impact;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by rebeccafinne on 2018-02-03.
 */

public class StartFragement extends Fragment {

    public static StartFragement newInstance() {
        StartFragement fragment = new StartFragement();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.start_layout, container, false);
    }
}
