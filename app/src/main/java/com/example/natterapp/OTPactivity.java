package com.example.natterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.natterapp.databinding.ActivityPhoneBinding;

public class OTPactivity extends AppCompatActivity {
    ActivityPhoneBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityPhoneBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());
        String phoneNumber= getIntent().getStringExtra("phoneNumber");
        binding.pnolabel.setText("Verify"+phoneNumber);
    }
}