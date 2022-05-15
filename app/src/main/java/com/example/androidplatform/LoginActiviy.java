package com.example.androidplatform;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class LoginActiviy extends AppCompatActivity {

    private TextView toolbarTitle;
    private ImageView backbtn;
    private MaterialButton loginBtn;
    private Context context = LoginActiviy.this;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        toolbarTitle = findViewById(R.id.toolbarTitle);
        backbtn = findViewById(R.id.back_btn);
        loginBtn = findViewById(R.id.LoginBtn);
        toolbarTitle.setText("Нэвтрэх");

        backbtn.setOnClickListener(view -> {
            finish();
        });

        loginBtn.setOnClickListener(view -> {
            Intent intent = new Intent(context, LanguageSelectionActivity.class);
            startActivity(intent);
        });

    }
}
