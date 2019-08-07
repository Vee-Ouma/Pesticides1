package com.example.pesticide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Last_page extends AppCompatActivity {

    String val1,val2;
    int val3;

    TextView origin,disease_name,diagnosis,preventive_measures,treatment;
    ImageView picture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last_page);

        origin=findViewById(R.id.origin);
        disease_name=findViewById(R.id.name);
        diagnosis=findViewById(R.id.diagnosis);
        preventive_measures=findViewById(R.id.prevention);
        treatment=findViewById(R.id.treat_now);
        picture=findViewById(R.id.disease_picture);

        Intent getValue = getIntent();
        val1 = getValue.getStringExtra("parent");
        val2=getValue.getStringExtra("child");


        origin.setText(val1);
        disease_name.setText(val2);




    }
}
