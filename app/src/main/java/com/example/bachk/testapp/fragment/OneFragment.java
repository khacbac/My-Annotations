package com.example.bachk.testapp.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bachk.testapp.R;
import com.example.bachk.testapp.annotations.MethodMask;

/**
 * A simple {@link Fragment} subclass.
 */
public class OneFragment extends Fragment {

    private static OneFragment fragment;

    public OneFragment() {
        // Required empty public constructor
    }

    @MethodMask("newInstance")
    public static OneFragment newInstance() {
        if (fragment == null) {
            fragment = new OneFragment();
        }
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_one, container, false);
    }

}
