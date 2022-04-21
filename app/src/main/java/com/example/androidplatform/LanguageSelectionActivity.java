package com.example.androidplatform;

import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidplatform.adapters.LanguageSelectionAdapter;
import com.example.androidplatform.model.LanguageModel;

import java.util.ArrayList;
import java.util.Objects;

public class LanguageSelectionActivity extends AppCompatActivity {

    private RecyclerView rvLanguageSelection;
    private ArrayList <LanguageModel> languageModel = new ArrayList<>();
    private Context context = LanguageSelectionActivity.this;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language_selection);

        Toolbar toolbar = findViewById(R.id.toolbar);
        rvLanguageSelection = findViewById(R.id.rvRecyclerView3);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayShowTitleEnabled(false);
        setValue();
        setAdapter();
    }

    private void setValue() {
        languageModel.add(new LanguageModel("Python", "One of the easist languages to learn. But we go advanced too.", R.drawable.ic_python_icon));
        languageModel.add(new LanguageModel("JavaScript", "The engine of today's internet. We include Node.js, NPM and more.", R.drawable.ic_js_jcon));
        languageModel.add(new LanguageModel("Bash", "If you want full control over linux and scripting language. This is for you", R.drawable.ic_bash_icon));
        languageModel.add(new LanguageModel("Java", "A Battle tested language used in over 8 billion device", R.drawable.ic_java_icon));

    }

    private void setAdapter() {
        LanguageSelectionAdapter languageSelectionAdapter = new LanguageSelectionAdapter(languageModel, context);
        rvLanguageSelection.setAdapter(languageSelectionAdapter);
        rvLanguageSelection.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false));

    }

}
