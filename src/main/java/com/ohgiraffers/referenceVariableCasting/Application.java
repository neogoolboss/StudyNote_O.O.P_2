package com.ohgiraffers.referenceVariableCasting;

public class Application {

    public static void main(String[] args) {

        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        car = fe;                   // car = (Car)fe; 형변환 생략
//        car.water();                // 컴파일 에러, Car 타입의 참조변수로는 water()를 호출할 수 없다.
        fe2 = (FireEngine)car;      // 자손타입 <- 조상타입. 형변환 생략 불가
        fe2.water();

    }

}
