package com.example.layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

public class GridDisplay extends AppCompatActivity {
    GridView gridView;
    ArrayAdapter adapter;
    final static String [] alphabets={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_display);
        gridView=(GridView) findViewById(R.id.gridView);
        adapter=new ArrayAdapter(this,R.layout.list_view,alphabets);

        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener((new GridView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView v=(TextView)view;
                Toast.makeText(getApplicationContext(),v.getText(),Toast.LENGTH_SHORT).show();
            }
        }));
    }

}
