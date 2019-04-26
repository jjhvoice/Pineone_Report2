package com.example.pineone_report;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Set;

public class VerticalFragment extends ListFragment {

    ServerCommand serverCommand;
    ArrayList<GetI30List> getI30Lists;
    ArrayList<GetI30ContList> getI30ContLists;
    VerticalListViewAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        serverCommand = (ServerCommand)getArguments().getSerializable("ServerCommand");
        getI30Lists = getArguments().getParcelableArrayList("GetI30Lists");
        getI30ContLists = getArguments().getParcelableArrayList("GetI30ContLists");
        adapter = new VerticalListViewAdapter();
        setListAdapter(adapter);

        prepareData();

        return super.onCreateView(inflater, container, savedInstanceState);
    }

    public void prepareData() {
        switch(serverCommand) {
            case SERVER_CMD_IMCS_GETI30LIST:
                for(int i = 0; i < getI30Lists.size(); i++) {
                    adapter.addItem(new VerticalListViewItem(getI30Lists.get(i).toString()));
                }
                break;

            case SERVER_CMD_IMCS_GETI30CONTLIST:
                for(int i = 0; i < getI30ContLists.size(); i++) {
                    adapter.addItem(new VerticalListViewItem(getI30ContLists.get(i).toString()));
                }
                break;
        }
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        Intent intent;
        switch(serverCommand) {
            case SERVER_CMD_IMCS_GETI30LIST:
                intent = new Intent(getActivity(), MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP|Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("CAT_ID", getI30Lists.get(position).getId());
                startActivity(intent);
                break;

            case SERVER_CMD_IMCS_GETI30CONTLIST:
                intent = new Intent(getActivity(), ResponseListViewActivity.class);
                intent.putExtra("GetI30ContList", getI30ContLists.get(position));
                intent.putExtra("ServerCommand", serverCommand);
                startActivity(intent);
                break;
        }
    }


}
