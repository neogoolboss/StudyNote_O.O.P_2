package com.ohgiraffers;

public class Tv {

    public boolean power;  // 전원상태 (on/off)
    public int channel;    // 채널

    public void power() {
        power = !power;
    }

    public void channelUp() {
        ++channel;
    }

    public void channelDown() {
        --channel;
    }


}
