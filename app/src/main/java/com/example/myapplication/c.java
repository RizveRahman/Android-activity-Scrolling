package com.example.myapplication;

import static com.example.myapplication.R.id.button1;
import static com.example.myapplication.R.id.button2;
import static com.example.myapplication.R.id.button3;
import static com.example.myapplication.R.id.button4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class c extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);

        Button btn1 = findViewById(button1);
        Button btn2 = findViewById(button2);
        Button btn3 = findViewById(button3);
        Button btn4 = findViewById(button4);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case button1:
                Toast.makeText(this, "Activity A", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(c.this, a.class);
                startActivity(i);
            case button2:
                Toast.makeText(this, "Activity B", Toast.LENGTH_SHORT).show();
                Intent j = new Intent(c.this, b.class);
                startActivity(j);

            case button3:
                Toast.makeText(this, "Activity C", Toast.LENGTH_SHORT).show();
                Intent k = new Intent(c.this, c.class);
                startActivity(k);

            case button4:
                Toast.makeText(this, "Activity D", Toast.LENGTH_SHORT).show();
                Intent l = new Intent(c.this, d.class);
                startActivity(l);
        }
    }
}
