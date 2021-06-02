package com.example.counterregister;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView txtCount;
    private Button btnCount;
    private RadioButton rBtnUp,rBtnDown;
    private int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        rBtnUp = (RadioButton)findViewById(R.id.rBtnUpId);
        rBtnDown = (RadioButton)findViewById(R.id.rBtnDownId);

        txtCount = (TextView)findViewById(R.id.txtCountId);
        txtCount.setText(String.valueOf(count));

        btnCount = (Button)findViewById(R.id.btnCountId);

        btnCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(rBtnUp.isChecked())
                    count++;
                if(rBtnDown.isChecked())
                    count--;
                txtCount.setText(String.valueOf(count));
            }
        });




    }
}