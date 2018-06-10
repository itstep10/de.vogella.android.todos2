package de.vogella.android.todos.database;

import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

public class MyTable {

    // Database table
    public static final String MY_TABLE = "mytable";
    public static final String COLUMN_ID = "_id";

    // Database creation SQL statement
    private static final String DATABASE_CREATE = "create table "
            + MY_TABLE
            + "(" + COLUMN_ID + " integer primary key autoincrement, "
            + "name text"
            + ");";

    public static void onCreate(SQLiteDatabase database) {
        database.execSQL(DATABASE_CREATE);
    }
}
