package com.example.pesticide;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Seedling2 extends  RecyclerView.Adapter<Seedling2.ViewHolder> {

    private Context mContext;
    private ArrayList<Values> mlist;

    ImageView im;

    int im2;
    TextView t1,t2;
    String val1,val2;
    Values items;



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

        items = mlist.get(position);



        im=holder.picture;
        t1=holder.biology;
        t2=holder.biology_name;

        im.setImageResource(items.getImage());
        t1.setText(items.getParent_name());
        t2.setText(items.getDisease_name());

        val1=items.getParent_name();
        val2=items.getDisease_name();
        im2=items.getImage();

        im.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent=new Intent(mContext,Last_page.class);
                intent.putExtra("parent",val1);
                intent.putExtra("child",val2);
                intent.putExtra("image",im2);


                mContext.startActivity(intent);
            }
        });



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
