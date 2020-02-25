package com.example.android.miwok;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;
import java.util.List;

public class WordAdapter extends ArrayAdapter<Word> {
    Context mcontext;
    int prev_position = 0;
    int mbg_color;

    /**
     * Create a new {@link WordAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param objects is the list of {@link Word}s to be displayed.
     * @param bg_color is the resource ID for the background color for this list of words
     */
    public WordAdapter(@NonNull Context context, @NonNull ArrayList<Word> objects, int bg_color) {
        super(context, 0, objects);
        mcontext = context;
        mbg_color = bg_color;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.item, parent, false);
        }
        //
        Word currentword = getItem(position);
        RelativeLayout item_container = (RelativeLayout) listItemView.findViewById(R.id.listview_item_container);
        LinearLayout text_container = (LinearLayout) listItemView.findViewById(R.id.text_container);
        TextView miwokText = (TextView) listItemView.findViewById(R.id.miwok_txt);
        TextView defaultTranslationText = (TextView) listItemView.findViewById(R.id.defaultTranslate_txt);
        ImageView image = (ImageView) listItemView.findViewById(R.id.imageView);
        //
        int color = ContextCompat.getColor(getContext(), mbg_color);
        text_container.setBackgroundColor(color);
        //
        miwokText.setText(currentword.getMiwokTranslation());
        defaultTranslationText.setText(currentword.getDefaultTranslation());
        //
        if (currentword.getImage() == 0) {
            image.setVisibility(View.GONE);
        } else image.setImageResource(currentword.getImage());
        //
        if (prev_position > position)
            item_container.setAnimation(AnimationUtils.loadAnimation(mcontext, R.anim.fade_down_transition_animation));
        else
            item_container.setAnimation(AnimationUtils.loadAnimation(mcontext, R.anim.fade_up_transition_animation));
        prev_position = position;
        //
        return listItemView;
    }
}
