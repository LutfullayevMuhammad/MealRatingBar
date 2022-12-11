package uz.isystem.lesson26.core;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import androidx.annotation.NonNull;

import uz.isystem.lesson26.R;
import uz.isystem.lesson26.core.adapter.MealAdapter;
import uz.isystem.lesson26.core.models.MealData;

public class JavaAdapter extends BaseAdapter {

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        int image;

        if (true) {
            image = R.drawable.ic_favorite_full;
        }else {
            image = R.drawable.ic_favorite_empty;
        }


        MealAdapter mealAdapter = new MealAdapter();

        mealAdapter.setOnMoreClickListener(new MealAdapter.OnMoreClickListener() {
            @Override
            public void onClick(@NonNull MealData mealData) {

            }
        });

        return null;
    }
}
