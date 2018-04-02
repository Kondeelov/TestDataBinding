package com.kondee.testdatabinding;

import android.app.Activity;

public class DataForShared {

    private Activity currentActivity;

    public DataForShared setCurrentActivity(Activity currentActivity) {
        this.currentActivity = currentActivity;
        return this;
    }

    public Activity getCurrentActivity() {
        return currentActivity;
    }
}
