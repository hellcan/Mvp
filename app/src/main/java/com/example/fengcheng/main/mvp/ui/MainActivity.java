package com.example.fengcheng.main.mvp.ui;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.fengcheng.main.data.db.model.Login;
import com.example.fengcheng.main.mvp.R;

/**
 * MainActivity is a view
 * description ABCDEFG
 */


public class MainActivity extends AppCompatActivity implements IView {
    IPresenter iPresenter;
    EditText nameEdt, pwdEdt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameEdt = findViewById(R.id.edt_name);
        pwdEdt = findViewById(R.id.edt_pwd);

        iPresenter = new Presenter(this);
    }


    public void clickHandler(View view) {
        //tell presenter that btn was clicked
        //because its the presenter who will decide what needs to be done on click of this button
        Login login = new Login(nameEdt.getText().toString(), pwdEdt.getText().toString());
        iPresenter.onButtonClicked(view, login);
    }


    @Override
    public void showToast(Login login) {
        Toast.makeText(this, login.getName(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void setDbTxt(Cursor cursor) {
        pwdEdt.setText(cursor.getCount()+"");
    }
}
