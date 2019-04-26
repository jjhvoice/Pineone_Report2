package com.example.pineone_report;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;

import static com.example.pineone_report.ServerCommand.SERVER_CMD_IMCS_GETI30CONTLIST;
import static com.example.pineone_report.ServerCommand.SERVER_CMD_IMCS_GETI30LIST;

public class HorizontalFragment extends Fragment {

    ServerCommand serverCommand;
    ArrayList<GetI30List> getI30Lists;
    ArrayList<GetI30ContList> getI30ContLists;
    ArrayList<HorizontalListViewItem> items = new ArrayList<HorizontalListViewItem>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.horizontal_listview, container, false);
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(R.id.horizontal_listview);
        View view = null;

        for(int i = 0; i < items.size(); i++) {
            view = (LinearLayout) inflater.inflate(R.layout.horizontal_listview_item, null);
            final int index = i;

            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent;
                    switch(serverCommand) {
                        case SERVER_CMD_IMCS_GETI30LIST:
                            intent = new Intent(getActivity(), MainActivity.class);
                            intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP|Intent.FLAG_ACTIVITY_CLEAR_TOP);
                            intent.putExtra("CAT_ID", getI30Lists.get(index).getId());
                            startActivity(intent);
                            break;

                        case SERVER_CMD_IMCS_GETI30CONTLIST:
                            intent = new Intent(getActivity(), ResponseListViewActivity.class);
                            intent.putExtra("GetI30ContList", getI30ContLists.get(index));
                            intent.putExtra("ServerCommand", serverCommand);
                            startActivity(intent);
                            break;
                    }
                }
            });

            TextView textView = view.findViewById(R.id.textview);

            textView.setText(items.get(i).getSummary());
            viewGroup.addView(view);
        }

        return rootView;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        prepareData();
    }

    public void prepareData() {

        serverCommand = (ServerCommand)getArguments().getSerializable("ServerCommand");
        getI30Lists = getArguments().getParcelableArrayList("GetI30Lists");
        getI30ContLists = getArguments().getParcelableArrayList("GetI30ContLists");

        switch(serverCommand) {
            case SERVER_CMD_IMCS_GETI30LIST:
                for(int i = 0; i < getI30Lists.size(); i++) {
                    items.add(new HorizontalListViewItem(getI30Lists.get(i).toString()));
                }
                break;

            case SERVER_CMD_IMCS_GETI30CONTLIST:
                for(int i = 0; i < getI30ContLists.size(); i++) {
                    items.add(new HorizontalListViewItem(getI30ContLists.get(i).toString()));
                }
                break;
        }
    }
}
