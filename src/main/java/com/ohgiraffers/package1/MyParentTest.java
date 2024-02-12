package com.ohgiraffers.package1;

public class MyParentTest {

    public static void main(String[] args) {

        MyParent p = new MyParent();
//        System.out.println(p.prv);      // 에러. 클래스가 다르다.
        System.out.println(p.dft);
        System.out.println(p.prt);
        System.out.println(p.pub);

    }

}
