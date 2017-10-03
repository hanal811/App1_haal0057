package com.example.hannes.app1_haal0057;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

import static com.example.hannes.app1_haal0057.MainActivity.total;

/**
 * Created by Hannes on 2017-10-02.
 */

public class Play extends AppCompatActivity {
    int res;
    int times;
    EditText etxt;
    TextView t1;
    TextView t2;
    TextView t3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        t1= (TextView) findViewById(R.id.txt1);
        t2= (TextView) findViewById(R.id.txt2);
        t3= (TextView) findViewById(R.id.txt3);
        Button btn= (Button) findViewById(R.id.button2);
        etxt= (EditText) findViewById(R.id.editText);
        etxt.setInputType(InputType.TYPE_CLASS_NUMBER |
                InputType.TYPE_NUMBER_FLAG_DECIMAL |
                InputType.TYPE_NUMBER_FLAG_SIGNED);
        game();
        times=0;

        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                calc();
                game();
            }
        });
    }

    public void calc() {
    if(Integer.parseInt(etxt.getText().toString())==res){
            total++;
        } else total--;
        times++;
        etxt.setText("");
    }

    public void game() {
       if(times < 5) {
           int n1 = 0;
           int n2 = 0;
           int n3 = 0;
           int res = 0;
           int max = 100;
           int min = 1;
           Random rand = new Random();
           n1 = rand.nextInt((max - min) + 1) + min;
           n2 = rand.nextInt((max - min) + 1) + min;
           n3 = rand.nextInt((max - min) + 1) + min;
           t1.setText("" + n1);
           t3.setText("" + n2);
           if (n3 < 33) {
               t2.setText("" + '+');
               res = n1 + n2;
           } else if (n3 > 66) {
               t2.setText("" + '*');
               res = n1 * n2;
           } else {
               t2.setText("" + '-');
               res = n1 - n2;
           }

           this.res = res;
       }
       else{
           Intent intent = new Intent(Play.this, Score.class);
           startActivity(intent);
       }
    }
}
