package com.example.app3;

import android.content.ClipData;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class Itemadapter extends BaseAdapter {
    LayoutInflater nInflater;
    String[] items;

    String[] prices;
    String[] desc1;
    public Itemadapter(Context c , String[] i, String[] p, String[] d){
        items = i;
        prices = p;
        desc1 = d;
        nInflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return items.length;
    }

    @Override
    public Object getItem(int position) {
        return items[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = nInflater.inflate(R.layout.mylist_detail,null);

        TextView nameView = v.findViewById(R.id.nameView);
        TextView priceView = v.findViewById(R.id.priceView);
        TextView descView = v.findViewById(R.id.descView);

        String name = items[position];
        String price = prices[position];
        String desc = desc1[position];

        nameView.setText(name);
        priceView.setText(price);
        descView.setText(desc);


        return v;
    }
}
