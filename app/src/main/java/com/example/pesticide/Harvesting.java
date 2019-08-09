package com.example.pesticide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.ArrayList;

public class Harvesting extends AppCompatActivity {
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
            list.add(new Values(R.drawable.cotton_harvesting_blight, "Bacteria", "Bacterial blight of cotton"));
            list.add(new Values(R.drawable.cotton_harvesting_worm, "Insect", "Pink bollworm"));
            list.add(new Values(R.drawable.cotton_harvesting_spotted, "Insect", "Spotted bollworm"));
            list.add(new Values(R.drawable.cotton_harvesting_helicoverpa, "Insect", "Helicoverpa caterpillar"));

        }
        if(string.equalsIgnoreCase(t2)) {

            list = new ArrayList<>();
            list.add(new Values(R.drawable.rice_harvesting_smut, "Fungus", "False smut"));
            list.add(new Values(R.drawable.rice_harvesting_blight, "Bacteria", "Bacterial panicle blight"));
            list.add(new Values(R.drawable.rice_harvesting_pinnacle, "Mite", "Rice pinnacle blight"));
            list.add(new Values(R.drawable.rice_harvesting_udbatta, "Fungus", "Udbatta disease of rice"));

        }
        if(string.equalsIgnoreCase(t3)) {

            list = new ArrayList<>();
            list.add(new Values(R.drawable.peanut_harvesting_ashy, "Fungus", "Ashy stem blight of bean"));
            list.add(new Values(R.drawable.peanut_harvesting_rot, "Fungus", "Foot and collar rot"));
            list.add(new Values(R.drawable.peanut_harvesting_mold, "Fungus", "Fruit molds"));
            list.add(new Values(R.drawable.peanut_harvesting_necrosis, "Virus", "Groundnut bud necrosis virus"));

        }
        if(string.equalsIgnoreCase(t4)) {

            list = new ArrayList<>();
            list.add(new Values(R.drawable.sugarcane_harvesting_rot, "Fungus", "Red rot"));
            list.add(new Values(R.drawable.sugarcane_harvesting_borer, "Insect", "Root borer"));
            list.add(new Values(R.drawable.sugarcane_harvesting_termite, "Insect", "Termites"));
            list.add(new Values(R.drawable.sugarcane_harvesting_helicoverpa, "Insect", "Helicoverpa caterpillar"));

        }
        if(string.equalsIgnoreCase(t5)) {

            list = new ArrayList<>();
            list.add(new Values(R.drawable.wheat_harvesting_smut, "Fungus", "Loose smut of wheat"));
            list.add(new Values(R.drawable.wheat_harvesting_karnal, "Fungus", "Karnal bunt of wheat"));
            list.add(new Values(R.drawable.wheat_harvesting_amyworm, "Insect", "Fall armyworm"));
            list.add(new Values(R.drawable.wheat_harvesting_blight, "Fungus", "Fusarium head blight"));

        }

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        RecyclerView.LayoutManager rvLiLayoutManager=layoutManager;
        recyclerView.setLayoutManager(rvLiLayoutManager);
        title.setImageResource(R.drawable.harvesting_stage);
        Seedling2 seedling2=new Seedling2(this,list);
        recyclerView.setAdapter(seedling2);
    }
}
