package com.example.chatapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.chatapp.databinding.ActivityPhoneNumberVerificationBinding;
import com.google.firebase.auth.FirebaseAuth;


public class PhoneNumberVerification extends AppCompatActivity {
    ActivityPhoneNumberVerificationBinding binding;
    FirebaseAuth auth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPhoneNumberVerificationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //if(auth.getCurrentUser()!=null){
            //Intent intent = new Intent(PhoneNumberVerification.this, MainActivity.class);
           // startActivity(intent);
            //finish();
       // }


        getSupportActionBar().hide();
        binding.phntxt.requestFocus();
        binding.continuebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PhoneNumberVerification.this, otpactivity.class);
                intent.putExtra("PhoneNumber",binding.phntxt.getText().toString());
                startActivity(intent);
            }
        });
    }
}