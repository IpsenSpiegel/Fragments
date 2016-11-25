package com.example.ipsenspiegel.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class Fragment1 extends Fragment implements View.OnClickListener {

    public TextView hellofrag1;
    private static final String TAG_FIRST_FRAGMENT = "FirstFragment";

    public interface clickRandom {
        void ComsFrag1(long rNumber);
    }

    private clickRandom myRandom;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(Fragment1.TAG_FIRST_FRAGMENT, "onCreate()");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View fragView = inflater.inflate(R.layout.fragment_fragment1, container, false);
        Log.d(Fragment1.TAG_FIRST_FRAGMENT, "onCreateView()");
        this.hellofrag1 = (TextView) fragView.findViewById(R.id.helloFragment1);
        final Button updaptefrag2 = (Button) fragView.findViewById(R.id.updatefrag2);
        updaptefrag2.setOnClickListener(this);
        return fragView;
    }

    @Override
    public void onAttach(Activity hostActivity) {
        super.onAttach(hostActivity);
        Log.i(Fragment1.TAG_FIRST_FRAGMENT, "onAttach()");
        try {
            this.myRandom = (clickRandom) hostActivity;
        } catch (ClassCastException e) {
            throw new ClassCastException(this.getActivity().toString() + "must implement clickrandom");
        }
    }


    @Override
    public void onClick(View fragView) {
        if (fragView.getId() == R.id.updatefrag2)
        {
            Log.d(Fragment1.TAG_FIRST_FRAGMENT, "Pulsado botón random");
            this.myRandom.ComsFrag1(new Random().nextInt(100));
        } else {
            Log.d(Fragment1.TAG_FIRST_FRAGMENT, "No pulsado una mierda");
        }
    }

}