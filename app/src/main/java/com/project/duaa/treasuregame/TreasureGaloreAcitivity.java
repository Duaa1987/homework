package com.project.duaa.treasuregame;

import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class TreasureGaloreAcitivity extends AppCompatActivity {
    public static final String EXTRA_TREASURE_ID = "treasureId";
    RecyclerView recyclerView;
    List<Product> productList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_treasure_galore_acitivity);

        //Set the toolbar as the activity's app bar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        //Display details of the treasurehunt
        long treasureId1 = (long) getIntent().getExtras().get(EXTRA_TREASURE_ID);

        int treasureId = (int) treasureId1;

        Treasure t = Treasure.treasures[treasureId];

        String treasureName = t.getName();
        String TreasureLevel=t.getLevel();
        String treasurehealth=t.getHealth();
        TextView tx = (TextView)findViewById(R.id.treasure_text);
        TextView tlevel=(TextView)findViewById(R.id.treasure_level);
        TextView txhealth=(TextView)findViewById(R.id.treasure_health);
        tx.setText("Name :"+treasureName);
        tlevel.setText("Level: "+TreasureLevel);
        txhealth.setText("Health: "+treasurehealth);
        int treasureImage = t.getImageResourceId();
        ImageView imageView = (ImageView)findViewById(R.id.treasure_image);
        imageView.setImageDrawable(ContextCompat.getDrawable(this, treasureImage ));
        imageView.setContentDescription(treasureName);

        //array
        Product[] proArray= t.getProductArray();

        String productname[]=new String [3];

        for (int i=0;i<3; i++){
            productname[i] = proArray[i].getTitle();
        }

        int imageid[]=new int[3];

        for (int i=0;i<3; i++){
            imageid[i] = proArray[i].getImage();
        }


        String productlevel[]=new String [3];

        for (int i=0;i<3; i++){
            productlevel[i] = proArray[i].getlevel();
        }

        String productrate[]=new String [3];

        for (int i=0;i<3; i++){
            productrate[i] = proArray[i].getRating();
        }


        CaptionedImageAdapter adapter = new CaptionedImageAdapter(productname, imageid,productlevel,productrate);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        recyclerView.setAdapter(adapter);


    }


}
