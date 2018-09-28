package com.example.mohammadibrahim.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText et1,et2,et3;
    Button btn1;
    ListView listView;


    ArrayAdapter<String> adapter;
    ArrayList<String> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=(EditText)findViewById(R.id.etroll);
        et2=(EditText)findViewById(R.id.name);
        et3=(EditText)findViewById(R.id.address);
        btn1=(Button)findViewById(R.id.btsend);
        listView=(ListView)findViewById(R.id.list_item);

       arrayList = new ArrayList<String>();
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayList);

        listView.setAdapter(adapter);
        OnClick();

    }
    public void OnClick(){

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String roll=et1.getText().toString();
                String name=et2.getText().toString();
                String add=et3.getText().toString();

                arrayList.add(roll);
                arrayList.add(name);
                arrayList.add(add);
                 adapter.notifyDataSetChanged();
            }
        });
        }
}
