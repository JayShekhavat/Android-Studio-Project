package com.example.bloodandorgansdonation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Donate extends AppCompatActivity {
    private Button bloodbtn1,organbtn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donate);

        Button button1=findViewById(R.id.dbloodbtn);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Donate.this,BDonate.class);
                startActivity(intent);
            }
        });

        Button button2=findViewById(R.id.dorganbtn);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Donate.this,ODonate.class);
                startActivity(intent);
            }
        });
    }
}