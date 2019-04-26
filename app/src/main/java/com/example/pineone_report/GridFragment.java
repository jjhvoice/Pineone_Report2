package com.example.pineone_report;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import java.util.ArrayList;

import static com.example.pineone_report.ServerCommand.SERVER_CMD_IMCS_GETI30CONTLIST;
import static com.example.pineone_report.ServerCommand.SERVER_CMD_IMCS_GETI30LIST;

public class GridFragment extends Fragment {

    ServerCommand serverCommand;
    ArrayList<GetI30List> getI30Lists;
    ArrayList<GetI30ContList> getI30ContLists;
    GridListViewAdapter adapter;
    GridView gridView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        serverCommand = (ServerCommand)getArguments().getSerializable("ServerCommand");
        getI30Lists = getArguments().getParcelableArrayList("GetI30Lists");
        getI30ContLists = getArguments().getParcelableArrayList("GetI30ContLists");
        View view = inflater.inflate(R.layout.grid_listview, container, false);

        adapter = new GridListViewAdapter(serverCommand, getI30Lists, getI30ContLists);
        gridView = view.findViewById(R.id.gridview);
        gridView.setAdapter(adapter);

        prepareData();

        return view;
    }

    public void prepareData() {
        switch(serverCommand) {
            case SERVER_CMD_IMCS_GETI30LIST:
                for(int i = 0; i < getI30Lists.size(); i++) {
                    adapter.addItem(new GridListViewItem(getI30Lists.get(i).toString()));
                }
                break;

            case SERVER_CMD_IMCS_GETI30CONTLIST:
                for(int i = 0; i < getI30ContLists.size(); i++) {
                    adapter.addItem(new GridListViewItem(getI30ContLists.get(i).toString()));
                }
                break;
        }
    }
}
