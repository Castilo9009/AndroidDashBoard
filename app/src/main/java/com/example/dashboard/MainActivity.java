package com.example.dashboard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // link: https://www.youtube.com/watch?v=ixRXEoGAEZM&t=469s

        CardView hikeCard = findViewById(R.id.card_hike);
        CardView searchCard = findViewById(R.id.card_search);
        CardView sightsCard = findViewById(R.id.card_sights);
        CardView uploadCard = findViewById(R.id.card_upload_hike);


        hikeCard.setOnClickListener(view -> Toast.makeText(this, "Hike", Toast.LENGTH_SHORT).show());
        sightsCard.setOnClickListener(view -> Toast.makeText(this, "Hike", Toast.LENGTH_SHORT).show());
        searchCard.setOnClickListener(view -> Toast.makeText(this, "Hike", Toast.LENGTH_SHORT).show());
        uploadCard.setOnClickListener(view -> Toast.makeText(this, "Hike", Toast.LENGTH_SHORT).show());


    }
}