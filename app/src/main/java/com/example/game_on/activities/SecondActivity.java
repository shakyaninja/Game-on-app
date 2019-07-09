package com.example.game_on.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.game_on.R;
import com.example.game_on.modal.Customers;

import java.io.Serializable;

public class SecondActivity extends AppCompatActivity {
    private Button Btn;
    private TextView Text5;
    private TextView Text6;
    private TextView Text7;
    private Customers customer;
    private EditText Change;
    private TextView Text9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Change=findViewById(R.id.change);
        Text5 = findViewById(R.id.text5);
        Text6 = findViewById(R.id.text6);
        Text7 = findViewById(R.id.text7);
        Text9 = findViewById(R.id.text9);
        String gettext= getIntent().getStringExtra("NAME");
//        getting the objects data and setting into the required textviews
        customer= (Customers) getIntent().getSerializableExtra("CUSTOMER");
        Text5.setText(customer.getCustomerName());
        Text6.setText(customer.getCustomerId());
        Text7.setText(customer.getCustomerUsername());
        Btn = findViewById(R.id.click);
        Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                setContentView(R.layout.content_main);
                Intent intent = new Intent(SecondActivity.this, FirstActivity.class);
                startActivity(intent);
            }
        });
        Change.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Text9.setText(Change.getText().toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}
