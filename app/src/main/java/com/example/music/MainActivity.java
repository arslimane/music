package com.example.music;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<music> music;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.list);
        music = new ArrayList<music>();
        music.add(new music("justin Bieber", R.drawable.music, "2:40"));
        music.add(new music("Niki Menage", R.drawable.music, "3:40"));
        music.add(new music("The Love of my hart", R.drawable.music, "1:40"));
        music.add(new music("Niki Menage", R.drawable.music, "3:40"));
        music.add(new music("Niki Menage", R.drawable.music, "3:40"));
        music.add(new music("Niki Menage", R.drawable.music, "3:40"));
        music.add(new music("Niki Menage", R.drawable.music, "3:40"));
        music.add(new music("Niki Menage", R.drawable.music, "3:40"));
        Log.d("main", "1: " + music.size());
        Cadpter cadpter = new Cadpter(getApplicationContext(), music);
        Log.d("main", "2");
        listView.setAdapter(cadpter);
        Log.d("main", "3");

    }
}