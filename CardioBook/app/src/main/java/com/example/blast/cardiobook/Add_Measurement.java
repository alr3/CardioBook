package com.example.blast.cardiobook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.sql.Time;
import java.util.Date;


public class Add_Measurement extends AppCompatActivity {
    BloodPressure bp;
    int heart_rate;
    String comment;
    Date date;
    Time time;
    int systolic;
    int diastolic;

    EditText heart_rate_input;
    EditText date_input;
    EditText systolic_input;
    EditText diastolic_input;
    EditText time_input;
    EditText comment_input;

    Button submitButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add__measurement);

        heart_rate_input = (EditText) findViewById(R.id.Heart_rate);
        date_input = (EditText) findViewById(R.id.editText5);
        systolic_input = (EditText) findViewById(R.id.editText);
        diastolic_input = (EditText) findViewById(R.id.editText2);
        time_input = (EditText) findViewById(R.id.editText4);
        comment_input = (EditText) findViewById(R.id.editText6);

        submitButton = (Button) findViewById(R.id.submit);
        submitButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                heart_rate = Integer.valueOf(heart_rate_input.getText().toString());
                comment = (comment_input.getText().toString());
                systolic = Integer.valueOf(systolic_input.getText().toString());
                diastolic = Integer.valueOf(diastolic_input.getText().toString());
                bp = new BloodPressure(systolic, diastolic);


            }
        });

        }
    }


