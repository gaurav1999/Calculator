package com.example.gaurav.calculator;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.content.ContentValues.TAG;

public class MainActivity extends Activity{
double num1,num2;
boolean sum,qu,mul,sub;
Button one,two,three,four,five,six,seven,eight,nine,zero,add,equals,divide,decimal,minus,multiply,clear;
EditText Output;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Output=(EditText) findViewById(R.id.Output);


        one=(Button)findViewById(R.id.one);
        two=(Button)findViewById(R.id.two);
        three=(Button)findViewById(R.id.three);
        four=(Button)findViewById(R.id.four);
        five=(Button)findViewById(R.id.five);
        six=(Button)findViewById(R.id.six);
        seven=(Button)findViewById(R.id.seven);
        eight=(Button)findViewById(R.id.eight);
        nine=(Button)findViewById(R.id.nine);
        zero=(Button)findViewById(R.id.zero);
        add=(Button)findViewById(R.id.add);
        minus=(Button)findViewById(R.id.minus);
        multiply=(Button)findViewById(R.id.multiply);
        divide=(Button)findViewById(R.id.divide);
        decimal=(Button)findViewById(R.id.decimal);
        clear=(Button)findViewById(R.id.Clear);
    }
        public void onNumclick(View v)
    {
        switch (v.getId())
        {
            case R.id.one:
                Output.setText(Output.getText()+"1");
                break;
            case R.id.two:
                Output.setText(Output.getText()+"2");
                break;
            case R.id.three:
                Output.setText(Output.getText()+"3");
                break;
            case R.id.four:
                Output.setText(Output.getText()+"4");
                break;
            case R.id.five:
                Output.setText(Output.getText()+"5");
                break;
            case R.id.six:
                Output.setText(Output.getText()+"6");
                break;
            case R.id.seven:
                Output.setText(Output.getText()+"7");
                break;
            case R.id.eight:
                Output.setText(Output.getText()+"8");
                break;
            case R.id.nine:
                Output.setText(Output.getText()+"9");
                break;
            case R.id.zero:
                Output.setText(Output.getText()+"0");
                break;
            case R.id.decimal:
                Output.setText(Output.getText()+".");
                break;
            case R.id.add:
                  num1=Double.parseDouble(Output.getText().toString());
                  Output.setText("");
                  sum=true;
                  break;
            case R.id.minus:
                num1=Double.parseDouble(Output.getText().toString());
                Output.setText("");
                sub=true;
                break;
            case R.id.divide:
                num1=Double.parseDouble(Output.getText().toString());
                Output.setText("");
                qu=true;
                break;
            case R.id.multiply:
                num1=Double.parseDouble(Output.getText().toString());
                Output.setText("");
                mul=true;
                break;
            case R.id.equals:
                num2=Double.parseDouble(Output.getText().toString());
                if(sum==true)
                {
                    Output.setText((num1+num2)+"");
                    sum=false;
                }
                if(mul==true)
                {
                    Output.setText((num1*num2)+"");
                    mul=false;
                }
                if(sub==true)
                {
                    Output.setText((num1-num2)+"");
                    sub=false;
                }
                if (qu==true)
                {
                    Output.setText((num1/num2)+"");
                    qu=false;
                }
                break;
            case R.id.Clear:
                Output.setText("");
                break;


        }

    }



    }







