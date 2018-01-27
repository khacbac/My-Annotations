package com.example.bachk.testapp;

import android.annotation.SuppressLint;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by bachk on 1/27/2018.
 */

@SuppressLint("Registered")
public abstract class BaseActivity extends AppCompatActivity {

    public Fragment activeFragment;

    public int getFrameLayoutId() {
        return 0;
    }

    public void showFragment(Fragment fragment) {
        activeFragment = fragment;
        getSupportFragmentManager().beginTransaction().replace(getFrameLayoutId(),fragment).commit();
    }
}
