package com.example.family.clicker;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnCount;
    Button btnReset;
    Button btnClear;

    TextView textViewCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCount = (Button)findViewById(R.id.btnCount);
        btnReset = (Button)findViewById(R.id.btnReset);
        btnClear = (Button)findViewById(R.id.btnClear);

        textViewCount = (TextView)findViewById(R.id.textViewCount);

        btnCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String countValue = textViewCount.getText().toString();
                int intCountValue = Integer.parseInt(countValue);
                intCountValue++;
                textViewCount.setText(String.valueOf(intCountValue));
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            textViewCount.setText(String.valueOf(0));

            }
        });
    }



}
