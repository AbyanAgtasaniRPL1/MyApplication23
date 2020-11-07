package com.example.myapplication23;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText txtusername;
    EditText txtpassword;
    Button btnlogin;

    SharedPreferences pref;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pref = getSharedPreferences("login", MODE_PRIVATE);
        txtusername=findViewById(R.id.edittext1);
        txtpassword=findViewById(R.id.edittext2);

        btnlogin=findViewById(R.id.btnlogin2);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtusername.getText().toString().isEmpty() || txtpassword.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "MOHON DIISI ", Toast.LENGTH_SHORT).show();

                }else {
                   if (txtusername.getText().toString().equalsIgnoreCase("ABYAN") &&
                        txtpassword.getText().toString().equalsIgnoreCase("ABYAN")){
                    Toast.makeText(MainActivity.this, "Login sukses", Toast.LENGTH_SHORT).show();

                    editor = pref.edit();

                    editor.putString("userid", txtusername.getText().toString());
                    editor.apply();

                    Intent in=new Intent(MainActivity.this, Main2Activity.class);
                    //bisa melempar nilai
                    in.putExtra("username", txtusername.getText().toString());
                    startActivity(in);
                    finish();
        }else{
            Toast.makeText(MainActivity.this,"Login Gagal",Toast.LENGTH_SHORT).show();
        }
    }
    }

        });}}
