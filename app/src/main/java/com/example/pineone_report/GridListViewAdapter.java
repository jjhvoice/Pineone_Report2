package com.example.pineone_report;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

import static com.example.pineone_report.ServerCommand.SERVER_CMD_IMCS_GETI30CONTLIST;
import static com.example.pineone_report.ServerCommand.SERVER_CMD_IMCS_GETI30LIST;

public class GridListViewAdapter extends BaseAdapter {

    ArrayList<GridListViewItem> items = new ArrayList<GridListViewItem>();
    ServerCommand serverCommand;
    ArrayList<GetI30List> getI30Lists;
    ArrayList<GetI30ContList> getI30ContLists;

    public GridListViewAdapter(ServerCommand serverCommand, ArrayList<GetI30List> getI30Lists, ArrayList<GetI30ContList> getI30ContLists) {
        this.serverCommand = serverCommand;
        this.getI30Lists = getI30Lists;
        this.getI30ContLists = getI30ContLists;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public GridListViewItem getItem(int position) {
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
            convertView = inflater.inflate(R.layout.grid_listview_item, parent, false);
            convertView.setFocusable(true);
            convertView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent;
                    switch(serverCommand) {
                        case SERVER_CMD_IMCS_GETI30LIST:
                            intent = new Intent(context, MainActivity.class);
                            intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP|Intent.FLAG_ACTIVITY_CLEAR_TOP);
                            intent.putExtra("CAT_ID", getI30Lists.get(pos).getId());
                            context.startActivity(intent);
                            break;

                        case SERVER_CMD_IMCS_GETI30CONTLIST:
                            intent = new Intent(context, ResponseListViewActivity.class);
                            intent.putExtra("GetI30ContList", getI30ContLists.get(pos));
                            intent.putExtra("ServerCommand", serverCommand);
                            context.startActivity(intent);
                            break;
                    }
                }
            });
        }

        TextView textView = (TextView)convertView.findViewById(R.id.textview);

        GridListViewItem item = items.get(pos);

        textView.setText(item.getSummary());

        return convertView;
    }

    public void addItem(GridListViewItem item) {
        items.add(item);
    }
}
