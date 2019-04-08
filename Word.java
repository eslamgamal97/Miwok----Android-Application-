package com.example.android.miwok;

/**
 * Created by Eslam on 3/12/2018.
 */

public class Word {
    private  String mMiwokTranslation;

    private String mDefaulTranslation;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1 ;
    /*
    constructor for Word class
     */
    public Word(String defaulTranslation,String miwokTranslation){
        mDefaulTranslation = defaulTranslation;
        mMiwokTranslation  = miwokTranslation;
    }
    // new constructor to add 2 strings and 1 image for numbers,family,colors activity
    public Word(String defaulTranslation, String miwokTranslation, int imageResourceId){
        mDefaulTranslation = defaulTranslation;
        mMiwokTranslation  = miwokTranslation;
        mImageResourceId = imageResourceId;
    }
    /*
    get Default Translation
     */
    public  String getDefaultTranslation(){
        return mDefaulTranslation;
    }
    /*
    get Miwok Translation
     */
    public  String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    // get image resource id
    public  int getImageResourceId(){
        return mImageResourceId;
    }

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
