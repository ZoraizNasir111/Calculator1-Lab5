
package com.example.calculator1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

/** MainActivity java class for the calculator creates the app and has all necessary function in one file
 * @author Group2
 * @version 1.0(11/19/2021)
 */
public class MainActivity extends AppCompatActivity {
    Button bu1, bu2, bu3, bu4, bu5, bu6, bu7, bu8, bu9, bu0, budot, divideBTN, plusBTN, minusBTN,
    multiplyBTN, buequal, buclear;

    TextView display;
    double val1, val2;
    double valFinal;


    enum Operator{none, add, minus, multiply, divide}
    Operator op = Operator.none;
    boolean isNewOp;

    /** this method onCreate starts up our ui and displays all the relevant components
     *
     * @param savedInstanceState savedInstanceState is of type Bundle
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display=findViewById(R.id.editText);
        bu0 = findViewById(R.id.bu0);
        bu1 = findViewById(R.id.bu1);
        bu2 = findViewById(R.id.bu2);
        bu3 = findViewById(R.id.bu3);
        bu4 = findViewById(R.id.bu4);
        bu5 = findViewById(R.id.bu5);
        bu6 = findViewById(R.id.bu6);
        bu7 = findViewById(R.id.bu7);
        bu8 = findViewById(R.id.bu8);
        bu9 = findViewById(R.id.bu9);
        budot = findViewById(R.id.budot);

        divideBTN = findViewById(R.id.divideBTN);
        plusBTN = findViewById(R.id.plusBTN);
        minusBTN = findViewById(R.id.minusBTN);
        multiplyBTN = findViewById(R.id.multiplyBTN);

        buequal = findViewById(R.id.buequal);
        buclear = findViewById(R.id.buclear);

        bu0.setOnClickListener(new View.OnClickListener(){
            /** This method sets our display text and displays the number which button was pressed. here it sets it to 0
             *
             * @param v takes in v of type View
             */

