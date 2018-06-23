package com.example.filsaf.kalkulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText vTxtA, vTxtB, vTxtC;

    protected float yTxtA, yTxtB, yTxtC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vTxtA = findViewById(R.id.txtA);
        vTxtB = findViewById(R.id.txtB);
        vTxtC = findViewById(R.id.txtC);

        Button vbtnTambah = findViewById(R.id.btnTambah);
        Button vbtnKurang = findViewById(R.id.btnKurang);
        Button vbtnKali = findViewById(R.id.btnKali);
        Button vbtnBagi = findViewById(R.id.btnBagi);

        vbtnTambah.setOnClickListener(this);
        vbtnKurang.setOnClickListener(this);
        vbtnBagi.setOnClickListener(this);
        vbtnKali.setOnClickListener(this);

    }

    @Override
    public void onClick(View v){
        yTxtA= Float.parseFloat(vTxtA.getText().toString());
        yTxtB= Float.parseFloat(vTxtB.getText().toString());

        switch (v.getId()){
            case R.id.btnTambah:
                yTxtC = yTxtA + yTxtB;

                vTxtC.setText(Float.toString(yTxtC));
                break;

            case R.id.btnKurang:
                yTxtC = yTxtA - yTxtB;

                vTxtC.setText(Float.toString(yTxtC));
                break;

            case R.id.btnKali:
                yTxtC = yTxtA * yTxtB;

                vTxtC.setText(Float.toString(yTxtC));
                break;

            case R.id.btnBagi:
                yTxtC = yTxtA / yTxtB;

                vTxtC.setText(Float.toString(yTxtC));
                break;

        }
    }
}
