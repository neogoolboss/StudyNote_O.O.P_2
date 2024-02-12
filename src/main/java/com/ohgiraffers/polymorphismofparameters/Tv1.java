package com.ohgiraffers.polymorphismofparameters;

public class Tv1 extends Product {

    Tv1() {
        // 조상클래스의 생성자 Product(int price)를 호출한다.
        super(100);     // Tv의 가격을 100만원으로 한다.
    }

    public String toString() {
        return "Tv";
    }

}
