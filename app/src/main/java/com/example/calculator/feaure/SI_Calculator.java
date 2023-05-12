package com.example.calculator.feaure;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.calculator.R;

public class SI_Calculator extends AppCompatActivity {
    TextView resulttxt;
    Button SIBtn;
    EditText principal,time,rate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_si_calculator);
        resulttxt = findViewById(R.id.SIresult);
        SIBtn = findViewById(R.id.calSIbtn);
        principal = findViewById(R.id.princiamt);
        time = findViewById(R.id.SItime);
        rate = findViewById(R.id.SIrate);

        SIBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(principal.getText().toString().equals("")||time.getText().toString().equals("")||rate.getText().toString().equals("")){
                    resulttxt.setText("Error");
                }else{
                    double p = Double.parseDouble(principal.getText().toString());
                    double t = Double.parseDouble(time.getText().toString());
                    double r = Double.parseDouble(rate.getText().toString());
                    double si = (p*t*r)/100;

                    resulttxt.setText(Double.toString(si));
                }
            }
        });
    }
}