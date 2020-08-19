package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

  public static final String EXTRA_NUMBER = "com.example.intentsproj.example.EXTRA_NUMBER";

  EditText number_1;
  EditText number_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        Button btnOk = (Button)findViewById(R.id.btnOk);

       btnOk.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               openSecondActivity();
           }
       });
    }
    public void openSecondActivity(){

         number_1 = findViewById(R.id.edtTxtAc11);

         number_2 = findViewById(R.id.edtTxtAc12);


        //Context context = getApplicationContext();
        //CharSequence message = "You clicked OK , Navigate to Second Activity";
       // int duration = Toast.LENGTH_SHORT;
        //Toast toast = Toast.makeText(context,message,duration);
        //toast.setGravity(Gravity.BOTTOM,0,0);
       // toast.show();

        //Creating the LayoutInflater instance
        LayoutInflater li = getLayoutInflater();
       //Getting the View object as defined in the customtoast.xml file
        View layout = li.inflate(R.layout.customtoast, (ViewGroup)
                findViewById(R.id.custom_toast_layout));
        //Creating the Toast object
        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setView(layout);//setting the view of custom toast layout
        toast.show();


        Intent intent = new Intent(this, SecondActivity.class);

        intent.putExtra("numb1",number_1.getText().toString());
        intent.putExtra("numb2", number_2.getText().toString());
        startActivity(intent);

    }
}