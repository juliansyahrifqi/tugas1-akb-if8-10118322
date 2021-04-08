package com.example.app_10118322_rifqipratama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

// Dibuat tanggal 6 April 2021
// Oleh 10118322 - Rifqi Pratama Juliansyah - IF8

public class MainActivity extends AppCompatActivity {

    private TextView tvUsername;
    private String username;
    private Button btnLogout, btnProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        setData();
    }

    public void initView() {
        tvUsername = findViewById(R.id.txt_username);

        btnProfile = findViewById(R.id.btn_profile);
        btnLogout = findViewById(R.id.btn_logout);
    }

    public void setData() {
        Intent intent = getIntent();
        username = intent.getStringExtra("username");

        tvUsername.setText("Selamat datang, " + username);

        btnProfile.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
               startActivity(intent);
           }
        });

        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), LoginActivity.class));
                finish();
            }
        });
    }
}