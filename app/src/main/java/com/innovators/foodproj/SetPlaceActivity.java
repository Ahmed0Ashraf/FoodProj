package com.innovators.foodproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SetPlaceActivity extends AppCompatActivity {

    Button setButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_place);

        setButton = findViewById(R.id.set_now_button);

        setButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SetPlaceActivity.this, ResturantsActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
