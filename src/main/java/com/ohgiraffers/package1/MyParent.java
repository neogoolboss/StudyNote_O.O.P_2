package com.ohgiraffers.package1;

public class MyParent {

    private int prv;        // 같은 클래스
    int dft;                // 같은 패키지
    protected int prt;      // 같은 패키지 + 자손(다른 패키지)
    public int pub;         // 접근 제한 없음

    public void printMembers() {
        System.out.println(prv);
        System.out.println(dft);
        System.out.println(prt);
        System.out.println(pub);
    }

}

