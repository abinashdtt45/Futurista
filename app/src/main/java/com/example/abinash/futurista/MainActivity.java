package com.example.abinash.futurista;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ask = findViewById(R.id.ask);
        final ImageView image = findViewById(R.id.emotions);

        final int[] emotions ={R.drawable.angry,R.drawable.crying,R.drawable.hot,R.drawable.laugh,
                R.drawable.love,R.drawable.scared,R.drawable.smile,R.drawable.sobbing,R.drawable.surprise,
                R.drawable.tear,R.drawable.teeth};

        ask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random number=new Random();
                int finalnum= number.nextInt(11);

                image.setImageResource(emotions[finalnum]);
            }
        });
    }
}
