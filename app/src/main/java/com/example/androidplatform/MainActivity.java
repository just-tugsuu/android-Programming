package com.example.androidplatform;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;

import com.example.androidplatform.adapters.ClassAdapter;
import com.example.androidplatform.model.ClassModel;

import java.util.ArrayList;

import io.noties.markwon.Markwon;


public class MainActivity extends AppCompatActivity {

    //IU components
    private RecyclerView rvClass;
    private TextView codeBlock;
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
        codeBlock = findViewById(R.id.tvCodeblock);
        setValue();

        //markdown
        final Markwon markwon = Markwon.create(context);
        String test = "```" +
                "print('Hello, world!')" + "\n" + "num_sqrt = num ** 0.5\n" +
                "print('The square root of %0.3f is %0.3f'%(num ,num_sqrt))";
        markwon.setMarkdown(codeBlock, test);


    }

    private void setValue(){

        //when data comes from db or api i need to iterate throught then add data to the model.

        classModel.add(new ClassModel("Хичээл", "Javascript", getString(R.string.paragraph), R.drawable.ic_white_js, 10));
        classModel.add(new ClassModel("Хичээл", "Java", getString(R.string.paragraph), R.drawable.ic_white_java, 50));
        classModel.add(new ClassModel("Хичээл", "Python", getString(R.string.paragraph), R.drawable.ic_white_python, 60));
        ClassAdapter classAdapter = new ClassAdapter(classModel, context);
        rvClass.setAdapter(classAdapter);
        rvClass.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
    }



    private void updateStatusBar(){
        getWindow().setStatusBarColor(0xFF1C1C26);
    }
}