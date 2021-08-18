package com.example.layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListDisplay extends AppCompatActivity {
    String [] countries={"Pakistan","India","Bangladesh","Chaina","Iran","Adghanistan","Japan","America","England"};
    ListView lv;
    ArrayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_display);
        lv =(ListView) findViewById(R.id.list);
        adapter = new ArrayAdapter<String>(this,R.layout.list_view,countries);
        lv.setAdapter(adapter);
    }
}
