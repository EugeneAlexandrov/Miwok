package com.example.android.miwok;

public class Word {
    private String mMiwokTranslation;
    private int mDefaultTranslation;
    private int mImage;


    private int msound;
    Category mCategory;

    Word(String miwok_word, int translate, int sound, int image, Category category) {
        mMiwokTranslation = miwok_word;
        mDefaultTranslation = translate;
        mImage = image;
        mCategory = category;
        msound = sound;
    }

    Word(String miwok_word, int translate, int sound, Category category) {
        mMiwokTranslation = miwok_word;
        mDefaultTranslation = translate;
        mCategory = category;
        msound = sound;
    }

    public int getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImage() {
        return mImage;
    }

    public int getSound() {
        return msound;
    }

    public Category getCategory() {
        return mCategory;
    }

}
