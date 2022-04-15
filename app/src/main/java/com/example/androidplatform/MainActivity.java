package com.example.androidplatform;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.Window;

import com.example.androidplatform.adapters.ClassAdapter;
import com.example.androidplatform.model.ClassModel;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    //IU components
    private RecyclerView rvClass;

    //these are gonna replace in future because I need to get data from back-end
    // so I need to load ui first then load data from backend !!!

    // adding like these are very sloppy, So gotta refactror my code ... first of all this is demo data ..
    private int icons[] = {R.drawable.ic_white_js, R.drawable.ic_white_java, R.drawable.ic_white_python};
    private String[] tag = {"Хичээл", "Хичээл", "Хичээл"};
    private String[] title = {"JavaScript", "Java", "Python"};
    private int progress[] = {10, 80, 20};

    private ArrayList<ClassModel> classModel = new ArrayList<>();
    private Context context = MainActivity.this;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Change windows color
        updateStatusBar();

        //RecyclerView
        rvClass = findViewById(R.id.rvRecyclerView);
        setValue();
        ClassAdapter classAdapter = new ClassAdapter(classModel, context);
        rvClass.setAdapter(classAdapter);
        rvClass.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
    }

    private void setValue(){
        classModel.add(new ClassModel("Хичээл", "Javascript", getString(R.string.paragraph), R.drawable.ic_white_js, 10));
        classModel.add(new ClassModel("Хичээл", "Java", getString(R.string.paragraph), R.drawable.ic_white_java, 50));
        classModel.add(new ClassModel("Хичээл", "Python", getString(R.string.paragraph), R.drawable.ic_white_python, 60));
    }



    private void updateStatusBar(){
        getWindow().setStatusBarColor(0xFF1C1C26);
    }
}