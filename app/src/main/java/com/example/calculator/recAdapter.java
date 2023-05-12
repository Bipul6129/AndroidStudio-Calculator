package com.example.calculator;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class recAdapter extends RecyclerView.Adapter<recAdapter.MyViewHolder> {
    private ArrayList<String> activitynamelist;
    private Class<?>[] activities;
    private Context context;

    public recAdapter(ArrayList<String> activitynamelist,Class<?>[] activities,Context context){
        this.activitynamelist = activitynamelist;
        this.activities = activities;
        this.context = context;
    }
    public class MyViewHolder extends  RecyclerView.ViewHolder{
        private TextView listname;
        public MyViewHolder(final View view){
            super(view);
            listname = view.findViewById(R.id.ItemText);
        }
    }
    @NonNull
    @Override
    public recAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull recAdapter.MyViewHolder holder, int position) {
        String name = activitynamelist.get(position);
        holder.listname.setText(name);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println(holder.listname.getText());
                System.out.println(holder.getAdapterPosition());

                    Class<?> activityClass = activities[holder.getAdapterPosition()];
                    Intent intent = new Intent(context,activityClass);
                    context.startActivity(intent);


            }
        });
    }

    @Override
    public int getItemCount() {
        return activitynamelist.size();
    }
}
