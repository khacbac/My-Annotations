package com.example.bachk.testapp;

import android.app.Activity;
import android.content.Context;
import android.view.View;

import com.example.bachk.testapp.annotations.ViewId;

import java.lang.reflect.Method;

/**
 * Created by bachk on 1/27/2018.
 */

public class IdManager {

    private Activity activity;

    public void setContext(Activity activity) {
        this.activity = activity;
    }

    public IdManager(Activity activity) {
        this.activity = activity;
    }

    public void findID(View view) {
        ViewId viewId = null;
    }


}
