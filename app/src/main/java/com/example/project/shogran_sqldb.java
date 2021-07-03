package com.example.project;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class shogran_sqldb extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "shogran_Details.db";
    private static int DATABASE_VERSON = 1;
    private static  String TABLE_NAME = "Shogran";
    private String query_create =" create table " + TABLE_NAME + "(shogran_name TEXT, shogran_email TEXT, shogran_phone TEXT)";
    public shogran_sqldb(Context context) { super(context, DATABASE_NAME, null, DATABASE_VERSON); }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(query_create);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    public boolean insert_sho_data (String sho_name, String sho_email, String  sho_phone) {
        SQLiteDatabase sql_db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("shogran_name", sho_name);
        contentValues.put("shogran_email", sho_email);
        contentValues.put("shogran_phone", sho_phone);
        long insertCheck = sql_db.insert(TABLE_NAME, null, contentValues);
        if (insertCheck == -1) {
            return false;
        } else {
            return true;
        }
    }
}
