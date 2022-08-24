package com.example.netflixapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Calculator extends AppCompatActivity {

    EditText editTextMyInputs;
    TextView textViewMyResults;
    Button button0;
    Button button1;
    Button additionButton;
    Button button2;
    Button button3;
    Button button4;
    Button subtractionButton;
    Button button5;
    Button button6;
    Button button7;
    Button multiplicationButton;
    Button button8;
    Button button9;
    Button divisionButton;
    Button clearButton;
    Button equalToButton;

    Boolean addBtn= false;
    Boolean subtractBtn= false;
    Boolean multiplyBtn= false;
    Boolean divisionBtn= false;

    int firstValue=0;
    int secondValue=0;
    String totalSumSoFar = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);


        initViews();
        initListeners();

    }

    public void initViews() {

        editTextMyInputs = findViewById(R.id.editTextMyInputs);
        textViewMyResults = findViewById(R.id.textViewResult);
        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        additionButton = findViewById(R.id.additionBtn);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        subtractionButton = findViewById(R.id.subtractionBtn);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        multiplicationButton = findViewById(R.id.multiplicationBtn);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        divisionButton = findViewById(R.id.divisionBtn);
        clearButton = findViewById(R.id.clearBtn);
        equalToButton = findViewById(R.id.equalToBtn);
    }

    public void initListeners() {


        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextMyInputs.setText(editTextMyInputs.getText() + "0");
                totalSumSoFar = totalSumSoFar + "0";
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextMyInputs.setText(editTextMyInputs.getText() + "1");
                totalSumSoFar = totalSumSoFar + "1";

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextMyInputs.setText(editTextMyInputs.getText() + "2");
                totalSumSoFar = totalSumSoFar + "2";

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextMyInputs.setText(editTextMyInputs.getText() + "3");
                totalSumSoFar = totalSumSoFar + "3";

            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextMyInputs.setText(editTextMyInputs.getText() + "4");
                totalSumSoFar = totalSumSoFar + "4";

            }
        });


        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextMyInputs.setText(editTextMyInputs.getText() + "5");
                totalSumSoFar = totalSumSoFar + "5";

            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextMyInputs.setText(editTextMyInputs.getText() + "6");
                totalSumSoFar = totalSumSoFar + "6";

            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextMyInputs.setText(editTextMyInputs.getText() + "7");
                totalSumSoFar = totalSumSoFar + "7";

            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextMyInputs.setText(editTextMyInputs.getText() + "8");
                totalSumSoFar = totalSumSoFar + "8";

            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextMyInputs.setText(editTextMyInputs.getText() + "9");
                totalSumSoFar = totalSumSoFar + "9";

            }
        });

        additionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (totalSumSoFar != null) {
                    firstValue = Integer.parseInt(totalSumSoFar.trim());
                    editTextMyInputs.setText(firstValue + "+");
                    addBtn = true;
                    subtractBtn = false;
                    divisionBtn = false;
                    multiplyBtn = false;
                }
            }
        });


        subtractionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstValue = Integer.parseInt(editTextMyInputs.getText() + "");
                addBtn = false;
                divisionBtn = false;
                multiplyBtn = false;
                textViewMyResults.setText("");

            }
        });

        multiplicationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstValue = Integer.parseInt(editTextMyInputs.getText() + "");
                addBtn = false;
                divisionBtn = false;
                subtractBtn = false;
                textViewMyResults.setText("");
            }
        });


        divisionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstValue = Integer.parseInt(editTextMyInputs.getText() + "");
                addBtn = false;
                multiplyBtn = false;
                subtractBtn = false;
                textViewMyResults.setText("");

            }
        });

        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewMyResults.setText(null);

            }
        });

        equalToButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myAddition();
                mySubtraction();
                myDivision();
                myMultiplication();
            }
        });

    }

    public Boolean myAddition() {
        if (addBtn) {
            secondValue = Integer.parseInt(editTextMyInputs.getText() + "");
            if (addBtn) {
                if ((firstValue > 0) && (secondValue > 0)) {
                    textViewMyResults.setText(calculateAddition(firstValue, secondValue));
                    addBtn = false;
                } else {
                    Toast.makeText(this, "Enter a positive number", Toast.LENGTH_SHORT).show();
                }
            }
            return false;
        }
        return true;
    }

    public Boolean mySubtraction() {
        if (subtractBtn) {
            secondValue = Integer.parseInt(editTextMyInputs.getText() + "");
            if ((firstValue > 0) && (secondValue > 0)) {
                if (firstValue > secondValue) {
                    textViewMyResults.setText(calculateSubtraction(firstValue, secondValue));
                    subtractBtn = false;
                } else {
                    Toast.makeText(this, "First value is less than second value", Toast.LENGTH_SHORT).show();
                }
            } else {
                Toast.makeText(this, "Enter a positive number", Toast.LENGTH_SHORT).show();
            }
            return false;
        }
        return true;
    }


    public boolean myDivision() {
        if (divisionBtn) {
            secondValue = Integer.parseInt(editTextMyInputs.getText() + "");
            if ((firstValue > 0) && (secondValue > 0)) {
                if (firstValue > secondValue) {
                    textViewMyResults.setText(calculateDivision(firstValue, secondValue));
                    divisionBtn = false;
                } else {
                    Toast.makeText(this, "First value is less than second value", Toast.LENGTH_SHORT).show();
                }
            } else {
                Toast.makeText(this, "Enter a positive number", Toast.LENGTH_SHORT).show();
            }
            return false;
        }
        return true;
    }

    public boolean myMultiplication() {
        if (multiplyBtn) {
            secondValue = Integer.parseInt(editTextMyInputs.getText() + "");
            if ((firstValue > 0) && (secondValue > 0)) {
                textViewMyResults.setText(calculateMultiplication(firstValue, secondValue));
                multiplyBtn = false;
            } else {
                Toast.makeText(this, "Enter a positive number", Toast.LENGTH_SHORT).show();
            }
            return false;
        }
        return true;
    }


    public int calculateAddition(int a, int b) {
        int addedResult = a + b;
        return addedResult;
    }

    public int calculateSubtraction(int a, int b) {
        int subtractedResult = a - b;
        return subtractedResult;
    }

    public int calculateDivision(int a, int b) {
        int dividedResult = a / b;
        return dividedResult;
    }

    public int calculateMultiplication(int a, int b) {
        int multipliedResult = a * b;
        return multipliedResult;
    }


}




