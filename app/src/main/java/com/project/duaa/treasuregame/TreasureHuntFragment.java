package com.project.duaa.treasuregame;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class TreasureHuntFragment extends Fragment{

    private static final int[]a={2};
    private static final int[]y={1};
    private static final int[]z={3};


    public TreasureHuntFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View v1 = inflater.inflate(R.layout.fragment_treasure_hunt, container, false);

        Spinner spinner = (Spinner) v1.findViewById(R.id.spinner);
        //Button btn =(Button) v.findViewById(R.id.button);

        Button b = (Button) v1.findViewById(R.id.button);
    //    b.setOnClickListener(this);
    //    b.setOnClickListener(new v.OnClickListener());


        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

               String text=((Spinner)v1.findViewById(R.id.spinner)).getSelectedItem().toString();
               Toast.makeText(getActivity(), "Treasure  Found "+text, Toast.LENGTH_LONG ).show();

               if( text.equals("David")){
                   Treasure treasures=Treasure.treasures[0];
                   a[0]=a[0]+1;
                   if(a[0]==6)
                   {
                       a[0]=0;
                   }
                   Product[] productArray1={Product.products[0],Product.products[1],Product.products[a[0]]};
                   treasures.setProductArray1(productArray1);

                   long position = 0;
                   Intent intent = new Intent(getActivity(), TreasureGaloreAcitivity.class);
                   intent.putExtra(TreasureGaloreAcitivity.EXTRA_TREASURE_ID, position);
                   getActivity().startActivity(intent);
               }
               else if (text.equals("Phil")) {
                   Treasure treasures=Treasure.treasures[1];
                   y[0]=y[0]+2;
                   if(y[0]==4)
                   {
                       y[0]=0;
                   }
                   Product[] productArray1={Product.products[4],Product.products[3],Product.products[y[0]]};
                   treasures.setProductArray1(productArray1);

                   long position = 2;
                   Intent intent = new Intent(getActivity(), TreasureGaloreAcitivity.class);
                   intent.putExtra(TreasureGaloreAcitivity.EXTRA_TREASURE_ID, position);
                   getActivity().startActivity(intent);
               }
               else if (text.equals("Greg")) {

                   Treasure treasures=Treasure.treasures[2];
                   z[0]=z[0]+1;
                   if(z[0]==6)
                   {
                       z[0]=0;
                   }
                   Product[]productArray1={Product.products[4],Product.products[5],Product.products[z[0]]};
                   treasures.setProductArray1(productArray1);

                   long position = 1;
                   Intent intent = new Intent(getActivity(), TreasureGaloreAcitivity.class);
                   intent.putExtra(TreasureGaloreAcitivity.EXTRA_TREASURE_ID, position);
                   getActivity().startActivity(intent);
               }
            }
        });

        // ArrayAdapter<String> adapterw = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, values);
        //adapterw.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
       // spinner.setAdapter(adapterw);

        ArrayAdapter<String> adapter=new ArrayAdapter<>(
                  inflater.getContext(),
                  android.R.layout.simple_list_item_1,
                  getResources().getStringArray(R.array.beautiful));
                  adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
                  spinner.setAdapter(adapter);


        return v1;

    }




}
