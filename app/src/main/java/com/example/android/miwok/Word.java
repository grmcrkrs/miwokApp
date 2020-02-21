package com.example.android.miwok;

public class Word {
    /* This is meant to contain a Miwok translation and a default
    or english translation for that same word.
     */
    private String mDefaultTranslation;

    private String mMiwokTranslation;

    private int mImageResourceID;


    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    /**
     * public constructor with three inputs into the Word array, one of those being an image resource ID.
     *
     * @param defaultTranslation the default translation of the word, i.e. English
     * @param miwokTranslation   the Miwok translation of the word
     * @param imageResourceID    a String of the R.drawable... resource ID.
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceID) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceID = imageResourceID;
    }

    /**
     * get the default translation of the word
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * get the miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResourceID() {
        return mImageResourceID;
    }
}
