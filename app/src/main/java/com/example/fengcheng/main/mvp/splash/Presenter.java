package com.example.fengcheng.main.mvp.splash;

import android.content.Context;
import android.content.Intent;

import com.example.fengcheng.main.mvp.ui.MainActivity;

/**
 * @Package com.example.fengcheng.main.mvp.splash
 * @FileName Presenter
 * @Date 4/19/18, 10:26 AM
 * @Author Created by fengchengding
 * @Description Mvp
 */

public class Presenter implements IPresenter {
    IView iView;

    public Presenter(SplashActivity activity) {
        iView = activity;
    }


    @Override
    public void showProgress() {

    }

    @Override
    public void startLogin() {

    }

    @Override
    public void activityReady(SplashActivity activity) {
        iView.showLoading();
        try {
            Thread.sleep(2000);

            activity.startActivity(new Intent(activity, MainActivity.class));

            iView.hideLoading();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //start activity
    }
}
