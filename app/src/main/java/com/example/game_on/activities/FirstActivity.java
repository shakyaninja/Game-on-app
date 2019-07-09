package com.example.game_on.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.game_on.R;
import com.example.game_on.modal.Customers;

import static android.net.Uri.parse;

public class FirstActivity extends AppCompatActivity {
    private Button Loginbtn;
    private Button Openbtn;
    private EditText Name;
    private EditText Customerid;
    private EditText Username;
    private EditText Password;
    private TextView Text1;
    private TextView Text2;
    private TextView Text3;
    private TextView Text4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
//        Toolbar toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//        FloatingActionButton fab = findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
//        getWindow().setFlags(WindowManager.LayoutParams);
        Name = findViewById(R.id.nameid);
        Customerid = findViewById(R.id.customerid);
        Username = findViewById(R.id.username);
        Password = findViewById(R.id.password);
        Text1 = findViewById(R.id.text1);
        Text2 = findViewById(R.id.text2);
        Text3 = findViewById(R.id.text3);
        Text4 = findViewById(R.id.text4);
        Loginbtn = findViewById(R.id.loginbtn);
        Openbtn = findViewById(R.id.openbtn);
        final Customers customers = new Customers();
        Loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Text1.setText(Name.getText());
                Text2.setText(Password.getText());
                Text3.setText(Username.getText());
                Text4.setText(Customerid.getText());
                customers.setCustomerName(Name.getText().toString());
                customers.setCustomerId(Customerid.getText().toString());
                customers.setCustomerUsername(Username.getText().toString());
                customers.setCustomerPassword(Password.getText().toString());
                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
//                String name= Name.getText();
                intent.putExtra("NAME", Name.getText().toString());
                intent.putExtra("CUSTOMER", customers);
                startActivity(intent);
//                setContentView(R.layout.welcome_page);
            }
        });
        Openbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(parse(url));
                startActivity(i);
            }
        });
    }
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    private boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_tools) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
        }
}

