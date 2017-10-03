package com.example.hannes.app1_haal0057;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.hannes.app1_haal0057.MainActivity.total;

/**
 * Created by Hannes on 2017-10-03.
 */

public class Score extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_score);

            TextView tv = (TextView) findViewById(R.id.txt);
            tv.setText("Your score this session is: " + total);


            Button btn = (Button) findViewById(R.id.button);

            btn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent intent = new Intent(Score.this, Meny.class);
                    startActivity(intent);
                }
            });
        }
}
