package com.miramicodigo.p10_recyclerview_cardviews;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class DetalleActivity extends AppCompatActivity {
    /**
     *
     * @author Gustavo Lizarraga
     * @date 09/06/2017
     *
     * */

    private ImageView ivImagen;
    private TextView tvNombre;
    private TextView tvHAbilidades;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

    }
}
