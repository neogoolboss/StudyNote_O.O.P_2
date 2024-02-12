package com.ohgiraffers.inheritance;

public class InheritanceTest {

    public static void main(String[] args) {

        Circle c = new Circle();
        c.x = 1;
        c.y = 2;
        c.r = 3;
        System.out.println("c.x = " + c.x);
        System.out.println("c.y = " + c.y);
        System.out.println("c.r = " + c.r);
        System.out.println();

        Circle1 c1 = new Circle1();
        c1.p.x = 1;
        c1.p.y = 2;
        c1.r = 3;
        System.out.println("c1.p.x = " + c1.p.x);
        System.out.println("c1.p.y = " + c1.p.y);
        System.out.println("c1.r = " + c1.r);
        System.out.println();

        System.out.println(c.toString());
        System.out.println(c.hashCode());

    }

}
