package com.example.arraryadapterspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Spinner drink, temp;
    private TextView txv;
    private String[] tempSet1[] = {"冰","去冰","溫"};
    private String[] tempSet2[] = {"冰","去冰"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txv = (TextView) findViewById(R.id.order);
        temp = (Spinner) findViewById(R.id.temp);

        drink = (Spinner) findViewById(R.id.drink);
        drink.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String[] temSet;
                if(pasition ==3)
                    tempSet = tempSet2;
                else
                    tempSet = tempSet1;
                ArrayAdapter<String> tempAd =
                        new ArrayAdapter<>
            }
        });
    }
}