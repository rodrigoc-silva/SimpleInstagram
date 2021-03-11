package com.example.simpleinstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        // ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("WEsZJhuryyGGk4UFa0jFFcDzKKrcNiSewnLPPYiT")
                .clientKey("wHrEr8ai8YTCTgi6z2XmBv6eW4UkCjdN57UJpzPE")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
