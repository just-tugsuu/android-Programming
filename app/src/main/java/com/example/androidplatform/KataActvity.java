package com.example.androidplatform;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

import io.noties.markwon.Markwon;

public class KataActvity extends AppCompatActivity {

    private TextView description;
    private MaterialButton tryBtn;
    private ImageView back_btn;
    private Context context = KataActvity.this;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kata);

        description = findViewById(R.id.Markdown);
        tryBtn = findViewById(R.id.ChallengeBtn);
        back_btn = findViewById(R.id.back_btn);
        TextView toolbarTitle = findViewById(R.id.toolbarTitle);


        Markwon markwon = Markwon.create(context);
        markwon.setMarkdown(description, "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam non eros metus. Mauris at libero varius, tempor augue sit amet, euismod tortor. Cras lacinia orci massa, ac mattis diam rhoncus eget.\n" +
                "\n" +
                "```\n" +
                "public class Main {\n" +
                "  static void myMethod() {\n" +
                "    System.out.println(\"I just got executed!\");\n" +
                "  }\n" +
                "\n" +
                "  public static void main(String[] args) {\n" +
                "    myMethod();\n" +
                "    myMethod();\n" +
                "    myMethod();\n" +
                "  }\n" +
                "}\n" +
                "\n" +
                "```");

        toolbarTitle.setText("Обьектын функцтэй ажиллах");

        tryBtn.setOnClickListener(view -> {
            Intent intent = new Intent(context, Editor.class);
            String key = getIntent().getStringExtra("languageType");
            intent.putExtra("type", FindLanguage(key));
            startActivity(intent);
        });

        back_btn.setOnClickListener(view -> {
            finish();
        });

    }

    private String FindLanguage(String Tag){
        String payload;
        switch (Tag) {
            case "Java":
                payload = "java";
                break;
            case "C++":
                payload = "cpp";
                break;
            case "Ruby":
                payload = "rb";
                break;
            case "C#":
                payload = "cs";
                break;
            default:
                payload = "py";
                break;
        }
        return payload;
    }

}
