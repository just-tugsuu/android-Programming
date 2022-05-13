package com.example.androidplatform;

import android.content.Context;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.amrdeveloper.codeview.CodeView;
import com.example.androidplatform.adapters.ClassAdapter;
import com.example.androidplatform.adapters.CourseItemAdapter;
import com.example.androidplatform.model.CourseItems;

import java.util.ArrayList;

public class CourseActivity extends AppCompatActivity {

   private ArrayList <CourseItems> Model = new ArrayList<>();
   private RecyclerView rvCourse;
   private Context context = CourseActivity.this;
   private ImageView backBtn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);

        rvCourse = findViewById(R.id.rvCourses);
        backBtn = findViewById(R.id.back_btn);

        backBtn.setOnClickListener(view -> {
            finish();
        });

        filler();
        setAdapter();
    }

    private void setAdapter() {
        CourseItemAdapter courseItemAdapter = new CourseItemAdapter(Model, context);
        rvCourse.setAdapter(courseItemAdapter);
        rvCourse.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

    }

    private void filler() {
        Model.add(new CourseItems("Анхны програм", "1", R.drawable.ic_check));
        Model.add(new CourseItems("Хувьсагч зарлалт", "2",  R.drawable.ic_check));
        Model.add(new CourseItems("Логик болон нөхцөл шалгалт asdasd", "3",  R.drawable.ic_check));
        Model.add(new CourseItems("While давталт", "4"));
    }

}
