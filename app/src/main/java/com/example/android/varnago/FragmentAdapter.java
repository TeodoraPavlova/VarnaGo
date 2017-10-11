package com.example.android.varnago;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class FragmentAdapter extends FragmentPagerAdapter {
    // context of the application
    private Context mContext;

    //a constant for fragments
    private static final int fragmentCount = 5;

    //passing the context of the app with specific fragment
    public FragmentAdapter(Context context, FragmentManager fragmentManager){
        super(fragmentManager);
        mContext=context;
    }

    @Override
    public Fragment getItem(int position){
        switch (position){
            case 0: return new FragmentMostVisited();
            case 1: return new FragmentRestaurants();
            case 2: return new FragmentMuseums();
            case 3: return new FragmentBeaches();
            case 4: return new FragmentClubs();
            default: return new noFragmentFound();
        }
    }

    @Override
    public int getCount() {
        return fragmentCount;
    }


    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0: return mContext.getString(R.string.most_visited);
            case 1: return mContext.getString(R.string.restaurants);
            case 2: return mContext.getString(R.string.museums);
            case 3: return mContext.getString(R.string.beaches);
            case 4: return mContext.getString(R.string.clubs);
        }
        return super.getPageTitle(position);
    }
}
