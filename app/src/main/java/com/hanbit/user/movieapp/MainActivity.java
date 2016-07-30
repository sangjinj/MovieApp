package com.hanbit.user.movieapp;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends Activity {

    GridView gridView;
    public String[] movies = this.getArray();

    protected String[] getArray(){
        String[] arr = new String[12];
        for(int i =0;i < arr.length;i++){
            arr[i] = "mov"+(i+1);
            Log.d("영화제목",arr[i]);
        }
        return arr;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView = (GridView) findViewById(R.id.gridView);
        gridView.setAdapter(new Adapter(this, movies));
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int i, long id) {
                Toast.makeText(MainActivity.this, movies[i], Toast.LENGTH_LONG);

            }
        });
    }

}
