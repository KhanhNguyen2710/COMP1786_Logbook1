package com.example.look_book_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String currentText = "" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView resultView = findViewById(R.id.resultView);

// Number
        Button number1 = findViewById(R.id.number1);
        number1.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentText += "1";
                resultView.setText(currentText);
            }
        }));

        Button number2 = findViewById(R.id.number2);
        number2.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentText += "2";
                resultView.setText(currentText);
            }
        }));
        Button number3 = findViewById(R.id.number3);
        number3.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentText += "3";
                resultView.setText(currentText);
            }
        }));
        Button number4 = findViewById(R.id.number4);
        number4.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentText += "4";
                resultView.setText(currentText);
            }
        }));
        Button number5 = findViewById(R.id.number5);
        number5.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentText += "5";
                resultView.setText(currentText);
            }
        }));
        Button number6 = findViewById(R.id.number6);
        number6.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentText += "6";
                resultView.setText(currentText);
            }
        }));
        Button number7 = findViewById(R.id.number7);
        number7.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentText += "7";
                resultView.setText(currentText);
            }
        }));
        Button number8 = findViewById(R.id.number8);
        number8.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentText += "8";
                resultView.setText(currentText);
            }
        }));
        Button number9 = findViewById(R.id.number9);
        number9.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentText += "9";
                resultView.setText(currentText);
            }
        }));
        Button number0 = findViewById(R.id.number0);
        number0.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentText += "0";
                resultView.setText(currentText);
            }
        }));


// Calculator
        Button buttonPlus = findViewById(R.id.buttonPlus);
        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentText += "+";
                resultView.setText(currentText);
            }
        });
        Button buttonMinus = findViewById(R.id.buttonMinus);
        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentText += "-";
                resultView.setText(currentText);
            }
        });
        Button buttonMultiply = findViewById(R.id.buttonMultiply);
        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentText += "x";
                resultView.setText(currentText);
            }
        });
        Button buttonDivision = findViewById(R.id.buttonDivision);
        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentText += "/";
                resultView.setText(currentText);
            }
        });

// =
        Button buttonEqual = findViewById(R.id.buttonEqual);
        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String expression = currentText;
                double result = Calculator.calculate(expression);
                resultView.setText(String.valueOf(result));
            }
        });

// C
        Button buttonC = findViewById(R.id.buttonC);
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentText = "";
                resultView.setText(currentText);
            }
        });
    }
}