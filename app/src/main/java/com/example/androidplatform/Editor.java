package com.example.androidplatform;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.amrdeveloper.codeview.CodeView;

public class Editor extends AppCompatActivity {

    private CodeView codeView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editor);

        codeView = findViewById(R.id.codeView);
        codeView.setEnableLineNumber(true);
        codeView.setLineNumberTextColor(getResources().getColor(R.color.white));

    }
}
