package com.example.user.academicapp.Models;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by Kev' on 31/08/2015.
 */
@DatabaseTable
public class Theme {
    private static final String ID = "Id";
    private static final String NAME = "Name";

    public Theme(){

    }

    public void setId(int id){
        this.Id =id;
    }

    public void setName(String name ){
        this.Name = name;
    }

    public int getId(){ return Id;}

    public String getName(){ return Name;}

    @DatabaseField(columnName = ID, generatedId = true)
    private int Id;
    @DatabaseField(columnName = NAME)
    private String Name;
}
