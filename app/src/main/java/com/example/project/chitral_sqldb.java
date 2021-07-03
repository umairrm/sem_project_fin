package com.example.project;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class chitral_sqldb extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "chitral_Details.db";
    private static int DATABASE_VERSON = 1;
    private static  String TABLE_NAME = "Chitral";
    private String query_create =" create table " + TABLE_NAME + "(chitral_name TEXT, chitral_email TEXT, chitral_phone TEXT)";
    public chitral_sqldb(Context context) { super(context, DATABASE_NAME, null, DATABASE_VERSON); }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(query_create);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    public boolean insert_chi_data (String chi_name, String chi_email, String  chi_phone) {
        SQLiteDatabase sql_db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("chitral_name", chi_name);
        contentValues.put("chitral_email", chi_email);
        contentValues.put("chitral_phone", chi_phone);
        long insertCheck = sql_db.insert(TABLE_NAME, null, contentValues);
        if (insertCheck == -1) {
            return false;
        } else {
            return true;
        }
    }
}
