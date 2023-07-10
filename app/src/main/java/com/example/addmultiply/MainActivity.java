package com.example.addmultiply;

import static java.lang.Math.round;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   TextView result;
   EditText num1,num2;
   Button sum,multiply;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Summation
        sum=(Button) findViewById(R.id.sum);
        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Get user Input

                double output=Double.parseDouble(num1.getText().toString())+Double.parseDouble(num2.getText().toString());
                result=(TextView) findViewById(R.id.result);
                result.setText("Summation Result is : "+  round(output));
                Toast.makeText(getApplicationContext(),"Summation Result is : "+  round(output),Toast.LENGTH_SHORT).show();

            }
        });
        //Multiplication
        multiply=(Button) findViewById(R.id.multiply);
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double output=getResult("multi");
                result=(TextView) findViewById(R.id.result);
                result.setText("Multiplication Result is : "+  round(output));
                Toast.makeText(getApplicationContext(),"Multiplication Result is : "+  round(output),Toast.LENGTH_SHORT).show();
            }
        });

    }


    public  double getResult(String type)
    {
        double value = 0.0;
        if(type=="multi")
        {
            num1=(EditText) findViewById(R.id.num1);
            num2=(EditText) findViewById(R.id.num2);
            value=Double.parseDouble(num1.getText().toString())*Double.parseDouble(num2.getText().toString());
            return value;
        }
        num1=(EditText) findViewById(R.id.num1);
        num2=(EditText) findViewById(R.id.num2);
        value=Double.parseDouble(num1.getText().toString())+Double.parseDouble(num2.getText().toString());
        return value;


    }
}