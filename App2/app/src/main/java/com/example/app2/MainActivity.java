package com.example.app2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button AcButton1 = findViewById(R.id.AcButton1);
        AcButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(),Main2Activity.class);
                startIntent.putExtra("com.example.app2.name" , "Helloworld");
                startActivity(startIntent);
            }
        });
        Button AcButton2 = findViewById(R.id.AcButton2);
        AcButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Url = "http://www.google.com";
                Uri webaddress = Uri.parse(Url);
                Intent gotoaddress = new Intent(Intent.ACTION_VIEW,webaddress);
                if (gotoaddress.resolveActivity(getPackageManager())!= null){
                    startActivity(gotoaddress);
                }
            }
        });



    }


}
