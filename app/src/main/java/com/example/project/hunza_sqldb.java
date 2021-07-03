package com.example.project;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class hunza_sqldb extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "hunza_Details.db";
    private static int DATABASE_VERSON = 1;
    private static  String TABLE_NAME = "Hunza";
    private String query_create =" create table " + TABLE_NAME + "(hunza_name TEXT, hunza_email TEXT, hunza_phone TEXT)";
    public hunza_sqldb(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSON);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(query_create);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    public boolean insert_hun_data (String hun_name, String hun_email, String  hun_phone) {
        SQLiteDatabase sql_db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("hunza_name", hun_name);
        contentValues.put("hunza_email", hun_email);
        contentValues.put("hunza_phone", hun_phone);
        long insertCheck = sql_db.insert(TABLE_NAME, null, contentValues);
        if (insertCheck == -1) {
            return false;
        } else {
            return true;
        }
    }
}
