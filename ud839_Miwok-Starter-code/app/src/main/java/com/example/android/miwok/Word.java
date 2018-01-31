package com.example.android.miwok;

import android.media.Image;

/**
 * Created by mivy on 1/28/2018.
 */
//class name
public class Word {
    //create a state/fields

    //each word translation has its own list

    //this is for english translation
    private String mDefaultTranslation;

    //this is for miwok translation
    private String mMiwokTranslation;

    private int imMiwok = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     */

    //create Word object
    //constructor
    public Word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public Word(int getImage, String defaultTranslation, String miwokTranslation)
    {
        imMiwok = getImage;
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    //get each translation per word
    //methods
    public String getmDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation(){
        return mMiwokTranslation;
    }

    public int getImMiwok(){ return imMiwok;}

    /**Returns whether there's not or there's an image
     * **/
    public boolean hasImage()
    {
        return imMiwok != NO_IMAGE_PROVIDED;
    }
}
