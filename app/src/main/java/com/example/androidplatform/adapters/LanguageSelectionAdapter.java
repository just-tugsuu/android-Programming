package com.example.androidplatform.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidplatform.MainActivity;
import com.example.androidplatform.R;
import com.example.androidplatform.model.LanguageModel;

import java.util.ArrayList;

public class LanguageSelectionAdapter extends RecyclerView.Adapter<LanguageSelectionAdapter.ViewHolder> {

    private ArrayList <LanguageModel> Model = new ArrayList<>();
    private Context context;

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView Icon;
        private ConstraintLayout Layout;
        private TextView  Title, Description;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            Icon =itemView.findViewById(R.id.rvIcon);
            Title = itemView.findViewById(R.id.rvTitle3);
            Description = itemView.findViewById(R.id.rvDescription3);
            Layout = itemView.findViewById(R.id.Listlayout);
        }
    }

    public LanguageSelectionAdapter(ArrayList <LanguageModel> model, Context ct) {
        Model = model;
        context = ct;
    }

    @NonNull
    @Override
    public LanguageSelectionAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.language_item, parent, false);
        return new LanguageSelectionAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LanguageSelectionAdapter.ViewHolder holder, int position) {
        holder.Icon.setImageResource(Model.get(position).getIcon());
        holder.Title.setText(Model.get(position).getTitle());
        holder.Description.setText(Model.get(position).getDescription());
        holder.Layout.setOnClickListener(view -> {
            Intent intent = new Intent(context, MainActivity.class);
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return Model.size();
    }
}
