package com.elias.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
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
        Button button_number_0 = findViewById(R.id.button_number_0);
        Button button_plus = findViewById(R.id.button_plus);
        Button button_minus = findViewById(R.id.button_minus);
        Button button_multiply = findViewById(R.id.button_multiply);
        Button button_divide = findViewById(R.id.button_divide);
        Button button_result = findViewById(R.id.button_result);
        Button button_comma = findViewById(R.id.button_comma);
        Button button_clear = findViewById(R.id.button_clear);
        Button button_delete = findViewById(R.id.button_delete);
        Button button_degree = findViewById(R.id.button_degree);
        Button button_root = findViewById(R.id.button_root);


        final byte[] status = {0};
        final String[] number_1 = {""};
        final String[] number_2 = {""};
        final char[] todo = new char[1];
        final BigDecimal[] result = {new BigDecimal(0)};


        button_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textResult.setText("CLEAR");
                number_1[0] = "";
                number_2[0] = "";
                status[0] = 0;
                result[0] = new BigDecimal(0);
            }
        });

        button_delete.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (status[0] == 0) {
                    if (!number_1[0].isEmpty()) {
                        number_1[0] = number_1[0].substring(0, number_1[0].length() - 1);
                        textResult.setText(number_1[0]);
                }
            } else if (status[0] == 1) {
                if (!number_2[0].isEmpty()) {
                    number_2[0] = number_2[0].substring(0, number_2[0].length() - 1);
                    textResult.setText(number_2[0]);
                }
            }
          }
        });

        button_number_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (status[0] == 0) {
                    if (number_1[0].equals("0")) {
                        number_1[0] = String.valueOf(button_number_1.getText());
                        textResult.setText(number_1[0]);
                    } else {
                        number_1[0] = number_1[0].concat(String.valueOf(button_number_1.getText()));
                        textResult.setText(number_1[0]);
                    }
                } else if (status[0] == 1) {
                    if (number_2[0].equals("0")) {
                        number_2[0] = String.valueOf(button_number_1.getText());
                        textResult.setText(number_2[0]);
                    } else {
                        number_2[0] = number_2[0].concat(String.valueOf(button_number_1.getText()));
                        textResult.setText(number_2[0]);
                    }
                }
            }
        });

        button_number_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (status[0] == 0) {
                    if (number_1[0].equals("0")) {
                        number_1[0] = String.valueOf(button_number_2.getText());
                        textResult.setText(number_1[0]);
                    } else {
                        number_1[0] = number_1[0].concat(String.valueOf(button_number_2.getText()));
                        textResult.setText(number_1[0]);
                    }
                } else if (status[0] == 1) {
                    if (number_2[0].equals("0")) {
                        number_2[0] = String.valueOf(button_number_2.getText());
                        textResult.setText(number_2[0]);
                    } else {
                        number_2[0] = number_2[0].concat(String.valueOf(button_number_2.getText()));
                        textResult.setText(number_2[0]);
                    }
                }
            }
        });

        button_number_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (status[0] == 0) {
                    if (number_1[0].equals("0")) {
                        number_1[0] = String.valueOf(button_number_3.getText());
                        textResult.setText(number_1[0]);
                    } else {
                        number_1[0] = number_1[0].concat(String.valueOf(button_number_3.getText()));
                        textResult.setText(number_1[0]);
                    }
                } else if (status[0] == 1) {
                    if (number_2[0].equals("0")) {
                        number_2[0] = String.valueOf(button_number_3.getText());
                        textResult.setText(number_2[0]);
                    } else {
                        number_2[0] = number_2[0].concat(String.valueOf(button_number_3.getText()));
                        textResult.setText(number_2[0]);
                    }
                }
            }
        });

        button_number_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (status[0] == 0) {
                    if (number_1[0].equals("0")) {
                        number_1[0] = String.valueOf(button_number_4.getText());
                        textResult.setText(number_1[0]);
                    } else {
                        number_1[0] = number_1[0].concat(String.valueOf(button_number_4.getText()));
                        textResult.setText(number_1[0]);
                    }
                } else if (status[0] == 1) {
                    if (number_2[0].equals("0")) {
                        number_2[0] = String.valueOf(button_number_4.getText());
                        textResult.setText(number_2[0]);
                    } else {
                        number_2[0] = number_2[0].concat(String.valueOf(button_number_4.getText()));
                        textResult.setText(number_2[0]);
                    }
                }
            }
        });

        button_number_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (status[0] == 0) {
                    if (number_1[0].equals("0")) {
                        number_1[0] = String.valueOf(button_number_5.getText());
                        textResult.setText(number_1[0]);
                    } else {
                        number_1[0] = number_1[0].concat(String.valueOf(button_number_5.getText()));
                        textResult.setText(number_1[0]);
                    }
                } else if (status[0] == 1) {
                    if (number_2[0].equals("0")) {
                        number_2[0] = String.valueOf(button_number_5.getText());
                        textResult.setText(number_2[0]);
                    } else {
                        number_2[0] = number_2[0].concat(String.valueOf(button_number_5.getText()));
                        textResult.setText(number_2[0]);
                    }
                }
            }
        });

        button_number_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (status[0] == 0) {
                    if (number_1[0].equals("0")) {
                        number_1[0] = String.valueOf(button_number_6.getText());
                        textResult.setText(number_1[0]);
                    } else {
                        number_1[0] = number_1[0].concat(String.valueOf(button_number_6.getText()));
                        textResult.setText(number_1[0]);
                    }
                } else if (status[0] == 1) {
                    if (number_2[0].equals("0")) {
                        number_2[0] = String.valueOf(button_number_6.getText());
                        textResult.setText(number_2[0]);
                    } else {
                        number_2[0] = number_2[0].concat(String.valueOf(button_number_6.getText()));
                        textResult.setText(number_2[0]);
                    }
                }
            }
        });

        button_number_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (status[0] == 0) {
                    if (number_1[0].equals("0")) {
                        number_1[0] = String.valueOf(button_number_7.getText());
                        textResult.setText(number_1[0]);
                    } else {
                        number_1[0] = number_1[0].concat(String.valueOf(button_number_7.getText()));
                        textResult.setText(number_1[0]);
                    }
                } else if (status[0] == 1) {
                    if (number_2[0].equals("0")) {
                        number_2[0] = String.valueOf(button_number_7.getText());
                        textResult.setText(number_2[0]);
                    } else {
                        number_2[0] = number_2[0].concat(String.valueOf(button_number_7.getText()));
                        textResult.setText(number_2[0]);
                    }
                }
            }
        });

        button_number_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (status[0] == 0) {
                    if (number_1[0].equals("0")) {
                        number_1[0] = String.valueOf(button_number_8.getText());
                        textResult.setText(number_1[0]);
                    } else {
                        number_1[0] = number_1[0].concat(String.valueOf(button_number_8.getText()));
                        textResult.setText(number_1[0]);
                    }
                } else if (status[0] == 1) {
                    if (number_2[0].equals("0")) {
                        number_2[0] = String.valueOf(button_number_8.getText());
                        textResult.setText(number_2[0]);
                    } else {
                        number_2[0] = number_2[0].concat(String.valueOf(button_number_8.getText()));
                        textResult.setText(number_2[0]);
                    }
                }
            }
        });

        button_number_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (status[0] == 0) {
                    if (number_1[0].equals("0")) {
                        number_1[0] = String.valueOf(button_number_9.getText());
                        textResult.setText(number_1[0]);
                    } else {
                        number_1[0] = number_1[0].concat(String.valueOf(button_number_9.getText()));
                        textResult.setText(number_1[0]);
                    }
                } else if (status[0] == 1) {
                    if (number_2[0].equals("0")) {
                        number_2[0] = String.valueOf(button_number_9.getText());
                        textResult.setText(number_2[0]);
                    } else {
                        number_2[0] = number_2[0].concat(String.valueOf(button_number_9.getText()));
                        textResult.setText(number_2[0]);
                    }
                }
            }
        });

        button_number_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (status[0] == 0) {
                    if (!number_1[0].equals("0")) {
                        number_1[0] = number_1[0].concat(String.valueOf(button_number_0.getText()));
                        textResult.setText(number_1[0]);
                    }
                } else if (status[0] == 1) {
                    if (!number_2[0].equals("0")) {
                        number_2[0] = number_2[0].concat(String.valueOf(button_number_0.getText()));
                        textResult.setText(number_2[0]);
                    }
                }
            }
        });

        button_comma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (status[0] == 0) {
                    if (!number_1[0].isEmpty() && !number_1[0].contains(".")) {
                        number_1[0] = number_1[0].concat(String.valueOf(button_comma.getText()));
                        textResult.setText(number_1[0]);
                    }
                } else if (status[0] == 1) {
                    if (!number_2[0].isEmpty()  && !number_2[0].contains(".")) {
                        number_2[0] = number_2[0].concat(String.valueOf(button_comma.getText()));
                        textResult.setText(number_2[0]);
                    }
                }
            }
        });

        button_plus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (status[0] == 0 && !number_1[0].isEmpty()) {
                    status[0] = 1;
                    todo[0] = '+';
                }
            }
        });

        button_minus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (status[0] == 0) {
                    if (number_1[0].isEmpty()) {
                        number_1[0] = number_1[0].concat(String.valueOf(button_minus.getText()));
                        textResult.setText(number_1[0]);
                    }
                    else if (!number_1[0].equals("-")) {
                        status[0] = 1;
                        todo[0] = '-';
                    }
                } else if (status[0] == 1) {
                    if (number_2[0].isEmpty()) {
                        number_2[0] = number_2[0].concat(String.valueOf(button_minus.getText()));
                        textResult.setText(number_2[0]);
                    }
                }
            }
        });

        button_multiply.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (status[0] == 0 && !number_1[0].isEmpty()) {
                    status[0] = 1;
                    todo[0] = '*';
                }
            }
        });

        button_divide.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (status[0] == 0 && !number_1[0].isEmpty()) {
                    status[0] = 1;
                    todo[0] = '/';
                }
            }
        });

        button_degree.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (status[0] == 0) {
                    status[0] = 1;
                    todo[0] = 'd';
                }
            }
        });

        button_root.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (status[0] == 0) {
                    if (number_1[0].isEmpty()) {
                        number_1[0] = number_1[0].concat(String.valueOf(2));
                    }
                    status[0] = 1;
                    todo[0] = 'r';
                }
            }
        });


        button_result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (status[0] == 0 || number_1[0].isEmpty() || number_2[0].isEmpty()
                        || number_1[0].equals("-") || number_2[0].equals("-") ) {
                    textResult.setText("ERROR");
                    number_1[0] = "";
                } else {
                    BigDecimal num1 = new BigDecimal(number_1[0]);
                    BigDecimal num2 = new BigDecimal(number_2[0]);
                    MathContext mc = new MathContext(10);

                    if (todo[0] == '+') {
                        result[0] = num1.add(num2);
                        result[0] = result[0].stripTrailingZeros();
                        String resultStr = result[0].toPlainString();
                        if (!resultStr.equals("0")) {
                            resultStr = resultStr.replaceFirst("^0+(?![\\d.])", "");
                        }
                        number_1[0] = resultStr;
                        textResult.setText(resultStr);
                    }
                    if (todo[0] == '-') {
                        result[0] = num1.subtract(num2);
                        result[0] = result[0].stripTrailingZeros();
                        String resultStr = result[0].toPlainString();
                        if (!resultStr.equals("0")) {
                            resultStr = resultStr.replaceFirst("^0+(?![\\d.])", "");
                        }
                        number_1[0] = resultStr;
                        textResult.setText(resultStr);
                    }
                    if (todo[0] == '*') {
                        result[0] = num1.multiply(num2);
                        result[0] = result[0].stripTrailingZeros();
                        String resultStr = result[0].toPlainString();
                        if (!resultStr.equals("0")) {
                            resultStr = resultStr.replaceFirst("^0+(?![\\d.])", "");
                        }
                        number_1[0] = resultStr;
                        textResult.setText(resultStr);
                    }
                    if (todo[0] == '/') {
                        if (num2.compareTo(BigDecimal.ZERO) == 0) {
                            textResult.setText("ERROR: Division by zero");
                            number_1[0] = "";
                        } else {
                            result[0] = num1.divide(num2, 10, BigDecimal.ROUND_HALF_UP);
                            result[0] = result[0].stripTrailingZeros();
                            String resultStr = result[0].toPlainString();
                            if (!resultStr.equals("0")) {
                                resultStr = resultStr.replaceFirst("^0+(?![\\d.])", "");
                            }
                            number_1[0] = resultStr;
                            textResult.setText(resultStr);
                        }
                    }
                    if (todo[0] == 'd' || todo[0] == 'r') {
                        if (todo[0] == 'r'){
                            if (num1.compareTo(BigDecimal.ZERO) == 0) {
                                textResult.setText("ERROR");
                                number_1[0] = "";
                                number_2[0] = "";
                                status[0] = 0;
                                return;
                            }
                            BigDecimal saver = new BigDecimal(number_1[0]);
                            num1 = num2;
                            num2 = BigDecimal.ONE.divide(saver, new MathContext(15, RoundingMode.HALF_UP));
                        }
                        if (num2.stripTrailingZeros().scale() <= 0){
                            if (num2.intValue() < 0) {
                                result[0] = BigDecimal.ONE.divide(num1.pow(-num2.intValue()), MathContext.DECIMAL128);
                            } else {
                                result[0] = num1.pow(num2.intValue());
                            }
                        } else {
                            if (num1.compareTo(BigDecimal.ZERO) < 0) {
                                textResult.setText("ERROR");
                                number_1[0] = "";
                                number_2[0] = "";
                                status[0] = 0;
                                return;
                            } else {
                                double baseAsDouble = num1.doubleValue();
                                double log = Math.log(baseAsDouble);
                                double resultAsDouble = Math.exp(num2.doubleValue() * log);

                                result[0] = new BigDecimal(resultAsDouble, mc);
                            }
                        }
                        result[0] = result[0].stripTrailingZeros();
                        String resultStr = result[0].toPlainString();
                        if (!resultStr.equals("0")) {
                            resultStr = resultStr.replaceFirst("^0+(?![\\d.])", "");
                        }
                        number_1[0] = resultStr;
                        textResult.setText(resultStr);
                    }
                }
                number_2[0] = "";
                status[0] = 0;
            }
        });
    }
}