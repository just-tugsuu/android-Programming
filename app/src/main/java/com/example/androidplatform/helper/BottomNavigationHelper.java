package com.example.androidplatform.helper;

import android.content.Context;
import android.content.Intent;


import com.example.androidplatform.Editor;
import com.example.androidplatform.LanguageSelectionActivity;
import com.example.androidplatform.MainActivity;
import com.example.androidplatform.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BottomNavigationHelper {

    public static void enableNavigation(final Context context, BottomNavigationView view, String location) {
        view.setOnItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.nv_home:
                    Intent intent = new Intent(context, MainActivity.class);
                    if(location != "Home") {
                        context.startActivity(intent);
                    }
                    break;
                case R.id.nv_items:
                    Intent intent1 = new Intent(context, Editor.class);
                    context.startActivity(intent1);
                    break;
            }
            return false;
        });
    }
}
