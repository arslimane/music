package com.example.music;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.util.Log;

public class info extends AppCompatActivity {
  Bundle bundle;
  TextView t;
  ImageView i;
  ImageView play;
  ImageView back;
  ImageView next;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        Log.d("info","you are in");
        bundle=getIntent().getExtras();
        int image=bundle.getInt("image");
        String time=bundle.getString("time");
        String name=bundle.getString("name");
        play=findViewById(R.id.play_info);
        back=findViewById(R.id.back_info);
        next=findViewById(R.id.next_info);
        t=findViewById(R.id.name_info);
        i=findViewById(R.id.image_info);
        t.setText(name+" : "+time);
        i.setImageResource(image);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast=Toast.makeText(getBaseContext(),"you are playing music",Toast.LENGTH_LONG);
                toast.show();

            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast=Toast.makeText(getBaseContext(),"you are playing the next music",Toast.LENGTH_LONG);
                toast.show();
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast=Toast.makeText(getBaseContext(),"you are playing the previous music",Toast.LENGTH_LONG);
                toast.show();
            }
        });


    }
}