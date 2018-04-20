package com.example.fengcheng.main.mvp.ui;

import android.content.Context;
import android.database.Cursor;
import android.view.View;

import com.example.fengcheng.main.data.db.DbHelper;
import com.example.fengcheng.main.data.db.IDbHelper;
import com.example.fengcheng.main.data.db.model.Login;
import com.example.fengcheng.main.mvp.R;

/**
 * @Package com.example.fengcheng.main.mvp.ui
 * @FileName Presenter
 * @Date 4/19/18, 9:45 AM
 * @Author Created by fengchengding
 * @Description Mvp
 */

public class Presenter implements IPresenter, IDbHelper.OnDataReceive {
    Context context;
    IView iView;
    IDbHelper iDbHelper;

    public Presenter(MainActivity activity) {
        iView = activity;
        iDbHelper  = new DbHelper(activity);
    }

    @Override
    public void onButtonClicked(View v, Login login) {
        iDbHelper.openDb();

        switch (v.getId()){
            case R.id.btn_login:
                iView.showToast(login);
                iDbHelper.createRow(login);
                break;
            case R.id.btn_cancel:
                iDbHelper.readRow(this);
                break;
        }
    }

    @Override
    public void onSuccess(Cursor cursor) {
        iView.setDbTxt(cursor);
    }

    @Override
    public void onFailure() {

    }
}
