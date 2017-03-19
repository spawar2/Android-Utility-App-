package com.example.gsu.final_project_sp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.gsu.final_project_sp.Fragement.CFragment;
import com.example.gsu.final_project_sp.Fragement.LFragment;
import com.example.gsu.final_project_sp.Fragement.HFragment;

import com.example.gsu.final_project_sp.Adapter.ViewPagerAdapter;


import java.util.ArrayList;

public class ViewPagerActivity extends AppCompatActivity {

    public ViewPager viewPager;
    private ArrayList<Fragment> fragmentList = new ArrayList<Fragment>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);
        initial();
    }

    private void initial(){
        viewPager = (ViewPager) findViewById(R.id.view_pager);
        fragmentList.add(new LFragment());
        fragmentList.add(new CFragment());
        fragmentList.add(new HFragment());
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this.getSupportFragmentManager());
        viewPagerAdapter.setContent(fragmentList);
        viewPager.setAdapter(viewPagerAdapter);
    }
}
