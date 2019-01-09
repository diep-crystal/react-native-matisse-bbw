package com.rnmatisse.rnmatisse;

import android.widget.Toast;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class RNMatisseModule extends ReactContextBaseJavaModule {
    public RNMatisseModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "RNMatisse";
    }

    @ReactMethod
    public void openGallry() {
        Toast.makeText(getReactApplicationContext(), "hahah", Toast.LENGTH_LONG).show();
    }
}
