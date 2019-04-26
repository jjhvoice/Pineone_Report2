package com.example.pineone_report;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class RequestRecyclerViewAdapter extends RecyclerView.Adapter<RequestRecyclerViewAdapter.Holder> {

    ArrayList<RequestRecyclerViewItem> items;
    String[] spinner_items;
    ArrayAdapter<String> arrayAdapter;
    HashMap<String, String> requestMap = new HashMap<String, String>();

    public RequestRecyclerViewAdapter(ArrayList<RequestRecyclerViewItem> items, String[] spinner_items) {
        this.items = items;
        this.spinner_items = spinner_items;
    }

    public HashMap<String, String> getRequestMap() {
        return requestMap;
    }

    public void initRequestMap() {
        requestMap = new HashMap<String, String>();
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.request_recyclerview_item, viewGroup, false);
        Holder holder = new Holder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull final Holder holder, int position) {
        if(holder.editText.getText().toString() != null) {
            holder.editText.setText("");
        }

        arrayAdapter = new ArrayAdapter<String>(holder.context, android.R.layout.simple_spinner_dropdown_item, spinner_items);
        holder.spinner.setAdapter(arrayAdapter);
        holder.editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                requestMap.put(holder.spinner.getSelectedItem().toString(), holder.editText.getText().toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        public Context context;
        public Spinner spinner;
        public EditText editText;

        public Holder(View view) {
            super(view);
            context = view.getContext();
            spinner = view.findViewById(R.id.spinner);
            editText = view.findViewById(R.id.edittext);
        }
    }
}
