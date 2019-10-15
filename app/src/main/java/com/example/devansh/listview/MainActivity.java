package com.example.devansh.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<String> arr=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.list);
        for(int i=0;i<20;i++)
        {
            arr.add("name"+i);
        }
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(
                MainActivity.this
                ,R.layout.myrow
                ,R.id.txt
                ,arr
        );
        listView.setAdapter(adapter);
    }
}
