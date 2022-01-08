package com.example.lesson_6_beksultan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements OnClickItem {
    private FragmentManager manager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        manager = getSupportFragmentManager();
        initFragmentLast();
    }
    private void initFragmentLast() {
        getSupportFragmentManager().beginTransaction().add(R.id.containerFirst, new FragmentMain()).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.containerSecond, new FragmentLast()).commit();
    }

    @Override
    public void onClick(int pos) {
    }
}