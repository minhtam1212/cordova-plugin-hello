package com.example.plugin;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;

public class Hello extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {

        if (action.equals("greet")) {
            ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE); 
            
           String _t = clipboard.getText();
            String name = data.getString(0);
            String message = "Hello, " + name + _t;
            callbackContext.success(message);

            return true;

        } else {
            
            return false;

        }
    }
}
