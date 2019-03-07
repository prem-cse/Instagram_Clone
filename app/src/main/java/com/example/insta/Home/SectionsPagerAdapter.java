package com.example.insta.Home;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class SectionsPagerAdapter extends FragmentPagerAdapter {
    private List<Fragment> fragList = new ArrayList<>();

    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        return fragList.get(i);
    }

    @Override
    public int getCount() {
        return fragList.size();
    }

    public void addFragment(Fragment fragment){
        fragList.add(fragment);
    }
}
