package com.example.bloodandorgansdonation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

public class Login extends AppCompatActivity {
    private EditText useremail,password;
    private TextView newUser;
    private Button loginBtn;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        useremail =  findViewById(R.id.useremail);
        password=  findViewById(R.id.password);
        mAuth = FirebaseAuth.getInstance();
        loginBtn = findViewById(R.id.loginBtn);



        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uEmail = useremail.getText().toString().trim();
                String psd = password.getText().toString().trim();

                if(!uEmail.isEmpty() && !psd.isEmpty()){

                        mAuth.signInWithEmailAndPassword(uEmail, psd)
                                .addOnCompleteListener(Login.this, new OnCompleteListener<AuthResult>() {
                                    @Override
                                    public void onComplete(@NonNull Task<AuthResult> task) {
                                        if (task.isSuccessful()) {
                                            Intent intent=new Intent(Login.this,Options.class);
                                            intent.putExtra("email",mAuth.getCurrentUser().getEmail());
                                            intent.putExtra("uid",mAuth.getCurrentUser().getUid());
                                            startActivity(intent);

                                        } else {
                                            useremail.getEditableText();
                                            password.getEditableText();
                                            Toast.makeText(getApplicationContext(), "invalidEmail/password",Toast.LENGTH_SHORT);
                                        }
                                    }
                                });


                }else{
                    Toast.makeText(getApplicationContext(),"please fill Empty",Toast.LENGTH_SHORT);
                }
            }

        });

//        newUser.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent=new Intent(Login.this,Register.class);
//                startActivity(intent);
//            }
//        });

    }

}