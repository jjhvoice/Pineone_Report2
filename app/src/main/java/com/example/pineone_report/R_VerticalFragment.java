package com.example.pineone_report;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

public class R_VerticalFragment extends Fragment {

    ServerCommand serverCommand;
    ArrayList<GetI30List> getI30Lists;
    ArrayList<GetI30ContList> getI30ContLists;
    ArrayList<R_VerticalListViewItem> items = new ArrayList<R_VerticalListViewItem>();

    LinearLayoutManager linearLayoutManager;
    R_VerticalListViewAdapter adapter;
    RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.r_vertical_listview, container, false);
        Context context = rootView.getContext();

        linearLayoutManager = new LinearLayoutManager(context);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        adapter = new R_VerticalListViewAdapter(serverCommand, getI30Lists, getI30ContLists, items);
        recyclerView = rootView.findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);

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
                    items.add(new R_VerticalListViewItem(getI30Lists.get(i).toString()));
                }
                break;

            case SERVER_CMD_IMCS_GETI30CONTLIST:
                for(int i = 0; i < getI30ContLists.size(); i++) {
                    items.add(new R_VerticalListViewItem(getI30ContLists.get(i).toString()));
                }
                break;
        }
    }
}
