package com.example.pesticide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import java.util.ArrayList;

public class Fruiting extends AppCompatActivity {
    ImageView title;

    RecyclerView recyclerView;

    ArrayList<Values> list;

    CardView click;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.seedling_page);

        title=findViewById(R.id.title_image);
        click=(CardView) findViewById(R.id.card6);
        recyclerView= findViewById(R.id.rv);

        list=new ArrayList<>();
        list.add(new Values(R.drawable.root_rot_cotton,"vegetative ","Rotten Rot of Cotton"));
        list.add(new Values(R.drawable.bacterial_blight_of_cotton,"Bacteria","Bacterial Blight of Cotton"));
        list.add(new Values(R.drawable.cotton_aphid,"Insect","Aphids"));
        list.add(new Values(R.drawable.shoreshin_cotton,"Fungus","Soreshin"));

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        RecyclerView.LayoutManager rvLiLayoutManager=layoutManager;
        recyclerView.setLayoutManager(rvLiLayoutManager);
        title.setImageResource(R.drawable.seedling_stage);
        Seedling2 seedling2=new Seedling2(this,list);
        recyclerView.setAdapter(seedling2);
    }
}
