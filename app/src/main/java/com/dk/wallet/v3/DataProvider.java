package com.dk.wallet.v3;

import android.content.Context;

/**
 * Created by dkuz on 18.09.16.
 */
public class DataProvider {

    static DbHelper mHelper;

    static void init(Context context) {
        if (mHelper == null) {
            mHelper = new DbHelper(context);
        }
    }
}
