package com.example.user.academicapp.Adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.user.academicapp.Models.Category;
import com.example.user.academicapp.R;

import java.util.List;

/**
 * Created by USER on 30/08/2015.
 */
public class AdapterCategory extends BaseAdapter{

    Context c;
    List<Category> categories;

    public AdapterCategory(Context c, List<Category> categories) {
        super();
        this.c = c;
        this.categories = categories;
    }

    @Override
    public int getCount() {
        return categories.size();
    }

    @Override
    public Object getItem(int position) {
        return categories.size();
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = ((Activity)c).getLayoutInflater();
        View view = inflater.inflate(R.layout.list_item_category, null);

        TextView name = (TextView) view.findViewById(R.id.list_item_category_name);
        TextView description = (TextView) view.findViewById(R.id.list_item_category_description);

        name.setText(categories.get(position).getName());
        description.setText(categories.get(position).getDescription());

        return view;
    }

}
