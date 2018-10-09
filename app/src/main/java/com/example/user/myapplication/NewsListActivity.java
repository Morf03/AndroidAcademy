package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class NewsListActivity extends AppCompatActivity {
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_menu, menu);
        return true;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_list);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId()==R.id.about_menu){
            Toast.makeText(this, "About Item", Toast.LENGTH_SHORT).show();
            openAboutActivity();
        }

        return super.onOptionsItemSelected(item);
    }

    public void openAboutActivity() {
        Intent AboutActivityIntent = new Intent(this, AboutActivity.class);
        startActivity(AboutActivityIntent);
    }
}

