package com.ohgiraffers.run;


import com.ohgiraffers.SmartTv;

public class Main {

    public static void main(String[] args) {

        SmartTv stv = new SmartTv();
        stv.channel = 10;                           // 조상 클래스로부터 상속받은 멤버
        stv.channelUp();                            // 조상 클래스로부터 상속받은 멤버
        System.out.println(stv.channel);
        stv.displayCaption("Hello, World");
        stv.caption = true;                         // 캡션(자막) 기능을 켠다.
        stv.displayCaption("Hello, World!!");

    }

}
