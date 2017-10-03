package com.example.hannes.app1_haal0057;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Hannes on 2017-10-02.
 */

public class Help extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);


        TextView tv = (TextView) findViewById(R.id.txt);
        tv.setText("To play, click play and answer 5 math questions." +
                " You get 1 point for right answer and -1 for wrong answer." +
                " Under scores you can see your personal score." +
                " The version used is: " + android.os.Build.VERSION.RELEASE

        );

    }
}
