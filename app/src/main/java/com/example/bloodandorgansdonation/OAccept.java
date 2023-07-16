package com.example.bloodandorgansdonation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OAccept extends AppCompatActivity {
    private Button donorbtn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oaccept);

        Button button=findViewById(R.id.findodonor);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(OAccept.this,FindODonor.class);
                startActivity(intent);
            }
        });
    }
}