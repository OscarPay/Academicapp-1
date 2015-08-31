package com.example.user.academicapp.database;

import roboguice.inject.ContextSingleton;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.google.inject.Inject;
import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

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
			/*
		Answer.class,
		CompletedSurvey.class,
		Binnacle.class,
		Location.class,
		QuestionOption.class,
		Question.class,
		Section.class,
		SocialToken.class,
		Survey.class,
		Task.class,
		User.class,
		FacebookTask.class,
		TwitterTask.class,
		CompletedTask.class*/
	};
	
	private static final String DATABASE_NAME = "SurveyApp.db";
	private static final int DATABASE_VERSION = 2;
}
