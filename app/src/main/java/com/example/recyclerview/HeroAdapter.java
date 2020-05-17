package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HeroAdapter extends RecyclerView.Adapter<HeroAdapter.MyViewHolder> {
    ArrayList<Hero> dataHero;
    Context context;

    public HeroAdapter(ArrayList<Hero> dataHero, Context context) {
        this.dataHero = dataHero;
        this.context = context;
    }

    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View itemView=layoutInflater.inflate(R.layout.hero,parent,false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.txtHero.setText(dataHero.get(position).getTen());
        holder.imgHero.setImageResource(dataHero.get(position).getHinhAnh());

    }

    @Override
    public int getItemCount() {
        return dataHero.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView txtHero;
        ImageView imgHero;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            txtHero=(TextView) itemView.findViewById(R.id.txtHero);
            imgHero=(ImageView) itemView.findViewById(R.id.imgHero);
        }
    }

}
