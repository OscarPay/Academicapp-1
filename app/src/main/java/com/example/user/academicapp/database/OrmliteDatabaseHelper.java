package com.example.user.academicapp.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.user.academicapp.Models.Category;
import com.example.user.academicapp.Models.Theme;
import com.example.user.academicapp.Models.User;
import com.google.inject.Inject;
import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import roboguice.inject.ContextSingleton;

@ContextSingleton
public class OrmliteDatabaseHelper extends OrmLiteSqliteOpenHelper{

	@Inject
	public OrmliteDatabaseHelper(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase database,
			ConnectionSource connectionSource) {
		// TODO Auto-generated method stub
		for(Class<?> currentClass : mDbClasses){
			try{
				TableUtils.createTableIfNotExists(connectionSource, currentClass);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}

	@Override
	public void onUpgrade(SQLiteDatabase database,
			ConnectionSource connectionSource, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		
	}

	private static Class<?>[] mDbClasses = {
			Category.class,
			Theme.class,
			User.class
	};
	
	private static final String DATABASE_NAME = "SurveyApp.db";
	private static final int DATABASE_VERSION = 2;
}
