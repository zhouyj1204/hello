package com.cool.toast;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.widget.Toast;

import java.util.HashMap;

public class ShowToast extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        // TODO Auto-generated method stub  
        if ("toast".equals(action)) {
            Toast.makeText(cordova.getActivity(), "show...", Toast.LENGTH_SHORT).show();
            callbackContext.success("this is a callback result");
            return true;
        } else{
			callbackContext.error("error");
			return false;
		}
        
    }
}  