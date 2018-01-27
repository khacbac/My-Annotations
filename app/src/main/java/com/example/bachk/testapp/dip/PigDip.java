package com.example.bachk.testapp.dip;

import android.util.Log;

import com.example.bachk.testapp.dip.myinterface.IPig;

/**
 * Created by bachk on 1/27/2018.
 */

public class PigDip implements IPig{
    private static final String TAG = PigDip.class.getSimpleName();

    @Override
    public void sleep() {
        Log.d(TAG, "sleep: Pig dip");
    }
}
