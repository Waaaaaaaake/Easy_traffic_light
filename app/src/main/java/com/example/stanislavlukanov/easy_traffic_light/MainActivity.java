package com.example.stanislavlukanov.easy_traffic_light;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private LinearLayout mLinearLayout;
    private TextView mTextView;
    private Button mButtonGreen;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mLinearLayout = findViewById(R.id.linearlayout);
        mTextView = findViewById(R.id.tv_color);
        mButtonGreen = findViewById(R.id.btn3);
        mButtonGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mLinearLayout.setBackgroundColor(ContextCompat.getColor(getApplicationContext(),R.color.colorGreen));
                mTextView.setText(R.string.third);
            }
        });

    }


    public void onRedClick(View view) {
        mLinearLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.colorRed));
        mTextView.setText(R.string.first);
    }


    public void onYellowClick(View view) {
        mLinearLayout.setBackgroundColor(ContextCompat.getColor(this,R.color.colorYellow));
        mTextView.setText(R.string.second);
    }
}
