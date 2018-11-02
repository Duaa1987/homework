package com.project.duaa.treasuregame;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;


/**
 * A simple {@link Fragment} subclass.
 */
public class BeautifulFragment extends Fragment {


    public BeautifulFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        RecyclerView beautifulRecycler = (RecyclerView)inflater.inflate(
                R.layout.fragment_beautiful, container, false);

        String[] beautifulNames = new String[Treasure.treasures.length];

        for (int i = 0; i < beautifulNames.length; i++) {
            beautifulNames[i] = Treasure.treasures[i].getName();
        }

        int[] beautifulImages = new int[Treasure.treasures.length];

        for (int i = 0; i < beautifulImages.length; i++) {
            beautifulImages[i] = Treasure.treasures[i].getImageResourceId();
        }

        String[] beautifullevel = new String[Treasure.treasures.length];

        for (int i = 0; i < beautifullevel.length; i++) {
            beautifullevel[i] = Treasure.treasures[i].getLevel();
        }

        String[] beautifulhealth = new String[Treasure.treasures.length];

        for (int i = 0; i < beautifullevel.length; i++) {
            beautifulhealth[i] = Treasure.treasures[i].getHealth();
        }


        CaptionedImageAdapter adapter = new CaptionedImageAdapter(beautifulNames, beautifulImages,beautifullevel,beautifulhealth);
        beautifulRecycler.setAdapter(adapter);
       // GridLayoutManager layoutManager = new GridLayoutManager(getActivity(), 2);
       // beautifulRecycler.setLayoutManager(layoutManager);

        LinearLayoutManager layoutManager=new LinearLayoutManager(getActivity());
        beautifulRecycler.setLayoutManager(layoutManager);


        adapter.setListener(new CaptionedImageAdapter.Listener() {
            public void onClick(int position1) {
                Intent intent = new Intent(getActivity(), TreasureGaloreAcitivity.class);
                long position = (long) position1;
                intent.putExtra(TreasureGaloreAcitivity.EXTRA_TREASURE_ID, position);
                getActivity().startActivity(intent);
            }
        });

        return beautifulRecycler;
    }
       // ArrayAdapter<String> adapter=new ArrayAdapter<>(
               // inflater.getContext(),
               // android.R.layout.simple_list_item_1,
               // getResources().getStringArray(R.array.beautiful));
       // this.setListAdapter(adapter);


}
