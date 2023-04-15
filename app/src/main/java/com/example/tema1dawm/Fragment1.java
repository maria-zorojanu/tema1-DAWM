package com.example.tema1dawm;

import static java.util.Arrays.asList;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragment1#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment1 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    ListView animalsListView;
    static ArrayAdapter<String> arrayAdapter;
    SharedPreferences sharedPreferences;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Fragment1() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment1.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment1 newInstance(String param1, String param2) {
        Fragment1 fragment = new Fragment1();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //animalsListView = getView().findViewById(R.id.animals_list_view);
        /*Animal a1 = new Animal("Pisica", "Europa");
        Animal a2 = new Animal("Pisica", "Asia");
        Animal a3 = new Animal("Pisica", "America de Nord");
        Animal a4 = new Animal("Pisica", "America de Sud");
        Animal a5 = new Animal("Pisica alba", "Australia");
        Animal a6 = new Animal("Pisica neagra", "Africa");
        Animal a7 = new Animal("Pisica portocalie", "Europa");
        Animal a8 = new Animal("Pisica cu dungi", "America de Nord");
        Animal a9 = new Animal("Pisica cu alb si negru", "Asia");
        Animal a10 = new Animal("Pisica cu alb si gri", "Australia");
        Animal a11 = new Animal("Pisica Persana", "Europa");
        Animal a12 = new Animal("Pisica British Shorthair", "Asia");
        Animal a13 = new Animal("Pisica Calico", "America de Nord");
        Animal a14 = new Animal("Pisica British medium hair", "Europa");
        Animal a15 = new Animal("Pisica British Long hair", "America de Nord");
        Animal a16 = new Animal("Pisica Main Coon", "America de Sud");
        Animal a17 = new Animal("Pisica Ragdoll", "America de Nord");
        Animal a18 = new Animal("Pisica Birmaneza", "Australia");
        Animal a19 = new Animal("Pisica Gri", "America de Sud");
        Animal a20 = new Animal("Pisica Maro", "America de Nord");
        Animal a21 = new Animal("Pisica Norvegiana de padure", "Australia");
        Animal a22 = new Animal("Pui de Pisica ", "Asia");
        Animal a23 = new Animal("Pui de Pisica British short hair", "Europa");
        Animal a24 = new Animal("Pui de Pisica Persana", "Africa");
        Animal a25 = new Animal("Pisica cu portocaliu si alb", "Europa");
        Animal a26 = new Animal("Pisica monocroma", "Europa");
        Animal a27 = new Animal("Pisica Sphinx", "Europa");
        Animal a28 = new Animal("Pisica Bengaleza", "Asia");
        Animal a29 = new Animal("Pisica Shorthair Portocalie", "Europa");
        Animal a30 = new Animal("Pisica British Shorthair Gri Deschis", "Europa");
        Animal a31 = new Animal("Pisica British Shorthair Gri Inchis", "Europa");
        Animal a32 = new Animal("Pisica British Shorthair Neagra", "Africa");
        Animal a33 = new Animal("Pisica cu ochisori galbeni", "Asia");
        Animal a34 = new Animal("Pisica cu ochisori portocalii", "Europa");
        Animal a35 = new Animal("Pisica cu ochisori verzi", "Europa");
        Animal a36 = new Animal("Pisica cu ochisori albastri", "America de Nord");
        Animal a37 = new Animal("Pisica adrabila", "Asia");
        Animal a38 = new Animal("Pisica cu negru si gri", "Europa");
        Animal a39 = new Animal("Pisica siberiana", "America de Nord");
        Animal a40 = new Animal("Pisica Tortoise shell", "Africa");
        Animal a41 = new Animal("Motan", "Europa");
        Animal a42 = new Animal("Motan alb", "America de Sud");
        Animal a43 = new Animal("Motan negru", "Asia");
        Animal a44 = new Animal("Motan gri", "Europa");
        Animal a45 = new Animal("Motan portocaliu", "America de Nord");
        Animal a46 = new Animal("Motan cu alb si negru", "Africa");
        Animal a47 = new Animal("Motan alb cu gri", "Africa");
        Animal a48 = new Animal("Motan portocaliu cu dungi", "Europa");
        Animal a49 = new Animal("Motan cu pete", "America de Nord");
        Animal a50 = new Animal("Motanel", "America de Sud");

        ArrayList<Animal> animals = new ArrayList<Animal> (asList(
                a1, a2, a3, a4, a5, a6, a7, a8, a9, a10,
                a11, a12, a13, a14, a15, a16, a17, a18, a19, a20,
                a21, a22, a23, a24, a25, a26, a27, a28, a29, a30,
                a31, a32, a33, a34, a35, a36, a37, a38, a39, a40,
                a41, a42, a43, a44, a45, a46, a47, a48, a49,a50)
        );

        ArrayList <String> animalsData = new ArrayList<String>();
        for(int index = 0; index< animals.size(); index++)
        {
            animalsData.add(animals.get(index).displayAnimal());
        }
        arrayAdapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1, animalsData);
        animalsListView.setAdapter(arrayAdapter);

         */
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_1, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        animalsListView = (ListView)view.findViewById(R.id.animals_list_view);

        Animal a1 = new Animal("Pisica", "Europa");
        Animal a2 = new Animal("Pisica", "Asia");
        Animal a3 = new Animal("Pisica", "America de Nord");
        Animal a4 = new Animal("Pisica", "America de Sud");
        Animal a5 = new Animal("Pisica alba", "Australia");
        Animal a6 = new Animal("Pisica neagra", "Africa");
        Animal a7 = new Animal("Pisica portocalie", "Europa");
        Animal a8 = new Animal("Pisica cu dungi", "America de Nord");
        Animal a9 = new Animal("Pisica cu alb si negru", "Asia");
        Animal a10 = new Animal("Pisica cu alb si gri", "Australia");
        Animal a11 = new Animal("Pisica Persana", "Europa");
        Animal a12 = new Animal("Pisica British Shorthair", "Asia");
        Animal a13 = new Animal("Pisica Calico", "America de Nord");
        Animal a14 = new Animal("Pisica British medium hair", "Europa");
        Animal a15 = new Animal("Pisica British Long hair", "America de Nord");
        Animal a16 = new Animal("Pisica Main Coon", "America de Sud");
        Animal a17 = new Animal("Pisica Ragdoll", "America de Nord");
        Animal a18 = new Animal("Pisica Birmaneza", "Australia");
        Animal a19 = new Animal("Pisica Gri", "America de Sud");
        Animal a20 = new Animal("Pisica Maro", "America de Nord");
        Animal a21 = new Animal("Pisica Norvegiana de padure", "Australia");
        Animal a22 = new Animal("Pui de Pisica ", "Asia");
        Animal a23 = new Animal("Pui de Pisica British short hair", "Europa");
        Animal a24 = new Animal("Pui de Pisica Persana", "Africa");
        Animal a25 = new Animal("Pisica cu portocaliu si alb", "Europa");
        Animal a26 = new Animal("Pisica monocroma", "Europa");
        Animal a27 = new Animal("Pisica Sphinx", "Europa");
        Animal a28 = new Animal("Pisica Bengaleza", "Asia");
        Animal a29 = new Animal("Pisica Shorthair Portocalie", "Europa");
        Animal a30 = new Animal("Pisica British Shorthair Gri Deschis", "Europa");
        Animal a31 = new Animal("Pisica British Shorthair Gri Inchis", "Europa");
        Animal a32 = new Animal("Pisica British Shorthair Neagra", "Africa");
        Animal a33 = new Animal("Pisica cu ochisori galbeni", "Asia");
        Animal a34 = new Animal("Pisica cu ochisori portocalii", "Europa");
        Animal a35 = new Animal("Pisica cu ochisori verzi", "Europa");
        Animal a36 = new Animal("Pisica cu ochisori albastri", "America de Nord");
        Animal a37 = new Animal("Pisica adrabila", "Asia");
        Animal a38 = new Animal("Pisica cu negru si gri", "Europa");
        Animal a39 = new Animal("Pisica siberiana", "America de Nord");
        Animal a40 = new Animal("Pisica Tortoise shell", "Africa");
        Animal a41 = new Animal("Motan", "Europa");
        Animal a42 = new Animal("Motan alb", "America de Sud");
        Animal a43 = new Animal("Motan negru", "Asia");
        Animal a44 = new Animal("Motan gri", "Europa");
        Animal a45 = new Animal("Motan portocaliu", "America de Nord");
        Animal a46 = new Animal("Motan cu alb si negru", "Africa");
        Animal a47 = new Animal("Motan alb cu gri", "Africa");
        Animal a48 = new Animal("Motan portocaliu cu dungi", "Europa");
        Animal a49 = new Animal("Motan cu pete", "America de Nord");
        Animal a50 = new Animal("Motanel", "America de Sud");

        ArrayList<Animal> animals = new ArrayList<Animal> (asList(
                a1, a2, a3, a4, a5, a6, a7, a8, a9, a10,
                a11, a12, a13, a14, a15, a16, a17, a18, a19, a20,
                a21, a22, a23, a24, a25, a26, a27, a28, a29, a30,
                a31, a32, a33, a34, a35, a36, a37, a38, a39, a40,
                a41, a42, a43, a44, a45, a46, a47, a48, a49,a50)
        );

        ArrayList <String> animalsData = new ArrayList<String>();
        for(int index = 0; index< animals.size(); index++)
        {
            animalsData.add(animals.get(index).displayAnimal());
        }
        arrayAdapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1, animalsData);
        animalsListView.setAdapter(arrayAdapter);

        animalsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                MainActivity mainActivity =(MainActivity)getActivity();
                sharedPreferences = mainActivity.getApplicationContext().getSharedPreferences("com.example.tema1dawm", Context.MODE_PRIVATE);
                sharedPreferences.edit().putString("animal", animals.get(i).getName()).apply();
                sharedPreferences.edit().putString("continent", animals.get(i).getContinent()).apply();
                replaceFragment(new Fragment2());
            }
        });
    }

    private void replaceFragment(Fragment fragment)
    {
        FragmentManager fragmentManager = getFragmentManager();//getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.replace(R.id.frameLayout, fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
        Log.i("change", "ok");
    }
}