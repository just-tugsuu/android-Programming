package com.example.androidplatform;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.androidplatform.adapters.ChallengeAdapter;
import com.example.androidplatform.adapters.ClassAdapter;
import com.example.androidplatform.helper.BottomNavigationHelper;
import com.example.androidplatform.model.ChallengeModel;
import com.example.androidplatform.model.ClassModel;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    //IU components
    private RecyclerView rvClass, rvChallenge;
    private BottomNavigationView bottomNavigationView;
    private ArrayList<ClassModel> classModel = new ArrayList<>();
    private ArrayList<ChallengeModel> challengeModel = new ArrayList<>();
    private Context context = MainActivity.this;
    private static final  int ACTIVITY_NUM = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //RecyclerView
        rvClass = findViewById(R.id.rvRecyclerView);
        rvChallenge = findViewById(R.id.rvRecyclerView2);
        setValue();
        setAdapter();

//        navigationBar
        bottomNavigationView = findViewById(R.id.bnNavigation);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(ACTIVITY_NUM);
        menuItem.setChecked(true);
        BottomNavigationHelper.enableNavigation(context, bottomNavigationView, "Home");

    }

    private void setValue(){
        //when data comes from db or api i need to iterate throught then add data to the model.
        classModel.add(new ClassModel("Хичээл", "Javascript", getString(R.string.paragraph), R.drawable.ic_white_js, 10));
        classModel.add(new ClassModel("Хичээл", "Java", getString(R.string.paragraph), R.drawable.ic_white_java, 50));
        classModel.add(new ClassModel("Хичээл", "Python", getString(R.string.paragraph), R.drawable.ic_white_python, 60));

        challengeModel.add(new ChallengeModel("Эвент болон callback функц", "Java", R.drawable.ic_java_icon, "Хоёрдахь нь өмнөх Java аппаас ирсэн гүйлгээний мэдээллийг хүлээн авч татварын газрын сэрвэр рүү дамжуулах үүрэгтэй windows сэрвэр дээр ажиллах windows service юм. Энэ сэрвисийг бид C# хэл ашиглан бүтээх ба уг сэрвэрийг унтрааж"));

    }

    private void setAdapter() {
        ClassAdapter classAdapter = new ClassAdapter(classModel, context);
        rvClass.setAdapter(classAdapter);
        rvClass.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        ChallengeAdapter challengeAdapter = new ChallengeAdapter(challengeModel, context);
        rvChallenge.setAdapter(challengeAdapter);
        rvChallenge.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
    }

}