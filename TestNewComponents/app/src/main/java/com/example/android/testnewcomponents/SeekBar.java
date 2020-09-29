package com.example.android.testnewcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SeekBar extends AppCompatActivity {
    private android.widget.SeekBar seekBar;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seek_bar);

        textView = findViewById(R.id.changableText);
        seekBar =  findViewById(R.id.greenSeekBar1);


        seekBar.setOnSeekBarChangeListener(new android.widget.SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(android.widget.SeekBar seekBar, int i, boolean b) {
                String rateService = "تقييم الخدمة: ";
                if(seekBar.getProgress()<=25){
                    textView.setText(rateService+"سيئة");
                }
                else if(seekBar.getProgress()<=50){
                    textView.setText(rateService+"جيدة");
                }
                else if(seekBar.getProgress()<=75){
                    textView.setText(rateService+"جيده جدا");
                }
                else{
                    textView.setText(rateService+"ممتازة");
                }
            }

            @Override
            public void onStartTrackingTouch(android.widget.SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(android.widget.SeekBar seekBar) {

            }
        });
    }
}