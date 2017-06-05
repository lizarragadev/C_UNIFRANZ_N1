package com.miramicodigo.p7_listas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashscreenActivity extends AppCompatActivity {

    /**
     *
     * @author Gustavo Lizarraga
     * @date 05/06/2017
     *
     * */

    private ImageView ivLogo;
    private Animation animacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_splashscreen);

        ivLogo = (ImageView) findViewById(R.id.ivLogo);
        animacion = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.animacion);
        ivLogo.startAnimation(animacion);

    }
}
