package com.example.fengcheng.main.data.db;

import android.database.Cursor;

import com.example.fengcheng.main.data.db.model.Login;

/**
 * @Package com.example.fengcheng.main.data.db
 * @FileName IDbHelper
 * @Date 4/19/18, 11:35 AM
 * @Author Created by fengchengding
 * @Description Mvp
 */

public interface IDbHelper {

    void openDb();
    void closeDb();

    void createRow(Login login);
    void readRow(OnDataReceive onDataReceive);
    void readAllRow();
    void updateRow();
    void deleteRow();

    interface OnDataReceive{
        void onSuccess(Cursor cursor);
        void onFailure();
    }
}
