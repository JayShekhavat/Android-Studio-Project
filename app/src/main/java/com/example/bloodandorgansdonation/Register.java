package com.example.bloodandorgansdonation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Register extends AppCompatActivity {
    private EditText fName, age, pNumber, bType, gender, uEmail, password;
    private Button registerBtn, goLoginBtn;
    private FirebaseAuth mAuth;
    FirebaseDatabase db;
    DatabaseReference reference;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        mAuth = FirebaseAuth.getInstance();
        fName = findViewById(R.id.fName);
        age = findViewById(R.id.age);
        pNumber = findViewById(R.id.pNumber);
        bType = findViewById(R.id.bType);
        gender = findViewById(R.id.gender);
        uEmail = findViewById(R.id.uEmail);
        password = findViewById(R.id.password);
        registerBtn = findViewById(R.id.registerBtn);
        goLoginBtn = findViewById(R.id.goLoginBtn);


        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String fullName = fName.getText().toString().trim();
                String Age = age.getText().toString().trim();
                String phoneNumber = pNumber.getText().toString().trim();
                String bloodType = bType.getText().toString().trim();
                String Gender = gender.getText().toString().trim();
                String userEmail = uEmail.getText().toString().trim();
                String Password = password.getText().toString().trim();

//                Users obj = new Users(fullName,Age,phoneNumber,bloodType,Gender,userEmail,Password);
//                FirebaseDatabase db = FirebaseDatabase.getInstance();
//                DatabaseReference node = db.getReference("users");
//
//                node.child(userEmail).setValue(obj);

//                fName.setText("");
//                age.setText("");
//                pNumber.setText("");
//                bType.setText("");
//                gender.setText("");
//                uEmail.setText("");
//                password.setText("");





                if (fullName.isEmpty() && Age.isEmpty() && phoneNumber.isEmpty() && bloodType.isEmpty() && Gender.isEmpty() && userEmail.isEmpty() && Password.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "please fill Empty Space", Toast.LENGTH_SHORT).show();


                } else {
                    mAuth.createUserWithEmailAndPassword(userEmail, Password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()) {
                                Toast.makeText(getApplicationContext(), "Registration succefull", Toast.LENGTH_SHORT).show();
                                startActivity(new Intent(Register.this, Login.class));
                            } else {
                                Toast.makeText(getApplicationContext(), "Registration Failed " + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                }
            }
        });

        goLoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Register.this, Login.class));
            }
        });
    }
}