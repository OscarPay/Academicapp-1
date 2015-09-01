package com.example.user.academicapp.Models;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.Collection;

/**
 * Created by USER on 30/08/2015.
 */
@DatabaseTable
public class Category {
    public static final String ID = "Id";
    public static final String NAME = "Name";
    public static final String DESCRIPTION = "Description";

    public Category(){

    }

    public Category(String name, String description){
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public int getId(){ return id;}

    public void setId(int id){
        this.id = id;
    }

    public Collection<Theme> getThemes(){
        return themes;
    }

    public void setThemes(Collection<Theme> themes){
        this.themes = themes;
    }

    @DatabaseField(columnName = ID, generatedId = true)
    private int id;
    @DatabaseField(columnName = NAME)
    private String name;
    @DatabaseField(columnName = DESCRIPTION)
    private String description;
    @ForeignCollectionField(eager = true)
    private Collection<Theme> themes;
}
