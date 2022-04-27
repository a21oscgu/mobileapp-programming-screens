package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String name = "";

        Intent intent = getIntent();
        if (intent !=null){
            String temp = intent.getStringExtra("name");
            if (temp != null){
                name = temp;
            }
        }

        TextView text = findViewById(R.id.maintext);
        text.setText(name);

        Button close = findViewById(R.id.close);
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("MAINYTA","Activity ends");

                finish();
            }
        });
    }
}
