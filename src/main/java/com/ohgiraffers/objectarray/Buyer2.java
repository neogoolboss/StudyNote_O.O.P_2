package com.ohgiraffers.objectarray;

import com.ohgiraffers.polymorphismofparameters.Product;

public class Buyer2 {

    int money2 = 1000;       // 소유 금액
    int bonusPoint2 = 0;     // 보너스 점수
    Product2[] cart = new Product2[10]; // 구입한 제품을 저장하기 위한 배열
    int i = 0;                          // Product배열에 사용할 카운터

    void buy(Product2 p2) {
        if(money2 < p2.price2) {
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }

        money2 -= p2.price2;                // 가진 돈에서 구입한 제품의 가격을 뺀다.
        bonusPoint2 += p2.bonusPoint2;      // 제품의 보너스 점수를 추가한다.
        cart[i++] = p2;                     // 제품을 Product[] cart에 저장한다.
        System.out.println(p2 + "을/를 구입하셨습니다.");
//        System.out.println(p.toString() + "을/를 구입하셨습니다.");
    }

    void summary() {                        // 구매한 물품에 대한 정보를 요약해서 보여준다.
        int sum = 0;                        // 구입한 물품의 가격합계
        String itemList = "";               // 구입한 물품목록

        // 반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다.
        for (int i = 0; i < cart.length; i++) {
            if(cart[i]==null) {
                break;
            }
            sum += cart[i].price2;
            itemList += cart[i] + ", ";
        }
        System.out.println("구입하신 물품의 총금액은 " + sum + "만원 입니다.");
        System.out.println("구입하신 제품은 " + itemList + "입니다.");
    }

}
