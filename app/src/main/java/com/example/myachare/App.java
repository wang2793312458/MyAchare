package com.example.myachare;

import android.app.Application;

public class App extends Application {
    public static ACache aCacheAPP;

    @Override
    public void onCreate() {
        super.onCreate();
        aCacheAPP = ACache.get(this);
    }
}
