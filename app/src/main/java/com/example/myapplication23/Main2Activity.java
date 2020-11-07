package com.example.myapplication23;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    EditText bil1, bil2;
    TextView hasil;
    Button kali, bagi, tambah, kurang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        bil1 = (EditText) findViewById(R.id.editText);
        bil2 = (EditText) findViewById(R.id.editText2);
        kali = (Button) findViewById(R.id.bkali);
        bagi = (Button) findViewById(R.id.bbagi);
        tambah = (Button) findViewById(R.id.btambah);
        kurang = (Button) findViewById(R.id.bkurang);
        hasil = (TextView) findViewById(R.id.textViewh);

        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double a = Double.parseDouble(bil1.getText().toString());
                Double b = Double.parseDouble(bil2.getText().toString());
                Double result = a + b;
                hasil.setText(Double.toString(result));
            }
        });
        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double a = Double.parseDouble(bil1.getText().toString());
                Double b = Double.parseDouble(bil2.getText().toString());
                Double result = a - b;
                hasil.setText(Double.toString(result));
            }
        });
        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double a = Double.parseDouble(bil1.getText().toString());
                Double b = Double.parseDouble(bil2.getText().toString());
                Double result = a*b;
                hasil.setText(Double.toString(result));
            }
        });
        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double a = Double.parseDouble(bil1.getText().toString());
                Double b = Double.parseDouble(bil2.getText().toString());
                Double result = a/b;
                hasil.setText(Double.toString(result));
            }
        });


    }}