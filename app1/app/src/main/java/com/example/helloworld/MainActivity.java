package com.example.helloworld;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bt = (Button) findViewById(R.id.bt);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText n_valin1 = findViewById(R.id.n_valin1);
                EditText n_valin0 = findViewById(R.id.n_valin0);
                TextView n_result = findViewById(R.id.n_result);

                int num1 = Integer.parseInt(n_valin1.getText().toString());
                int num0 = Integer.parseInt(n_valin0.getText().toString());
                int res = num1 + num0;
                n_result.setText(res + "");
            }
        });
    }
}
