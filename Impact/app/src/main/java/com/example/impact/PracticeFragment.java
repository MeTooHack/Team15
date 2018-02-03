package com.example.impact;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by rebeccafinne on 2018-02-03.
 */

public class PracticeFragment extends Fragment {

    public static PracticeFragment newInstance() {
        PracticeFragment fragment = new PracticeFragment();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.practice_layout, container, false);
    }
}
