package com.test.architecture;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
public class ThirdActivity extends AppCompatActivity {

public String etPhoune;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

System.out.println(etPhoune);

    }
    public String onClickButton1(View view)
    {
        String b1 = "1";
        etPhoune = etPhoune + b1;
        return etPhoune;
    }
    public String onClickButton2(View view)
    {
        String b2 = "2";
        etPhoune = etPhoune + b2;
        return etPhoune;

    }
    public String onClickButton3(View view)
    {
        String b3 = "3";
        etPhoune = etPhoune + b3;
        return etPhoune;

    }
    public String onClickButton4(View view)
    {
        String b4 = "4";
        etPhoune = etPhoune + b4;
        return etPhoune;
    }
    public String onClickButton5(View view) {
        String b5 = "5";
        etPhoune = etPhoune + b5;
        return etPhoune;
    }
    public String onClickButton6(View view) {
        String b6 = "6";
        etPhoune = etPhoune + b6;
        return etPhoune;
    }
    public String onClickButton7(View view) {
        String b7 = "7";
        etPhoune = etPhoune + b7;
        return etPhoune;
    }
    public String onClickButton8(View view) {
        String b8 = "8";
        etPhoune = etPhoune + b8;
        return etPhoune;
    }

    public String onClickButton9(View view)
    {
        String b9 = "9";
        etPhoune = etPhoune + b9;
        return etPhoune;
    }

    public String onClickButtonL(View view)
    {
        String bL = "*";
        etPhoune = etPhoune + bL;
        return etPhoune;
    }
    public String onClickButtonR(View view)
    {
        String bR = "#";
        etPhoune = etPhoune + bR;
        return etPhoune;
    }
    public String onClickButton0(View view) {
        String b0 = "0";
        etPhoune = etPhoune + b0;
        return etPhoune;

    }

}