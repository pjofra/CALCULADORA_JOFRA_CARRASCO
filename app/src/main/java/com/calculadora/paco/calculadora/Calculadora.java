package com.calculadora.paco.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;

public class Calculadora extends AppCompatActivity {

    Button btn_zero, btn_one, btn_two, btn_three, btn_four, btn_five, btn_six, btn_seven, btn_eight,btn_nine,
            btn_decimal, btn_equals, btn_add, btn_substract, btn_multiply, btn_divide, btn_clear;
    EditText showingvalues, values;
    double value1, value2, result;
    String action;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        btn_zero = (Button)findViewById(R.id.btn_zero);
        btn_one = (Button)findViewById(R.id.btn_one);
        btn_two = (Button)findViewById(R.id.btn_two);
        btn_three = (Button)findViewById(R.id.btn_three);
        btn_four = (Button)findViewById(R.id.btn_four);
        btn_five = (Button)findViewById(R.id.btn_five);
        btn_six = (Button)findViewById(R.id.btn_six);
        btn_seven = (Button)findViewById(R.id.btn_seven);
        btn_eight = (Button)findViewById(R.id.btn_eight);
        btn_nine = (Button)findViewById(R.id.btn_nine);
        btn_clear = (Button)findViewById(R.id.btn_clear);
        btn_decimal = (Button)findViewById(R.id.btn_decimal);
        btn_equals = (Button)findViewById(R.id.btn_equals);
        btn_add = (Button)findViewById(R.id.btn_add);
        btn_substract = (Button)findViewById(R.id.btn_substract);
        btn_multiply = (Button)findViewById(R.id.btn_multiply);
        btn_divide = (Button)findViewById(R.id.btn_divide);
        showingvalues = (EditText)findViewById(R.id.showingvalues);


        btn_zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                values = (EditText)findViewById(R.id.showingvalues);
                showingvalues.setText(values.getText().toString() + "0");
            }
        });
        btn_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                values = (EditText)findViewById(R.id.showingvalues);
                showingvalues.setText(values.getText().toString() + "1");
            }
        });
        btn_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                values = (EditText)findViewById(R.id.showingvalues);
                showingvalues.setText(values.getText().toString() + "2");
            }
        });
        btn_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                values = (EditText)findViewById(R.id.showingvalues);
                showingvalues.setText(values.getText().toString() + "3");
            }
        });
        btn_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                values = (EditText)findViewById(R.id.showingvalues);
                showingvalues.setText(values.getText().toString() + "4");
            }
        });
        btn_five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                values = (EditText)findViewById(R.id.showingvalues);
                showingvalues.setText(values.getText().toString() + "5");
            }
        });
        btn_six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                values = (EditText)findViewById(R.id.showingvalues);
                showingvalues.setText(values.getText().toString() + "6");
            }
        });
        btn_seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                values = (EditText)findViewById(R.id.showingvalues);
                showingvalues.setText(values.getText().toString() + "7");
            }
        });
        btn_eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                values = (EditText)findViewById(R.id.showingvalues);
                showingvalues.setText(values.getText().toString() + "8");
            }
        });
        btn_nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                values = (EditText)findViewById(R.id.showingvalues);
                showingvalues.setText(values.getText().toString() + "9");
            }
        });
        btn_decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                values = (EditText)findViewById(R.id.showingvalues);
                showingvalues.setText(values.getText().toString() + ".");
            }
        });
        btn_equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                values = (EditText)findViewById(R.id.showingvalues);
                value2 = Double.parseDouble (values.getText().toString());
                if (action.equals ("+")){
                    showingvalues.setText("");
                    result = value1 + value2;
                }
                if (action.equals ("-")){
                    showingvalues.setText("");
                    result = value1 - value2;
                }
                if (action.equals ("*")){
                    showingvalues.setText("");
                    result = value1 * value2;
                }
                if (action.equals ("/")){
                    showingvalues.setText("");
                    if(value2 !=0){
                    result = value1 / value2;}
                    else{
                        showingvalues.setText("Infinity");}
                }
                showingvalues.setText(String.valueOf(result));
            }
        });

        //
        // Nose perque pero l'infinity no funciona

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                action ="+";
                values = (EditText)findViewById(R.id.showingvalues);
                value1 = Double.parseDouble(values.getText().toString());
                showingvalues.setText ("");
            }
        });
        btn_substract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                action ="-";
                values = (EditText)findViewById(R.id.showingvalues);
                value1 = Double.parseDouble(values.getText().toString());
                showingvalues.setText ("");
            }
        });
        btn_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                action ="*";
                values = (EditText)findViewById(R.id.showingvalues);
                value1 = Double.parseDouble(values.getText().toString());
                showingvalues.setText ("");
            }
        });
        btn_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                action ="/";
                values = (EditText)findViewById(R.id.showingvalues);
                value1 = Double.parseDouble(values.getText().toString());
                showingvalues.setText ("");
            }
        });
        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1 = 0;
                value2 = 0;
                showingvalues.setText ("");
            }
        });
    }
}
