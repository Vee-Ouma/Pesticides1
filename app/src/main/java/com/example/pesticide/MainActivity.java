package com.example.pesticide;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.widget.AdapterView;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String seed,vegetative,flower,fruit,harvest;
    Spinner mSpinner;
    ImageView imageView;
    TextView textView;
    Button button;
    String stage_name;
    String[] mOptions = {"-----SELECT-----","COTTON", "RICE-P", "RICE-K", "SUGARCANE","SUNFLOWER-RAINFED","SUNFLOWER-IRRIGATED"};
    String[] plant_stage={"Pest attack may occur during seedling stage.Click to know more","Pest attack may occur during vegetative stage.Click to know more",
            "Pest attack may occur during flowering stage.Click to know more","Pest attack may occur during fruiting stage.Click to know more",
            "Pest attack may occur during harvesting stage.Click to know more"};


    String[] select_options={"STAGES FOR COTTON","STAGES FOR RICE-P","STAGES FOR RICE-K","STAGES FOR SUGARCANE","STAGES FOR SUNFLOWER-RAINFED","STAGES FOR SUNFLOWER-IRRIGATED"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        mSpinner = findViewById(R.id.spinner);
        imageView=findViewById(R.id.pic);
        textView=findViewById(R.id.text);
        button=findViewById(R.id.next);

        ArrayAdapter aa = new ArrayAdapter(this, android.R.layout.simple_spinner_item, mOptions);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //setting the ArrayAdapter data on the Spinner
        mSpinner.setAdapter(aa);

        mSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                seed=plant_stage[0];
                vegetative=plant_stage[1];
                flower=plant_stage[2];
                fruit=plant_stage[3];
                harvest=plant_stage[4];
                if(i==0){

                   textView.setText(R.string.select);
                }
                if(i==1){
                    stage_name=select_options[0];

                    imageView.setImageResource(R.drawable.cotton);
                    textView.setText(R.string.cotton_selection);


                }
                if(i==2){
                    stage_name=select_options[1];
                    imageView.setImageResource(R.drawable.rice);
                    textView.setText(R.string.rice_k_selection);

                }
                if(i==3){
                    stage_name=select_options[2];
                    imageView.setImageResource(R.drawable.rice_1);
                    textView.setText(R.string.rice_p_selection);

                }
                if(i==4){
                    stage_name=select_options[3];
                    imageView.setImageResource(R.drawable.sugar_cane);
                    textView.setText(R.string.sugarcane_selection);


                }
                if(i==5){
                    stage_name=select_options[4];
                    imageView.setImageResource(R.drawable.sunflower_1);
                    textView.setText(R.string.sunflower_1_selection);

                }
                if(i==6){
                    stage_name=select_options[5];
                    imageView.setImageResource(R.drawable.sunflower_2);
                    textView.setText(R.string.sunflower_2_selection);

                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        /*select=stage_name.toUpperCase();*/
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent=new Intent(MainActivity.this,Stages.class);
                intent.putExtra("Name",stage_name);
                intent.putExtra("seed",seed);
                intent.putExtra("veg",vegetative);
                intent.putExtra("flow",flower);
                intent.putExtra("fru",fruit);
                intent.putExtra("harv",harvest);
                startActivity(intent);
            }
        });


    }
}
