package com.example.fengcheng.main.mvp.splash;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.fengcheng.main.mvp.R;

public class SplashActivity extends AppCompatActivity implements IView {
    Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        presenter = new Presenter(this);
    }


    @Override
    protected void onStart() {
        super.onStart();
        presenter.activityReady(this);
    }

    @Override
    public void showLoading() {
        Toast.makeText(this, "show", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void hideLoading() {
        Toast.makeText(this, "hide", Toast.LENGTH_SHORT).show();

    }
}
