package com.example.app3;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView myListView;
    String[] items;
    String[] desc;
    String[] prices;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resources res = getResources();
        myListView = findViewById(R.id.listView);
        items = res.getStringArray(R.array.items);
        desc = res.getStringArray(R.array.desc);
        prices = res.getStringArray(R.array.price);

        //myListView.setAdapter(new ArrayAdapter<String>(this,R.layout.mylistview_detail,items));
        Itemadapter itemadapter = new Itemadapter(this , items , prices , desc);
        myListView.setAdapter(itemadapter);
    }
}
