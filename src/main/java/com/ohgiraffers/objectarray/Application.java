package com.ohgiraffers.objectarray;

import com.ohgiraffers.polymorphismofparameters.Buyer;
import com.ohgiraffers.polymorphismofparameters.Computer;
import com.ohgiraffers.polymorphismofparameters.Tv1;

public class Application {

    public static void main(String[] args) {

        Buyer2 b2 = new Buyer2();

        b2.buy(new Tv2());
        b2.buy(new Computer2());
        b2.buy(new Audio2());
        b2.summary();



    }

}
