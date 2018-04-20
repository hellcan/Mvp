package com.example.fengcheng.main.mvp.ui;

import android.view.View;

import com.example.fengcheng.main.data.db.model.Login;

/**
 * @Package com.example.fengcheng.main.mvp
 * @FileName IPresenter
 * @Date 4/19/18, 9:43 AM
 * @Author Created by fengchengding
 * @Description Mvp
 */

public interface IPresenter {
     void onButtonClicked(View v, Login login);

}
