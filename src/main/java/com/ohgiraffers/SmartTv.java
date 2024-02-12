package com.ohgiraffers;

public class SmartTv extends Tv{ // SmartTv는 Tv에 캡션(자막)을 보여주는 기능을

    public boolean caption;    // 캡션상태 (on/off)

    public void displayCaption(String text) {
        if(caption) {   // 캡션 상태가 on(true)일 때만 text를 보여준다.
            System.out.println(text);
        }
    }

}
