package com.example.pesticide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class Stages extends AppCompatActivity implements View.OnClickListener {

    TextView t1,t2,t3,t4,t5,t6;

    String value;



    CardView S_stage,V_stage,F1_stage,F2_stage,H_stage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stages);

       t1=findViewById(R.id.stage_cotton);
       t2=findViewById(R.id.seedling);
       t3=findViewById(R.id.vegetation);
       t4=findViewById(R.id.flowering);
       t5=findViewById(R.id.fruiting);
       t6=findViewById(R.id.harvesting);

       Intent getValue = getIntent();
       value=getValue.getStringExtra("crop_name");


       S_stage=(CardView)findViewById(R.id.card1);
       V_stage=(CardView)findViewById(R.id.card2);
       F1_stage=(CardView)findViewById(R.id.card3);
       F2_stage=(CardView)findViewById(R.id.card4);
       H_stage=(CardView)findViewById(R.id.card5);


        S_stage.setOnClickListener(this);
        V_stage.setOnClickListener(this);
        F1_stage.setOnClickListener(this);
        F2_stage.setOnClickListener(this);
        H_stage.setOnClickListener(this);


       t1.setText(getIntent().getStringExtra("Name"));
       t2.setText(getIntent().getStringExtra("seed"));
       t3.setText(getIntent().getStringExtra("veg"));
       t4.setText(getIntent().getStringExtra("flow"));
       t5.setText(getIntent().getStringExtra("fru"));
       t6.setText(getIntent().getStringExtra("harv"));






    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()){
            case R.id.card1:
                intent=new Intent(Stages.this,Seedling.class);
                intent.putExtra("crop",value);
                startActivity(intent);
                break;
            case R.id.card2:
                intent=new Intent(Stages.this,Vegetative.class);
                intent.putExtra("crop",value);
                startActivity(intent);
                break;
            case R.id.card3:
                intent=new Intent(Stages.this,Flowering.class);
                intent.putExtra("crop",value);
                startActivity(intent);
                break;
            case R.id.card4:
                intent=new Intent(Stages.this,Fruiting.class);
                intent.putExtra("crop",value);
                startActivity(intent);
                break;
            case R.id.card5:
                intent=new Intent(Stages.this,Harvesting.class);
                intent.putExtra("crop",value);
                startActivity(intent);
                break;

    }
    }
}
