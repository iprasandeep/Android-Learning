package com.example.daytwo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etFirstValue, etSecondValue;
    TextView tvAns;
    Button add,sub,mul,div;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_active);
        getSupportActionBar().hide();

        etFirstValue = findViewById(R.id.etFirstValue);
        etSecondValue = findViewById(R.id.etSecondValue);
        tvAns = findViewById(R.id.tvAns);
        add = findViewById(R.id.btAdd);
        sub = findViewById(R.id.btSub);
        mul = findViewById(R.id.btMul);
        div = findViewById(R.id.btDiv);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstvalue, secondvalue, ans;
                firstvalue = Integer.parseInt(etFirstValue.getText().toString());
                secondvalue = Integer.parseInt(etSecondValue.getText().toString());
                ans = firstvalue+secondvalue;
                tvAns.setText("Ans is = "+ans);
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstvalue, secondvalue, ans;
                firstvalue = Integer.parseInt(etFirstValue.getText().toString());
                secondvalue = Integer.parseInt(etSecondValue.getText().toString());
                ans = firstvalue-secondvalue;
                tvAns.setText("Ans is = "+ans);
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstvalue, secondvalue, ans;
                firstvalue = Integer.parseInt(etFirstValue.getText().toString());
                secondvalue = Integer.parseInt(etSecondValue.getText().toString());
                ans = firstvalue*secondvalue;
                tvAns.setText("Ans is = "+ans);
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstvalue, secondvalue, ans;
                firstvalue = Integer.parseInt(etFirstValue.getText().toString());
                secondvalue = Integer.parseInt(etSecondValue.getText().toString());
                ans = firstvalue/secondvalue;
                tvAns.setText("Ans is = "+ans);
            }
        });



    }
}