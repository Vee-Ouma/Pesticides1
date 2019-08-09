package com.example.pesticide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.ArrayList;

public class Fruiting extends AppCompatActivity {
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
            list.add(new Values(R.drawable.cotton_flowering_tobacco, "Insect", "Tobacco caterpillar"));
            list.add(new Values(R.drawable.cotton_flowering_jassids, "Insect", "Cotton leafhopper jassids"));
            list.add(new Values(R.drawable.cotton_flowering_mildew, "Fungus", "Powdery mildew"));
            list.add(new Values(R.drawable.cotton_flowering_myrotheium, "Fungus", "Myrothecium leaf spot"));

        }
        if(string.equalsIgnoreCase(t2)) {

            list = new ArrayList<>();
            list.add(new Values(R.drawable.rice_flowering_blast, "Fungus", "Blast of rice"));
            list.add(new Values(R.drawable.rice_flowering_sheath, "Fungus", "Rice sheath blight"));
            list.add(new Values(R.drawable.rice_flowering_borer, "Insect", "Yellow stem borer"));
            list.add(new Values(R.drawable.rice_flowering_roller, "Insect", "Rice leafroller"));

        }
        if(string.equalsIgnoreCase(t3)) {

            list = new ArrayList<>();
            list.add(new Values(R.drawable.peanut_flowering_tobacco, "Virus", "Tobacco streak virus"));
            list.add(new Values(R.drawable.peanut_flowering_mite, "Mite", "Spider mite"));
            list.add(new Values(R.drawable.peanut_flowering_thrips, "Insect", "Thrips"));
            list.add(new Values(R.drawable.peanut_flowering_grub, "Insect", "White gub"));

        }
        if(string.equalsIgnoreCase(t4)) {

            list = new ArrayList<>();
            list.add(new Values(R.drawable.sugarcane_flowering_mealy, "Insect", "Mealy bug"));
            list.add(new Values(R.drawable.sugarcane_flowering_wilt, "Fungus", "wilt disease of sugarcane"));
            list.add(new Values(R.drawable.sugarcane_flowering_aphids, "Insect", "Aphids"));
            list.add(new Values(R.drawable.sugarcane_flowering_borer, "Insect", "Root borer"));

        }
        if(string.equalsIgnoreCase(t5)) {

            list = new ArrayList<>();
            list.add(new Values(R.drawable.wheat_flowering_rust, "Fungus", "Wheat leaf rust"));
            list.add(new Values(R.drawable.wheat_flowering_stem, "Fungus", "Wheat stem rust"));
            list.add(new Values(R.drawable.wheat_flowering_fall, "Insect", "Fall armyworm"));
            list.add(new Values(R.drawable.wheat_flowering_spot, "Fungus", "Eyespots of cereals"));

        }

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        RecyclerView.LayoutManager rvLiLayoutManager=layoutManager;
        recyclerView.setLayoutManager(rvLiLayoutManager);
        title.setImageResource(R.drawable.flowering_stage);
        Seedling2 seedling2=new Seedling2(this,list);
        recyclerView.setAdapter(seedling2);
    }
}
