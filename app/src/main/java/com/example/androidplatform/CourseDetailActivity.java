package com.example.androidplatform;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CourseDetailActivity extends AppCompatActivity {

    private TextView toolbarTitle;
    private ImageView backbtn;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_detail);

        // layout swipe .......
        toolbarTitle = findViewById(R.id.toolbarTitle);
        backbtn = findViewById(R.id.back_btn);

        backbtn.setOnClickListener(view -> {
            finish();
        });

        toolbarTitle.setText("Обьектын функцтэй ажиллах");

    }
}
