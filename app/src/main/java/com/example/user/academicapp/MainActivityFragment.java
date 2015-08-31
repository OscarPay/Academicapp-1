package com.example.user.academicapp;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.user.academicapp.Adapters.AdapterCategory;
import com.example.user.academicapp.Models.Category;

import java.util.ArrayList;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        List<Category> listCategories = new ArrayList<Category>();

        listCategories.add(new Category("Operaciones", "asdasdasd"));
        listCategories.add(new Category("Tablas de Multiplicar", "asdasdasd"));
        listCategories.add(new Category("Fracciones", "asdfasdfa"));
        listCategories.add(new Category("Figuras", "asdasdad"));
        listCategories.add(new Category("Numeros", "asdasdasd"));
        listCategories.add(new Category("Medidas", "asdasdasdasdasd"));
        listCategories.add(new Category("Geometria", "adasdasdasdas"));

        ListView listView = (ListView) rootView.findViewById(R.id.listView_categories);
        listView.setAdapter(new AdapterCategory(getActivity(), listCategories));

        return rootView;
    }
}
