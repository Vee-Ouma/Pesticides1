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



public class Seedling extends AppCompatActivity implements View.OnClickListener {
    ImageView title;

    RecyclerView recyclerView;

    String string;

    String t1,t2,t3,t4,t5,t6;

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
        t2="rice";
        t3="peanut";
        t4="sugarcane";
        t5="maize";
        t6="wheat";

        Intent getValue=getIntent();
        string=getValue.getStringExtra("crop");



        if(string.equalsIgnoreCase(t1)) {

            list = new ArrayList<>();
            list.add(new Values(R.drawable.root_rot_cotton, "Fungus", "Rotten Rot of Cotton"));
            list.add(new Values(R.drawable.bacterial_blight_of_cotton, "Bacteria", "Bacterial Blight of Cotton"));
            list.add(new Values(R.drawable.cotton_aphid, "Insect", "Cotton Aphids"));
            list.add(new Values(R.drawable.shoreshin_cotton, "Fungus", "Soreshin"));
        }
        else if(string.equalsIgnoreCase(t2)){

            list = new ArrayList<>();
            list.add(new Values(R.drawable.rice_hispa, "Insect", "Rice Hispa"));
            list.add(new Values(R.drawable.rice_case_worm1, "Insect", "Rice case worm"));
            list.add(new Values(R.drawable.frog_hopper, "Insect", "Demerara Froghopper"));
            list.add(new Values(R.drawable.rice_leaf_mite, "Mite", "Rice Leaf Mite"));

        }
        else if(string.equalsIgnoreCase(t3)){

            list = new ArrayList<>();
            list.add(new Values(R.drawable.peanut_aphids, "Insect", "Peanut Aphids"));
            list.add(new Values(R.drawable.peanut_white_grub, "Insect", "White Grub"));
            list.add(new Values(R.drawable.peanut_termites, "Insect", "Peanut Termites"));
            list.add(new Values(R.drawable.peanut_leaf_spot, "Fungus", "Phyllosticta leaf spot"));

        }
        else if(string.equalsIgnoreCase(t4)) {

            list = new ArrayList<>();
            list.add(new Values(R.drawable.sugarcane_wilt, "Fungus", "Wilt disease of sugarcane"));
            list.add(new Values(R.drawable.bacterial_bacterial_of_bacteria, "Bacteria", "Bacterial Blight of sugarcane"));
            list.add(new Values(R.drawable.sugarcane_aphids, "Insect", "Sugarcane Aphids"));
            list.add(new Values(R.drawable.root_borer, "Insect", "Root borer"));

        }

        else if(string.equalsIgnoreCase(t6)){

            list = new ArrayList<>();
            list.add(new Values(R.drawable.wheat_yellow_rust, "Fungus", "Yellow stripe Rust"));
            list.add(new Values(R.drawable.wheat_powdery, "Fungus", "Powdery mildew of cereals"));
            list.add(new Values(R.drawable.wheat_root, "Fungus", "Root and foot rot"));
            list.add(new Values(R.drawable.wheat_aphid, "Insect", "wheat Aphids"));
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
