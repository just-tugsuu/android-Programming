package com.example.androidplatform.resModels;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CodeModel {

    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("language")
    @Expose
    private String language;
    @SerializedName("input")
    @Expose
    private String input;
    @SerializedName("sourceCode")
    @Expose
    private String sourceCode;
    @SerializedName("output")
    @Expose
    private String output;


    public CodeModel(String code, String language, String input) {
        this.code = code;
        this.language = language;
        this.input = input;
    }

    public String getCode() {
        return code;
    }

    public String getLanguage() {
        return language;
    }

    public String getInput() {
        return input;
    }

    public String getSourceCode() {
        return sourceCode;
    }

    public String getOutput() {
        return output;
    }
}
