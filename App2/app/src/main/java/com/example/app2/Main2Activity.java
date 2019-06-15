package com.example.app2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        if (getIntent().hasExtra("com.example.app2.name")){
            TextView tv = findViewById(R.id.textView);
            tv.setText(getIntent().getExtras().getString("com.example.app2.name"));

        }
    }
}
