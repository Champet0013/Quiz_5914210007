package com.example.ist_mac_01.quiz_5914210007;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    Button but1;
    EditText edt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        edt = (EditText) findViewById(R.id.editText);
        but1 = (Button) findViewById(R.id.button);

        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(edt.getText().toString());

                Intent intent = new Intent (getApplicationContext(),MainActivity.class);
                intent.putExtra("result",n1);
                startActivity(intent);

                Toast.makeText(getApplicationContext(),n1,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
