package com.example.gsu.final_project_sp.view;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.View;

import com.example.gsu.final_project_sp.R;
import com.example.gsu.final_project_sp.Adapter.MainViewPagerAdapter;
import com.example.gsu.final_project_sp.audio.BaseAudioOb;
import com.example.gsu.final_project_sp.audio.MusicController;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Music_Play extends BaseActivty {

    @BindView(R.id.main_view_pager)
    ViewPager viewPager;
    private ArrayList<BaseAudioOb> contentList = new ArrayList<BaseAudioOb>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_music__play);
        ButterKnife.bind(this);
        initInfo();
        initViewPager();
    }

    private void initViewPager() {
        ArrayList<View> viewList = new ArrayList<View>();
        viewList.add(new PlayView(this));
        viewList.add(new PlayListView(this));
        viewPager.setAdapter(new MainViewPagerAdapter(viewList));
    }

    private void initInfo() {


        AudioOb m1 = new AudioOb();
        m1.setURL("http://other.web.rh01.sycdn.kuwo.cn/resource/n3/77/1/1061700123.mp3");
        m1.setName("One Moment");

        AudioOb m2 = new AudioOb();
        m2.setURL("http://other.web.re01.sycdn.kuwo.cn/resource/n2/41/79/3442130618.mp3");
        m2.setName("I will remember you");

        AudioOb m3 = new AudioOb();
        m3.setURL("http://other.web.ra01.sycdn.kuwo.cn/resource/n2/128/72/74/2639398911.mp3");
        m3.setName("Young for you");

        contentList.add(m1);
        contentList.add(m2);
        contentList.add(m3);
    }

    public ArrayList<BaseAudioOb> getContent(){
        return contentList;
    }

    @Override
    protected void onDestroy (){
        MusicController controller = MusicController.getInstance(this);
        controller.destroy();
        super.onDestroy();
    }
}
