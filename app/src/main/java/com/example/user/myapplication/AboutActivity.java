package com.example.user.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class AboutActivity extends AppCompatActivity {
Button button;
TextView textView5;
EditText editText;
String[] emailTo;
String emailSubject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_activity);

        button = (Button)  findViewById(R.id.button);
        editText =(EditText) findViewById(R.id.editText);
        emailTo = new String[]{getString(R.string.email_to_me)};
        emailSubject = getString(R.string.email_subject);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                composeEmail(emailTo, emailSubject,editText.getText().toString());
            }
        });

    }

    public void openSecondActivity() {
        Intent secondActivityIntent = new Intent(this, SecondActivityActivity.class);
        secondActivityIntent.putExtra("TEXT", editText.getText().toString());
        startActivity(secondActivityIntent);
    }

    public void composeEmail(String[] addresses, String subject, String emailBody) {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_EMAIL, addresses);
        intent.putExtra(Intent.EXTRA_SUBJECT, subject);
        intent.putExtra(Intent.EXTRA_TEXT, emailBody);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }else {
            Toast.makeText(this, "No Email app found", Toast.LENGTH_LONG).show();
        }
        }
    }


