package com.example.subpraka.calapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DisplayFragment displayFragment = (DisplayFragment)getSupportFragmentManager()
                .findFragmentById(R.id.frag_display);

        InputFragment inputFragment = (InputFragment)getSupportFragmentManager()
                .findFragmentById(R.id.frag_input);

        CalculatorPresenter presenter = new CalculatorPresenter(displayFragment);
        displayFragment.setPresenter(presenter);
        inputFragment.setPresenter(presenter);

    }
}
