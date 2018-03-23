package com.example.android.quakereport;

import android.support.v7.app.AppCompatActivity;

public class Earthquake extends AppCompatActivity{
    private String mMagnitude;
    private String mLocation;
    private String mTime;

    public Earthquake(String magnitude, String location, String time) {
        mMagnitude = magnitude;
        mLocation = location;
        mTime = time;
    }

    public String getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public String getTime() {
        return mTime;
    }
}
