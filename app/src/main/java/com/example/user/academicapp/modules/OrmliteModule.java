package com.example.user.academicapp.modules;

import android.app.Application;
import android.content.Context;

import com.example.user.academicapp.database.OrmliteDatabaseHelper;
import com.google.inject.AbstractModule;

public class OrmliteModule extends AbstractModule{
	
	public OrmliteModule(Application application){
		mContext = application;
	}
	
	@Override
	protected void configure() {
		// TODO Auto-generated method stub
		OrmliteDatabaseHelper helper = new OrmliteDatabaseHelper(mContext);

		/**
		bind(AnswerRepository.class).toInstance(new OrmliteAnswerRepository(helper));
		*/
		
	}

	private Context mContext;
}
