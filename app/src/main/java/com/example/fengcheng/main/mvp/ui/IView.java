package com.example.fengcheng.main.mvp.ui;

import android.database.Cursor;

import com.example.fengcheng.main.data.db.model.Login;

/**
 * @Package com.example.fengcheng.main.mvp.ui
 * @FileName IView
 * @Date 4/19/18, 10:01 AM
 * @Author Created by fengchengding
 * @Description Mvp
 */

public interface IView {
    void showToast(Login login);
    void setDbTxt(Cursor cursor);
}
