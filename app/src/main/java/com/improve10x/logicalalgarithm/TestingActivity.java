package com.improve10x.logicalalgarithm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.Telephony;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

public class TestingActivity extends AppCompatActivity {
    Button sumBtn;
    SeekBar aSb;
    SeekBar bSb;
    TextView resultTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testing);
        handleInItViews();
        handlesumBtn();

    }

    private void handlesumBtn() {
        sumBtn.setOnClickListener(view -> {
             int progress1 = aSb.getProgress();
             int progress2 = bSb.getProgress();
             int progress = sumIsLessThan100(progress1,progress2);
             resultTxt.setText(progress);

        });
    }

    private int sumIsLessThan100(int progress1, int progress2) {

        boolean result = false;
        if (progress1 + progress2<100){
            result = true;
        }
        return result ;

    }

    public void handleInItViews(){
        sumBtn = findViewById(R.id.sum_btn);
        aSb = findViewById(R.id.a_sb);
        bSb = findViewById(R.id.b_sb);
        resultTxt = findViewById(R.id.result_txt);
    }

}