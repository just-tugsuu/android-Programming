package com.example.androidplatform;

import android.content.Context;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.amrdeveloper.codeview.CodeView;

public class outputActivity extends AppCompatActivity {

    private TextView codeView;
    private ImageView back_btn;
    private Context context = outputActivity.this;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);

        codeView = findViewById(R.id.codeView2);

        back_btn = findViewById(R.id.back_btn);

        back_btn.setOnClickListener(view -> {
            finish();
        });

        String output = getIntent().getStringExtra("output");

        codeView.setText(output);


    }
}
