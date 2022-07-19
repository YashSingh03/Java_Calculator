package com.example.calctrial;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Button buttonac, buttonbrackets, buttonmodulo, buttondivide, button7, button8, button9, buttonmultiply, button4, button5, button6,buttonsubtract, button1, button2, button3, buttonaddition, button0, buttondot, buttonc, buttonequal;
    EditText calctrialedittext;

    float mValueOne, mValueTwo;
    boolean Addition, Subtract, Multiply, Divide, Modulo;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button0 = (Button) findViewById(R.id.button0);
        buttonaddition = (Button) findViewById(R.id.buttonaddition);
        buttonsubtract = (Button) findViewById(R.id.buttonsubtract);
        buttonmultiply = (Button) findViewById(R.id.buttonmultiply);
        buttondivide = (Button) findViewById(R.id.buttondivide);
        buttonc = (Button) findViewById(R.id.buttonc);
        buttonequal = (Button) findViewById(R.id.buttonequal);
        calctrialedittext = (EditText) findViewById(R.id.calctrialedittext);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calctrialedittext.setText(calctrialedittext.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calctrialedittext.setText(calctrialedittext.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calctrialedittext.setText(calctrialedittext.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calctrialedittext.setText(calctrialedittext.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calctrialedittext.setText(calctrialedittext.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calctrialedittext.setText(calctrialedittext.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calctrialedittext.setText(calctrialedittext.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calctrialedittext.setText(calctrialedittext.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calctrialedittext.setText(calctrialedittext.getText() + "9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calctrialedittext.setText(calctrialedittext.getText() + "0");
            }
        });
        buttonaddition.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (calctrialedittext == null){
                    calctrialedittext.setText("");
                }else{
                    mValueOne = Float.parseFloat(calctrialedittext.getText() + "");
                    Addition = true;
                    calctrialedittext.setText(null);
                }
            }
        });

        buttonsubtract.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mValueOne = Float.parseFloat(calctrialedittext.getText() + "");
                Subtract = true;
                calctrialedittext.setText(null);
            }
        });

        buttonmultiply.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mValueOne = Float.parseFloat(calctrialedittext.getText() + "");
                Multiply = true;
                calctrialedittext.setText(null);
            }
        });

        buttondivide.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mValueOne = Float.parseFloat(calctrialedittext.getText() + "");
                Divide = true;
                calctrialedittext.setText(null);

            }
        });

        buttonmodulo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mValueOne = Float.parseFloat(calctrialedittext.getText() + "");
                Modulo = true;
                calctrialedittext.setText(null);

            }
        });
        buttonequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(calctrialedittext.getText() + "");

                if (Addition == true) {
                    calctrialedittext.setText(mValueOne + mValueTwo + "");
                    Addition = false;
                }

                if (Subtract == true) {
                    calctrialedittext.setText(mValueOne - mValueTwo + "");
                    Subtract = false;
                }

                if (Multiply == true) {
                    calctrialedittext.setText(mValueOne * mValueTwo + "");
                    Multiply = false;
                }

                if (Divide == true) {
                    calctrialedittext.setText(mValueOne / mValueTwo + "");
                    Divide = false;
                }
                if (Modulo == true) {
                    calctrialedittext.setText(mValueOne % mValueTwo + "");
                }
            }
        });
        buttonc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calctrialedittext.setText("");
            }
        });

        buttonac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calctrialedittext.setText(calctrialedittext.getText() + ".");
            }
        });
    }
}

