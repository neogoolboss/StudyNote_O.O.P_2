package com.ohgiraffers.polymorphismofparameters;

public class Buyer {        // 고객, 물건을 사는 사람
    int money = 1000;       // 소유 금액
    int bonusPoint = 0;     // 보너스 점수

    void buy(Product p) {
        if(money < p.price) {
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }

        money -= p.price;
        bonusPoint += p.bonusPoint;
        System.out.println(p + "을/를 구입하셨습니다.");
//        System.out.println(p.toString() + "을/를 구입하셨습니다.");

    }
}
