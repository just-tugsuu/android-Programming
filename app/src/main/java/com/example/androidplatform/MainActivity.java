package com.example.androidplatform;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Window;

import com.example.androidplatform.adapters.ClassAdapter;


public class MainActivity extends AppCompatActivity {

    //IU components
    private RecyclerView rvClass;

    //these are gonna replace in future because I need to get data from back-end
    // so I need to load ui first then load data from backend !!!
    private int icons[] = {R.drawable.ic_white_js, R.drawable.ic_white_java, R.drawable.ic_white_python};
    private String[] description = {};
    private String[] tag = {"Хичээл", "Хичээл", "Хичээл"};
    private String[] title = {"JavaScript", "Java", "Python"};
    private int progress[] = {10, 80, 20};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Change windows color
        updateStatusBar();

        description= getResources().getStringArray(R.array.rvParagraph);
        rvClass = findViewById(R.id.rvRecyclerView);

        ClassAdapter classAdapter = new ClassAdapter(tag, title, description, icons, progress, this);
         rvClass.setAdapter(classAdapter);
         rvClass.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

    }

    private void updateStatusBar(){
        getWindow().setStatusBarColor(0xFF1C1C26);
    }
}