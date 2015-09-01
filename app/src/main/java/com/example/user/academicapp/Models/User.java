package com.example.user.academicapp.Models;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.Collection;

/**
 * Created by Kev' on 31/08/2015.
 */

@DatabaseTable
public class User {

    private static final String ID = "Id";
    private static final String NAME = "Name";
    private static final String GRADE = "Grade";
    private static final String EXPPOINTS = "ExpPoints";
    private static final String COMPLETEDTHEMES = "CompletedThemes";

    public User(){}

    public int getId(){ return Id;}

    public void setId(int id){ this.Id = id;}

    public void setName(String name){
        this.Name = name;
    }

    public String getName(){
        return Name;
    }

    public void setGrade(String grade){
        this.Grade = grade;
    }

    public String getGrade(){
        return Grade;
    }

    public void setExppoints(int expPoints){
        this.expPoints = expPoints;
    }

    public int getExpPoints(){
        return expPoints;
    }

    public void setCompletedthemes(Collection<Theme> completedThemes){
        this.completedThemes = completedThemes;
    }

    public Collection<Theme> getCompletedThemes(){
        return completedThemes;
    }

    @DatabaseField(columnName = ID, generatedId = true)
    private int Id;
    @DatabaseField(columnName = NAME)
    private String Name;
    @DatabaseField(columnName = GRADE)
    private String Grade;
    @DatabaseField(columnName = EXPPOINTS)
    private int expPoints;
    @ForeignCollectionField(eager = true)
    private Collection<Theme> completedThemes;
}
