package com.phatinya.phatinya_restaurant;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by user on 19/10/2559.
 */

public class FoodTABLE {
    //Explicit
    private MySQLiteOpenHelper objMySQLiteOpenHelper;
    private SQLiteDatabase writeSQLiteDatabase,readSqLiteDatabase;
        public FoodTABLE(Context context){
            objMySQLiteOpenHelper = new MySQLiteOpenHelper(context);
            writeSQLiteDatabase = objMySQLiteOpenHelper.getReadableDatabase();
            readSqLiteDatabase = objMySQLiteOpenHelper.getReadableDatabase();
    } //Constructor
}//Main Class
