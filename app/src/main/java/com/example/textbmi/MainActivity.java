package com.example.textbmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText height;
    private EditText weight;
    private TextView showbmi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        height = findViewById(R.id.edHeight);
        weight = findViewById(R.id.edWeight);
        showbmi = findViewById(R.id.tvShowBMI);
    }

    public void calBMI(View view) {
        if(height.getText().toString().isEmpty()||weight.getText().toString().isEmpty()){
            showbmi.setText("請完整輸入身高體重的數值");
        }else {
            double h = Double.parseDouble(height.getText().toString());
            double w = Double.parseDouble(weight.getText().toString());
            double bmi = w /((h/100.0)*(h/100.0));
            showbmi.setText(String.valueOf(bmi));

        }


    }
}