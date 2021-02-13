package com.example.natterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.natterapp.databinding.ActivityPhoneBinding;

public class PhoneActivity extends AppCompatActivity {
  ActivityPhoneBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityPhoneBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.btnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(PhoneActivity.this ,OTPactivity.class);
                i.putExtra("phoneNumber",binding.edPno.getText().toString());
                startActivity(i);
            }
        });
    }
}