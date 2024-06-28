package com.example.registerapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SuccessLogin extends AppCompatActivity {
    AppCompatButton b1,b2;
    EditText e1,e2,e3,e4;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_success_login);
        b2=(AppCompatButton) findViewById(R.id.logout);
        b1=(AppCompatButton) findViewById(R.id.add);
        e1=(EditText)findViewById(R.id.name);
        e2=(EditText)findViewById(R.id.admn);
        e3=(EditText)findViewById(R.id.sys);
        e4=(EditText)findViewById(R.id.dept);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getName=e1.getText().toString();
                String getAdmn=e2.getText().toString();
                String getSys=e3.getText().toString();
                String getDept=e4.getText().toString();
                Toast.makeText(getApplicationContext(),getName+getAdmn+getSys+getDept,Toast.LENGTH_LONG).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i1);
            }
        });
    }
}