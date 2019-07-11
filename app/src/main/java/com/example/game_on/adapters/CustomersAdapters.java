package com.example.game_on.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.game_on.R;
import com.example.game_on.activities.RecyclerViewExample;
import com.example.game_on.modal.Customers;

import java.util.ArrayList;
import java.util.List;

public class CustomersAdapters extends RecyclerView.Adapter<CustomersAdapters.CustomerViewHolder>{
    List<Customers> customerslist;
    public CustomersAdapters(List<Customers> customerslist) {
        this.customerslist = customerslist;
    }
    @NonNull
    @Override
    public CustomersAdapters.CustomerViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_customerslist,viewGroup,false);
        return new CustomerViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull CustomersAdapters.CustomerViewHolder customerViewHolder, int i) {
        customerViewHolder.name.setText(customerslist.get(i).getCustomerName());
        customerViewHolder.crn.setText(customerslist.get(i).getCustomerId());
        customerViewHolder.bind(customerslist.get(i));
    }

    @Override
    public int getItemCount() {
        return customerslist.size();
    }
    public class CustomerViewHolder extends RecyclerView.ViewHolder{
        protected TextView name;
        protected TextView crn;
        public CustomerViewHolder(@NonNull final View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            crn = itemView.findViewById(R.id.crn);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(itemView.getContext(), "You clicked", Toast.LENGTH_SHORT).show();
                }
            });
        }
        public void bind(final Customers customer){
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(itemView.getContext(),customer.getCustomerName(), Toast.LENGTH_SHORT).show();
                }
            });
        }
    }

}
