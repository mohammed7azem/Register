package com.example.register;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText name;
    EditText email;
    EditText phone;
    EditText age;
    EditText address;
    EditText gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.text_name);
        email=findViewById(R.id.text_email);
        phone=findViewById(R.id.phone_number);
        age=findViewById(R.id.age);
        address=findViewById(R.id.text_address);
        gender=findViewById(R.id.gender);
            }

    public void onOkClicked(View view) {
        String theName=name.getText().toString();
        String theEmail=email.getText().toString();
        String thePhone=phone.getText().toString();
        String theAge=age.getText().toString();
        String theAddress=address.getText().toString();
        String theGender=gender.getText().toString();
        Intent intent=new Intent(this,Informations.class);
        intent.putExtra("name",theName);
        intent.putExtra("email",theEmail);
        intent.putExtra("phone",thePhone);
        intent.putExtra("age",theAge);
        intent.putExtra("address",theAddress);
        intent.putExtra("gender",theGender);
        startActivity(intent);
    }
}
