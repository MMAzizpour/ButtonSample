package com.example.button;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
//private Button btn;
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"hi,Clicked!",Toast.LENGTH_LONG).show();

            }
        });
        btn.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Toast.makeText(MainActivity.this,"hi,long Clicked!",Toast.LENGTH_LONG).show();
                return false;
            }
        });
        //btn = findViewById(R.id.button);
        //TextView txt = new TextView(findViewById(R.id.textView2));
        TextView txt1 = (TextView) findViewById(R.id.textView2);
       /* btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText("Clicked!");
            }
        });
        btn.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                txt1.setText("on Long Clicked!");
                return false;
            }

        });*/
    }
}