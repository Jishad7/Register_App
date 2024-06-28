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

public class MainActivity extends AppCompatActivity {
    AppCompatButton b1;
    EditText e1,e2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
       b1=(AppCompatButton) findViewById(R.id.logbtn);
       e1=(EditText)findViewById(R.id.uname);
        e2=(EditText)findViewById(R.id.pass);
       b1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               String getUsername=e1.getText().toString();
               String getPassword=e2.getText().toString();
               if (getUsername.equals("user") && getPassword.equals("123"))
               {
                   Intent ii=new Intent(getApplicationContext(), SuccessLogin.class);
                  startActivity(ii);
               }
               else
                   Toast.makeText(getApplicationContext(),"Wrong Username or Password",Toast.LENGTH_SHORT).show();
           }
       });
    }
}