package com.example.user.academicapp.database.ormlite;

import com.example.user.academicapp.Models.Category;
import com.example.user.academicapp.Models.Theme;
import com.example.user.academicapp.database.OrmliteDatabaseHelper;
import com.example.user.academicapp.repository.interfaces.CategoryRepository;
import com.example.user.academicapp.repository.interfaces.SearchCriteria;
import com.example.user.academicapp.repository.interfaces.ThemeRepository;
import com.google.inject.Inject;

import java.util.List;

/**
 * Created by Kev' on 31/08/2015.
 */
public class OrmliteCategoryRepository extends OrmliteBaseRepository<Category> implements CategoryRepository{

    @Inject
    public OrmliteCategoryRepository(OrmliteDatabaseHelper helper) {
        super(helper, Category.class);
        // TODO Auto-generated constructor stub
        mHelper = helper;
        initRepository();

    }

    @Override
    public List<Category> fetchAll() {
        return super.fetchAll();
    }

    @Override
    public List<Category> fetchByCriteria(SearchCriteria criteria) {
        return super.fetchByCriteria(criteria);
    }

    @Override
    public int addObject(Category object) {
        int created = 0;
        created += super.addObject(object);
        addThemeCompleted(object);
        return created;
    }

    @Override
    public int addObjects(List<Category> objectList) {
        return super.addObjects(objectList);
    }

    @Override
    public int deleteObject(Category object) {
        return super.deleteObject(object);
    }

    @Override
    public int deleteObjects(List<Category> objectList) {
        return super.deleteObjects(objectList);
    }

    @Override
    public int updateObject(Category object) {
        return super.updateObject(object);
    }

    @Override
    public int updateObjects(List<Category> objectList) {
        return super.updateObjects(objectList);
    }

    private void initRepository() {
        // TODO Auto-generated method stub
        mThemeRepository = new OrmliteThemeRepository(mHelper);
    }

    private void addThemeCompleted(Category object){
        if (object != null && object.getThemes() != null) {
            for (Theme theme : object.getThemes()) {
                mThemeRepository.addObject(theme);
            }
        }
    }

    private OrmliteDatabaseHelper mHelper;
    private ThemeRepository mThemeRepository;
}
