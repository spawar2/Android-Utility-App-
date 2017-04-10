package com.example.gsu.final_project_sp;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.example.gsu.final_project_sp.view.BaseActivty;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class AnimationActivity extends BaseActivty {
    private Animation alpaAnimation;
    private Animation scaleAnimation;
    private Animation rotateAnimation;
    private Animation translateAnimation;
    private Animation setAnimation;

    @BindView(R.id.anim_tv)

    TextView tv;


    @OnClick(R.id.anim_alpha)
    public void alpha(){
        tv.startAnimation(alpaAnimation);

    }

    @OnClick(R.id.anim_scale)
    public void scale(){
        tv.startAnimation(scaleAnimation);
    }

    @OnClick(R.id.anim_rotate)
    public void rotate(){
        tv.startAnimation(rotateAnimation);
    }

    @OnClick(R.id.anim_trans)
    public void trans(){
        tv.startAnimation(translateAnimation);
    }

    @OnClick(R.id.anim_set)
    public void set(){
        tv.startAnimation(setAnimation);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);
        ButterKnife.bind(this);
    initialAnimation();

        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toastShort("click");
            }
        });

    }

    private void initialAnimation(){
        alpaAnimation = AnimationUtils.loadAnimation(this, R.anim.anim_alpha);
        scaleAnimation = AnimationUtils.loadAnimation(this, R.anim.anim_scale);
        rotateAnimation = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
        translateAnimation = AnimationUtils.loadAnimation(this, R.anim.anim_trans);
        setAnimation = AnimationUtils.loadAnimation(this, R.anim.anim_set);
    }
}
