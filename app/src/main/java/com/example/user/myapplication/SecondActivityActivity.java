package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivityActivity extends AppCompatActivity {
    public static final String TEXT = "TEXT";
    TextView textView5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        textView5 =(TextView) findViewById(R.id.textView5);

        String textView_intent = getIntent().getStringExtra(TEXT);
        textView5.setText(textView_intent);

    }
}
