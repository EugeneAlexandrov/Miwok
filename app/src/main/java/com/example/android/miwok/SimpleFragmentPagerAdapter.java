package com.example.android.miwok;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {
    private Context context;

    public SimpleFragmentPagerAdapter(@NonNull FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new ColorsFragment();
            case 1:
                return new NumbersFragment();
            case 2:
                return new FamilyFragment();
            case 3:
                return new PhrasesFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return context.getString(R.string.category_colors);
            case 1:
                return context.getString(R.string.category_numbers);
            case 2:
                return context.getString(R.string.category_family);
            case 3:
                return context.getString(R.string.category_phrases);
            default:
                return null;
        }
    }
}
