package com.example.hashem.bumapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import uk.co.senab.photoview.PhotoViewAttacher;

public class MainActivity extends AppCompatActivity {

    public Button butENG;

    public void init(){
        butENG = (Button)findViewById(R.id.butENG);
        butENG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent (MainActivity.this,ENG.class);
                startActivity(toy);
            }
        });

    }

    public Button butGSU;

    public void init9(){
        butGSU = (Button)findViewById(R.id.butGSU);
        butGSU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent (MainActivity.this,GSU.class);
                startActivity(toy);
            }
        });

    }

    public Button butCAS;

    public void init2(){
        butCAS = (Button)findViewById(R.id.butCAS);
        butCAS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent (MainActivity.this,CAS.class);
                startActivity(toy);
            }
        });

    }

    public Button butLAW;

    public void init7(){
        butLAW = (Button)findViewById(R.id.butLAW);
        butLAW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent (MainActivity.this,LAW.class);
                startActivity(toy);
            }
        });

    }

    public Button butEAST;



    public Button butCOM;
    public Button butWEST;


    public void init4(){
        butCOM = (Button)findViewById(R.id.butCOM);
        butCOM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent (MainActivity.this,COM.class);
                startActivity(toy);
            }
        });

    }

    public Button butWAR;


    public void init10(){
        butWAR = (Button)findViewById(R.id.butWAR);
        butWAR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent (MainActivity.this,WAR.class);
                startActivity(toy);
            }
        });

    }



    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        butEAST = (Button)findViewById(R.id.butEAST);
        butEAST.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, EAST.class);
                startActivity(i);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            }
        });
        butWEST = (Button)findViewById(R.id.butWEST);
        butWEST.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, WEST.class);
                startActivity(i);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_righ);
            }
        });
        init();
        init2();
        //init3();
        init4();
        //init5();
        init7();
        init9();
        init10();
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //final ImageView zoom = (ImageView) findViewById(R.id.imageView);

        //final Animation zoomAnimation = AnimationUtils.loadAnimation(this, R.anim.zoom);
        //zoom.startAnimation(zoomAnimation);

        /*imageView = (ImageView)findViewById(R.id.imageView);
        PhotoViewAttacher photoView = new PhotoViewAttacher(imageView);
        photoView.update();
*/
        /*imageView = (ImageView)findViewById(R.id.butCOM);
        PhotoViewAttacher photoView2 = new PhotoViewAttacher(imageView);
        photoView2.update();
        */

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}

