package com.vyas.pranav.animationdemo1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Scene;
import android.transition.TransitionInflater;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class Demo2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo2);
    }

    public void click2(View view) {
        TransitionManager.go(Scene.getSceneForLayout((ViewGroup)findViewById(android.R.id.content),
                R.layout.activity_demo2_scene2,
                this),TransitionInflater.from(this).inflateTransition(R.transition.first_transition));

    }

    public void clicked3(View view) {
        TransitionManager.go(Scene.getSceneForLayout((ViewGroup)findViewById(android.R.id.content),
                R.layout.activity_demo2,
                this));
        Toast.makeText(this, "Toasted", Toast.LENGTH_SHORT).show();
    }
}
