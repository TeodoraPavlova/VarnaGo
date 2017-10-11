package com.example.android.varnago;

public class Varna {

    // var for topic title
    private int mTitle;
    // var for topic description
    private int mDescription;
    //var for topic image
    private int mImage=NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED=-1;

    //Creation of a new topic
    public Varna(int title,int description,int image){
        mTitle=title;
        mDescription=description;
        mImage=image;
    }
    //set the title
    public void setTitle(int title){
        mTitle=title;
    }
    //get the title
    public int getTitle(){
        return mTitle;
    }
    //set the description
    public void setDescription(int description){
        mDescription=description;
    }
    //get the description
    public int getDescription(){
        return mDescription;
    }
    //set the image
    public void setImage(int image){
        mImage=image;
    }
    //get the image
    public int getImage(){
        return mImage;
    }
    //checking (does it has an image)
    public boolean hasImage(){
        return mImage!=NO_IMAGE_PROVIDED;
    }
}
