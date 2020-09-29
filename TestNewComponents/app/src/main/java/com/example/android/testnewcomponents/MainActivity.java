package com.example.android.testnewcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //ربط الأزرار في ال id
        Button switchOnOff = findViewById(R.id.switchButton);
        Button seekBar = findViewById(R.id.seekbarButton);
        Button checkBox = findViewById(R.id.checkboxButton);
        Button radioButtons = findViewById(R.id.radiobuttonsButton);
        Button FAB = findViewById(R.id.FAB);


        //go to swithcer activity
        switchOnOff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Switch.class);
                startActivity(intent);
            }
        });

        //go to seekbar activity
        seekBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SeekBar.class);
                startActivity(intent);
            }
        });

        //go to checkBox activity
        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,CheckBox.class);
                startActivity(intent);
            }
        });

        //go to radioButtons activity
        radioButtons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,RadioButtons.class);
                startActivity(intent);
            }
        });

        //go to FAB activity
        FAB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,FAB.class);
                startActivity(intent);
            }
        });

    }
}