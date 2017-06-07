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

    public void rotate(View v) {
        animation = AnimationUtils.loadAnimation(
                getApplicationContext(), R.anim.rotate);
        ivOctocat.startAnimation(animation);
    }

    public void move(View v) {
        animation = AnimationUtils.loadAnimation(
                getApplicationContext(), R.anim.move);
        ivOctocat.startAnimation(animation);
    }

    public void slideup(View v) {
        animation = AnimationUtils.loadAnimation(
                getApplicationContext(), R.anim.slide_up);
        ivOctocat.startAnimation(animation);
    }

    public void slidedown(View v) {
        animation = AnimationUtils.loadAnimation(
                getApplicationContext(), R.anim.slide_down);
        ivOctocat.startAnimation(animation);
    }
    public void blink(View v) {
        animation = AnimationUtils.loadAnimation(
                getApplicationContext(), R.anim.blink);
        ivOctocat.startAnimation(animation);
    }
    public void bounce(View v) {
        animation = AnimationUtils.loadAnimation(
                getApplicationContext(), R.anim.bounce);
        ivOctocat.startAnimation(animation);
    }

    public void crossfade(View v) {
        animation = AnimationUtils.loadAnimation(
                getApplicationContext(), R.anim.fade_in);
        Animation animation2 = AnimationUtils.loadAnimation(
                getApplicationContext(), R.anim.fade_out);
        ivOctocat.startAnimation(animation2);
        ivOctocat2.startAnimation(animation);
    }
    public void sequential(View v) {
        animation = AnimationUtils.loadAnimation(
                getApplicationContext(), R.anim.sequential);
        ivOctocat.startAnimation(animation);
    }
    public void together(View v) {
        animation = AnimationUtils.loadAnimation(
                getApplicationContext(), R.anim.together);
        ivOctocat.startAnimation(animation);
    }

    public void stop(View v) {
        ivOctocat.clearAnimation();
        ivOctocat2.clearAnimation();
    }
















}
