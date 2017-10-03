package com.example.hannes.app1_haal0057;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Hannes on 2017-10-02.
 */

public class Meny extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meny);

        Button btn = (Button) findViewById(R.id.play);

        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(Meny.this, Play.class);
                startActivity(intent);
            }
        });

        Button btn2 = (Button) findViewById(R.id.score);

        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(Meny.this, Score.class);
                startActivity(intent);
            }
        });

        Button btn3 = (Button) findViewById(R.id.help);

        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(Meny.this, Help.class);
                startActivity(intent);
            }
        });
    }
}
