package com.example.fengcheng.main.mvp.splash;

/**
 * @Package com.example.fengcheng.main.mvp.splash
 * @FileName IPresenter
 * @Date 4/19/18, 10:26 AM
 * @Author Created by fengchengding
 * @Description Mvp
 */

public interface IPresenter {

    void showProgress();

    void startLogin();

    void activityReady(SplashActivity activity);
}
