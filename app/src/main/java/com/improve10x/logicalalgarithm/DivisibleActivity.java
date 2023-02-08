package com.improve10x.logicalalgarithm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DivisibleActivity extends AppCompatActivity {
    EditText numberTxt;
    Button divisibleBtn;
    TextView resultTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_divisible);
        handleInitViews();
        handleDivisibleBtn();
    }

    public  void handleInitViews(){
        numberTxt = findViewById(R.id.number_txt);
        divisibleBtn = findViewById(R.id.divisible_btn);
        resultTxt = findViewById(R.id.result_txt);
    }

    public void  handleDivisibleBtn(){
        divisibleBtn.setOnClickListener(view -> {
            String input = numberTxt.getText().toString();
            String division = divisibleBy5(input);
            resultTxt.setText(division);

        });
    }

    private String divisibleBy5(String input) {
        int a = Integer.parseInt(input);
        boolean result = false;
        if (a % 5 ==0){
            result = true;
        }
        return  result + "";

    }

    @Override
    protected void onPause() {
        super.onPause();
        numberTxt.setText(0);
        resultTxt.setText("");
    }
}