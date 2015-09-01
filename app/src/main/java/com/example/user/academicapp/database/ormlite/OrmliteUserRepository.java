package com.example.user.academicapp.database.ormlite;

import com.example.user.academicapp.Models.Theme;
import com.example.user.academicapp.Models.User;
import com.example.user.academicapp.database.OrmliteDatabaseHelper;
import com.example.user.academicapp.repository.interfaces.SearchCriteria;
import com.example.user.academicapp.repository.interfaces.UserRepository;
import com.google.inject.Inject;

import java.util.List;

/**
 * Created by Kev' on 31/08/2015.
 */
public class OrmliteUserRepository extends OrmliteBaseRepository<User> implements UserRepository {

    @Inject
    public OrmliteUserRepository(OrmliteDatabaseHelper helper){
        super(helper, User.class);
        this.mHelper = helper;
        initRepository();
    }

    private void initRepository() {
        // TODO Auto-generated method stub
        mThemeRepository = new OrmliteThemeRepository(mHelper);
    }

    @Override
    public List<User> fetchAll() {
        return super.fetchAll();
    }

    @Override
    public List<User> fetchByCriteria(SearchCriteria criteria) {
        return super.fetchByCriteria(criteria);
    }

    @Override
    public int addObject(User object) {
        int created = 0;
        created += super.addObject(object);
        addThemeCompleted(object);
        return created;
    }

    @Override
    public int addObjects(List<User> objectList) {
        return super.addObjects(objectList);
    }

    @Override
    public int deleteObject(User object) {
        return super.deleteObject(object);
    }

    @Override
    public int deleteObjects(List<User> objectList) {
        return super.deleteObjects(objectList);
    }

    @Override
    public int updateObject(User object) {
        return super.updateObject(object);
    }

    @Override
    public int updateObjects(List<User> objectList) {
        return super.updateObjects(objectList);
    }

    private void addThemeCompleted(User object){
        if (object != null && object.getCompletedThemes() != null) {
            for (Theme theme : object.getCompletedThemes()) {
                mThemeRepository.addObject(theme);
            }
        }
    }

    private OrmliteDatabaseHelper mHelper;
    private OrmliteThemeRepository mThemeRepository;
}
