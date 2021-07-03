package com.example.project;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPreferencesManager {

    private final Context context;

    public SharedPreferencesManager(Context context) {
        this.context = context;
    }

    public void saveUserDataToSharedPreferences(String email, String password, String flag) {
        SharedPreferences sharedPreferenc = context.getSharedPreferences("userdata", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferenc.edit();
        editor.putString("email", email);
        editor.putString("password", password);
        editor.putString("logintype", flag);
        editor.apply();
    }

    public String getEmail() {
        SharedPreferences sharedPreferenc = context.getSharedPreferences("userdata", Context.MODE_PRIVATE);
        return sharedPreferenc.getString("email", "");
    }

    public String getPassword() {
        SharedPreferences sharedPreferenc = context.getSharedPreferences("userdata", Context.MODE_PRIVATE);
        return sharedPreferenc.getString("password", "");
    }

    public String getLoginType() {
        SharedPreferences sharedPreferenc = context.getSharedPreferences("userdata", Context.MODE_PRIVATE);
        return sharedPreferenc.getString("logintype", "");
    }

    /**
     * remove user data that saved in sharedpreferences
     */
    public void deleteSharedPreferenceData() {
        SharedPreferences sharedPreferenc = context.getSharedPreferences("userdata", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferenc.edit();
        editor.remove("email");
        editor.remove("password");
        editor.remove("logintype");
        editor.apply();

    }

}
