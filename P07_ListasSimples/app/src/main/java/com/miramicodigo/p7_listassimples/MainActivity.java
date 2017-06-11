package com.miramicodigo.p7_listassimples;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    /*

    * @author Gustavo Lizarraga
    * @date 05-06-2017
    *
    * */

    //Por un lado se necesitan los datos a mostrar
    String[] datos = {
            "Bolivia", "Peru", "Brasil", "Venezuela", "Argentina",
            "Chile", "Paraguay", "Ecuador", "Guatemala", "Uruguay",
            "Mexico", "Panama", "Colombia", "Haiti", "Nicaragua",
            "Cuba", "EE.UU.", "Espania", "Inglaterra", "Rusia",
            "Portugal", "Grecia", "Egipto"
    };
    //Por otro lado se necesita un adaptador que conviertan los datos a un tipo que ListView entienda.
    private ArrayAdapter<String> adapter;
    //Por ultimo necesitamos un View que permita visualizar los datos almacenador en esa lista.
    private ListView lvDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Enlazamos la vista a la funcionalidad
        lvDatos = (ListView) findViewById(R.id.lvDatos);

        //Creamos un adaptador para convertir los datos para mostrarlo en el ListView
        adapter = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                datos
        );

        //Asignamos al ListView un adaptador que lo creamos un par de lineas mas arriba
        lvDatos.setAdapter(adapter);
    }
}
