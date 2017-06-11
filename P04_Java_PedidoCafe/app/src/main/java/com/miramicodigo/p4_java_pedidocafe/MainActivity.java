package com.miramicodigo.p4_java_pedidocafe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    /*
    * @author Gustavo Lizarraga
    * @date 05-06-2017
    *
    * */

    private TextView tvPrecioUnitario;
    private EditText etNombre;
    private TextView tvContador;
    private TextView tvResNombre;
    private TextView tvResCantidad;
    private TextView tvResPrecio;
    private int cantidad;
    private double resultado;
    private double precio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cantidad = 1;
        resultado = 0;
        precio = 7;

        tvPrecioUnitario = (TextView) findViewById(R.id.tvPrecio);
        etNombre = (EditText) findViewById(R.id.etNombre);
        tvContador = (TextView) findViewById(R.id.tvContador);
        tvResNombre = (TextView) findViewById(R.id.tvResNombre);
        tvResCantidad = (TextView) findViewById(R.id.tvResCantidad);
        tvResPrecio = (TextView) findViewById(R.id.tvResPrecio);

        init();
    }
    public void menos(View v) {
        if(cantidad > 1) {
            cantidad--;
            tvContador.setText(cantidad+"");
        }
    }
    public void mas(View v) {
        cantidad++;
        tvContador.setText(cantidad+"");
    }
    public void calcular(View v) {
        if(!etNombre.getText().toString().equals("")) {
            resultado = dosDecimales(cantidad * precio);
            tvResPrecio.setText("Bs. "+resultado);
            tvResCantidad.setText(cantidad+" Cafe(s)");
            tvResNombre.setText(etNombre.getText().toString());
        } else {
            Toast.makeText(getApplicationContext(), "Debe ingresar un nombre", Toast.LENGTH_SHORT).show();
        }
    }
    public void borrar(View v) {
        init();
    }

    public void init() {
        tvPrecioUnitario.setText("Precio unitario: Bs. "+precio);
        etNombre.setText("");
        cantidad = 1;
        tvContador.setText(cantidad+"");
        tvResNombre.setText("-");
        tvResCantidad.setText("-");
        tvResPrecio.setText("-");
    }

    public double dosDecimales(double d) {
        DecimalFormat df = new DecimalFormat("#.##");
        return Double.valueOf(df.format(d));
    }

}
