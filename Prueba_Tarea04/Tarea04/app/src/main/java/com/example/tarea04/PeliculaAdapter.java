package com.example.tarea04;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class PeliculaAdapter extends ArrayAdapter<Pelicula> {

    private ArrayList<Pelicula> peliculasLista;
    private Context context;
    private int viewRes;
    private Resources res;

    public PeliculaAdapter(Context context, int textViewResourceId,
                           ArrayList<Pelicula> peliculas) {
        super(context, textViewResourceId, peliculas);
        this.peliculasLista = peliculas;
        this.context = context;
        this.viewRes = textViewResourceId;
        this.res = context.getResources();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(viewRes, parent, false);
        }
        final Pelicula pelicula = peliculasLista.get(position);
        if (pelicula != null) {
            final TextView title = (TextView) view.findViewById(R.id.title);
            final String titulo = String.format(res.getString(R.string.titulo_pelicula), pelicula.getName());
            title.setText(titulo);
        }
        return view;
    }
}
