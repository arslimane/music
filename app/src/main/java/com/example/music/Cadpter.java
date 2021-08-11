package com.example.music;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Cadpter extends BaseAdapter {
    Context context;
    ArrayList<music> music;
    LayoutInflater inflater;


    public Cadpter(Context c, ArrayList<music> music) {
        this.context = c;
        this.music = music;
        this.inflater = LayoutInflater.from(c);
    }

    @Override
    public int getCount() {
        return music.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.activity_music_item, null);
        TextView name = convertView.findViewById(R.id.name);
        ImageView image = convertView.findViewById(R.id.image);
        Button b = convertView.findViewById(R.id.lunchmusic);
        Log.d("adpter", String.valueOf(music.size()));
        name.setText(music.get(position).name + " " + music.get(position).time);
        image.setImageResource(music.get(position).image);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, info.class);
                Bundle bundle = new Bundle();
                bundle.putInt("image", music.get(position).image);
                bundle.putString("name", music.get(position).name);
                bundle.putString("time", music.get(position).time);
                intent.putExtras(bundle);
                Log.d("adpter", "in the click");
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);

            }
        });

        return convertView;
    }
}
