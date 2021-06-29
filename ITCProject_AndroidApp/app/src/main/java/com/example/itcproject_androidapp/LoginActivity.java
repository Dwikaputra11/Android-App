package com.example.itcproject_androidapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ComponentActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    EditText etEmail,etPassword;
    Button btnLogin;
    TextView tvCheckAccount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etEmail = findViewById(R.id.et_email);
        etPassword = findViewById(R.id.et_password);
        tvCheckAccount = findViewById(R.id.tv_checkAccount);
        btnLogin = findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(etEmail.getText().toString().trim(),etPassword.getText().toString().trim());
            }
        });
    }
    public void validate(String Name, String Pass){
        if(Name.equals("admin") && Pass.equals("12345")){
            String mail = etEmail.getText().toString();
            Intent move = new Intent(LoginActivity.this, HomeActivity.class);
            move.putExtra(HomeActivity.EXTRA_EMAIL, mail);
            startActivity(move);
        }
        else{
            if(!Name.equals("admin")){
                tvCheckAccount.setText("Wrong Username");
            }else if(!Pass.equals("12345")){
                tvCheckAccount.setText("Wrong Password");
            }else {
                tvCheckAccount.setText("Wrong Password & Username");
            }
            btnLogin.setEnabled(true);
        }
    }
}