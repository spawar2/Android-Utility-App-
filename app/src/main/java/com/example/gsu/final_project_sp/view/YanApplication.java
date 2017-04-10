package com.example.gsu.final_project_sp.view;

import android.app.Application;

import com.example.gsu.final_project_sp.util.UtilLog;


/**
 * Created by YoungH on 2/6/17.
 */

public class YanApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        UtilLog.setDebug(true);
    }
}
