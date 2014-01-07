package com.junkie.junkie;

import android.database.sqlite.SQLiteOpenHelper;

public class DataBase extends SQLiteOpenHelper{
		
	public static String DB_PATH = "/data/com.junkie.junkie/databases";
	public static String DB_NAME = "db_junkie";
	private final Context myContext;
	public static int v_db = 2;
	
	String sqlCreate = "CREATE TABLE voice_command (id INTEGER PRIMARY KEY AUTOINCREMENT," +
		"command TEXT, description TEXT, sendalert")";

}
