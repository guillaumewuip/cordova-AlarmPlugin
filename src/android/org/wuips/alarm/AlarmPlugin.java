package com.wuips.alarm;

import java.util.Iterator;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.provider.Settings;

import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.PluginResult;



public class AlarmPlugin extends CordovaPlugin {

	public static final String TAG = "AlarmPlugin";
	
	@Override
	public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {

		if ("get".equals(action)) {
            
            String nextAlarm = Settings.System.getString(getApplicationContext().getContentResolver(),Settings.System.NEXT_ALARM_FORMATTED);

            this.echo(nextAlarm, callbackContext);

            return true;
        }
        return false;
    }

    private void echo(String message, CallbackContext callbackContext) {
        if (message != null && message.length() > 0) { 
            callbackContext.success(message);
        } else {
            callbackContext.error("Expected one non-empty string argument.");
        }
    }

    /**
     * Gets the application context from cordova's main activity.
     * @return the application context
     */
    private Context getApplicationContext() {
        return this.cordova.getActivity().getApplicationContext();
    }

}
