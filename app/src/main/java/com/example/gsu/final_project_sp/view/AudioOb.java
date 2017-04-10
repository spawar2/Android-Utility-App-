package com.example.gsu.final_project_sp.view;


import com.example.gsu.final_project_sp.audio.BaseAudioOb;


/**
 * Created by YoungH on 3/15/17.
 */

public class AudioOb extends BaseAudioOb {
    private String name;
    private String size;
    private String duration;
    private String info;
    private String iconUrl;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
