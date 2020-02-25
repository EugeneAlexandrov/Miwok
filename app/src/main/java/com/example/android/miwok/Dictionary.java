package com.example.android.miwok;

import android.content.Context;
import android.content.res.Resources;

import java.util.ArrayList;

public class Dictionary {
    static ArrayList<Word> mDictionary;
    ArrayList<Word> mWord_list;
    Context mcntxt;
    private Word mWord;
    private static volatile Dictionary instance;

    private Dictionary(Context context) {
        mcntxt = context;
    }

    public static Dictionary getInstance(Context context) {

        synchronized (Dictionary.class) {
            if (instance == null) {
                instance = new Dictionary(context);
            }
            instance.dictionary_init();
            return instance;
        }
    }

//    public ArrayList<Word> getWordsAll() {
//        mWord_list = new ArrayList<Word>();
//        Category[] category = Category.values();
//        Resources res = mcntxt.getResources();
//        for (Category cat : category) {
//            String[] miwok_word = res.getStringArray(cat.getMiwokTranslate());
//            String[] default_word = res.getStringArray(cat.getDefaultTranslate());
//            for (int i = 0; i < miwok_word.length; i++) {
//                mWord_list.add(new Word(miwok_word[i], default_word[i]));
//            }
//        }
//        return mWord_list;
//    }

    public ArrayList<Word> getWords(Category category) {
        //Category category1= category;
        mWord_list = new ArrayList<Word>();
        for (Word word:mDictionary) {
            if(word.getCategory()==category)
            mWord_list.add(word);
        }
        return mWord_list;
    }

    private void dictionary_init() {
        mDictionary=new ArrayList<Word>();
        mDictionary.add(new Word("Weṭeṭṭi", R.string.red,R.raw.color_red, R.drawable.color_red, Category.COLORS));
        mDictionary.add(new Word("Chokokki", R.string.green, R.raw.color_green,R.drawable.color_green, Category.COLORS));
        mDictionary.add(new Word("Takaakki", R.string.brown, R.raw.color_brown,R.drawable.color_brown, Category.COLORS));
        mDictionary.add(new Word("Topoppi", R.string.gray, R.raw.color_gray,R.drawable.color_gray, Category.COLORS));
        mDictionary.add(new Word("Kululli", R.string.black, R.raw.color_black,R.drawable.color_black, Category.COLORS));
        mDictionary.add(new Word("Kelelli", R.string.white, R.raw.color_white,R.drawable.color_white, Category.COLORS));
        mDictionary.add(new Word("Topiisә", R.string.dusty_yellow, R.raw.color_dusty_yellow,R.drawable.color_dusty_yellow, Category.COLORS));
        mDictionary.add(new Word("Chiwiiṭә", R.string.mustard_yellow, R.raw.color_mustard_yellow,R.drawable.color_mustard_yellow, Category.COLORS));
        mDictionary.add(new Word("Lutti", R.string.one, R.raw.number_one,R.drawable.number_one, Category.NUMBERS));
        mDictionary.add(new Word("Otiiko", R.string.two, R.raw.number_two,R.drawable.number_two, Category.NUMBERS));
        mDictionary.add(new Word("Tolookosu", R.string.three, R.raw.number_three,R.drawable.number_three, Category.NUMBERS));
        mDictionary.add(new Word("Oyyisa", R.string.four, R.raw.number_four,R.drawable.number_four, Category.NUMBERS));
        mDictionary.add(new Word("Massokka", R.string.five, R.raw.number_five,R.drawable.number_five, Category.NUMBERS));
        mDictionary.add(new Word("Temmokka", R.string.six, R.raw.number_six,R.drawable.number_six, Category.NUMBERS));
        mDictionary.add(new Word("Kenekaku", R.string.seven, R.raw.number_seven,R.drawable.number_seven, Category.NUMBERS));
        mDictionary.add(new Word("Kawinta", R.string.eight, R.raw.number_eight,R.drawable.number_eight, Category.NUMBERS));
        mDictionary.add(new Word("Wo’e", R.string.nine, R.raw.number_nine,R.drawable.number_nine, Category.NUMBERS));
        mDictionary.add(new Word("Na’aacha", R.string.ten, R.raw.number_ten,R.drawable.number_ten, Category.NUMBERS));
        mDictionary.add(new Word("әpә", R.string.father, R.raw.family_father,R.drawable.family_father, Category.MEMBERS));
        mDictionary.add(new Word("әṭa", R.string.mother, R.raw.family_mother,R.drawable.family_mother, Category.MEMBERS));
        mDictionary.add(new Word("Angsi", R.string.son, R.raw.family_son,R.drawable.family_son, Category.MEMBERS));
        mDictionary.add(new Word("Tune", R.string.daughter, R.raw.family_daughter,R.drawable.family_daughter, Category.MEMBERS));
        mDictionary.add(new Word("Taachi", R.string.older_brother, R.raw.family_older_brother,R.drawable.family_older_brother, Category.MEMBERS));
        mDictionary.add(new Word("Chalitti", R.string.younger_brother, R.raw.family_younger_brother,R.drawable.family_younger_brother, Category.MEMBERS));
        mDictionary.add(new Word("Teṭe", R.string.older_sister, R.raw.family_older_sister,R.drawable.family_older_sister, Category.MEMBERS));
        mDictionary.add(new Word("Kolliti", R.string.younger_sister, R.raw.family_younger_sister,R.drawable.family_younger_sister, Category.MEMBERS));
        mDictionary.add(new Word("Ama", R.string.grandmother, R.raw.family_grandmother,R.drawable.family_grandmother, Category.MEMBERS));
        mDictionary.add(new Word("Paapa", R.string.grandfather, R.raw.family_grandfather,R.drawable.family_grandfather, Category.MEMBERS));
        mDictionary.add(new Word("Minto wuksus", R.string.phrase_1,R.raw.phrase_where_are_you_going, Category.PHRASES));
        mDictionary.add(new Word("Tinnә oyaase'nә", R.string.phrase_2,R.raw.phrase_what_is_your_name, Category.PHRASES));
        mDictionary.add(new Word("Oyaaset...", R.string.phrase_3,R.raw.phrase_my_name_is, Category.PHRASES));
        mDictionary.add(new Word("Michәksәs?", R.string.phrase_4,R.raw.phrase_how_are_you_feeling, Category.PHRASES));
        mDictionary.add(new Word("Kuchi achit?", R.string.phrase_5,R.raw.phrase_im_feeling_good, Category.PHRASES));
        mDictionary.add(new Word("әәnәs'aa??", R.string.phrase_6,R.raw.phrase_are_you_coming, Category.PHRASES));
        mDictionary.add(new Word("Hәә’ әәnәm", R.string.phrase_7,R.raw.phrase_yes_im_coming, Category.PHRASES));
        mDictionary.add(new Word("әәnәm", R.string.phrase_8,R.raw.phrase_im_coming, Category.PHRASES));
        mDictionary.add(new Word("Yoowutis", R.string.phrase_9,R.raw.phrase_lets_go, Category.PHRASES));
        mDictionary.add(new Word("әnni'nem", R.string.phrase_10,R.raw.phrase_come_here, Category.PHRASES));

    }
}


enum Category {
    NUMBERS,
    COLORS,
    PHRASES,
    MEMBERS

}
