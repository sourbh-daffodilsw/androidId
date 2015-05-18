package com.android.plugin.deviceID;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class androidId extends CordovaPlugin {
    private String androidId;

    protected void pluginInitialize() {
        androidId = Secure.getString(this.getContentResolver(), Secure.ANDROID_ID);
    }


    public boolean execute(String action, JSONArray args, CallbackContext callbackContext)
            throws JSONException {
        if (action.equals("getId")) {
            return androidId;
        }
        return false;
    }
}