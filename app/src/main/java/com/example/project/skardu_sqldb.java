package com.example.project;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class skardu_sqldb extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "skardu_Details.db";
    private static int DATABASE_VERSON = 1;
    private static  String TABLE_NAME = "Skardu";
    private String query_create =" create table " + TABLE_NAME + "(skardu_name TEXT, skardu_email TEXT, skardu_phone TEXT)";
    public skardu_sqldb(Context context) { super(context, DATABASE_NAME, null, DATABASE_VERSON); }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(query_create);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    public boolean insert_ska_data (String ska_name, String ska_email, String  ska_phone) {
        SQLiteDatabase sql_db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("skardu_name", ska_name);
        contentValues.put("skardu_email", ska_email);
        contentValues.put("skardu_phone", ska_phone);
        long insertCheck = sql_db.insert(TABLE_NAME, null, contentValues);
        if (insertCheck == -1) {
            return false;
        } else {
            return true;
        }
    }
}
