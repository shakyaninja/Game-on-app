package com.example.game_on.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.game_on.R;

public class SecondActivity extends AppCompatActivity {
    private Button Btn;
    private TextView Text5;
    private TextView Text6;
    private TextView Text7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Text5 = findViewById(R.id.text5);
        Text6 = findViewById(R.id.text6);
        Text7 = findViewById(R.id.text7);
        String gettext= getIntent().getStringExtra("NAME");
        Text5.setText(gettext);
        Btn = findViewById(R.id.click);
        Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                setContentView(R.layout.content_main);
                Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(intent);

            }
        });
    }
}
