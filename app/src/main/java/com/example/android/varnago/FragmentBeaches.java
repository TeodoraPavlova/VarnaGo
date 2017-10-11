package com.example.android.varnago;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class FragmentBeaches extends Fragment {

    //creating the required empty constructor
    public FragmentBeaches() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        View rooting = inflater.inflate(R.layout.fragment_list, viewGroup, false);

        //The creation of list of beaches
        final ArrayList<Varna> varna = new ArrayList<Varna>();

        varna.add(new Varna(R.string.fichoza_beach,
                R.string.fichoza_beach_description,
                R.drawable.fichozabeach));
        varna.add(new Varna(R.string.pasha_dere_beach,
                R.string.pasha_dere_beach_description,
                R.drawable.pashaderebeach));
        varna.add(new Varna(R.string.sunny_day_beach,
                R.string.sunny_day_beach_description,
                R.drawable.sunnydaybeach));
        varna.add(new Varna(R.string.golden_sands_beach,
                R.string.golden_sands_description,
                R.drawable.goldensands));
        varna.add(new Varna(R.string.kranevo_beach,
                R.string.kranevo_beach_description,
                R.drawable.kranevobeach));

        VarnaAdapter adapter = new VarnaAdapter(getActivity(), varna, R.color.fragmentColor);

        ListView listView = (ListView) rooting.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rooting;
    }
}