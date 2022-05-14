package com.example.androidplatform;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SignUpActivity extends AppCompatActivity {

    private TextView toolbarTitle;
    private ImageView backbtn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        // Ene redundant code iig bas zailuulah (Gol sanaa ni uur java class aas ene iig duudaj ireh xd)
        toolbarTitle = findViewById(R.id.toolbarTitle);
        backbtn = findViewById(R.id.back_btn);

        backbtn.setOnClickListener(view -> {
            finish();
        });

        toolbarTitle.setText("Бүртгүүлэх");

    }
}
