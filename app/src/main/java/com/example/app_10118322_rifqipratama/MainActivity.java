package com.example.app_10118322_rifqipratama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvUsername, tvPassword;
    private String username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        setData();
    }

    public void initView() {
        tvUsername = findViewById(R.id.txt_username);
        tvPassword = findViewById(R.id.txt_password);
    }

    public void setData() {
        Intent intent = getIntent();
        username = intent.getStringExtra("username");
        password = intent.getStringExtra("password");

        tvUsername.setText(username);
        tvPassword.setText(password);
    }
}