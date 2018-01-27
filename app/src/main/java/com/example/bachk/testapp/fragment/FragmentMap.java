package com.example.bachk.testapp.fragment;

import android.support.v4.app.Fragment;

import com.example.bachk.testapp.annotations.MethodMask;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by bachk on 1/27/2018.
 */

public enum FragmentMap {
    ONE_FRAGMENT(0),
    TWO_FRAGMENT(1);

    private Class<? extends Fragment> fragment;

    FragmentMap(int i) {

    }

    public void setFragment(Class<? extends Fragment> frg) {
        this.fragment = frg;
    }

    public static void builder(){
        ONE_FRAGMENT.setFragment(OneFragment.class);
        TWO_FRAGMENT.setFragment(TwoFragment.class);
    }

    public Fragment newInstance() {
        Fragment myFragment = null;
        if (fragment != null) {
            MethodMask methodMask = null;
            Object object = null;
            Method[] method = fragment.getMethods();
            for (Method m : method) {
                methodMask = m.getAnnotation(MethodMask.class);
                if (methodMask != null && methodMask.value().equalsIgnoreCase("newInstance")) {
                    try {
                        object = m.invoke(null);
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    }
                }
            }
            if (object != null) {
                if (object instanceof Fragment) {
                    myFragment = (Fragment) object;
                }
            }
        }
        return myFragment;
    }
}
