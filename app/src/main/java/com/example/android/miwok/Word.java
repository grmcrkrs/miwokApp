package com.example.android.miwok;

public class Word {
    /* This is meant to contain a Miwok translation and a default
    or english translation for that same word.
     */
    private String mDefaultTranslation;

    private String mMiwokTranslation;

    private int mImageResourceID;

    /**
     * Image resource ID for the word
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * public constructor with two inputs into the array.
     *
     * @param defaultTranslation
     * @param miwokTranslation
     */
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

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
