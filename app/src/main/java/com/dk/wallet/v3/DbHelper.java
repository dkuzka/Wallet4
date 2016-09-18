package com.dk.wallet.v3;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.support.annotation.Nullable;

/**
 * Created by dkuz on 18.09.16.
 */
public class DbHelper extends SQLiteOpenHelper {

    //private SQLiteDatabase db;

    final String CREATE_TABLE = "CREATE TABLE accounts(_ID integer,name text)";
    final static int DATABASE_VERSION = 1;
    final static String DB_NAME = "wallet.db";
    Context mContext;

    public DbHelper(Context context/*, int dbVer*/) {
        super(context, DB_NAME, null, DATABASE_VERSION /*dbVer*/);
        //(Context context, String name, CursorFactory factory, int version)
        mContext = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
//        //проверяете какая версия сейчас и делаете апдейт
//        db.execSQL("DROP TABLE IF EXISTS tableName");
//        onCreate(db);
    }
}
