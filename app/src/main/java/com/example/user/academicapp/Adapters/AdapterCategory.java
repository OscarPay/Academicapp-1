package com.example.user.academicapp.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.user.academicapp.Models.Category;
import com.example.user.academicapp.R;
import com.example.user.academicapp.viewholders.ViewHolderCategory;

import java.util.List;

/**
 * Created by USER on 30/08/2015.
 */
public class AdapterCategory extends ArrayAdapter<Category> {

    private Context c;
    private List<Category> categories;

    public AdapterCategory(Context c, List<Category> categories) {
        super(c, R.layout.list_item_category, categories);
        this.c = c;
        this.categories = categories;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View currentView = convertView;
        ViewHolderCategory holder;

        if(currentView == null){
            LayoutInflater inflater = LayoutInflater.from(c);
            currentView = inflater.inflate(R.layout.list_item_category, parent,false);
            holder = new ViewHolderCategory();
            holder.image = (ImageView) currentView.findViewById(R.id.list_item_imageView_icon);
            holder.title = (TextView) currentView.findViewById(R.id.list_item_category_name);
            holder.description = (TextView) currentView.findViewById(R.id.list_item_category_description);
            currentView.setTag(holder);
        }

        holder = (ViewHolderCategory) currentView.getTag();
        Category category = categories.get(position);

        holder.title.setText(category.getName());
        holder.description.setText(category.getDescription());

        return currentView;
    }

}
