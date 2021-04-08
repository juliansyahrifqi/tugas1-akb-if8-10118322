package com.example.app_10118322_rifqipratama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.w3c.dom.Text;

// Dibuat tanggal 7 April 2021
// Oleh 10118322 - Rifqi Pratama Juliansyah - IF8

public class RegisterActivity extends AppCompatActivity {

    private Button btnLogin, btnRegister;
    private EditText etNama, etNim, etUsername, etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        initView();
        setData();
    }

    public boolean validate(EditText input) {
        boolean status = true;

        if(TextUtils.isEmpty(input.getText())) {
            status = false;

            input.setError("Kolom ini wajib diisi!");
            input.requestFocus();
        }

        return status;
    }

    public void initView() {
        btnLogin = findViewById(R.id.btn_login);
        btnRegister = findViewById(R.id.btn_register);

        etNama = findViewById(R.id.et_nama);
        etNim = findViewById(R.id.et_nim);
        etUsername = findViewById(R.id.et_username);
        etPassword = findViewById(R.id.et_password);
    }

    public void setData() {
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((validate(etNama)) && (validate(etNim)) && (validate(etUsername)) && (validate(etPassword))) {
                    Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                    startActivity(intent);

                    etNama.setText("");
                    etNim.setText("");
                    etUsername.setText("");
                    etPassword.setText("");
                    finish();
                }
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}