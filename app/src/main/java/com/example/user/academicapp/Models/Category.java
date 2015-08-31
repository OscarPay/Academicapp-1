package com.example.user.academicapp.Models;

/**
 * Created by USER on 30/08/2015.
 */
public class Category {

    private String name;
    private String description;

    public Category(String name, String description){
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
