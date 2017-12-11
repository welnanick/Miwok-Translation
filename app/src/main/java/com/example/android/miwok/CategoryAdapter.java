package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

class CategoryAdapter extends FragmentPagerAdapter {

    Context context;

    public CategoryAdapter(Context context, FragmentManager fm) {

        super(fm);
        this.context = context;

    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {

            case 0:
                return new NumbersFragment();
            case 1:
                return new FamilyFragment();
            case 2:
                return new ColorsFragment();
            default:
                return new PhraseFragment();

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
                return context.getString(R.string.category_numbers);
            case 1:
                return context.getString(R.string.category_family);
            case 2:
                return context.getString(R.string.category_colors);
            default:
                return context.getString(R.string.category_phrases);

        }
    }
}
