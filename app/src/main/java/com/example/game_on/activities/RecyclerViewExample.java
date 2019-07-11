package com.example.game_on.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.game_on.R;
import com.example.game_on.adapters.CustomersAdapters;
import com.example.game_on.modal.Customers;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewExample extends AppCompatActivity {
    private CustomersAdapters customersAdapters;
    List<Customers> customerslist=new ArrayList<>();
    CustomersAdapters customersAddapters;
    RecyclerView recyclerView;
//    private EditText Nameenter;
//    private EditText Identer;
//    private EditText Usernameenter;
//    private EditText Passwordenter;
//    private Button Submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
//        Nameenter= findViewById(R.id.nameenter);
//        Identer =findViewById(R.id.idnumber);
//        Usernameenter = findViewById(R.id.username);
//        Passwordenter =findViewById(R.id.password);
//        Submit= findViewById(R.id.submit);
        recyclerView= findViewById(R.id.recycle);
        //for static list
        customerslist.add(new Customers("Luja","KCE074BCT022","ShakyaNinja","*********") );
        customerslist.add(new Customers("Niranjan","KCE074BCT022","","") );
        customerslist.add(new Customers("Bikesh","KCE074BCT022","","") );
        customerslist.add(new Customers("Sunil","KCE074BCT022","","") );
        customerslist.add(new Customers("Sheldon","KCE074BCT022","","") );
                    customersAdapters = new CustomersAdapters(customerslist);
                    RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(RecyclerViewExample.this);
                    recyclerView.setLayoutManager(layoutManager);
                    recyclerView.setAdapter(customersAdapters);
                    customersAdapters.notifyDataSetChanged();
        //        Submit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(Nameenter.getText().toString().isEmpty()){
//                    Toast.makeText(RecyclerViewExample.this, "Enter your name first", Toast.LENGTH_SHORT).show();
//                }
//                else if(Identer.getText().toString().isEmpty()){
//                    Toast.makeText(RecyclerViewExample.this, "Enter your roll no.", Toast.LENGTH_SHORT).show();
//                }
//                else{
//                    customerslist.add(new Customers(Nameenter.getText().toString(),Identer.getText().toString(),Usernameenter.getText().toString(),Passwordenter.getText().toString()));
//                    customersAdapters = new CustomersAdapters(customerslist);
//                    RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(RecyclerViewExample.this);
//                    recyclerView.setLayoutManager(layoutManager);
//                    recyclerView.setAdapter(customersAdapters);
//                    customersAdapters.notifyDataSetChanged();
//                    Nameenter.setText(null);
//                    Identer.setText(null);
//                    Usernameenter.setText(null);
//                    Passwordenter.setText(null);
//                }
//            }
//        });
    }
    public class Adapter<T> {


    }
}
