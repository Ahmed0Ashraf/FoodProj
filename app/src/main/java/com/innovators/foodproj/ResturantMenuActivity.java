package com.innovators.foodproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ResturantMenuActivity extends AppCompatActivity {


    ImageView restrauntmenuImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resturant_menu);

        restrauntmenuImage = findViewById(R.id.add_cart_imageView);

        restrauntmenuImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ResturantMenuActivity.this, AddToCartActivity.class);
                startActivity(intent);

            }
        });
    }
}
