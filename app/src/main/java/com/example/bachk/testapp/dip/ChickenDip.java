package com.example.bachk.testapp.dip;

import android.util.Log;

import com.example.bachk.testapp.dip.myinterface.IChicken;

/**
 * Created by bachk on 1/27/2018.
 */

public class ChickenDip implements IChicken{
    private static final String TAG = ChickenDip.class.getSimpleName();

    @Override
    public void eat() {
        Log.d(TAG, "eat: chicken dip");
    }
}
