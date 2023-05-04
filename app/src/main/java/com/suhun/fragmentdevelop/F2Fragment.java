package com.suhun.fragmentdevelop;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class F2Fragment extends Fragment {
    private View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if(view==null) {
            // Inflate the layout for this fragment
            inflater.inflate(R.layout.fragment_f2, container, false);
        }
        return view;
    }
}