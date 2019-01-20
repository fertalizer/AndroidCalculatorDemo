package com.example.calculatordemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton imageButtonNumber0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageButtonNumber0 = (ImageButton) findViewById(R.id.imageButtonNumber0);
        imageButtonNumber0.getBackground().setAlpha(0);
    }
}
