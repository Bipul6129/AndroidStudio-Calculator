package com.example.calculator.feaure;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;
import net.objecthunter.exp4j.ValidationResult;


import com.example.calculator.R;

import org.w3c.dom.Text;

public class GeneralCalculator extends AppCompatActivity {
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general_calculator);
        result = findViewById(R.id.Result);

        Button bt1 = findViewById(R.id.Btn1);
        Button bt2 = findViewById(R.id.Btn2);
        Button bt3 = findViewById(R.id.Btn3);
        Button bt4 = findViewById(R.id.Btn4);
        Button bt5 = findViewById(R.id.Btn5);
        Button bt6 = findViewById(R.id.Btn6);
        Button bt7 = findViewById(R.id.Btn7);
        Button bt8 = findViewById(R.id.Btn8);
        Button bt9 = findViewById(R.id.Btn9);
        Button btAdd = findViewById(R.id.AddBtn);
        Button btSub = findViewById(R.id.SubBtn);
        Button btMul = findViewById(R.id.MulBtn);
        Button btClear = findViewById(R.id.BtnClear);
        Button btResult = findViewById(R.id.ResultGO);



        View.OnClickListener NumButtonClickListner = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button button = (Button) view;
                String buttonText = button.getText().toString();
                String currentText = result.getText().toString();

                switch (view.getId()){
                    case R.id.Btn1:
                        result.setText(currentText+buttonText);
                        break;
                    case R.id.Btn2:
                        result.setText(currentText+buttonText);
                        break;
                    case R.id.Btn3:
                        result.setText(currentText+buttonText);
                        break;
                    case R.id.Btn4:
                        result.setText(currentText+buttonText);
                        break;
                    case R.id.Btn5:
                        result.setText(currentText+buttonText);
                        break;
                    case R.id.Btn6:
                        result.setText(currentText+buttonText);
                        break;
                    case R.id.Btn7:
                        result.setText(currentText+buttonText);
                        break;
                    case R.id.Btn8:
                        result.setText(currentText+buttonText);
                        break;
                    case R.id.Btn9:
                        result.setText(currentText+buttonText);
                        break;
                    case R.id.AddBtn:
                        result.setText(currentText+buttonText);
                        break;
                    case R.id.SubBtn:
                        result.setText(currentText+buttonText);
                        break;
                    case R.id.MulBtn:
                        result.setText(currentText+buttonText);
                        break;
                    case R.id.BtnClear:
                        result.setText("");
                        break;
                    case R.id.ResultGO:
                        ExpressionBuilder builder = new ExpressionBuilder(currentText);
                        ValidationResult validationResult = builder.build().validate();
                        if(!validationResult.isValid()){

                            result.setText("0");
                            break;
                        }
                        Expression exp = builder.build();
                        double resdou = exp.evaluate();

                        result.setText(Double.toString(resdou));
                        break;
                }

            }
        };

        bt1.setOnClickListener(NumButtonClickListner);
        bt2.setOnClickListener(NumButtonClickListner);
        bt3.setOnClickListener(NumButtonClickListner);
        bt4.setOnClickListener(NumButtonClickListner);
        bt5.setOnClickListener(NumButtonClickListner);
        bt6.setOnClickListener(NumButtonClickListner);
        bt7.setOnClickListener(NumButtonClickListner);
        bt8.setOnClickListener(NumButtonClickListner);
        bt9.setOnClickListener(NumButtonClickListner);
        btAdd.setOnClickListener(NumButtonClickListner);
        btSub.setOnClickListener(NumButtonClickListner);
        btResult.setOnClickListener(NumButtonClickListner);
        btClear.setOnClickListener(NumButtonClickListner);
        btMul.setOnClickListener(NumButtonClickListner);
    }
}