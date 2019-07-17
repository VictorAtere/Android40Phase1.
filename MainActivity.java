package com.example.atere.android40phase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Making  a reference to the MyProfile button
        Button myProfile = findViewById(R.id.my_profile);


        //Setting an OnClickListener for the MyProfile button
        myProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myProfileIntent = new Intent(MainActivity.this ,MyProfile.class);
                startActivity(myProfileIntent);
            }
        });

        //Making  a reference to the MyProfile button
        Button aboutAlcButton= findViewById(R.id.about_alc);


        //Setting an OnClickListener for the AboutAlc button
        aboutAlcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aboutAlcIntent = new Intent(MainActivity.this ,AboutAlc.class);
                startActivity(aboutAlcIntent);
            }
        });
    }
}
