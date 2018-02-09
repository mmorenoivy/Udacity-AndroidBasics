package com.example.android.quakereport;

/**
 * Created by mivy on 2/5/2018.
 */

public class Earthquake {

    /**object for magnitude*/
    private double mMagnitude;

    /**object for location*/
    private String mLocation;

    /**object for date*/
    private String mDate;

    private long mTimeInMilliseconds;

    private String mUrl;

    public Earthquake(double magnitude, String location, long timeInMilliseconds, String url){
        mMagnitude = magnitude;
        mLocation = location;
//        mDate = date;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    /**since the global variables are private, we need to create public getters
     * so that other classes can access*/
    public double getMagnitude()
    {
        return mMagnitude;
    }

    public String getLocation()
    {
        return mLocation;
    }

  //  public String getDste()
   // {
    //    return mDate;
   // }

    public long getTimeInMilliseconds()
    {
        return mTimeInMilliseconds;
    }

    public String getUrl()
    {
        return mUrl;
    }
}
