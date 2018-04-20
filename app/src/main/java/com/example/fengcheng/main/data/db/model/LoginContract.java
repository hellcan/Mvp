package com.example.fengcheng.main.data.db.model;

import android.provider.BaseColumns;

public final class LoginContract {
    // To prevent someone from accidentally instantiating the contract class,
    // give it an empty constructor.
    public LoginContract() {}

    /* Inner class that defines the table contents */
    public static abstract class LoginEntry implements BaseColumns {
        public static final String TABLE_NAME = "tb_login";
        public static final String COLUMN_NAME_ENTRY_ID = "entryid";
        public static final String COLUMN_NAME_TITLE = "name";
        public static final String COLUMN_NAME_PASSWORD = "password";
    }
}