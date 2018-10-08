package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button button;
TextView textView5;
EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)  findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openSecondActivity();
            }
        });

    }

    public void openSecondActivity() {
        Intent secondActivityIntent = new Intent(this, SecondActivityActivity.class);
        secondActivityIntent.putExtra("TEXT", editText.getText().toString());
        startActivity(secondActivityIntent);
    }

}
