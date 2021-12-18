package com.example.basic_series;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnclick(View v)
    {
        EditText ed1;
        TextView tv1, tv2;
        int num1, loop1, loop2;
        double series1 = 0;
        int num2 = 1;

        ed1 = (EditText)findViewById(R.id.tb_1);
        tv1 = (TextView)findViewById(R.id.tb_ans);
        num1 = Integer.parseInt(ed1.getText().toString());

        for (int x = 1; x <= num1; x = x + 1)
        {
            num2 = num2 * x;
            series1 = series1 + num2;

        }
        tv1.setText(String.valueOf(series1));
    }
}