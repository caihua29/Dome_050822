package com.example.objectanimator;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView mImage;
    private Button mRotation;
    private Button mTranslation;
    private Button mScale;
    private Button mAlpha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        mImage = findViewById(R.id.image);
        mRotation.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.rotation:
                ObjectAnimator animator = ObjectAnimator.ofFloat(mImage, "rotation", new float[]{0f, 360f, 0f});
                animator.setDuration(1000);
                animator.start();
                break;
            case R.id.translation:
                break;
            case R.id.scale:
                break;
            case R.id.alpha:
                break;
            default:
                break;
        }

    }

    private void initView() {
        mRotation = findViewById(R.id.rotation);
        mTranslation = findViewById(R.id.translation);
        mScale = findViewById(R.id.scale);
        mAlpha = findViewById(R.id.alpha);
    }
}
