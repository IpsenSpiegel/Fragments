package com.example.ipsenspiegel.fragments;

import android.support.annotation.IdRes;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity implements Fragment1.clickRandom {

    private static final String TAG_MAIN_ACTIVITY = "In-MainActivity";
    private boolean sentido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }


    @Override
    public void ComsFrag1(long rNumber) {
        Log.d(TAG_MAIN_ACTIVITY, "i hope it works " + String.valueOf(rNumber));
        FragmentManager fm = getSupportFragmentManager();

        if (sentido == true) {
            Fragment2 fragment2 = (Fragment2) fm.findFragmentById(R.id.Fragment2);
            fragment2.setNumberOnTxtView(rNumber);
        } else if (sentido == false){
            Fragment2 fragment2 = (Fragment2) fm.findFragmentByTag(Fragment2.TAG_SECOND_FRAGMENT);
            fragment2.setNumberOnTxtView(rNumber);
        }
    }


}
