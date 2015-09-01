package com.example.user.academicapp.database.ormlite;

import com.example.user.academicapp.Models.Theme;
import com.example.user.academicapp.database.OrmliteDatabaseHelper;
import com.example.user.academicapp.repository.interfaces.SearchCriteria;
import com.example.user.academicapp.repository.interfaces.ThemeRepository;
import com.google.inject.Inject;

import java.util.List;

/**
 * Created by Kev' on 31/08/2015.
 */
public class OrmliteThemeRepository extends OrmliteBaseRepository<Theme> implements ThemeRepository{

    @Inject
    public OrmliteThemeRepository(OrmliteDatabaseHelper helper){
        super(helper, Theme.class);
        this.mHelper = helper;
    }

    @Override
    public List<Theme> fetchAll() {
        return super.fetchAll();
    }

    @Override
    public List<Theme> fetchByCriteria(SearchCriteria criteria) {
        return super.fetchByCriteria(criteria);
    }

    @Override
    public int addObject(Theme object) {
        return super.addObject(object);
    }

    @Override
    public int addObjects(List<Theme> objectList) {
        return super.addObjects(objectList);
    }

    @Override
    public int deleteObject(Theme object) {
        return super.deleteObject(object);
    }

    @Override
    public int deleteObjects(List<Theme> objectList) {
        return super.deleteObjects(objectList);
    }

    @Override
    public int updateObject(Theme object) {
        return super.updateObject(object);
    }

    @Override
    public int updateObjects(List<Theme> objectList) {
        return super.updateObjects(objectList);
    }

    private OrmliteDatabaseHelper mHelper;
}
