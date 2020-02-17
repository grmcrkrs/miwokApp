package com.example.android.miwok;

public class Word {
    /* This is meant to contain a Miwok translation and a default
    or english translation for that same word.
     */
    private String mDefaultTranslation;

    private String mMiwokTranslation;

    private String mImageResourceID;

    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }
    public Word(String defaultTranslation, String miwokTranslation, String imageResourceID) {
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

    public String getImageResourceID() { return mImageResourceID; }
}
