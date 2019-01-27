package com.example.calculatordemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView mExpressionTextView;
    private TextView mAnswerTextView;

    private String firstNumberString = "0";
    private String secondNumberString = "0";
    private int calculateIndex = 0;

    private ImageButton mImageButtonNumber0, mImageButtonNumber1, mImageButtonNumber2, mImageButtonNumber3,
                        mImageButtonNumber4, mImageButtonNumber5, mImageButtonNumber6, mImageButtonNumber7,
                        mImageButtonNumber8, mImageButtonNumber9;

    private ImageButton mImageButtonDot, mImageButtonEqual, mImageButtonClear, mImageButtonChangeSign,
                        mImageButtonPercent,mImageButtonPlus, mImageButtonMinus, mImageButtonTimes,
                        mImageButtonDivide;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mExpressionTextView = (TextView) findViewById(R.id.expressionTextView);
        mExpressionTextView.setText("0");
        mAnswerTextView = (TextView) findViewById(R.id.answerTextView);
        mAnswerTextView.setText("0");

        mImageButtonNumber0 = (ImageButton) findViewById(R.id.imageButtonNumber0);
        mImageButtonNumber1 = (ImageButton) findViewById(R.id.imageButtonNumber1);
        mImageButtonNumber2 = (ImageButton) findViewById(R.id.imageButtonNumber2);
        mImageButtonNumber3 = (ImageButton) findViewById(R.id.imageButtonNumber3);
        mImageButtonNumber4 = (ImageButton) findViewById(R.id.imageButtonNumber4);
        mImageButtonNumber5 = (ImageButton) findViewById(R.id.imageButtonNumber5);
        mImageButtonNumber6 = (ImageButton) findViewById(R.id.imageButtonNumber6);
        mImageButtonNumber7 = (ImageButton) findViewById(R.id.imageButtonNumber7);
        mImageButtonNumber8 = (ImageButton) findViewById(R.id.imageButtonNumber8);
        mImageButtonNumber9 = (ImageButton) findViewById(R.id.imageButtonNumber9);

        mImageButtonDot = (ImageButton) findViewById(R.id.imageButtonDot);
        mImageButtonEqual = (ImageButton) findViewById(R.id.imageButtonEqual);
        mImageButtonClear = (ImageButton) findViewById(R.id.imageButtonClear);
        mImageButtonChangeSign = (ImageButton) findViewById(R.id.imageButtonChangeSign);
        mImageButtonPercent = (ImageButton) findViewById(R.id.imageButtonPercent);
        mImageButtonPlus = (ImageButton) findViewById(R.id.imageButtonPlus);
        mImageButtonMinus = (ImageButton) findViewById(R.id.imageButtonMinus);
        mImageButtonTimes = (ImageButton) findViewById(R.id.imageButtonTimes);
        mImageButtonDivide = (ImageButton) findViewById(R.id.imageButtonDivide);


        mImageButtonNumber0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = "0";
                String beginNumber = "0";
                String expressionString = mExpressionTextView.getText().toString();
                if(beginNumber.equals(expressionString)) {
                    mExpressionTextView.setText("");
                    mExpressionTextView.setText(number);
                } else {
                    mExpressionTextView.setText(expressionString + number);
                }
            }
        });

        mImageButtonNumber1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = "1";
                String beginNumber = "0";
                String expressionString = mExpressionTextView.getText().toString();
                if(beginNumber.equals(expressionString)) {
                    mExpressionTextView.setText("");
                    mExpressionTextView.setText(number);
                } else {
                    mExpressionTextView.setText(expressionString + number);
                }
            }
        });

        mImageButtonNumber2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = "2";
                String beginNumber = "0";
                String expressionString = mExpressionTextView.getText().toString();
                if(beginNumber.equals(expressionString)) {
                    mExpressionTextView.setText("");
                    mExpressionTextView.setText(number);
                } else {
                    mExpressionTextView.setText(expressionString + number);
                }
            }
        });

        mImageButtonNumber3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = "3";
                String beginNumber = "0";
                String expressionString = mExpressionTextView.getText().toString();
                if(beginNumber.equals(expressionString)) {
                    mExpressionTextView.setText("");
                    mExpressionTextView.setText(number);
                } else {
                    mExpressionTextView.setText(expressionString + number);
                }
            }
        });

        mImageButtonNumber4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = "4";
                String beginNumber = "0";
                String expressionString = mExpressionTextView.getText().toString();
                if(beginNumber.equals(expressionString)) {
                    mExpressionTextView.setText("");
                    mExpressionTextView.setText(number);
                } else {
                    mExpressionTextView.setText(expressionString + number);
                }
            }
        });

        mImageButtonNumber5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = "5";
                String beginNumber = "0";
                String expressionString = mExpressionTextView.getText().toString();
                if(beginNumber.equals(expressionString)) {
                    mExpressionTextView.setText("");
                    mExpressionTextView.setText(number);
                } else {
                    mExpressionTextView.setText(expressionString + number);
                }
            }
        });

        mImageButtonNumber6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = "6";
                String beginNumber = "0";
                String expressionString = mExpressionTextView.getText().toString();
                if(beginNumber.equals(expressionString)) {
                    mExpressionTextView.setText("");
                    mExpressionTextView.setText(number);
                } else {
                    mExpressionTextView.setText(expressionString + number);
                }
            }
        });

        mImageButtonNumber7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = "7";
                String beginNumber = "0";
                String expressionString = mExpressionTextView.getText().toString();
                if(beginNumber.equals(expressionString)) {
                    mExpressionTextView.setText("");
                    mExpressionTextView.setText(number);
                } else {
                    mExpressionTextView.setText(expressionString + number);
                }
            }
        });

        mImageButtonNumber8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = "8";
                String beginNumber = "0";
                String expressionString = mExpressionTextView.getText().toString();
                if(beginNumber.equals(expressionString)) {
                    mExpressionTextView.setText("");
                    mExpressionTextView.setText(number);
                } else {
                    mExpressionTextView.setText(expressionString + number);
                }
            }
        });

        mImageButtonNumber9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = "9";
                String beginNumber = "0";
                String expressionString = mExpressionTextView.getText().toString();
                if(beginNumber.equals(expressionString)) {
                    mExpressionTextView.setText("");
                    mExpressionTextView.setText(number);
                } else {
                    mExpressionTextView.setText(expressionString + number);
                }
            }
        });

        mImageButtonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mExpressionTextView.setText("0");
                mAnswerTextView.setText("0");
            }
        });

        mImageButtonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                String operator = "+";
                String expressionString = mExpressionTextView.getText().toString();
