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

import com.example.androidplatform.KataActvity;
import com.example.androidplatform.R;
import com.example.androidplatform.model.ChallengeModel;

import java.util.ArrayList;

public class ChallengeAdapter extends RecyclerView.Adapter<ChallengeAdapter.ViewHolder> {

    private ArrayList <ChallengeModel> Model = new ArrayList<>();
    private Context context;

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView icon;
        private TextView tag, title, description;
        private ConstraintLayout layout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            icon = itemView.findViewById(R.id.ivIcon2);
            tag = itemView.findViewById(R.id.rvClassTag2);
            title = itemView.findViewById(R.id.rvTitle2);
            description = itemView.findViewById(R.id.rvDescription2);
            layout = itemView.findViewById(R.id.challengeList);
        }
    }

    public ChallengeAdapter(ArrayList<ChallengeModel> model, Context ct) {
        Model = model;
        context = ct;
    }

    @NonNull
    @Override
    public ChallengeAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.challenge_item, parent, false);
        return new ChallengeAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ChallengeAdapter.ViewHolder holder, int position) {
        holder.icon.setImageResource(Model.get(position).getIcon());
        holder.tag.setText(Model.get(position).getTag());
        holder.title.setText(Model.get(position).getTitle());
        holder.description.setText(Model.get(position).getDescription());
        holder.layout.setOnClickListener(view -> {
            Intent intent = new Intent(context, KataActvity.class);
            intent.putExtra("languageType", Model.get(position).getTag());
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return Model.size();
    }
}
