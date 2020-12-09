package com.test.architecture;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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
            if (checkLogin(etLogin.getText().toString())
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
    private  boolean checkLogin(String login){
for(int i = 0; i<Utils.logins.length;i++){
    if (Utils.logins[i].equals(login)) return  true;
}
        return false;
    }
    private  boolean checkPassword(String password){
return  password.equals(Utils.password);
    }

}