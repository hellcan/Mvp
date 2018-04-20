package com.example.fengcheng.main.data.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.fengcheng.main.data.db.model.Login;
import com.example.fengcheng.main.data.db.model.LoginContract;

/**
 * @Package com.example.fengcheng.main.data.db
 * @FileName DbHelper
 * @Date 4/19/18, 11:38 AM
 * @Author Created by fengchengding
 * @Description Mvp
 */

public class DbHelper implements IDbHelper {
    SQLiteDatabase db;
    DbOpenHelper openHelper;

    public DbHelper(Context context) {
        openHelper = new DbOpenHelper(context);

    }

    @Override
    public void openDb() {
        db = openHelper.getWritableDatabase();
    }

    @Override
    public void closeDb() {
        db.close();
    }

    @Override
    public void createRow(Login login) {
        ContentValues mContentValue = new ContentValues();
        mContentValue.put(LoginContract.LoginEntry.COLUMN_NAME_TITLE, login.getName());
        mContentValue.put(LoginContract.LoginEntry.COLUMN_NAME_PASSWORD, login.getPwd());

        this.db.insertOrThrow(LoginContract.LoginEntry.TABLE_NAME, null, mContentValue);
    }

    @Override
    public void readRow(OnDataReceive onDataReceive) {
        Cursor cursor;
        cursor = db.query(LoginContract.LoginEntry.TABLE_NAME, null, null, null, null, null, null);
        onDataReceive.onSuccess(cursor);
    }

    @Override
    public void readAllRow() {

    }

    @Override
    public void updateRow() {

    }

    @Override
    public void deleteRow() {

    }
}
