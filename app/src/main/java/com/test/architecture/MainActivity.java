package com.test.architecture;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
    Button btnStart2;
    Button btnlogin;
    EditText etLogin;
    EditText etPassword;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        btnlogin = findViewById(R.id.btnStart);
        etLogin = findViewById(R.id.etLogin);
        etPassword = findViewById(R.id.etPassword);


        btnlogin.setOnClickListener(viev -> {
            if (checkLogin()
                    &&
                    checkPassword(etPassword.getText().toString())){
                startActivity();
            } else {
                Toast.makeText(this, "логин или пароль не правельный", Toast.LENGTH_SHORT). show();

            }

        });


         btnStart2.setOnClickListener(view ->{
             startActivity();
        });

    }

    private void  startActivity(){
        Intent intent = new Intent(this, ThirdActivity.class);
        startActivity(intent);

    }



    private  boolean checkPassword(String password){
        int checkEtPassword = etPassword.length();

        if ( checkEtPassword >= 8) {



        }
        return true;

    }

    private boolean checkLogin(){
        int checkEtLogin = etLogin.length();
        if ( checkEtLogin > 3);
        return true;

    }



}
