package com.example.androidplatform.model;

public class CourseItems {
    private int check;
    private String courseItem, lineNumbers;

    public CourseItems(String CourseItem, String counter){
        this.courseItem = CourseItem;
        this.lineNumbers = counter;
    }
    public CourseItems(String CourseItem, String counter, int CheckImage) {
        this.courseItem = CourseItem;
        this.lineNumbers = counter;
        this.check = CheckImage;
    }

    public String getLineNumbers() {
        return lineNumbers;
    }

    public int getIcon() {
        return check;
    }

    public String getCourseItem() {
        return courseItem;
    }
}
