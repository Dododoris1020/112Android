package com.example.myapplicationbmi;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private TextView txvOutput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txvOutput = (TextView) findViewById(R.id.txvOutput);
        txvOutput.setTextSize(36);
        Button btnOK = (Button) findViewById(R.id.btnOK);
        Button btnClear = (Button) findViewById(R.id.btnClear);
        btnOK.setOnClickListener(this);
        btnClear.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        EditText edtHeight = (EditText) findViewById(R.id.edtHeight);
        EditText edtWeight = (EditText) findViewById(R.id.edtWeight);

        if (v.getId() == R.id.btnOK){
            double height = Double.parseDouble(edtHeight.getText().toString());
            double weight = Double.parseDouble(edtHeight.getText().toString());
            double bmi = weight / Math.pow(height/100.0 , 2);
            if (bmi>=24)
                txvOutput.setTextColor(Color.RED);
            else if (bmi<18.5)
                txvOutput.setTextColor(Color.BLUE);
            else
                txvOutput.setTextColor(Color.GREEN);

            txvOutput.setText(String.format("%.2f", bmi));

        }
        else{
            edtHeight.setText("0");
            edtWeight.setText("0");
            txvOutput.setText("");

        }
    }
}