package com.example.pesticide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.ArrayList;

import static com.example.pesticide.R.string.sugarcane;

public class Seedling extends AppCompatActivity implements View.OnClickListener {
    ImageView title;

    RecyclerView recyclerView;

    String string;

    String t1,t2,t3,t4,t5;

    ArrayList<Values> list;

    CardView click;

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.seedling_page);

        title=findViewById(R.id.title_image);
        click=(CardView) findViewById(R.id.card6);
        recyclerView= findViewById(R.id.rv);

        t1="cotton";
        t2="sugarcane";
        t3="rice-p";
        t4="rice-k";
        t5="sunflower-rainfed";

        Intent getValue=getIntent();
        string=getValue.getStringExtra("crop");


        if(string.equalsIgnoreCase(t1)) {

            list = new ArrayList<>();
            list.add(new Values(R.drawable.root_rot_cotton, "Fungus", "Rotten Rot of Cotton"));
            list.add(new Values(R.drawable.bacterial_blight_of_cotton, "Bacteria", "Bacterial Blight of Cotton"));
            list.add(new Values(R.drawable.cotton_aphid, "Insect", "Aphids"));
            list.add(new Values(R.drawable.shoreshin_cotton, "Fungus", "Soreshin"));
        }
        else if(string.equalsIgnoreCase(t2)){

            list = new ArrayList<>();
            list.add(new Values(R.drawable.root_rot_cotton, "vegetative ", "Rotten Rot of Cotton"));


        }
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        RecyclerView.LayoutManager rvLiLayoutManager=layoutManager;
        recyclerView.setLayoutManager(rvLiLayoutManager);
        title.setImageResource(R.drawable.seedling_stage);
        Seedling2 seedling2=new Seedling2(this,list);
        recyclerView.setAdapter(seedling2);




    }

    @Override
    public void onClick(View view) {

    }
}
