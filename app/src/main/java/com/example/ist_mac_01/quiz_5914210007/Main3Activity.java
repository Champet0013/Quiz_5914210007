package com.example.ist_mac_01.quiz_5914210007;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.RelativeLayout;

public class Main3Activity extends AppCompatActivity {
    Button btn;
    NumberPicker np1,np2,np3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        np1 = (NumberPicker)findViewById(R.id.numberPicker1);
        np2 = (NumberPicker)findViewById(R.id.numberPicker2);
        np3 = (NumberPicker)findViewById(R.id.numberPicker3);

        final String[] data = {"0","1","2","3","4","5","6","7","8","9"};

        np1.setMinValue(0);
        np1.setMaxValue(data.length-1);
        np1.setDisplayedValues(data);

        np2.setMinValue(0);
        np2.setMaxValue(data.length-1);
        np2.setDisplayedValues(data);

        np3.setMinValue(0);
        np3.setMaxValue(data.length-1);
        np3.setDisplayedValues(data);





    }
}
