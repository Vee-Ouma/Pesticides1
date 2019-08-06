package com.example.pesticide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Stages extends AppCompatActivity {

    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stages);

        t1=findViewById(R.id.stage_cotton);

        t1.setText(getIntent().getStringExtra("Name"));


    }
}
