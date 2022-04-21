package com.example.androidplatform.model;

public class ChallengeModel {
    private String Title, Tag,  Description;
    private int Icon;
    public ChallengeModel(String title, String tag, int icon, String description){
        Title = title;
        Tag = tag;
        Description = description;
        Icon = icon;
    }

    public String getTitle() {
        return Title;
    }

    public String getTag() {
        return Tag;
    }

    public String getDescription() {
        return Description;
    }

    public int getIcon() {
        return Icon;
    }
}
