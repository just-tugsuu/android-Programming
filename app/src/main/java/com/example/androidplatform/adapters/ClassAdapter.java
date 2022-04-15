package com.example.androidplatform.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidplatform.R;
import com.example.androidplatform.model.ClassModel;

import java.util.ArrayList;

// ClassAdapter --> this contains innerClass

public class ClassAdapter extends RecyclerView.Adapter<ClassAdapter.ViewHolder> {

    private ArrayList <ClassModel> classModel = new ArrayList<>();
    private  Context context;

    // inner class holds my user interface componenets
    public class ViewHolder extends RecyclerView.ViewHolder {


        private TextView tvClassTag,  tvTitle, tvDescribtion;
        private ImageView ivIcon;
        private ProgressBar pbBar;

        public ViewHolder(@NonNull View view) {
            super(view);

            tvClassTag = view.findViewById(R.id.rvClassTag);
            tvTitle = view.findViewById(R.id.rvTitle);
            tvDescribtion = view.findViewById(R.id.rvDescription);
            pbBar = view.findViewById(R.id.pbTaskloading);
            ivIcon = view.findViewById(R.id.ivIcon);
        }
    }

    public ClassAdapter( ArrayList<ClassModel> model ,Context ct) {
        classModel  = model;
        context = ct;
    }

    @NonNull
    @Override
    public ClassAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.activity_class_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ClassAdapter.ViewHolder holder, int position) {
        holder.ivIcon.setImageResource(classModel.get(position).getIcon());
        holder.tvClassTag.setText(classModel.get(position).getTag());
        holder.tvTitle.setText(classModel.get(position).getTitle());
        holder.tvDescribtion.setText(classModel.get(position).getDescription());
        holder.pbBar.setProgress(classModel.get(position).getProgress());
    }

    @Override
    public int getItemCount() {
        return classModel.size();
    }
}