//                mExpressionTextView.setText(expressionString + operator);

                Calculate(0, expressionString);

            }
        });

        mImageButtonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                String operator = "-";
                String expressionString = mExpressionTextView.getText().toString();
//                mExpressionTextView.setText(expressionString + operator);

                Calculate(1, expressionString);
            }
        });

        mImageButtonTimes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                String operator = "×";
                String expressionString = mExpressionTextView.getText().toString();
//                mExpressionTextView.setText(expressionString + operator);

                Calculate(2, expressionString);
            }
        });

        mImageButtonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                String operator = "÷";
                String expressionString = mExpressionTextView.getText().toString();
//                mExpressionTextView.setText(expressionString + operator);

                Calculate(3, expressionString);
            }
        });

        mImageButtonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String expressionString = mExpressionTextView.getText().toString();
                Calculate(4, expressionString);

            }
        });

    }

    private void Calculate(int calculateType, String  calculateNumber) {
        double result;
        String answer;


        switch (calculateType) {
            case 0:
                firstNumberString = calculateNumber;
                calculateIndex = 0;
                mExpressionTextView.setText("");
                break;
            case 1:
                firstNumberString = calculateNumber;
                calculateIndex = 1;
                mExpressionTextView.setText("");
                break;
            case 2:
                firstNumberString = calculateNumber;
                calculateIndex = 2;
                mExpressionTextView.setText("");
                break;
            case 3:
                firstNumberString = calculateNumber;
                calculateIndex = 3;
                mExpressionTextView.setText("");
                break;
            case 4:
                secondNumberString = mExpressionTextView.getText().toString();
                double firstNumber = Double.valueOf(firstNumberString);
                double secondNumber = Double.valueOf(secondNumberString);

                switch (calculateIndex) {
                    case 0:
                        result = firstNumber + secondNumber;
                        answer = Double.toString(result);
                        mAnswerTextView.setText(answer);
                        break;
                    case 1:
                        result = firstNumber - secondNumber;
                        answer = Double.toString(result);
                        mAnswerTextView.setText(answer);
                        break;
                    case 2:
                        result = firstNumber * secondNumber;
                        answer = Double.toString(result);
                        mAnswerTextView.setText(answer);
                        break;
                    case 3:
                        if(secondNumber == 0) {
                            Toast.makeText(this, "Can't be divided by 0",Toast.LENGTH_SHORT).show();
                            break;
                        }
                        result = firstNumber / secondNumber;
                        answer = Double.toString(result);
                        mAnswerTextView.setText(answer);
                        break;
                }
                break;
        }


    }



}
