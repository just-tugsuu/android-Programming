package com.example.androidplatform.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidplatform.R;
import com.example.androidplatform.model.CourseItems;

import java.util.ArrayList;

public class CourseItemAdapter extends RecyclerView.Adapter<CourseItemAdapter.ViewHolder> {

    private ArrayList <CourseItems> Model = new ArrayList<>();
    private Context context;

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView checkIcon;
        private TextView LineNumber, CourseItem;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            LineNumber = itemView.findViewById(R.id.rvListNumber);
            CourseItem = itemView.findViewById(R.id.rvCourseItems);
            checkIcon = itemView.findViewById(R.id.rvCourseCheck) ;
        }
    }

    public CourseItemAdapter (ArrayList <CourseItems> model, Context ct) {
        Model = model;
        context = ct;
    }

    @NonNull
    @Override
    public CourseItemAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.course_item, parent, false);
        return new CourseItemAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CourseItemAdapter.ViewHolder holder, int position) {
        holder.LineNumber.setText(Model.get(position).getLineNumbers());
        holder.CourseItem.setText(Model.get(position).getCourseItem());
        holder.checkIcon.setImageResource(Model.get(position).getIcon());

    }

    @Override
    public int getItemCount() {
        return Model.size();
    }
}
