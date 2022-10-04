package com.easy_food;
import android.app.Application;
import android.os.SystemClock;

public class Myapp extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        SystemClock.sleep(4000);
    }
}
