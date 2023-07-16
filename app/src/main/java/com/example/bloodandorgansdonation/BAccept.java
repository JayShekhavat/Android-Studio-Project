package com.example.bloodandorgansdonation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BAccept extends AppCompatActivity {
    private Button donorbtn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baccept);

        Button button=findViewById(R.id.findbdonor);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(BAccept.this,FindBDonor.class);
                startActivity(intent);
            }
        });
    }
}