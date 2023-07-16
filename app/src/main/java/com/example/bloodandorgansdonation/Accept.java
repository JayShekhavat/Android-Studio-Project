package com.example.bloodandorgansdonation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Accept extends AppCompatActivity {

    private Button bloodbtn2,organbtn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accept);

        Button button1=findViewById(R.id.abloodbtn);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Accept.this,BAccept.class);
                startActivity(intent);
            }
        });

        Button button2= findViewById(R.id.aorganbtn);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Accept.this,OAccept.class);
                startActivity(intent);
            }
        });
    }
}