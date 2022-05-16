package com.example.androidplatform;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class onBoardingActivity extends AppCompatActivity {

    private MaterialButton preLogin, preSignUp;
    private Context context = onBoardingActivity.this;

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        setContentView(R.layout.activity_onboard);

        preLogin = findViewById(R.id.preLoginBtn);
        preSignUp = findViewById(R.id.preSignup);

        preLogin.setOnClickListener(view -> {
            Intent intent = new Intent(context, LoginActiviy.class);
            startActivity(intent);
        });

        preSignUp.setOnClickListener(view -> {
            Intent intent = new Intent(context, SignUpActivity.class);
            startActivity(intent);
            Log.d("onBoard", "Clicked");
        });

    }
}
