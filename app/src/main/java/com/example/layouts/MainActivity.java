package com.example.layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    int count=0;
    String [] students=new String[count];
    EditText name,fee,id;
    Button add,cancel;
    ListView lv;
    ArrayAdapter adapter;
    String [] a={"a","b","c"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.abs_layout);
//        name=findViewById(R.id.etname);
//        fee=findViewById(R.id.etfee);
//        add=findViewById(R.id.add);
//        id=findViewById(R.id.etid);
//        cancel=findViewById(R.id.cancel);
//        cancel.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                name.setText("");
//                id.setText("");
//                fee.setText("");
//            }
//        });
//        add.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String s=id.getText().toString()+"        "+name.getText().toString()+"        "+fee.getText().toString();
//                /*s.name=name.getText().toString();
//                s.id=id.getText().toString();
//                s.fees=fee.getText().toString();*/
//                count++;
//                String[] std=new String[count-1];
//                for(int i=0;i<count-1;i++){
//                    std[i]=students[i];
//                }
//                students=new String[count];
//                int i;
//                for(i=0;i<count-1;i++){
//                    students[i]=std[i];
//                }
//                students[i]=s;
//                name.setText("");
//                id.setText("");
//                fee.setText("");
//                display();
//
//            }
//        });
//
       }
//    public void display(){
//        lv =(ListView) findViewById(R.id.list);
//        adapter = new ArrayAdapter<String>(this,R.layout.list_view,students);
//        lv.setAdapter(adapter);
//    }
}
