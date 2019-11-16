package com.example.animation08102019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView= findViewById(R.id.View_alpha);
        final Animation alphaAnimation =  AnimationUtils.loadAnimation(this,R.anim.scale_new);
        imageView.setAnimation(alphaAnimation);
        imageView.performClick();
//       imageView.setOnClickListener(new View.OnClickListener() {
//           @Override
//           public void onClick(View v) {
//               imageView.startAnimation(alphaAnimation);
//           }
//       });
//        imageView_scale= findViewById(R.id.Scale_1);
//        final AlphaAnimation alphaAnimation_scale = (AlphaAnimation) AnimationUtils.loadAnimation(this,R.anim.scale);
//        imageView_scale.startAnimation(alphaAnimation_scale);
    }
}
