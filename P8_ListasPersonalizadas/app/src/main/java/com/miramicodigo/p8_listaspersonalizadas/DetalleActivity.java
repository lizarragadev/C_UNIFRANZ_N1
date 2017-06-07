package com.miramicodigo.p8_listaspersonalizadas;

import android.graphics.Typeface;
import android.support.constraint.solver.SolverVariable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Type;

public class DetalleActivity extends AppCompatActivity {
    /**
     *
     * @author Gustavo Lizarraga
     * @date 05/06/2017
     *
     * */

    private ImageView ivImagen;
    private TextView tvNombre;
    private TextView tvHAbilidades;
    private Typeface typeface_bold;
    private Typeface typeface_thing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        ivImagen = (ImageView) findViewById(R.id.ivDetalleImagen);
        tvNombre = (TextView) findViewById(R.id.tvDetalleNombre);
        tvHAbilidades = (TextView) findViewById(R.id.tvDetalleHabilidades);

        typeface_bold = Typeface.createFromAsset(
                getAssets(), "fonts/roboto_black.ttf");
        typeface_thing = Typeface.createFromAsset(
                getAssets(), "fonts/roboto_thin.ttf");

        tvNombre.setTypeface(typeface_bold);
        tvHAbilidades.setTypeface(typeface_thing);

        Pokemon pokemon = (Pokemon) getIntent().getSerializableExtra("poke");
        tvNombre.setText(pokemon.getNombre());
        tvHAbilidades.setText(pokemon.getTipo());
        ivImagen.setImageResource(pokemon.getImagen());

    }









}
