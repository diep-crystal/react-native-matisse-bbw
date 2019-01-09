package com.rnmatisse.rnmatisse;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;

public class RNMatisseModule extends ReactContextBaseJavaModule {
    public RNMatisseModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "RNMatisse";
    }
}
