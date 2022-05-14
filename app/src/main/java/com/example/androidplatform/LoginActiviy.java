package com.example.androidplatform;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActiviy extends AppCompatActivity {

    private TextView toolbarTitle;
    private ImageView backbtn;


    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        toolbarTitle = findViewById(R.id.toolbarTitle);
        backbtn = findViewById(R.id.back_btn);
        toolbarTitle.setText("Нэвтрэх");

        backbtn.setOnClickListener(view -> {
            finish();
        });

    }
}
