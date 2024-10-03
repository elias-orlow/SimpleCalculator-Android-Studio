package com.elias.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        TextView textResult = findViewById(R.id.textResult);
        Button button_number_1 = findViewById(R.id.button_number_1);
        Button button_number_2 = findViewById(R.id.button_number_2);
        Button button_number_3 = findViewById(R.id.button_number_3);
        Button button_number_4 = findViewById(R.id.button_number_4);
        Button button_number_5 = findViewById(R.id.button_number_5);
        Button button_number_6 = findViewById(R.id.button_number_6);
        Button button_number_7 = findViewById(R.id.button_number_7);
        Button button_number_8 = findViewById(R.id.button_number_8);
        Button button_number_9 = findViewById(R.id.button_number_9);
        Button button_plus = findViewById(R.id.button_plus);
        Button button_minus = findViewById(R.id.button_minus);
        Button button_multiply = findViewById(R.id.button_multiply);
        Button button_divide = findViewById(R.id.button_divide);
        Button button_result = findViewById(R.id.button_result);

        final byte[] status = {0};
        final String[] number_1 = {""};
        final String[] number_2 = {""};
        final char[] todo = new char[1];
        final float[] result = {0};

        button_number_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (status[0] == 0) {
                    number_1[0] = number_1[0].concat(String.valueOf(button_number_1.getText()));
                    textResult.setText(number_1[0]);
                } else if (status[0] == 1) {
                    number_2[0] = number_2[0].concat(String.valueOf(button_number_1.getText()));
                    textResult.setText(number_2[0]);
                }
            }
        });

        button_number_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (status[0] == 0) {
                    number_1[0] = number_1[0].concat(String.valueOf(button_number_2.getText()));
                    textResult.setText(number_1[0]);
                } else if (status[0] == 1) {
                    number_2[0] = number_2[0].concat(String.valueOf(button_number_2.getText()));
                    textResult.setText(number_2[0]);
                }
            }
        });

        button_number_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (status[0] == 0) {
                    number_1[0] = number_1[0].concat(String.valueOf(button_number_3.getText()));
                    textResult.setText(number_1[0]);
                } else if (status[0] == 1) {
                    number_2[0] = number_2[0].concat(String.valueOf(button_number_3.getText()));
                    textResult.setText(number_2[0]);
                }
            }
        });

        button_number_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (status[0] == 0) {
                    number_1[0] = number_1[0].concat(String.valueOf(button_number_4.getText()));
                    textResult.setText(number_1[0]);
                } else if (status[0] == 1) {
                    number_2[0] = number_2[0].concat(String.valueOf(button_number_4.getText()));
                    textResult.setText(number_2[0]);
                }
            }
        });

        button_number_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (status[0] == 0) {
                    number_1[0] = number_1[0].concat(String.valueOf(button_number_5.getText()));
                    textResult.setText(number_1[0]);
                } else if (status[0] == 1) {
                    number_2[0] = number_2[0].concat(String.valueOf(button_number_5.getText()));
                    textResult.setText(number_2[0]);
                }
            }
        });

        button_number_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (status[0] == 0) {
                    number_1[0] = number_1[0].concat(String.valueOf(button_number_6.getText()));
                    textResult.setText(number_1[0]);
                } else if (status[0] == 1) {
                    number_2[0] = number_2[0].concat(String.valueOf(button_number_6.getText()));
                    textResult.setText(number_2[0]);
                }
            }
        });

        button_number_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (status[0] == 0) {
                    number_1[0] = number_1[0].concat(String.valueOf(button_number_7.getText()));
                    textResult.setText(number_1[0]);
                } else if (status[0] == 1) {
                    number_2[0] = number_2[0].concat(String.valueOf(button_number_7.getText()));
                    textResult.setText(number_2[0]);
                }
            }
        });

        button_number_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (status[0] == 0) {
                    number_1[0] = number_1[0].concat(String.valueOf(button_number_8.getText()));
                    textResult.setText(number_1[0]);
                } else if (status[0] == 1) {
                    number_2[0] = number_2[0].concat(String.valueOf(button_number_8.getText()));
                    textResult.setText(number_2[0]);
                }
            }
        });

        button_number_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (status[0] == 0) {
                    number_1[0] = number_1[0].concat(String.valueOf(button_number_9.getText()));
                    textResult.setText(number_1[0]);
                } else if (status[0] == 1) {
                    number_2[0] = number_2[0].concat(String.valueOf(button_number_9.getText()));
                    textResult.setText(number_2[0]);
                }
            }
        });

        button_plus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (status[0] == 0) {
                    status[0] = 1;
                    todo[0] = '+';
                }
            }
        });

        button_minus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (status[0] == 0) {
                    status[0] = 1;
                    todo[0] = '-';
                }
            }
        });

        button_multiply.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (status[0] == 0) {
                    status[0] = 1;
                    todo[0] = '*';
                }
            }
        });

        button_divide.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (status[0] == 0) {
                    status[0] = 1;
                    todo[0] = '/';
                }
            }
        });

        button_result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (status[0] == 0 || number_1[0].equals("") || number_2[0].equals("")){
                    textResult.setText("ERROR");
                }

                if (todo[0] == '+') {
                    result[0] = Float.parseFloat(number_1[0]) + Float.parseFloat(number_2[0]);
                    textResult.setText(String.valueOf(result[0]));
                }
                if (todo[0] == '-') {
                    result[0] = Float.parseFloat(number_1[0]) - Float.parseFloat(number_2[0]);
                    textResult.setText(String.valueOf(result[0]));
                }
                if (todo[0] == '*') {
                    result[0] = Float.parseFloat(number_1[0]) * Float.parseFloat(number_2[0]);
                    textResult.setText(String.valueOf(result[0]));
                }
                if (todo[0] == '/') {
                    result[0] = Float.parseFloat(number_1[0]) / Float.parseFloat(number_2[0]);
                    textResult.setText(String.valueOf(result[0]));
                }

                number_1[0] = "";
                number_2[0] = "";
                status[0] = 0;
            }
        });

    }
}