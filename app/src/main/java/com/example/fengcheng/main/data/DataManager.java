package com.example.fengcheng.main.data;

import com.example.fengcheng.main.data.db.IDbHelper;
import com.example.fengcheng.main.data.db.model.Login;

/**
 * @Package com.example.fengcheng.main.data
 * @FileName DataManager
 * @Date 4/19/18, 11:33 AM
 * @Author Created by fengchengding
 * @Description Mvp
 */

public class DataManager implements IDataManager {
    IDbHelper iDbHelper;

    @Override
    public void openDb() {
        iDbHelper.openDb();
    }

    @Override
    public void closeDb() {
        iDbHelper.closeDb();
    }

    @Override
    public void createRow(Login login) {
        iDbHelper.createRow(login);
    }


    @Override
    public void readRow(OnDataReceive onDataReceive) {

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
