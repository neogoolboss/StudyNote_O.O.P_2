package com.ohgiraffers.encapsulation;

public class TimeTest {

    public static void main(String[] args) {

        Time t = new Time();
//        t.hour = 25;
        t.setHour(21); // hour의 값을 21로 변경
        System.out.println(t.getHour());

        t.setHour(25);
        System.out.println(t.getHour());
    }

}
