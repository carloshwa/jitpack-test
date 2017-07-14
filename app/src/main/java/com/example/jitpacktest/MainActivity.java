package com.example.jitpacktest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.library.Manager;

public class MainActivity extends AppCompatActivity {
    Manager manager = new Manager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((TextView) findViewById(R.id.manager_text)).setText(manager.getName());
    }

}
