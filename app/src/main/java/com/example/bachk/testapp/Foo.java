package com.example.bachk.testapp;

import android.util.Log;

import com.example.bachk.testapp.annotations.Status;

/**
 * Created by bachk on 1/27/2018.
 */

public class Foo {

    @Status(priority = Status.Priority.MEDIUM, author = "Amit Shekhar", completion = 0)
    public static void methodOne() {
        //no code
        Log.d("AAA", "methodOne: called");
    }
    @Status(priority = Status.Priority.HIGH, author = "Amit Shekhar", completion = 100)
    public static String methodTwo() {
        //complete code
        return "My String";

    }
}
