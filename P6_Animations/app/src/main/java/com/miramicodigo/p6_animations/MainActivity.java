package com.miramicodigo.p6_animations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    /**
     * @author Gustavo Lizarraga
     * @date 02-06-2017
     */
    private Animation animation;
    private ImageView ivOctocat;
    private ImageView ivOctocat2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivOctocat = (ImageView) findViewById(R.id.ivOctocat);
        ivOctocat2 = (ImageView) findViewById(R.id.ivOctocat2);

    }

    public void zoomin(View v) {
        animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_in);
        ivOctocat.startAnimation(animation);
    }

    public void zoomout(View v) {
        animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_out);
        ivOctocat.startAnimation(animation);
    }

    public void fadein(View v) {
        animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_in);
        ivOctocat.startAnimation(animation);
    }

    public void fadeout(View v) {
        animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_out);
        ivOctocat.startAnimation(animation);
    }

}
