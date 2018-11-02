package com.project.duaa.treasuregame;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class NormalFragment extends ListFragment {

  interface Listener{void itemClicked(long id); }


    public NormalFragment() {
        // Required empty public constructor
    }

     private Listener listener;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ArrayAdapter<String> adapters=new ArrayAdapter<>(
                inflater.getContext(),
                android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.normal));
        this.setListAdapter(adapters);
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public  void onAttach(Context context)
    {
        super.onAttach(context);
        this.listener=(Listener)context;
    }

    @Override
    public void onListItemClick(ListView listView , View itemview,int position,long id)
    {
        if(listener !=null)
        {
            listener.itemClicked(id);
        }
    }


}
