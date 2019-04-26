package com.example.pineone_report;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class VerticalListViewAdapter extends BaseAdapter {

    ArrayList<VerticalListViewItem> items = new ArrayList<VerticalListViewItem>();

    public VerticalListViewAdapter() {

    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public VerticalListViewItem getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final int pos = position;
        final Context context = parent.getContext();

        if(convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.vertical_listview_item, parent, false);
        }

        TextView textView = (TextView)convertView.findViewById(R.id.textview);

        VerticalListViewItem item = items.get(pos);

        textView.setText(item.getSummary());

        return convertView;
    }

    public void addItem(VerticalListViewItem item) {
        items.add(item);
    }
}
