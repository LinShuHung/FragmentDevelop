package com.suhun.fragmentdevelop;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class F1Fragment extends Fragment {
    private  View view;
    private Button createBtn;
    private TextView lotteryShow;
    private int lottery;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if(view == null) {
            // Inflate the layout for this fragment
            view = inflater.inflate(R.layout.fragment_f1, container, false);
            createBtn = view.findViewById(R.id.create);
            lotteryShow = view.findViewById(R.id.lotteryNum);
            createBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    lottery = new Random().nextInt(49)+1;
                    lotteryShow.setText(""+lottery);
                }
            });
        }
        return view;
    }
}