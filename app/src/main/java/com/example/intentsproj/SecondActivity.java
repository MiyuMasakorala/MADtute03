package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    EditText eText1;
    EditText eText2;

    String num1;
    String num2;

    int n1,n2;

    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        eText1  =findViewById(R.id.edtTxtAc21);
        eText2 = findViewById(R.id.edtTxtAc22);
        result = findViewById(R.id.txtVwAc2);

        Intent intent = getIntent();

         num1 = intent.getStringExtra("numb1");
         num2 = intent.getStringExtra("numb2");

        eText1.setText(num1);
        eText2.setText(num2);

        n1 = Integer.parseInt(num1);
        n2 = Integer.parseInt(num2);


        Button btnAdd = (Button)findViewById(R.id.btnAdd);
        Button btnDiv = (Button)findViewById(R.id.btnDiv);
        Button btnSub = (Button)findViewById(R.id.btnSub);
        Button btnMul = (Button)findViewById(R.id.btnMulti);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculationAdd();
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculationSub();
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculationMulti();
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculationDiv();
            }
        });
    }

    public void calculationAdd(){

        result.setText(num1+" + " +num2+" = "+(n1+n2));

    }

    public void calculationSub(){

        result.setText(num1+" - " +num2+" = "+(n1-n2));

    }

    public void calculationMulti(){

        result.setText(num1+" x " +num2+" = "+(n1*n2));

    }

    public void calculationDiv(){

        result.setText(num1+" / " +num2+" = "+(n1/n2));

    }
}