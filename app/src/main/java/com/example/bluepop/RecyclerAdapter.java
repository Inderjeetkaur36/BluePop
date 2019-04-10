package com.example.bluepop;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    Context context;
    int resource;
    ArrayList<Shoes> objects;

    public RecyclerAdapter(Context context, int resource, ArrayList<Shoes> objects) {
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {

        View view = LayoutInflater.from(context).inflate(resource,viewGroup,false);
        ViewHolder holder = new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Shoes shoes = objects.get(position);

        holder.imageView.setBackgroundResource(shoes.image);
        holder.txtShoes.setText(shoes.name);
        holder.txtPrice.setText(shoes.price);

    }

    @Override
    public int getItemCount() {
        return objects.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

       ImageView imageView;
       TextView txtShoes;
       TextView txtPrice;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            txtShoes = itemView.findViewById(R.id.textViewShoes);
            txtPrice = itemView.findViewById(R.id.textViewPrice);
        }
    }
}
