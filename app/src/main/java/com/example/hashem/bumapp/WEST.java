package com.example.hashem.bumapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WEST extends AppCompatActivity {

    public Button butCENT;


    public Button butCFA;

    public void init5() {
        butCFA = (Button) findViewById(R.id.butCFA);
        butCFA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(WEST.this, CFA.class);
                startActivity(toy);
            }
        });
    }

    public Button butWES;

    public void init6() {
        butWES = (Button) findViewById(R.id.butWES);
        butWES.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(WEST.this, WES.class);
                startActivity(toy);
            }
        });
    }


    public Button butFIT;

    public void init7() {
        butFIT = (Button) findViewById(R.id.butFIT);
        butFIT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(WEST.this, FIT.class);
                startActivity(toy);
            }
        });
    }

    public Button butCGS;

    public void init4() {
        butCGS = (Button) findViewById(R.id.butCGS);
        butCGS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(WEST.this, CGS.class);
                startActivity(toy);
            }
        });
    }

    public Button butSHS;

    public void init11() {
        butSHS = (Button) findViewById(R.id.butSHS);
        butSHS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(WEST.this, SHS.class);
                startActivity(toy);
            }
        });
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_west);
        init4();
        init5();
        init6();
        init7();
        init11();
            butCENT = (Button)findViewById(R.id.butCENT);
            butCENT.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(WEST.this, MainActivity.class);
                    startActivity(i);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                }
            });
    }
}
