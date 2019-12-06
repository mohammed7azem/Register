package com.example.register;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Informations extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informations);
        Intent intent=getIntent();
        String Name=intent.getStringExtra("name");
        String Email=intent.getStringExtra("email");
        String Phone=intent.getStringExtra("phone");
        String Age=intent.getStringExtra("age");
        String Address=intent.getStringExtra("address");
        String Gender=intent.getStringExtra("gender");
        TextView name=findViewById(R.id.result_name);
        TextView email=findViewById(R.id.result_email);
        TextView phone=findViewById(R.id.result_phone);
        TextView age=findViewById(R.id.result_age);
        TextView address=findViewById(R.id.result_address);
        TextView gender=findViewById(R.id.result_gender);
        name.append(Name);
        email.append(Email);
        phone.append(Phone);
        age.append(Age);
        address.append(Address);
        gender.append(Gender);
    }
}
