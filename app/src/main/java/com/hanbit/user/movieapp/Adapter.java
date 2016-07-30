package com.hanbit.user.movieapp;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by 1027 on 2016-07-16.
 */
public class Adapter extends BaseAdapter{
    private Context context;
    private String[] movieList;

    public Adapter(Context context, String[] list) {
        this.context = context;
        this.movieList = list;
    }

    @Override
    public int getCount() {
        //Toast.makeText(Adapter.this,"",Toast.LENGTH_LONG);
        Log.d("===카운트===",movieList.length+"");
        return movieList.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View v, ViewGroup parent) {

        System.out.println("################ getviewe start ####################");

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View gridView = null;
        if (v == null) {
            gridView = new View(context);
            gridView = inflater.inflate(R.layout.movie,null);
            TextView textView = (TextView) gridView.findViewById(R.id.movieTitle);
            textView.setText(movieList[i]);
            ImageView imageView = (ImageView) gridView.findViewById(R.id.movie);
            String movie = movieList[i];
            switch (movie){
                case "mov1" : imageView.setImageResource(R.drawable.mov1);break;
                case "mov2" : imageView.setImageResource(R.drawable.mov2);break;
                case "mov3" : imageView.setImageResource(R.drawable.mov3);break;
                case "mov4" : imageView.setImageResource(R.drawable.mov4);break;
                case "mov5" : imageView.setImageResource(R.drawable.mov5);break;
                case "mov6" : imageView.setImageResource(R.drawable.mov6);break;
                case "mov7" : imageView.setImageResource(R.drawable.mov7);break;
                case "mov8" : imageView.setImageResource(R.drawable.mov8);break;
                case "mov9" : imageView.setImageResource(R.drawable.mov9);break;
                case "mov10" : imageView.setImageResource(R.drawable.mov10);break;
                case "mov11" : imageView.setImageResource(R.drawable.mov11);break;
                case "mov12" : imageView.setImageResource(R.drawable.mov12);break;
            }
        } else {
            gridView = (View)v;

        }

        return gridView;
    }
}
