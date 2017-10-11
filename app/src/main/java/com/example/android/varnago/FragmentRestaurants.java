package com.example.android.varnago;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class FragmentRestaurants extends Fragment {


    //creating the required empty constructor
    public FragmentRestaurants() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        View rooting = inflater.inflate(R.layout.fragment_list, viewGroup, false);

        //The creation of list of restaurants
        final ArrayList<Varna> varna = new ArrayList<Varna>();

        varna.add(new Varna(R.string.happy,
                R.string.happy_restaurant_description,
                R.drawable.happyrestaurant));
        varna.add(new Varna(R.string.the_sea_terrace,
                R.string.the_sea_terrace_restaurant_description,
                R.drawable.theseaterrace));
        varna.add(new Varna(R.string.mr_baba,
                R.string.mr_baba_restaurant_description,
                R.drawable.mrbaba));
        varna.add(new Varna(R.string.massa,
                R.string.massa_restaurant_description,
                R.drawable.massa));
        varna.add(new Varna(R.string.sardinia,
                R.string.sardinia_restaurant_description,
                R.drawable.sardinia));

        VarnaAdapter adapter = new VarnaAdapter(getActivity(), varna, R.color.fragmentColor);

        ListView listView = (ListView) rooting.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rooting;
    }
}