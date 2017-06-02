package com.miramicodigo.p5_intents;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity{

    /**
     * @author Gustavo Lizarraga
     * @date 02-06-17
     * */

    private TextView tvTexto1;
    private TextView tvTexto2;

    private EditText etCajaTexto;
    private Button btnRespuesta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        tvTexto1 = (TextView) findViewById(R.id.tvTextoUno);
        tvTexto2 = (TextView) findViewById(R.id.tvTextoDos);
        etCajaTexto = (EditText) findViewById(R.id.etCajaTexto);
        btnRespuesta = (Button) findViewById(R.id.btnRespuesta);

        Bundle bundle = getIntent().getExtras();
        try {
            tvTexto1.setText(bundle.getString("dato1", "").toString());
            tvTexto2.setText(bundle.getString("dato2", "").toString());
        } catch (Exception w) {

        }

        try {
            etCajaTexto.setText(bundle.getString("mensaje", "").toString());
        } catch (Exception e) {

        }

        btnRespuesta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra(
                        "respuesta",
                        etCajaTexto.getText().toString());
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }
}
