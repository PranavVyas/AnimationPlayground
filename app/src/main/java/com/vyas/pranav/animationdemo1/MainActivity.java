package com.vyas.pranav.animationdemo1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Fade;
import android.transition.Slide;
import android.transition.TransitionManager;
import android.transition.TransitionValues;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView image,image2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image = findViewById(R.id.imageView);
        image2 = findViewById(R.id.imageView2);
    }

    public void clicked(View view) {
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
            Slide slide = new Slide(Gravity.TOP);
            Fade fade = new Fade();
            fade.captureStartValues(new TransitionValues());

            ViewGroup root = findViewById(android.R.id.content);
            TransitionManager.beginDelayedTransition(root,slide);
            image.setVisibility(View.INVISIBLE);
            image2.setVisibility(View.INVISIBLE);
        }
    }
}
