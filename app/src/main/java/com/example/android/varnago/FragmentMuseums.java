package com.example.android.varnago;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class FragmentMuseums extends Fragment {

    //creating the required empty constructor
    public FragmentMuseums() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        View rooting = inflater.inflate(R.layout.fragment_list, viewGroup, false);

        //The creation of list of museums
        final ArrayList<Varna> varna = new ArrayList<Varna>();

        varna.add(new Varna(R.string.archaeological_museum,
                R.string.archaeological_museum_description,
                R.drawable.archaeologicalmuseum));
        varna.add(new Varna(R.string.ethnographic_museum,
                R.string.ethnographic_museum_description,
                R.drawable.ethnographicmuseum));
        varna.add(new Varna(R.string.astronomical_museum,
                R.string.astronomical_museum_description,
                R.drawable.astronomicalmuseum));
        varna.add(new Varna(R.string.retro_museum,
                R.string.retro_museum_description,
                R.drawable.retromuseum));
        varna.add(new Varna(R.string.national_maritime_museum,
                R.string.national_maritime_museum_description,
                R.drawable.maritimemuseum));

        VarnaAdapter adapter = new VarnaAdapter(getActivity(), varna, R.color.fragmentColor);

        ListView listView = (ListView) rooting.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rooting;
    }
}