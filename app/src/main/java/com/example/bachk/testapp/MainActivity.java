package com.example.bachk.testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.bachk.testapp.annotations.Status;
import com.example.bachk.testapp.annotations.ViewId;
import com.example.bachk.testapp.fragment.FragmentMap;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MainActivity extends BaseActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @ViewId(id = R.id.txtTestApp)
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IdManager idManager = new IdManager(this);
        idManager.findID(textView);

        Class foo = Foo.class;
        Object object = null;
        for(Method method : foo.getDeclaredMethods()) {
            Status statusAnnotation = (Status)method.getAnnotation(Status.class);
            if(statusAnnotation != null) {
                Log.d(TAG, " Method Name : " + method.getName());
                Log.d(TAG, " Author : " + statusAnnotation.author());
                Log.d(TAG, " Priority : " + statusAnnotation.priority());
                Log.d(TAG, " Completion Status : " + statusAnnotation.completion());
                try {
                    object = method.invoke(null);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
        if (object != null) {
            Log.d(TAG, "onCreate: called");
            if (object instanceof String) {
                Log.d(TAG, "onCreate: String = " + (String)object);
            }
        }
        FragmentMap.builder();
    }

    public void onBtnShowClick(View view) {
        switch (view.getId()) {
            case R.id.btnShow1:
                showFragment(FragmentMap.ONE_FRAGMENT.newInstance());
                break;
            case R.id.btnShow2:
                showFragment(FragmentMap.TWO_FRAGMENT.newInstance());
                break;
            default:
                break;
        }
    }

    @Override
    public int getFrameLayoutId() {
        return R.id.frameMain;
    }
}
