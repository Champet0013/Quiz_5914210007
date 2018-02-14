package com.example.ist_mac_01.quiz_5914210007;

import android.content.Intent;
import android.view.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button bt1,bt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt1 = (Button) findViewById(R.id.button1);
        bt2 = (Button) findViewById(R.id.button2);

        bt1.setOnClickListener (new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent intent = new Intent (getApplicationContext(),Main3Activity.class);
                startActivity(intent);

            }

        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (getApplicationContext(),Main2Activity.class);
                startActivity(intent);
            }
        });
    }
}
