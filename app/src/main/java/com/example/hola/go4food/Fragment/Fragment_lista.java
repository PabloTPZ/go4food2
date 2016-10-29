package com.example.hola.go4food.Fragment;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hola.go4food.R;
import com.example.hola.go4food.clases.Restaurants;
import com.example.hola.go4food.clases.RestaurantsAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_lista extends Fragment {
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;
    String nombre="Cowerk Cafe";
    String tipo="Nuevo!!";
    String bebida="Asiatica,Bebidas";
    String preparacion="Preparacion: 10min min";
    String distancia="Distancia: 12km";
    int voto=0;
    int pesos=0;
    int logo=0;
    List<Restaurants> lista = new ArrayList<>();
    View view;

    //Llenar tarjeta
    private RecyclerView recycler;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager lManager;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.recycle_view, container, false);
        lista.add(new Restaurants(nombre,distancia, preparacion,bebida, tipo ,logo,pesos,voto));
        usarRecycleView();

        return view;
    }

    public void usarRecycleView() {
        recycler = (RecyclerView) view.findViewById(R.id.my_recycler_view);
        recycler.setHasFixedSize(true);

        // Usar un administrador para LinearLayout
        lManager = new LinearLayoutManager(getActivity());
        recycler.setLayoutManager(lManager);

        // Crear un nuevo adaptador
        adapter = new RestaurantsAdapter(lista);
        recycler.setAdapter(adapter);
    }

   /* @Override
    public void onResume() {
        super.onResume();

        getView().setFocusableInTouchMode(true);
        getView().requestFocus();
        getView().setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {

                if (event.getAction() == KeyEvent.ACTION_UP && keyCode == KeyEvent.KEYCODE_BACK){
                    getActivity().setTitle(R.string.navInicio);
                    fragmentManager = getFragmentManager();
                    fragmentTransaction = fragmentManager.beginTransaction();
                    InicioFragment inicio = new InicioFragment();
                    fragmentTransaction.setCustomAnimations(R.anim.right_in, R.anim.right_out);
                    fragmentTransaction.replace(R.id.contenedor, inicio);
                    //fragmentTransaction.addToBackStack("tag");
                    fragmentTransaction.commit();
                    return true;
                }
                return false;
            }
        });
    }*/

}
