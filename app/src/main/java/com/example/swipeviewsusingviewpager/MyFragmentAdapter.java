package com.example.swipeviewsusingviewpager;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class MyFragmentAdapter extends FragmentStatePagerAdapter
{
    public MyFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        MyFragment myFragment = new MyFragment();
        Bundle bundle = new Bundle();
        position = position +1 ;
        bundle.putString("message","Page : "+position);
        myFragment.setArguments(bundle);
        return myFragment;
    }

    @Override
    public int getCount() {
        return 100;
    }
}