            public void onClick(View v){
                display.setText(display.getText() + "0");
            }
        });
        bu1.setOnClickListener(new View.OnClickListener(){
            /** This method sets our display text and displays the number which button was pressed. here it sets it to 1
             *
             * @param v takes in v of type View
             */
            public void onClick(View v){
                display.setText(display.getText() + "1");
            }
        });
        bu2.setOnClickListener(new View.OnClickListener(){
            /** This method sets our display text and displays the number which button was pressed. here it sets it to 2
             *
             * @param v takes in v of type View
             */
            public void onClick(View v){
                display.setText(display.getText() + "2");
            }
        });
        bu3.setOnClickListener(new View.OnClickListener(){
            /** This method sets our display text and displays the number which button was pressed. here it sets it to 2
             *
             * @param v takes in v of type View
             */
            public void onClick(View v){
                display.setText(display.getText() + "3");
            }
        });
        bu4.setOnClickListener(new View.OnClickListener(){
            /** This method sets our display text and displays the number which button was pressed. here it sets it to 3
             *
             * @param v takes in v of type View
             */
            public void onClick(View v){
                display.setText(display.getText() + "4");
            }
        });
        bu5.setOnClickListener(new View.OnClickListener(){
            /** This method sets our display text and displays the number which button was pressed. here it sets it to 4
             *
             * @param v takes in v of type View
             */
            public void onClick(View v){
                /** This method sets our display text and displays the number which button was pressed. here it sets it to 5
                 *
                 * @param v takes in v of type View
                 */
                display.setText(display.getText() + "5");
            }
        });
        bu6.setOnClickListener(new View.OnClickListener(){
            /** This method sets our display text and displays the number which button was pressed. here it sets it to 6
             *
             * @param v takes in v of type View
             */
            public void onClick(View v){
                display.setText(display.getText() + "6");
            }
        });
        bu7.setOnClickListener(new View.OnClickListener(){
            /** This method sets our display text and displays the number which button was pressed. here it sets it to 7
             *
             * @param v takes in v of type View
             */
            public void onClick(View v){
                display.setText(display.getText() + "7");
            }
        });
        bu8.setOnClickListener(new View.OnClickListener(){
            /** This method sets our display text and displays the number which button was pressed. here it sets it to 2
             *
             * @param v takes in v of type View
             */
            public void onClick(View v){
                display.setText(display.getText() + "8");
            }
        });
        bu9.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                display.setText(display.getText() + "9");
            }
        });
        budot.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if (!display.getText().toString().contains(".") && !display.getText().toString().isEmpty() && !display.getText().toString().equals("-"))
                    display.setText(display.getText() + ".");
            }
        });
        buclear.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                val1 = 0;
                val2 = 0;
                display.setText("");
                op = Operator.none;
            }
        });
        divideBTN.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                op = Operator.divide;
                if (!display.getText().toString().isEmpty() && !display.getText().toString().equals("-")){
                    val1 = Double.parseDouble(display.getText().toString());
                    isNewOp = true;
                }
                display.setText("");
            }
        });
        multiplyBTN.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                op = Operator.multiply;
                if (!display.getText().toString().isEmpty() && !display.getText().toString().equals("-")){
                    val1 = Double.parseDouble(display.getText().toString());
                    isNewOp = true;
                }
                display.setText("");
            }
        });
        plusBTN.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                op = Operator.add;
                if (!display.getText().toString().isEmpty() && !display.getText().toString().equals("-")){
                    val1 = Double.parseDouble(display.getText().toString());
                    isNewOp = true;
            }
                display.setText("");
            }
        });
        minusBTN.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                if (display.getText().toString().isEmpty()) //if the user wants to enter a negative number
                    display.setText("-");
                else if (!display.getText().toString().equals("-")) {
                    op = Operator.minus;
                    val1 = Double.parseDouble(display.getText().toString());
                    isNewOp = true;
                    display.setText("");
                }
            }
        });
        buequal.setOnClickListener(new View.OnClickListener(){
            /** This method comes into play when the equal button in pressed it. it checkes the two numbers entered and the which operation button was pressed and displays the answer. on the EditTextView
             *
             * @param v take in v of type View ,
             */
            public void onClick(View v){

                if (!display.getText().toString().isEmpty() && !display.getText().toString().equals("-")) {
                    if (isNewOp)
                        val2 = Double.parseDouble(display.getText().toString());
                    else
                        val1 = Double.parseDouble(display.getText().toString());

                    switch(op) {
                        case none:
                            valFinal = val1;
                            break;
                        case minus:
                            valFinal = sub(val1 , val2);
                            break;
                        case add:
                            valFinal = add(val1 , val2);
                            break;
                        case multiply:
                            valFinal = mul(val1 ,val2);
                            break;
                        case divide:
                            valFinal = div(val1 , val2);
                            break;
                    }
                    if (valFinal % 1 == 0)
                        display.setText(Integer.toString((int) valFinal));
                    else
                        display.setText(Double.toString(valFinal));
                    valFinal = 0;
                    val1 = Double.parseDouble(display.getText().toString());
                    isNewOp = false;
                }

            }
        });
        };

    /** This method add takes in two parameter and returns their sum
     *
     * @param number1 - number1 parameter of type double
     * @param number2 - number2 parameter of type double
     * @return returns the sum of the two numbers
     */
    public static double add(double number1, double number2){
        return number1 + number2;
    }

    /** This method add takes in two parameter and returns their subtraction
     *
     * @param number1 - number1 parameter of type double
     * @param number2 - number2 parameter of type double
     * @return returns the subtraction of the two numbers
     */
    public static double sub(double number1, double number2){
        return number1 - number2;
    }

    /** This method add takes in two parameter and returns their multiplication
     *
     * @param number1 - number1 parameter of type double
     * @param number2 - number2 parameter of type double
     * @return returns the sum of the two numbers
     */
    public static double mul(double number1, double number2){
        return number1 * number2;
    }
    /** This method add takes in two parameter and returns their division
     *
     * @param number1 - number1 parameter of type double
     * @param number2 - number2 parameter of type double
     * @return returns the division of the two numbers
     */
    public static double div(double number1, double number2){
        return number1 / number2;
    }


}


