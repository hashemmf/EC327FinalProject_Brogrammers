package com.example.hashem.bumapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class COM extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_com);
    }

    public void open (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.bu.edu/com/about-com/news-events/"));
        startActivity(browserIntent);
    }
}

