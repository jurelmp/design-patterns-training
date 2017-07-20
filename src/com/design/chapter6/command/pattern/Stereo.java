package com.design.chapter6.command.pattern;

/**
 * Created by JurelP on 4/10/2016.
 */
public class Stereo {

    public void on() {
        System.out.println("Stereo is On");
    }

    public void off() {
        System.out.println("Stereo is Off");
    }

    public void setCd() {
        System.out.println("");
    }

    public void setDvd() {
    }

    public void setRadio() {
    }

    public void setVolume(int volume) {
        System.out.println("Stereo Volume is Set to " + volume);
    }
}
