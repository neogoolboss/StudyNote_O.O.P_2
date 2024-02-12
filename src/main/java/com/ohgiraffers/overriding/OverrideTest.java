package com.ohgiraffers.overriding;

public class OverrideTest {

    public static void main(String[] args) {

        Point3D point3D = new Point3D();
        point3D.x = 3;
        point3D.y = 5;
        point3D.z = 7;
//        System.out.println(point3D.getLocation());
        System.out.println(point3D.toString());
        System.out.println(point3D);

    }

}
