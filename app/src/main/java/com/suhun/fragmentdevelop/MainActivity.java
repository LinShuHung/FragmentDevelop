package com.suhun.fragmentdevelop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private F1Fragment f1;
    private F2Fragment f2;
    private F3Fragment f3;
    private FragmentManager fmgr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        f1 = new F1Fragment();
        f2 = new F2Fragment();
        f3 = new F3Fragment();
        fmgr = getSupportFragmentManager();

        FragmentTransaction transaction = fmgr.beginTransaction();
        transaction.add(R.id.container, f1);
        transaction.commit();
    }

    public void goToPage1(View view){

    }

    public void goToPage2(View view){

    }

    public void goToPage3(View view){

    }

}