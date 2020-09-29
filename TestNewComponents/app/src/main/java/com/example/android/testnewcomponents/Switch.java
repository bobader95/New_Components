package com.example.android.testnewcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Switch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch);

        final TextView choose = findViewById(R.id.this_or_that);
        final android.widget.Switch swithcer = findViewById(R.id.switchOnOff);

        swithcer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(swithcer.isChecked()){
                    choose.setText("صمونه");

                }else {
                    choose.setText("وجبه");

                }
            }
        });

    }
}