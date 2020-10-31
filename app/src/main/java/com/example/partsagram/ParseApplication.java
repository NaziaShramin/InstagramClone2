package com.example.partsagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("mOSG6wCBAS7LJoeUgtp1Qe8OJwMSO9tC7jFKqLb4")
                .clientKey("a9Zd4o2jwwXNLR10ZqQvQOTpUG9ULzmXUT8sv8CW")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}