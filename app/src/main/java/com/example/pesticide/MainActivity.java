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
    String select;
    Spinner mSpinner;
    ImageView imageView;
    TextView textView;
    Button button;
    String stage_name;
    String[] mOptions = {"-----SELECT-----","COTTON", "RICE-P", "RICE-K", "SUGARCANE","SUNFLOWER-RAINFED","SUNFLOWER-IRRIGATED"};
    String[] selectoptions={"STAGES FOR COTTON","STAGES FOR RICE-P","STAGES FOR RICE-K","STAGES FOR SUGARCANE","STAGES FOR SUNFLOWER-RAINFED","STAGED FOR SUNFLOWER-IRRIGATED"};
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
                if(i==0){

                   textView.setText(R.string.select);
                }
                if(i==1){
                    stage_name=selectoptions[1];
                    imageView.setImageResource(R.drawable.cotton);
                    textView.setText(R.string.cotton_selection);


                }
                if(i==2){
                    stage_name=selectoptions[2];
                    imageView.setImageResource(R.drawable.rice);
                    textView.setText(R.string.rice_k_selection);

                }
                if(i==3){
                    stage_name=selectoptions[3];
                    imageView.setImageResource(R.drawable.rice_1);
                    textView.setText(R.string.rice_p_selection);

                }
                if(i==4){
                    stage_name=selectoptions[4];
                    imageView.setImageResource(R.drawable.sugar_cane);
                    textView.setText(R.string.sugarcane_selection);


                }
                if(i==5){
                    stage_name=selectoptions[5];
                    imageView.setImageResource(R.drawable.sunflower_1);
                    textView.setText(R.string.sunflower_1_selection);

                }
                if(i==6){
                    stage_name=selectoptions[6];
                    imageView.setImageResource(R.drawable.sunflower_2);
                    textView.setText(R.string.sunflower_2_selection);

                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        select=stage_name.toUpperCase();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent=new Intent(MainActivity.this,Stages.class);
                intent.putExtra("Name",select);
                startActivity(intent);
            }
        });


    }
}
