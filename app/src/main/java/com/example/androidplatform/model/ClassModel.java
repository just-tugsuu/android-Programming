package com.example.androidplatform.model;

public class ClassModel {

    private  String mTag, mTitle, mDescription;
    private  int mIcon, mProgress;

    public ClassModel(String tag, String title, String description, int icon, int progress){
        this.mTag = tag;
        this.mTitle = title;
        this.mDescription = description;
        this.mIcon = icon;
        this.mProgress = progress;
    }

    public String getTag() {
        return mTag;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getDescription() {
        return mDescription;
    }

    public int getIcon() {
        return mIcon;
    }

    public int getProgress() {
        return mProgress;
    }
}
