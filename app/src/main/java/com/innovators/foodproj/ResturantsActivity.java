package com.innovators.foodproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ResturantsActivity extends AppCompatActivity {

    ImageView restrauntImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resturants);


        restrauntImage = findViewById(R.id.kfc_imageView);

        restrauntImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ResturantsActivity.this, ResturantMenuActivity.class);
                startActivity(intent);

            }
        });
    }
}
