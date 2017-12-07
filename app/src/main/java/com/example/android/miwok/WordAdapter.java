package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Nick on 11/18/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private int backgroundColor;

    public WordAdapter(@NonNull Context context, @NonNull List<Word> objects, int backgroundColor) {

        super(context, 0, objects);
        this.backgroundColor = backgroundColor;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        LinearLayout wordLayout = listItemView.findViewById(R.id.word_layout);
        int color = ContextCompat.getColor(getContext(), backgroundColor);
        wordLayout.setBackgroundColor(color);

        TextView defaultTranslation = listItemView.findViewById(R.id.default_translation);
        defaultTranslation.setText(currentWord.getDefaultTranslation());

        TextView miwokTranslation = listItemView.findViewById(R.id.miwok_translation);
        miwokTranslation.setText(currentWord.getMiwokTranslation());

        ImageView image = listItemView.findViewById(R.id.image);

        if (currentWord.wordHasImage()) {

            image.setImageResource(currentWord.getImageResourceId());

        } else {

            image.setVisibility(View.GONE);

        }

        return listItemView;

    }
}
