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
    private static final String DESCRIPTION = "Description";
    private static final String CATEGORY= "Category";

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

    public void setDescription(String description){ this.Description = description;}

    public String getDescription(){ return Description;}

    public void setCategory(Category category){
        this.category = category;
    }

    public Category getCategory(){
        return category;
    }

    @DatabaseField(columnName = ID, generatedId = true)
    private int Id;
    @DatabaseField(columnName = NAME)
    private String Name;
    @DatabaseField(columnName = DESCRIPTION)
    private String Description;
    @DatabaseField(foreign = true, foreignColumnName = Category.ID, foreignAutoRefresh = true, columnName = CATEGORY)
    private transient Category category;
}
