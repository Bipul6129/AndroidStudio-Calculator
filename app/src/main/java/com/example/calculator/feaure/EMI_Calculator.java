package com.example.calculator.feaure;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.calculator.R;

public class EMI_Calculator extends AppCompatActivity {
    TextView resulttext;
    Button solveBtn;
    EditText principalAmt,Interest,Tenure;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emi_calculator);
        resulttext = findViewById(R.id.EMIresult);
        solveBtn = findViewById(R.id.calEMIbtn);
        principalAmt = findViewById(R.id.loanamt);
        Interest = findViewById(R.id.interestrate);
        Tenure = findViewById(R.id.monthsTenure);

        principalAmt.setInputType(InputType.TYPE_CLASS_NUMBER);
        Interest.setInputType(InputType.TYPE_CLASS_NUMBER);
        Tenure.setInputType(InputType.TYPE_CLASS_NUMBER);

        solveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (principalAmt.getText().toString().equals("")||Interest.getText().toString().equals("")||Tenure.getText().toString().equals("")) {
                    resulttext.setText("Error");
                }else{
                    double p = Double.parseDouble(principalAmt.getText().toString());
                    double r = Double.parseDouble(Interest.getText().toString())/12/100;
                    double n = Double.parseDouble(Tenure.getText().toString())*12;
                    double emi;

                    emi = p*r*Math.pow(1+r,n)/(Math.pow(1+r,n)-1);
                    resulttext.setText(Double.toString(emi));
                }


            }
        });

    }
}