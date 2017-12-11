package com.example.hashem.bumapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EAST extends AppCompatActivity {

    public Button butHAR;

    public void init3(){
        butHAR = (Button)findViewById(R.id.butHAR);
        butHAR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent (EAST.this,HAR.class);
                startActivity(toy);
            }
        });

    }

    public Button butCENT;



    public Button butSAR;

    public void init5(){
        butSAR = (Button)findViewById(R.id.butSAR);
        butSAR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent (EAST.this,SAR.class);
                startActivity(toy);
            }
        });

    }
    public Button butSED;

    public void init6(){
        butSED = (Button)findViewById(R.id.butSED);
        butSED.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent (EAST.this,SED.class);
                startActivity(toy);
            }
        });

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_east);
        init3();
        //init4();
        init5();
        init6();
        butCENT = (Button)findViewById(R.id.butCENT);
        butCENT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(EAST.this, MainActivity.class);
                startActivity(i);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_righ);
            }
        });
    }
}
