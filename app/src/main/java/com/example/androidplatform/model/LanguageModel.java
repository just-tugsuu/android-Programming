package com.example.androidplatform.model;

public class LanguageModel {

    private String Title, Description;
    private int Icon;

    public LanguageModel(String title, String description, int icon){
        Title = title;
        Description = description;
        Icon = icon;
    }

    public String getTitle() {
        return Title;
    }

    public String getDescription() {
        return Description;
    }

    public int getIcon() {
        return Icon;
    }
}
