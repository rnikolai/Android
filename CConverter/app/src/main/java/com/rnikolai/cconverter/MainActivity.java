package com.rnikolai.cconverter;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    EditText t_From;
    EditText t_To;
    Spinner s_From;
    Spinner s_To;
    Button btn;
    TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        t_From = (EditText) findViewById(R.id.Input);
        t_To = (EditText) findViewById(R.id.Output);
        btn = (Button) findViewById(R.id.button);
        s_From = (Spinner) findViewById(R.id.spinnerFrom);
        s_To = (Spinner) findViewById(R.id.spinnerTo);
        tv = (TextView) findViewById(R.id.textView);

        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.Currency, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        s_To.setAdapter(adapter);
        s_From.setAdapter(adapter);

        final double rate []  = new double[3];
        rate[0] = 1;
        rate[1] = 0.74;
        rate[2] = 1.12;



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int from , to;
                double input = Double.parseDouble(t_From.getText().toString());
                double result = 0;

                from = s_From.getSelectedItemPosition();
                to = s_To.getSelectedItemPosition();

                if(to == 0){
                    result = input * rate[from];
                }
                else{
                    result =  input * rate[from] * (1/rate[to]);
                }
                t_To.setText(Double.toString(result));

            }
        });

    }
}
