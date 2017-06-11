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

    //Imagen de los items de la lista
    private ImageView ivImagen;
    //Titulo del item
    private TextView tvNombre;
    //Subtitulo del item
    private TextView tvHAbilidades;
    //Dos tipos de fuentes distintas
    private Typeface typeface_bold;
    private Typeface typeface_thing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        //Llamada al disenio de las vistas
        ivImagen = (ImageView) findViewById(R.id.ivDetalleImagen);
        tvNombre = (TextView) findViewById(R.id.tvDetalleNombre);
        tvHAbilidades = (TextView) findViewById(R.id.tvDetalleHabilidades);

        //Carga de los archivos de tipo fuente
        typeface_bold = Typeface.createFromAsset(
                getAssets(), "fonts/roboto_black.ttf");
        typeface_thing = Typeface.createFromAsset(
                getAssets(), "fonts/roboto_thin.ttf");

        //Asignamos los tipos de fuente
        tvNombre.setTypeface(typeface_bold);
        tvHAbilidades.setTypeface(typeface_thing);

        //Recuperamos el objeto serializado Pokemon y seteamos a la vista
        Pokemon pokemon = (Pokemon) getIntent().getSerializableExtra("poke");
        tvNombre.setText(pokemon.getNombre());
        tvHAbilidades.setText(pokemon.getTipo());
        ivImagen.setImageResource(pokemon.getImagen());

    }
}
