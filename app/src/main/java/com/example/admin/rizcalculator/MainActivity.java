package com.example.admin.rizcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


    public class MainActivity extends AppCompatActivity {

        Button button0, button1, button2, button3, button4, button5, button6,
                button7, button8, button9, buttonAdd, buttonSub, buttonDivision,
                buttonMul, button10, buttonC, buttonEqual;
        EditText rizEditText;

        float mValueOne, mValueTwo;

        boolean rizAddition, mSubtract, rizMuliplication, rizDivision;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            button0 =  findViewById(R.id.button0);
            button1 =  findViewById(R.id.button1);
            button2 =  findViewById(R.id.button2);
            button3 =  findViewById(R.id.button3);
            button4 =  findViewById(R.id.button4);
            button5 =  findViewById(R.id.button5);
            button6 =  findViewById(R.id.button6);
            button7 =  findViewById(R.id.button7);
            button8 =  findViewById(R.id.button8);
            button9 =  findViewById(R.id.button9);
            button10 =  findViewById(R.id.button10);
            buttonAdd =  findViewById(R.id.buttonadd);
            buttonSub =  findViewById(R.id.buttonsub);
            buttonMul =  findViewById(R.id.buttonmul);
            buttonDivision =  findViewById(R.id.buttondiv);
            buttonC =  findViewById(R.id.buttonC);
            buttonEqual =  findViewById(R.id.buttoneql);
            rizEditText =  findViewById(R.id.edt1);


            button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    rizEditText.setText(rizEditText.getText() + "1");
                }
            });

            button2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    rizEditText.setText(rizEditText.getText() + "2");
                }
            });

            button3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    rizEditText.setText(rizEditText.getText() + "3");
                }
            });

            button4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    rizEditText.setText(rizEditText.getText() + "4");
                }
            });

            button5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    rizEditText.setText(rizEditText.getText() + "5");
                }
            });

            button6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    rizEditText.setText(rizEditText.getText() + "6");
                }
            });

            button7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    rizEditText.setText(rizEditText.getText() + "7");
                }
            });

            button8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    rizEditText.setText(rizEditText.getText() + "8");
                }
            });

            button9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    rizEditText.setText(rizEditText.getText() + "9");
                }
            });

            button0.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    rizEditText.setText(rizEditText.getText() + "0");
                }
            });

            buttonAdd.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (rizEditText == null) {
                        rizEditText.setText("");
                    } else {
                        mValueOne = Float.parseFloat(rizEditText.getText() + "");
                        rizAddition = true;
                        rizEditText.setText(null);
                    }
                }
            });

            buttonSub.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mValueOne = Float.parseFloat(rizEditText.getText() + "");
                    mSubtract = true;
                    rizEditText.setText(null);
                }
            });

            buttonMul.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mValueOne = Float.parseFloat(rizEditText.getText() + "");
                    rizMuliplication = true;
                    rizEditText.setText(null);
                }
            });

            buttonDivision.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mValueOne = Float.parseFloat(rizEditText.getText() + "");
                    rizDivision = true;
                    rizEditText.setText(null);
                }
            });

            buttonEqual.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mValueTwo = Float.parseFloat(rizEditText.getText() + "");

                    if (rizAddition == true) {
                        rizEditText.setText(mValueOne + mValueTwo + "");
                        rizAddition = false;
                    }

                    if (mSubtract == true) {
                        rizEditText.setText(mValueOne - mValueTwo + "");
                        mSubtract = false;
                    }

                    if (rizMuliplication == true) {
                        rizEditText.setText(mValueOne * mValueTwo + "");
                        rizMuliplication = false;
                    }

                    if (rizDivision == true) {
                        rizEditText.setText(mValueOne / mValueTwo + "");
                        rizDivision = false;
                    }
                }
            });

            buttonC.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    rizEditText.setText("");
                }
            });

            button10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    rizEditText.setText(rizEditText.getText() + ".");
                }
            });
        }
    }




