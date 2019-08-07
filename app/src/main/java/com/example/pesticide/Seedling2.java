package com.example.pesticide;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Seedling2 extends  RecyclerView.Adapter<Seedling2.ViewHolder> {

    private Context mContext;
    private ArrayList<Values> mlist;


    Seedling2(Context context, ArrayList<Values> list){
        mContext=context;
        mlist=list;

    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(mContext);
        View view=layoutInflater.inflate(R.layout.seedling_page2,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Values items = mlist.get(position);


        ImageView im;
        TextView t1,t2;

        im=holder.picture;
        t1=holder.biology;
        t2=holder.biology_name;

        im.setImageResource(items.getImage());
        t1.setText(items.getParent_name());
        t2.setText(items.getDisease_name());



    }

    @Override
    public int getItemCount() {
        return mlist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView picture;
        TextView biology,biology_name;

        public ViewHolder(View view){
            super(view);

            picture=view.findViewById(R.id.disease_pic);
            biology=view.findViewById(R.id.category);
            biology_name=view.findViewById(R.id.disease);
        }

    }

}
