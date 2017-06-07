package com.miramicodigo.p8_listaspersonalizadas;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
implements AdapterView.OnItemClickListener {

    /**
     *
     * @author Gustavo Lizarraga
     * @date 05/06/2017
     *
     * */

    private ListView lvDatos;
    private Activity activity;
    private CustomAdapter adaptador;
    private ArrayList<Pokemon> datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvDatos = (ListView) findViewById(R.id.lvLista);
        activity = this;
        datos = new ArrayList<Pokemon>();

        llenarPokemones();

        adaptador = new CustomAdapter(activity, datos);
        lvDatos.setAdapter(adaptador);
        lvDatos.setOnItemClickListener(this);
    }

    public void llenarPokemones() {
        Resources resources = getResources();
        String[] arrayNombres = resources.getStringArray(R.array.nombre);
        String[] arrayTipos = resources.getStringArray(R.array.tipos);
        TypedArray arrayImgs = resources.obtainTypedArray(R.array.image);
        for(int i = 0; i < arrayNombres.length; i++) {
            Pokemon poke = new Pokemon(
                    arrayNombres[i], arrayTipos[i],
                    arrayImgs.getResourceId(i, -1)
            );
            datos.add(poke);
        }

    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Pokemon pokeTemp = datos.get(position);
        Intent intent = new Intent(
                activity,
                DetalleActivity.class
        );
        intent.putExtra("poke", pokeTemp);
        startActivity(intent);
    }














}
