package com.example.pineone_report;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class R_VerticalListViewAdapter extends RecyclerView.Adapter<R_VerticalListViewAdapter.Holder> {

    ServerCommand serverCommand;
    ArrayList<GetI30List> getI30Lists;
    ArrayList<GetI30ContList> getI30ContLists;
    ArrayList<R_VerticalListViewItem> items;

    public R_VerticalListViewAdapter(ServerCommand serverCommand, ArrayList<GetI30List> getI30Lists, ArrayList<GetI30ContList> getI30ContLists, ArrayList<R_VerticalListViewItem> items) {
        this.serverCommand = serverCommand;
        this.getI30Lists = getI30Lists;
        this.getI30ContLists = getI30ContLists;
        this.items = items;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull final ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.r_vertical_listview_item, viewGroup, false);
        view.setFocusable(true);
        final Holder holder = new Holder(view);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                switch(serverCommand) {
                    case SERVER_CMD_IMCS_GETI30LIST:
                        intent = new Intent(viewGroup.getContext(), MainActivity.class);
                        intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP|Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        intent.putExtra("CAT_ID", getI30Lists.get(holder.getAdapterPosition()).getId());
                        viewGroup.getContext().startActivity(intent);
                        break;

                    case SERVER_CMD_IMCS_GETI30CONTLIST:
                        intent = new Intent(viewGroup.getContext(), ResponseListViewActivity.class);
                        intent.putExtra("GetI30ContList", getI30ContLists.get(holder.getAdapterPosition()));
                        intent.putExtra("ServerCommand", serverCommand);
                        viewGroup.getContext().startActivity(intent);
                        break;
                }
            }
        });

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int i) {
        holder.textView.setText(items.get(i).getSummary());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        public TextView textView;

        public Holder(View view) {
            super(view);
            textView = view.findViewById(R.id.textview);
        }
    }
}
