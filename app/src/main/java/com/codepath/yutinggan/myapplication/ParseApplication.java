package com.codepath.yutinggan.myapplication;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("pd8iBE3lqmKJw7QbB7nHeuUlOLxLZrUjRNIg6xLD")
                .clientKey("XfrFO6reaDo9gHiZwM9R8uGZEie50VVP5R9wOpqc")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
