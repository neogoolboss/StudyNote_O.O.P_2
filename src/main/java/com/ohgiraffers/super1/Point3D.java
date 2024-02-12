package com.ohgiraffers.super1;

public class Point3D extends Point {

    int z;

//    Point3D(int x, int y, int z) { // Point() 기본생성자가 없어서 에러가 남.
//        this.x = x;
//        this.y = y;
//        this.z = z;
//    }
    Point3D(int x, int y, int z) {
        super(x, y);        // 조상의 생성자(Point(int x, int y)를 호출
        this.z = z;
    }


    String getLocation() {      // 오버라이딩
        return "x : " + x + ", y : " + y + ", z : " + z;
    }

}
