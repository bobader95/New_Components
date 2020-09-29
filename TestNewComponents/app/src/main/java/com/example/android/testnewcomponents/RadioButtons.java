package com.example.android.testnewcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RadioButtons extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_buttons);

        final RadioGroup chooseYourBread = findViewById(R.id.multipleBread);
        final RadioButton saj = findViewById(R.id.saj);
        final RadioButton sandwich = findViewById(R.id.sandwich);
        final RadioButton bread = findViewById(R.id.bread);
        Button orderNow = findViewById(R.id.orderNowButtonForRadioButton);

        orderNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int checkedBread = chooseYourBread.getCheckedRadioButtonId();
                if(checkedBread == R.id.saj){
                    Toast.makeText(getApplicationContext(),saj.getText(),Toast.LENGTH_LONG).show();
                }else if(checkedBread == R.id.sandwich){
                    Toast.makeText(getApplicationContext(),sandwich.getText(),Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(getApplicationContext(),bread.getText(),Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}