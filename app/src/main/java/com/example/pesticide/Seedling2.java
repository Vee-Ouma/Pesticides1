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
    int val;
    TextView t1,t2;
    String val1,val2;
    Values items;
    String c1,c2,c3,c4;
    String r1,r2,r3,r4;
    String p1,p2,p3,p4;
    String s1,s2,s3,s4;

    String w1,w2,w3,w4;
    String o1,o2,o3,o4,o5;




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

        c1="Rotten Rot of Cotton";
        c2="Bacterial Blight of Cotton";
        c3="Cotton Aphids";
        c4="Soreshin";

        r1="Rice Hispa";
        r2="Rice case worm";
        r3="Demerara Froghopper";
        r4="Rice Leaf Mite";

        p1="Peanut Aphids";
        p2="White Grub";
        p3="Peanut Termites";
        p4="Phyllosticta leaf spot";

        s1="Wilt disease of sugarcane";
        s2="Bacterial Blight of sugarcane";
        s3="Sugarcane Aphids";
        s4="Root borer";


        w1="Yellow stripe Rust";
        w2="Powdery mildew of cereals";
        w3="Root and foot rot";
        w4="wheat Aphids";

        o1="Fungus";
        o2="Bacteria";
        o3="Insect";

        o4="Mite";
        o5="Oomycete";

        items = mlist.get(position);



        im=holder.picture;
        t1=holder.biology;
        t2=holder.biology_name;

        im.setImageResource(items.getImage());
        t1.setText(items.getParent_name());
        t2.setText(items.getDisease_name());



        val1=items.getParent_name();
        val2=items.getDisease_name().toString();
        im2=items.getImage();


        if(val2.equalsIgnoreCase(c1)) {

            im.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent;
                    intent = new Intent(mContext, Last_page.class);
                    intent.putExtra("parent", o1);
                    intent.putExtra("child", c1);
                    mContext.startActivity(intent);

                }
            });
        }
        if(val2.equalsIgnoreCase(c2)) {

            im.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent;
                    intent = new Intent(mContext, Last_page.class);
                    intent.putExtra("parent", o2);
                    intent.putExtra("child", c2);
                    mContext.startActivity(intent);

                }
            });
        }
        if(val2.equalsIgnoreCase(c3)) {

            im.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent;
                        intent = new Intent(mContext, Last_page.class);
                        intent.putExtra("parent", o3);
                        intent.putExtra("child", c3);
                        mContext.startActivity(intent);

                }
                });
            }
        if(val2.equalsIgnoreCase(c4)) {

            im.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent;
                    intent = new Intent(mContext, Last_page.class);
                    intent.putExtra("parent", o1);
                    intent.putExtra("child", c4);
                    mContext.startActivity(intent);

                }
            });
        }
        if(val2.equalsIgnoreCase(r1)) {

            im.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent;
                    intent = new Intent(mContext, Last_page.class);
                    intent.putExtra("parent", o3);
                    intent.putExtra("child", r1);
                    mContext.startActivity(intent);

                }
            });
        }
        if(val2.equalsIgnoreCase(r2)) {

            im.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent;
                    intent = new Intent(mContext, Last_page.class);
                    intent.putExtra("parent", o3);
                    intent.putExtra("child", r2);
                    mContext.startActivity(intent);

                }
            });
        }
        if(val2.equalsIgnoreCase(r3)) {

            im.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent;
                    intent = new Intent(mContext, Last_page.class);
                    intent.putExtra("parent", o3);
                    intent.putExtra("child", r3);
                    mContext.startActivity(intent);

                }
            });
        }
        if(val2.equalsIgnoreCase(r4)) {

            im.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent;
                    intent = new Intent(mContext, Last_page.class);
                    intent.putExtra("parent", o4);
                    intent.putExtra("child", r4);
                    mContext.startActivity(intent);

                }
            });
        }
        if(val2.equalsIgnoreCase(p1)) {

            im.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent;
                    intent = new Intent(mContext, Last_page.class);
                    intent.putExtra("parent", o3);
                    intent.putExtra("child", p1);
                    mContext.startActivity(intent);

                }
            });
        }
        if(val2.equalsIgnoreCase(p2)) {

            im.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent;
                    intent = new Intent(mContext, Last_page.class);
                    intent.putExtra("parent", o3);
                    intent.putExtra("child", p2);
                    mContext.startActivity(intent);

                }
            });
        }
        if(val2.equalsIgnoreCase(p3)) {

            im.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent;
                    intent = new Intent(mContext, Last_page.class);
                    intent.putExtra("parent", o3);
                    intent.putExtra("child", p3);
                    mContext.startActivity(intent);

                }
            });
        }
        if(val2.equalsIgnoreCase(p4)) {

            im.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent;
                    intent = new Intent(mContext, Last_page.class);
                    intent.putExtra("parent", o1);
                    intent.putExtra("child", p4);
                    mContext.startActivity(intent);

                }
            });
        }
        if(val2.equalsIgnoreCase(s1)) {

            im.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent;
                    intent = new Intent(mContext, Last_page.class);
                    intent.putExtra("parent", o1);
                    intent.putExtra("child", s1);
                    mContext.startActivity(intent);

                }
            });
        }
        if(val2.equalsIgnoreCase(s2)) {

            im.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent;
                    intent = new Intent(mContext, Last_page.class);
                    intent.putExtra("parent", o2);
                    intent.putExtra("child", s2);
                    mContext.startActivity(intent);

                }
            });
        }
        if(val2.equalsIgnoreCase(s3)) {

            im.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent;
                    intent = new Intent(mContext, Last_page.class);
                    intent.putExtra("parent", o3);
                    intent.putExtra("child", s3);
                    mContext.startActivity(intent);

                }
            });
        }
        if(val2.equalsIgnoreCase(s4)) {

            im.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent;
                    intent = new Intent(mContext, Last_page.class);
                    intent.putExtra("parent", o3);
                    intent.putExtra("child", s4);
                    mContext.startActivity(intent);

                }
            });
        }

        if(val2.equalsIgnoreCase(w1)) {

            im.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent;
                    intent = new Intent(mContext, Last_page.class);
                    intent.putExtra("parent", o1);
                    intent.putExtra("child", w1);
                    mContext.startActivity(intent);

                }
            });
        }
        if(val2.equalsIgnoreCase(w2)) {

            im.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent;
                    intent = new Intent(mContext, Last_page.class);
                    intent.putExtra("parent", o1);
                    intent.putExtra("child", w2);
                    mContext.startActivity(intent);

                }
            });
        }
        if(val2.equalsIgnoreCase(w3)) {

            im.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent;
                    intent = new Intent(mContext, Last_page.class);
                    intent.putExtra("parent", o1);
                    intent.putExtra("child", w3);
                    mContext.startActivity(intent);

                }
            });
        }
        if(val2.equalsIgnoreCase(w4)) {

            im.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent;
                    intent = new Intent(mContext, Last_page.class);
                    intent.putExtra("parent", o3);
                    intent.putExtra("child", w4);
                    mContext.startActivity(intent);

                }
            });
        }

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
