package com.example.m8uf1t10helenamadrenys;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class ConfigurationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuration);

        Button button1, button2, buttonSmall, buttonLarge, buttonChange;
        TextView txtColor, txtSize, txtUser;
        EditText editText;
        final ConstraintLayout constraintLayout;

        button1 = findViewById(R.id.btVar1);
        button2 = findViewById(R.id.btVar2);
        buttonSmall = findViewById(R.id.btnSmall);
        buttonLarge = findViewById(R.id.btnLarge);
        buttonChange = findViewById(R.id.btnChange);
        txtColor = findViewById(R.id.tvVar1);
        txtSize = findViewById(R.id.textSize);
        txtUser = findViewById(R.id.txtUser);
        editText = findViewById(R.id.editText);
        constraintLayout = findViewById(R.id.rlVar1);

        //Canvi de color del fons
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // set the color to relative layout
                constraintLayout.setBackgroundResource(R.color.white);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // set the color to relative layout
                constraintLayout.setBackgroundResource(R.color.grey);
            }
        });

        //Canvi de mida de text
        buttonSmall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button1.setTextSize(10);
                button2.setTextSize(10);
                buttonSmall.setTextSize(10);
                buttonLarge.setTextSize(10);
                buttonChange.setTextSize(10);
                txtColor.setTextSize(15);
                txtSize.setTextSize(15);
                editText.setTextSize(10);
            }
        });
        buttonLarge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button1.setTextSize(25);
                button2.setTextSize(25);
                buttonSmall.setTextSize(25);
                buttonLarge.setTextSize(25);
                buttonChange.setTextSize(20);
                txtColor.setTextSize(30);
                txtSize.setTextSize(30);
                editText.setTextSize(20);
            }
        });

        //Canvi de nom d'usuari
        buttonChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Passar el nom d'usuari a l'altre activity
            }
        });
    }
}