package com.example.branch;

import android.app.Application;
import android.util.Log;

import io.branch.referral.Branch;

public final class customApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Branch.enableDebugMode();
        Log.d("Branch TEST TEST","123");
        // Initialize the Branch object
        Branch.getAutoInstance(this);


    }
}
