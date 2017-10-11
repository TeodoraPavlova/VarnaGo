package com.example.android.varnago;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class FragmentMostVisited extends Fragment {


    //creating the required empty constructor
    public FragmentMostVisited() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        View rooting = inflater.inflate(R.layout.fragment_list, viewGroup, false);

        //The creation of list of most visited places
        final ArrayList<Varna> varna = new ArrayList<Varna>();

        varna.add(new Varna(R.string.the_sea_garden,
                R.string.sea_garden_description,
                R.drawable.theseagarden));
        varna.add(new Varna(R.string.botanical_garden,
                R.string.botanical_garden_description,
                R.drawable.botanicalgarden));
        varna.add(new Varna(R.string.the_cathedral,
                R.string.the_cathedral_description,
                R.drawable.cathedral));
        varna.add(new Varna(R.string.golden_sands,
                R.string.golden_sands_description,
                R.drawable.goldensands));
        varna.add(new Varna(R.string.dolphinarium,
                R.string.dolphinarium_description,
                R.drawable.dolphinarium));
        varna.add(new Varna(R.string.aladzha_monastery,
                R.string.aladzha_monastery_description,
                R.drawable.aladzhamonastery));

        VarnaAdapter adapter = new VarnaAdapter(getActivity(), varna, R.color.fragmentColor);

        ListView listView = (ListView) rooting.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rooting;

    }
}
