package com.example.pineone_report;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;

public class ResponseListViewAdapter extends RecyclerView.Adapter<ResponseListViewAdapter.Holder> {

    ArrayList<ResponseListViewItem> items;

    public ResponseListViewAdapter(ArrayList<ResponseListViewItem> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.response_list_view_item, viewGroup, false);
        Holder holder = new Holder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int i) {
        holder.textView1.setText(items.get(i).getParameter());
        holder.textView2.setText(items.get(i).getValue());
        holder.textView3.setText(items.get(i).getRemark());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        public TextView textView1;
        public TextView textView2;
        public TextView textView3;

        public Holder(View view) {
            super(view);
            textView1 = view.findViewById(R.id.parameter);
            textView2 = view.findViewById(R.id.value);
            textView3 = view.findViewById(R.id.remark);
        }
    }
}
