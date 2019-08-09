package com.example.pesticide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.ArrayList;

public class Vegetative extends AppCompatActivity {

    ImageView title;

    RecyclerView recyclerView;

    String t1,t2,t3,t4,t5,t6;

    String string;

    ArrayList<Values> list;

    CardView click;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.seedling_page);

        title=findViewById(R.id.title_image);
        click=(CardView) findViewById(R.id.card6);
        recyclerView= findViewById(R.id.rv);

        t1="cotton";
        t2="rice";
        t3="peanut";
        t4="sugarcane";
        t5="wheat";

        Intent getValue=getIntent();
        string=getValue.getStringExtra("crop");

        if(string.equalsIgnoreCase(t1)) {

            list = new ArrayList<>();
            list.add(new Values(R.drawable.cotton_fusarium, "Fungus", "Fusarium wilt"));
            list.add(new Values(R.drawable.cotton_atlernia, "Fungus", "Alternaria leaf spot of cotton"));
            list.add(new Values(R.drawable.cotton_sooty_mold, "Fungus", "Sooty mold"));
            list.add(new Values(R.drawable.cotton_spider_mite, "Mite", "Spider mites"));

        }
        if(string.equalsIgnoreCase(t2)) {

            list = new ArrayList<>();
            list.add(new Values(R.drawable.rice_vegetative_blast, "Fungus", "Blast of rice"));
            list.add(new Values(R.drawable.rice_vegetative_brown, "Fungus", "Brown spot of rice"));
            list.add(new Values(R.drawable.rice_vegetative_bacterial, "Bacteria", "Bacterial blight of rice"));
            list.add(new Values(R.drawable.rice_vegetative_plant_hopper, "Insect", "Brown planthopper"));

        }
        if(string.equalsIgnoreCase(t3)) {

            list = new ArrayList<>();
            list.add(new Values(R.drawable.peanut_vegetative_late, "Fungus", "Late and early leaf spot"));
            list.add(new Values(R.drawable.peanut_vegetative_rust, "Fungus", "Peanut rust"));
            list.add(new Values(R.drawable.peanut_vegetative_ashy, "Fungus", "Ashy stem blight of bean"));
            list.add(new Values(R.drawable.peanut_vegetative_foot, "Fungus", "Foot and collar rot"));

        }
        if(string.equalsIgnoreCase(t4)) {

            list = new ArrayList<>();
            list.add(new Values(R.drawable.sugarcane_vegetative_redrot, "Fungus", "Red rot"));
            list.add(new Values(R.drawable.sugarcane_vegetative_smut, "Fungus", "Smut of sugarcane"));
            list.add(new Values(R.drawable.sugarcane_wilt, "Fungus", "Wilt disease of sugarcane"));
            list.add(new Values(R.drawable.sugarcane_vegetative_blight, "Bacteria", "Bacterial leaf blight of sugarcane"));

        }
        if(string.equalsIgnoreCase(t5)) {

            list = new ArrayList<>();
            list.add(new Values(R.drawable.wheat_vegetative_leaf_rust, "Fungus", "Wheat leaf rust"));
            list.add(new Values(R.drawable.wheat_vegetative_stem_rust, "Fungus", "Wheat stem rust"));
            list.add(new Values(R.drawable.wheat_vegetative_yellow_rust, "Fungus", "Yellow stripe rust"));
            list.add(new Values(R.drawable.wheat_vegetative_tan_spot, "Fungus", "Tan spot"));

        }


        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        RecyclerView.LayoutManager rvLiLayoutManager=layoutManager;
        recyclerView.setLayoutManager(rvLiLayoutManager);
        title.setImageResource(R.drawable.vegetative_stage);
        Seedling2 seedling2=new Seedling2(this,list);
        recyclerView.setAdapter(seedling2);
    }
}
