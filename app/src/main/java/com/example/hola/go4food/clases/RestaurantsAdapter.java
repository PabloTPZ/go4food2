package com.example.hola.go4food.clases;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hola.go4food.ProductoActivity;
import com.example.hola.go4food.R;

import java.util.List;

/**
 * Created by Ivan on 2/8/2016.
 */
public class RestaurantsAdapter extends RecyclerView.Adapter<RestaurantsAdapter.RestaurantViewHolder> {
    private static List<Restaurants> items;
    private View v;

    public static class RestaurantViewHolder extends RecyclerView.ViewHolder {
        // Campos respectivos de un item

        public ImageView logo;
        public TextView nombre;
        public TextView preparacion;
        public TextView tipo;
        public TextView distancia;
        public TextView voto;
        public TextView pesos;
        public TextView bebida;


        public RestaurantViewHolder(final View v) {
            super(v);
            logo = (ImageView) v.findViewById(R.id.logo_restaurant);
            nombre = (TextView) v.findViewById(R.id.nom_restaurant);
            preparacion = (TextView) v.findViewById(R.id.preparacion_restaurant);
            tipo = (TextView) v.findViewById(R.id.apertura_restaurant);
            distancia =(TextView) v.findViewById(R.id.distancia_restaurant);
            voto =(TextView)v.findViewById(R.id.voto_restaurant);
            //pesos =(TextView)v.findViewById(R.id.pesos);
            bebida=(TextView)v.findViewById(R.id.bebida_restaurant);
            final RatingBar minimumRating = (RatingBar)v.findViewById(R.id.etrellas_restaurant);
            minimumRating.setOnTouchListener(new View.OnTouchListener()
            {
                public boolean onTouch(View view, MotionEvent event)
                {
                    float touchPositionX = event.getX();
                    float width = minimumRating.getWidth();
                    float starsf = (touchPositionX / width) * 5.0f;
                    int stars = (int)starsf + 1;
                    minimumRating.setRating(stars);
                    return true;
                }
            });
            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int pos = getAdapterPosition();
                    Restaurants restaurants = items.get(pos);

                    Context context = v.getContext();
                   Intent intent = new Intent(context, ProductoActivity.class);
                    context.startActivity(intent);
                    //Toast.makeText(v.getContext(),String.valueOf(evento.getKeyEvento()),Toast.LENGTH_LONG).show();
                    //Toast toast1 = Toast.makeText(v.getContext(),"sip", Toast.LENGTH_SHORT);
                    //toast1.show();
                }
            });
        }
    }
    public RestaurantsAdapter(List<Restaurants> items) {
        this.items = items;
    }

    @Override
    public int getItemCount() {
        return items.size();
    }


    @Override
    public RestaurantViewHolder onCreateViewHolder(final ViewGroup viewGroup, final int i) {
        v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_restaurants, viewGroup, false);
        /*v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast1 =
                        Toast.makeText(v.getContext(),String.valueOf(1), Toast.LENGTH_SHORT);

                toast1.show();
            }
        });*/
        return new RestaurantViewHolder(v);
    }

    @Override
    public void onBindViewHolder(RestaurantViewHolder viewHolder, int i) {

        viewHolder.nombre.setText(items.get(i).getNombre());
        viewHolder.preparacion.setText(items.get(i).getPreparacion());
        viewHolder.tipo.setText(items.get(i).getTipo());
        viewHolder.distancia.setText(items.get(i).getDistancia());
        viewHolder.voto.setText(String.valueOf(items.get(i).getVoto()));
       // viewHolder.pesos.setText(String.valueOf(items.get(i).getPesos()));
        viewHolder.bebida.setText(items.get(i).getBebida());
    }

}
