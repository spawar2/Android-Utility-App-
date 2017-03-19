package com.example.gsu.final_project_sp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity {

    private ImageButton bt1;
    private ImageButton bt2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialView();
        initialListener();
    }

    private void initialView(){
        bt1 = (ImageButton) findViewById(R.id.bt1);
        bt2 = (ImageButton) findViewById(R.id.bt2);
    }

    private void initialListener() {
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), CalculatorActivity.class);
                startActivityForResult(intent,3);
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), ViewPagerActivity.class);
                startActivityForResult(intent,3);
            }
        });
    }

    }


