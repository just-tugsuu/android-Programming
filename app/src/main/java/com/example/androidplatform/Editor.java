package com.example.androidplatform;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.amrdeveloper.codeview.CodeView;
import com.example.androidplatform.resModels.CodeModel;
import com.example.androidplatform.retrofit.APIService;
import com.example.androidplatform.retrofit.RetrofitClient;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Editor extends AppCompatActivity {

    private CodeView codeView;
    private FloatingActionButton runBtn;
    private ImageView back_btn;
    private Context context = Editor.this;
    private String languageType;
//    @POST("/.netlify/functions/enforceCode")
//    @FormUrlEncoded


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editor);

        codeView = findViewById(R.id.codeView);
        back_btn = findViewById(R.id.back_btn2);
        runBtn = findViewById(R.id.fab);

        codeView.setEnableLineNumber(true);
        codeView.setLineNumberTextColor(getResources().getColor(R.color.white));

        back_btn.setOnClickListener(view -> {
            finish();
        });

        languageType = getIntent().getStringExtra("type");
        languageType = (languageType == null) ? "py" : languageType;

        if(languageType.equals("java")) {
            codeView.setText("public class program{\n" +
                    "                    public static void main(String [] args){\n" +
                    "                        System.out.println(\"Hello world\");\n" +
                    "                      }\n" +
                    "                    }");
        }

        runBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Editor", "Run button is clicked");
                sendData();
            }
        });

    }

    private void sendData() {
        APIService apiService = RetrofitClient.getClient("https://codexweb.netlify.app").create(APIService.class);
        Editable userCode = codeView.getText();
        String userInput = userCode.toString();


        CodeModel codeModel = new CodeModel(userInput, languageType, "");
        Call<CodeModel> call = apiService.codeData(codeModel);
        call.enqueue(new Callback<CodeModel>() {
            @Override
            public void onResponse(Call<CodeModel> call, Response<CodeModel> response) {
                if(response.isSuccessful()) {
                    Intent intent = new Intent(context, outputActivity.class);
                    intent.putExtra("output", response.body().getOutput());
                    startActivity(intent);
                }
            }

            @Override
            public void onFailure(Call<CodeModel> call, Throwable t) {
                Log.d("Editor", "No this is not working bro");
                Toast toast = Toast.makeText(context, "Хүсэлт амжилтгүй боллоо", Toast.LENGTH_SHORT);
            }
        });
    }
}
