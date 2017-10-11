package com.example.android.varnago;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class FragmentClubs extends Fragment {
    //creating the required empty constructor
    public FragmentClubs() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        View rooting = inflater.inflate(R.layout.fragment_list, viewGroup, false);

        //The creation of list of Clubs
        final ArrayList<Varna> varna = new ArrayList<Varna>();

        varna.add(new Varna(R.string.debut,
                R.string.debut_beach_bar_description,
                R.drawable.debut));
        varna.add(new Varna(R.string.punta_cana,
                R.string.punta_cana_description,
                R.drawable.puntacana));
        varna.add(new Varna(R.string.xtravaganzza,
                R.string.xtravaganzza_description,
                R.drawable.xtravaganzza));
        varna.add(new Varna(R.string.arrogance,
                R.string.arrogance_description,
                R.drawable.arrogance));
        varna.add(new Varna(R.string.la_playa,
                R.string.la_playa_description,
                R.drawable.laplaya));

        VarnaAdapter adapter = new VarnaAdapter(getActivity(), varna, R.color.fragmentColor);

        ListView listView = (ListView) rooting.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rooting;
    }
}