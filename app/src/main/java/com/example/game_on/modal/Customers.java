package com.example.game_on.modal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Customers extends AppCompatActivity {
    private String customerName;
    private String customerId;
    private String customerUsername;
    private String customerPassword;

    public Customers() {
//        empty Constructor
    }

    public Customers(String customerName, String customerId, String customerUsername, String customerPassword) {
        this.customerName = customerName;
        this.customerId = customerId;
        this.customerUsername = customerUsername;
        this.customerPassword = customerPassword;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerUsername() {
        return customerUsername;
    }

    public void setCustomerUsername(String customerUsername) {
        this.customerUsername = customerUsername;
    }

    public String getCustomerPassword() {
        return customerPassword;
    }

    public void setCustomerPassword(String customerPassword) {
        this.customerPassword = customerPassword;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customers);
    }
}
