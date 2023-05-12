package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.sql.SQLOutput;

public class LoginActivity extends AppCompatActivity {
    EditText getusername;
    EditText getuserPass;
    Button loginBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getusername=findViewById(R.id.usernameInput);
        getuserPass=findViewById(R.id.usernpassInput);
        loginBtn = findViewById(R.id.loginBtn);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(getusername.getText().toString().equals("190619")&&getuserPass.getText().toString().equals("190619")){
                    System.out.println("Logged in");
                    Intent intent = new Intent(LoginActivity.this,HomeActivity.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(LoginActivity.this, "Incorrect login ", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}