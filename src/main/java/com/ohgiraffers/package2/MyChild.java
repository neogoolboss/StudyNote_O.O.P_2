package com.ohgiraffers.package2;

import com.ohgiraffers.package1.MyParent;

public class MyChild extends MyParent {

    public void printMembers() {
//        System.out.println(prv);    // 클래스가 다르다.
//        System.out.println(dft);    // 패키지가 다르다.
        System.out.println(prt);    // 패키지가 다르지만 자손클래스라 가능하다.
        System.out.println(pub);
    }

}
