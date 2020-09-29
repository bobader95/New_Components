package com.example.android.testnewcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class CheckBox extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);

        final android.widget.CheckBox potato = findViewById(R.id.potatoButton);
        final android.widget.CheckBox tomato = findViewById(R.id.tomatoButton);
        final android.widget.CheckBox taheena = findViewById(R.id.taheenaButton);
        final android.widget.CheckBox garlic = findViewById(R.id.garlicButton);
        final android.widget.CheckBox onion = findViewById(R.id.onionButton);
        Button orderNow = findViewById(R.id.orderNowButton);


        orderNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder stringBuilder = new StringBuilder();
                if(potato.isChecked()){
                    stringBuilder.append(potato.getText().toString());//بطاط
                }
                if(tomato.isChecked()){
                    stringBuilder.append("\n"+tomato.getText().toString());
                }
                if(garlic.isChecked()){
                    stringBuilder.append("\n"+garlic.getText().toString());
                }
                if(taheena.isChecked()){
                    stringBuilder.append("\n"+taheena.getText().toString());
                }
                if(onion.isChecked()){
                    stringBuilder.append("\n"+onion.getText().toString());
                }


                Toast.makeText(CheckBox.this,stringBuilder,Toast.LENGTH_SHORT).show();
            }
        });
    }
}