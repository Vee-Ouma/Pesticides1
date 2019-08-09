package com.example.pesticide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.ArrayList;

public class Flowering extends AppCompatActivity {
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
            list.add(new Values(R.drawable.cotton_fruiting_mealy, "Insect", "Mealy bug"));
            list.add(new Values(R.drawable.cotton_fruiting_worm, "Insect", "Pink ballworm"));
            list.add(new Values(R.drawable.cotton_fruiting_tobacco, "Insect", "Tobacco Caterpillar"));
            list.add(new Values(R.drawable.cotton_fruiting_mildew, "Fungus", "Grey mildew of cotton"));

        }
        if(string.equalsIgnoreCase(t2)) {

            list = new ArrayList<>();
            list.add(new Values(R.drawable.rice_fruiting_smut, "Fungus", "False smut"));
            list.add(new Values(R.drawable.rice_fruiting_borer, "Insect", "Yellow stem borer"));
            list.add(new Values(R.drawable.rice_fruiting_hopper, "Insect", "Brown planthopper"));
            list.add(new Values(R.drawable.rice_fruiting_blast, "Fungus", "Blast of rice"));

        }
        if(string.equalsIgnoreCase(t3)) {

            list = new ArrayList<>();
            list.add(new Values(R.drawable.peanut_fruiting_rust, "Fungus", "Peanut rust"));
            list.add(new Values(R.drawable.peanut_fruiting_ashy, "Fungus", "Ashy stem blight of bean"));
            list.add(new Values(R.drawable.peanut_fruiting_necrosis, "Virus", "Groundnut bud necrosis virus"));
            list.add(new Values(R.drawable.peanut_fruiting_thrips, "Insect", "Thrips"));

        }
        if(string.equalsIgnoreCase(t4)) {

            list = new ArrayList<>();
            list.add(new Values(R.drawable.sugarcane_fruiting_rot, "Fungus", "Red rot"));
            list.add(new Values(R.drawable.sugarcane_fruiting_blight, "Bacteria", "Bacterial blight of sugarcane"));
            list.add(new Values(R.drawable.sugarcane_fruiting_black, "Fungus", "Black scorch"));
            list.add(new Values(R.drawable.sugarcane_fruiting_borer, "Insect", "Root borer"));

        }
        if(string.equalsIgnoreCase(t5)) {

            list = new ArrayList<>();
            list.add(new Values(R.drawable.wheat_fruiting_rust, "Fungus", "Wheat stem rust"));
            list.add(new Values(R.drawable.wheat_fruiting_smut, "Fungus", "Loose smut of wheat"));
            list.add(new Values(R.drawable.wheat_fruiting_karnal, "Fungus", "Karnal bunt of wheat"));
            list.add(new Values(R.drawable.wheat_fruiting_amyworm, "Insect", "Fall amyworm"));

        }

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        RecyclerView.LayoutManager rvLiLayoutManager=layoutManager;
        recyclerView.setLayoutManager(rvLiLayoutManager);
        title.setImageResource(R.drawable.fruiting_stage);
        Seedling2 seedling2=new Seedling2(this,list);
        recyclerView.setAdapter(seedling2);
    }
}
