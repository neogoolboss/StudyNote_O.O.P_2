package com.ohgiraffers.objectarray;

public class Product2 {

    int price2;
    int bonusPoint2;


    Product2() {            // 기본생성자

    }
    Product2(int price2) {
        this.price2 = price2;
        bonusPoint2 = (int)(price2/10.0);
    }



}
