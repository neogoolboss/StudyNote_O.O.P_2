package com.ohgiraffers.package2;

import com.ohgiraffers.package1.MyParent;

public class MyParentTest2 {

    public static void main(String[] args) {

        MyParent p = new MyParent();
//        System.out.println(p.prv);      // 클래스가 다르다.
//        System.out.println(p.dft);      // 패키지가 다르다.
//        System.out.println(p.prt);      // 패키지도 다르고 상속도 받지 않는다.
        System.out.println(p.pub);

    }


}
