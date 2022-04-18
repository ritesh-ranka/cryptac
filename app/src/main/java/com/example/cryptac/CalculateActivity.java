package com.example.cryptac;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class CalculateActivity extends AppCompatActivity {

    BottomNavigationView bottom_navigation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);
        bottom_navigation = findViewById(R.id.bottom_navigation);
        bottom_navigation.setSelectedItemId(R.id.page_1);
        bottom_navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch(item.getItemId()){
                    case R.id.page_1:
                        break;
                    case R.id.page_2:
                        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.page_3:
                        Intent i = new Intent(getApplicationContext(), SettingsActivity.class);
                        startActivity(i);
                        break;
                }
                return true;
            }
        });
    }
}