package com.example.ipsenspiegel.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment2 extends Fragment {

    public TextView hellofrag2;
    public TextView txtfragment2;
    public static final String TAG_SECOND_FRAGMENT = "SecondFragment";


    public interface setRandom {
        void ComsFrag2(long rNumber);
    }
    private setRandom setRandom;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(Fragment2.TAG_SECOND_FRAGMENT, "onCreate2nd()");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View fragView = inflater.inflate(R.layout.fragment_fragment2, container, false);
        Log.d(Fragment2.TAG_SECOND_FRAGMENT, "onCreate2ndView()");
        this.hellofrag2 = (TextView) fragView.findViewById(R.id.helloFragment2);
        this.txtfragment2 = (TextView) fragView.findViewById(R.id.txtFragment2);
        return fragView;
    }

    public void setNumberOnTxtView(long rNumber) {
        this.txtfragment2.setText(String.valueOf(rNumber));

    }

}
