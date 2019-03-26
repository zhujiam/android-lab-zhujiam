package com.ming.www.basiccalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView processDis;
    private TextView inputDis;
    private Button btn_00, btn_01, btn_02, btn_03, btn_04, btn_05, btn_06, btn_07, btn_08, btn_09;
    private Button btn_add, btn_sub, btn_multi, btn_div, btn_radical, btn_square, btn_pi;
    private Button btn_arc, btn_sin,btn_cos, btn_tan;
    private Button btn_clear, btn_dot, btn_cal;

    private String input = "";
    private double num1 = 0;
    private double num2 = 0;
    private String symbol = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        processDis = findViewById(R.id.processDis);
        inputDis  = findViewById(R.id.inputDis);
        btn_00    = findViewById(R.id.btn_00);
        btn_01    = findViewById(R.id.btn_01);
        btn_02    = findViewById(R.id.btn_02);
        btn_03    = findViewById(R.id.btn_03);
        btn_04    = findViewById(R.id.btn_04);
        btn_05    = findViewById(R.id.btn_05);
        btn_06    = findViewById(R.id.btn_06);
        btn_07    = findViewById(R.id.btn_07);
        btn_08    = findViewById(R.id.btn_08);
        btn_09    = findViewById(R.id.btn_09);

        btn_add     = findViewById(R.id.btn_add);
        btn_sub     = findViewById(R.id.btn_sub);
        btn_multi   = findViewById(R.id.btn_multi);
        btn_div     = findViewById(R.id.btn_div);
        btn_radical = findViewById(R.id.btn_radical);
        btn_square    = findViewById(R.id.btn_square);
        btn_pi   = findViewById(R.id.btn_pi);

        btn_arc = findViewById(R.id.btn_arc);
        btn_sin = findViewById(R.id.btn_sin);
        btn_cos = findViewById(R.id.btn_cos);
        btn_tan = findViewById(R.id.btn_tan);

        btn_clear = findViewById(R.id.btn_clear);
        btn_dot   = findViewById(R.id.btn_dot);
        btn_cal   = findViewById(R.id.btn_cal);

        btn_00.setOnClickListener(this);
        btn_01.setOnClickListener(this);
        btn_02.setOnClickListener(this);
        btn_03.setOnClickListener(this);
        btn_04.setOnClickListener(this);
        btn_05.setOnClickListener(this);
        btn_06.setOnClickListener(this);
        btn_07.setOnClickListener(this);
        btn_08.setOnClickListener(this);
        btn_09.setOnClickListener(this);

        btn_add.setOnClickListener(this);
        btn_sub.setOnClickListener(this);
        btn_div.setOnClickListener(this);
        btn_multi.setOnClickListener(this);
        btn_radical.setOnClickListener(this);
        btn_square.setOnClickListener(this);
        btn_pi.setOnClickListener(this);

        btn_arc.setOnClickListener(this);
        btn_sin.setOnClickListener(this);
        btn_cos.setOnClickListener(this);
        btn_tan.setOnClickListener(this);

        btn_dot.setOnClickListener(this);
        btn_cal.setOnClickListener(this);
        btn_clear.setOnClickListener(this);
    }

    public void onClick(View view){
        switch (view.getId()){
            case R.id.btn_00:
                input = input + "0";
                inputDis.setText(input);
                break;
            case R.id.btn_01:
                input = input + "1";
                inputDis.setText(input);
                break;
            case R.id.btn_02:
                input = input + "2";
                inputDis.setText(input);
                break;
            case R.id.btn_03:
                input = input + "3";
                inputDis.setText(input);
                break;
            case R.id.btn_04:
                input = input + "4";
                inputDis.setText(input);
                break;
            case R.id.btn_05:
                input = input + "5";
                inputDis.setText(input);
                break;
            case R.id.btn_06:
                input = input + "6";
                inputDis.setText(input);
                break;
            case R.id.btn_07:
                input = input + "7";
                inputDis.setText(input);
                break;
            case R.id.btn_08:
                input = input + "8";
                inputDis.setText(input);
                break;
            case R.id.btn_09:
                input = input + "9";
                inputDis.setText(input);
                break;
            case R.id.btn_add:
                input = input + "+";
                symbol = "/+";
                inputDis.setText(input);
                break;
            case R.id.btn_sub:
                input = input + "-";
                symbol = "-";
                inputDis.setText(input);
                break;
            case R.id.btn_multi:
                input = input + "×";
                symbol = "×";
                inputDis.setText(input);
                break;
            case R.id.btn_div:
                input = input + "÷";
                symbol = "÷";
                inputDis.setText(input);
                break;
            case R.id.btn_dot:
                input = input + ".";
                inputDis.setText(input);
                break;
            case R.id.btn_radical:
                input = input + "√";
                inputDis.setText(input);
                break;
            case R.id.btn_square:
                input = input + "^";
                inputDis.setText(input);
                break;
            case R.id.btn_pi:
                input = input + "π";
                inputDis.setText(input);
                processDis.setText("Push '=' to get value of \u03c0");
                break;
            case R.id.btn_arc:
                input = input + "arc";
                inputDis.setText(input);
                break;
            case R.id.btn_sin:
                input = input + "sin(x)";
                inputDis.setText(input);
                break;
            case R.id.btn_cos:
                input = input + "cos(x)";
                inputDis.setText(input);
                break;
            case R.id.btn_tan:
                input = input + "tan(x)";
                inputDis.setText(input);
                break;
            case R.id.btn_cal:
                Double answer = 0.0;
                if (input.contains("sin") | input.contains("cos") | input.contains("tan")){
                    // 截取字符串，分离操作符和操作数
                    symbol = input.substring(0, input.indexOf(")") + 1);
                    String num = input.substring(input.indexOf(")") + 1, input.length());
                    num1 = Double.parseDouble(num);
                    if (input.contains("arc")){    // 反函数求角度
                        // 生成并输出提示字符
                        symbol = symbol.replace("x", num);
                        processDis.setText(symbol);
                        String temp =  input.substring(0, input.indexOf("("));
                        switch (temp){
                            case "arcsin":
                                answer = Math.toDegrees(Math.asin(num1));
                                input = answer + "°";
                                inputDis.setText(input);
                                break;
                            case "arccos":
                                answer = Math.toDegrees(Math.acos(num1));
                                input = answer + "°";
                                inputDis.setText(input);
                                break;
                            case "arctan":
                                answer = Math.toDegrees(Math.atan(num1));
                                input = answer + "°";
                                inputDis.setText(input);
                                break;
                        }
                    }else{
                        // 生成并输出提示字符
                        num = num + "°";
                        symbol = symbol.replace("x", num);
                        processDis.setText(symbol);
                        String temp =  input.substring(0, input.indexOf("("));
                        Double arc = Math.toRadians(num1);
                        switch (temp){
                            case "sin":
                                answer = Math.sin(arc);
                                input = answer + "";
                                inputDis.setText(input);
                                break;
                            case "cos":
                                answer = Math.cos(arc);
                                input = answer + "";
                                inputDis.setText(input);
                                break;
                            case "tan":
                                answer = Math.tan(arc);
                                input = answer + "";
                                inputDis.setText(input);
                                break;
                        }
                    }
                    break;
                }
                processDis.setText(input);
                if (input.contains("√")){
                    Double temp = Double.parseDouble(input.substring(1));
                    answer = Math.sqrt(temp);
                    input = "" + answer;
                    inputDis.setText(input);
                    break;
                }
                if (input.contains("^")){
                    Double temp = Double.parseDouble(input.substring(0, input.indexOf("^")));
                    answer = Math.pow(temp, 2);
                    input = "" + answer;
                    inputDis.setText(input);
                    break;
                }
                if (input.contains("π")){
                    answer = Math.PI;
                    input = "" + answer;
                    inputDis.setText(input);
                    break;
                }
                input = input.replace("+", "/+");
                String[] in_arr = input.split(symbol);
                num1 = Double.parseDouble(in_arr[0]);
                num2 = Double.parseDouble(in_arr[1]);
                switch (symbol){
                    case "/+": answer = num1 + num2; break;
                    case "-": answer = num1 - num2; break;
                    case "×": answer = num1 * num2; break;
                    case "÷": answer = num1 / num2; break;
                    default: break;
                }
                input = "" + answer;
                inputDis.setText(input);
                break;
            case R.id.btn_clear:
                inputDis.setText("");
                processDis.setText("");
                input = "";
                symbol = "";
                break;
            default: processDis.setText("This function is developing...");
        }
    }

}
