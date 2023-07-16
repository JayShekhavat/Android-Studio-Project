package com.example.bloodandorgansdonation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BDonate extends AppCompatActivity {
    private Button accepterbtn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bdonate);

        Button button1=findViewById(R.id.findbacepter);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(BDonate.this,FindBAccepter.class);
                startActivity(intent);
            }
        });


    }
}

