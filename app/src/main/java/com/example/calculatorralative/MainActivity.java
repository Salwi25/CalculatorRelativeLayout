package com.example.calculatorralative;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public EditText e1, e2;
    TextView t2;
    int num1, num2;

    public boolean getNumbers() {

        //checkAndClear();
        // defining the edit text 1 to e1
        e1 = (EditText) findViewById(R.id.num1);

        // defining the edit text 2 to e2
        e2 = (EditText) findViewById(R.id.num2);

        // defining the text view to t1
        t2 = (TextView) findViewById(R.id.result2);

        // taking input from text box 1
        String s1 = e1.getText().toString();

        // taking input from text box 2
        String s2 = e2.getText().toString();

        if(s1.equals("Masukkan angka pertama") && s2.equals(null))
        {
            String result = "Masukkan angka kedua";
            e2.setText(result);
            return false;
        }
        if(s1.equals(null) && s2.equals("Masukkan angka kedua"))
        {
            String result = "Masukkan angka pertama";
            e1.setText(result);
            return false;
        }
        if(s1.equals("Masukkan angka pertama") || s2.equals("Masukkan angka kedua"))
        {
            return false;
        }

        if((!s1.equals(null) && s2.equals(null))|| (!s1.equals("") && s2.equals("")) ){

            String result = "Masukkan angka kedua";

            e2.setText(result);
            return false;
        }
        if((s1.equals(null) && !s2.equals(null))|| (s1.equals("") && !s2.equals("")) ){
            //checkAndClear();
            String result = "Masukkan angka pertama";
            e1.setText(result);
            return false;
        }
        if((s1.equals(null) && s2.equals(null))|| (s1.equals("") && s2.equals("")) ){
            //checkAndClear();
            String result1 = "Masukkan angka pertama";
            e1.setText(result1);
            String result2 = "Masukkan angka kedua";
            e2.setText(result2);
            return false;
        }

        else {
            // converting string to int.
            num1 = Integer.parseInt(s1);

            // converting string to int.
            num2 = Integer.parseInt(s2);


        }

        return true;
    }

    public void doSum(View v) {

        // get the input numbers
        if (getNumbers()) {
            int sum = num1 + num2;
            t2.setText(Integer.toString(sum));
        }
        else
        {
            t2.setText("Silahkan coba lagi masukkan angka dengan benar");
        }

    }
    public void clearTextNum1(View v) {

        // get the input numbers
        e1.getText().clear();
    }
    public void clearTextNum2(View v) {

        // get the input numbers
        e2.getText().clear();
    }

    // a public method to perform subtraction
    public void doSub(View v) {
        //checkAndClear();
        // get the input numbers
        if (getNumbers()) {
            int sum = num1 - num2;
            t2.setText(Integer.toString(sum));
        }
        else
        {
            t2.setText("Silahkan coba lagi masukkan angka dengan benar");
        }
    }

    // a public method to perform multiplication
    public void doMul(View v) {
        //checkAndClear();
        // get the input numbers
        if (getNumbers()) {
            int sum = num1 * num2;
            t2.setText(Integer.toString(sum));
        }
        else
        {
            t2.setText("Silahkan coba lagi masukkan angka dengan benar");
        }
    }

    // a public method to perform Division
    public void doDiv(View v) {
        //checkAndClear();
        // get the input numbers
        if (getNumbers()) {

            // displaying the text in text view assigned as t1
            double sum = num1 / (num2 * 1.0);
            t2.setText(Double.toString(sum));
        }
        else
        {
            t2.setText("Silahkan coba lagi masukkan angka dengan benar");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}