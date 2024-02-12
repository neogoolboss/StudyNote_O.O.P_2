package com.ohgiraffers;

public class Note {

    public static void main(String[] args) {

        /* 상속(Inheritance)
        *   - 기존의 클래스로 새로운 클래스를 작성하는 것. (코드의 재사용)
        *   - 두 클래스를 부모와 자식으로 관계를 맺어주는 것
        * ---------------------------------------------------------------
        *   class 자식클래스 extends 부모클래스 {
        *       // ...
        *   }
        * ---------------------------------------------------------------
        *  class Parent { }
        *
        *  class Child extends Parent {
        *      // ...
        *  }
        * ---------------------------------------------------------------
        *   - 자손은 조상의 모든 멤버를 상속받는다.(생성자, 초기화블럭 제외)
        *           * 조상 : 부모의 부모
        *   - 자손의 멤버 개수는 조상보다 적을 수 없다. (같거나 많다.)
        * ---------------------------------------------------------------
        *  class Parent {
        *       int age;                    <-- 멤버 1개
        *  }
        *
        *  class Child extends Parent { }   <-- 멤버 0개 x 멤버 1개
        *                                       (상속받은 멤버 1개)
        * ---------------------------------------------------------------
        *   - 자손의 변경은 조상에 영향을 미치지 않는다.
        *   class Parent {
        *       int age;
        *   }
        *
        *  class Child extends Parent {
        *       void play() {                    <-- 멤버 2개(자신1, 상속1)
        *           System.out.println("놀자~");  <-- 새로운 멤버 추가
        *       }
        *  }
        * ---------------------------------------------------------------
        *   class Point {    <-- 2차원 좌표 (x , y)
        *       int x;
        *       int y;
        *   }
        *                           3차원 좌표 (x, y, z)
        *   class Point3D {             |           class Point3D extend Point {
        *       int x;                  |               int z;
        *       int y;                  |           }
        *       int z;                  |
        *   }                           |
        *   (Point와 관계 없음)           |                   (Point를 상속)
        * ---------------------------------------------------------------
        * */

        /* 포함 관계
        * ✅ 포함(composite)이란?
        *   - 클래스의 멤버로 참조변수를 선언하는 것
        *
        *   class Point {
        *       int x;
        *       int y;
        *   }
        *
        *   class Circle {              |    class Circle {
        *       int x; // 원점의 x좌표    |        point c = new Point();   // 원점
        *       int y; // 원점의 y좌표    |        int rl  // 반지름
        *       int r; // 반지름         |    }
        *                                       Circle이 Point를 포함
        * ---------------------------------------------------------------
        *   - 작은 단위의 클래스를 만들고, 이 들을 조합해서 클래스를 만든다.
        *   class Car {
        *       Engine e = new Engine();  // 엔진
        *       Door[] d = new Door[4];   // 문, 문의 개수를 넷으로 가정하고 배열로 처리
        *       //...
        *   }
        * ---------------------------------------------------------------
        * */

        /* 클래스 간의 관계 설정하기
        *   상속관계 : '~ 은 ~ 이다. (is-a)'
        *   포함관계 : '~ 은 ~ 을 가지고 있다.(has-a)'
        *
        *   원(Circle)은 점(Point)이다. - Circle is a Point
        *   원(Circle)은 점(Point)를 가지고 있다. - Circle has a Point ✅
        * */

        /* 단일 상속(Single Inheritance)
        *   - Java는 단일상속 만을 허용한다. (C++은 다중상속 허용)
        *     class TvDVD extends Tv, DVD {  // 에러 조상은 하나만 허용.
        *           // ...
        *     }
        * ---------------------------------------------------------------
        *   - 비중이 높은 클래스 하나만 상속관계로, 나머지는 포함관계로 한다.
        *   class Tv {                          class TvDVD extends Tv {
        *       boolean power;                      DVD dvd = new DVD();
        *       int channel;
        *                                           void play() {
        *       void power() {                          dvd.play();
        *           power != power;                 }
        *       }                                   void stop {
        *       void channelUp() {                      dvd.stop();
        *           ++channel                       }
        *       }                                   void rew() {
        *       void channelDown() {                    dvd.rew();
        *           --channel                       }
        *       }                                   void ff() {
        *   }                                           dvd.ff();
        * ------------------------------            }
        *   class DVD {                          }
        *       boolean power;
        *
        *       void power() {
        *           power != power;
        *       }
        *       void play() {
        *           내용 생략
        *       }
        *       void stop() {
        *           내용 생략
        *       }
        *       void rew() {
        *           내용 생략
        *       }
        *       void ff() {
        *           내용 생략
        *       }
        *   }
        * */

        /* Object클래스 - 모든 클래스의 조상
        *   - 부모가 없는 클래스는 자동적으로 Object클래스를 상속받게 된다.(컴파일러 자동 추가)
        *   - 모든 클래스는 Object클래스에 정의된 11개의 메서드를 상속받는다.
        *   toString(), equals(Object obj), hasCode(), ...
        * */

        /* 오버라이딩(overriding)
        *   - 상속받은 조상의 메서드를 자신에 맞게 변경하는 것
        *
        *   class Point {
        *       int x;
        *       int y;
        *
        *       String getLocation() {
        *               return "x : " + x + ", y : " + y;   // 2차원 좌표
        *       }
        *   }
        *
        *   class Point3D extends Point {
        *       int z;
        *
        *       String getLocation() {      // 오버라이딩
        *               return "x : " + x + ", y : " + y + ", z : " + z;   // 3차원 좌표
        *       }
        *   }
        *       * 선언부 변경 불가 / 내용만 변경가능 (구현부 { })
        * */

        /* 오버라이딩 조건
        *   1. 선언부가 조상 클래스의 메서드와 일치해야 한다.
        *       ex) String getLocation() <- 선언부(반환타입, 메서드이름, 매개변수 목록)가 일치
        *   2. 접근제어자를 조상 클래스의 메서드보다 좁은 범위로 변경할 수 없다.
        *   3. 예외는 조상 클래스의 메서드보다 많이 선언할 수 없다.
        * */

        /* 오버로딩 vs 오버라이딩 (서로 관계 없음)0
        *   ✅오버로딩(overloading) : 기존에 없는 새로운 메서드를 정의하는 것(new) / 상속관계X
        *   ✅오버라이딩(overriding) : 상속받은 메서드의 내용을 변경하는 것(change, modify)
        *
        *   class Parent {
        *       void parentMethod() { }
        *   }
        *   class Child extends Parent {
        *       void parentMethod() { }         ✅오버라이딩
        *       void parentMethod(int i) { }    ✅오버로딩
        *
        *       void childMethod() { }          ✅메소드 정의
        *       void childMethod(int i) { }     ✅오버로딩
        *       void childMethod() { }          ❌중복정의 (에러)
        *   }
        * */

        /* 참조변수 super
        *   - 객체 자신을 가리키는 참조변수. 인스턴스 메서드(생성자) 내에만 존재
        *   - 조상의 멤버를 자신의 멤버와 구별할 때 사용
        *     (this : lv와 iv 구별에 사용)
        *   class Parent {
        *       int x = 10;  <-- super.x
        *   }
        *
        *   class Child extends Parent {
        *       int x = 20;  <-- this.x
        *
        *       void method() {
        *           System.out.println("x = " + x);                 // x = 20
        *           System.out.println("this.x = " + this.x);       // this.x = 20;
        *           System.out.println("super.x = " + super.x);     // super.x = 10;
        *       }
        *   }
        * ----------------------------------------------------------------------------
        * class Parent {
        *       int x = 10;  <-- super.x와 this.x 둘 다 가능
        *   }
        *
        *   class Child extends Parent {
        *       void method() {
        *           System.out.println("x = " + x);                 // x = 10
        *           System.out.println("this.x = " + this.x);       // this.x = 10;
        *           System.out.println("super.x = " + super.x);     // super.x = 10;
        *       }
        *   }
        * ----------------------------------------------------------------------------
        * */

        /* super() - 조상의 생성자  // 참조변수 super와 다르다.
        *   - 조상의 생성자를 호출할 때 사용
        *   - 조상의 멤버는 조상의 생성자를 호출해서 초기화
        * class Point {                         class Point3D extends Point {
        *       int x, y;                               int z;
        *
        *       Point(int x, int y) {                   Point3D(int x, int y, int z) {
        *           this.x = x;     // iv 초기화           ❌this.x = x;  // 조상의 멤버 초기화
        *           this.y = y;     // iv 초기화           ❌this.y = y;  // 조상의 멤버 초기화
        *       }                                           this.z = z;
        * }                                             }
        *                                       }
        * ----------------------------------------------------------------------------
        *  Point3D(int x, int y, int z) {
        *       super(x, y);  // 조상클래스의 생성자 Point(int x, int y)를 호출
        *       this.z = z;   // 자신의 멤버를 초기화
        *  }
        * ----------------------------------------------------------------------------
        *   - 생성자의 첫 줄에 반드시 생성자를 호출해야 한다.✨✨✨✨
        *     그렇지 않으면 컴파일러가 생성자의 첫 줄에 super();를 삽입
        *
        *   class Point extends Object {
        *       int x;
        *       int y;
        *
        *       Point() {
        *           this(0, 0);     // this 호출해서 Ok
        *       }
        *       Point(int x, int y) {
        *           super();        // Object();
        *           this.x = x;
        *           this.y = y;
        *       }
        *   }
        * */

        /* 패키지(Package)
        *   - 서로 관련된 클래스의 묶음
        *   - 클래스는 클래스 파일(*.class), 패키지는 폴더. 하위 패키지는 하위 폴더
        *   - 클래스의 실제 이름(full name)은 패키지를 포함(java.lang.String)
        *     rt.jar는 클래스를 압축한 파일(JDK설치경로￦jre￦lib에 위치)￦
        * */

        /* 패키지의 선언
        *   - 패키지는 소스파일 첫 번째 문장으로 단 한번 선언
        *   - 같은 소스 파일의 클래스들은 모두 같은 패키지에 속하게 된다.
        *   - 패키지 선언이 없으면 이름없는(unnamed) 패키지에 속하게 된다.
        * */

        /* 클래스 패스(classpath)
        *   - 클래스파일(*.class)의 위치를 알려주는 경로(path)
        *   - 환경변수 classpath로 관리하며, 경로간의 구분자는 ';'를 사용
        *     classpath(환경변수)에 패키지의 루트를 등록해줘야 함.
        * */

        /* import 문
        *   - 클래스를 사용할 때 패키지 이름을 생략할 수 있다.
        *   - 컴파일러에게 클래스가 속한 패키지를 알려준다.
        *   - java.lang 패키지의 클래스는 import 하지 않고도 사용할 수 있다.
        *                                                    |     import java.util.Date;
        *    class ImportTest {                              |     class ImportTest {
        *       java.util.Date today = new java.util.Date(); |         Date today = new Date();
        *   }                                                |     }
        * ----------------------------------------------------------------------------
        *   import java.lang.*; <-- 모든 클래스
        * */

        /* import문의 선언
        *   - import문을 선언하는 방법은 다음과 같다.
        *       import 패키지명.클래스명;
        *       import 패키지명.*;  <-- 모든클래스
        *
        *   - import문은 패키지문과 클래스 선언 사이에 선언한다.
        *       ① package com.ohgiraffers;   패키지 선언
        *
        *       ② import java.util.*;        import 문
        *
        *       ③ public class Note { }      클래스 정의
        *
        *   - import문은 컴파일 시에 처리되므로 프로그램의 성능에 영향없음.
        *   - 다음의 두 코드는 서로 의미가 다르다.
        *       import java.util.*;             -> import java.*;
        *       import java.text.*;                (java 패키지의 모든 클래스, 패키지는 포함 X)
        * */

        /* static import문
        *   - static멤버를 사용할 때 클래스 이름을 생략할 수 있게 해준다.
        *       import static java.lang.Integer.*;      // Integer클래스의 모든 static메서드
        *       import static java.lang.Math.random;    // Math.random()만. 괄호 안붙임.
        *       import static java.lang.System.out;     // System.out을 out만으로 참조 가능
        *
        *   System.out.println(Math.random());  --->  out.println(random());
        * */

        /* 제어자(modifier)        형용사
        *   - 클래스와 클래스의 멤버(멤버 변수, 메서드)에 부가적인 의미 부여
        *       접근 제어자 : public, protected, (default), private
        *       그      외 : static, final, abstract, native, transient, synchronized, volatile, strictfp
        *
        *   - 하나의 대상에 여러 제어자를 같이 사용 가능(접근 제어자는 하나만)
        *      ex) public static final int WIDTH = 200;
        * */

        /* static - 클래스의, 공통적인
        *
        *      제어자     |    대상     |                         의미
        * ------------------------------------------------------------------------------------
        *                |            | - 모든 인스턴스에 공통적으로 사용되는 클래스 변수가 된다.
        *                |   멤버변수   | - 클래스 변수는 인스턴스를 생성하지 않고도 사용 가능하다.
        *                |            | - 클래스가 메모리에 로드될 때 생성된다.
        *      static    |---------------------------------------------------------------------
        *                |    메서드   | - 인스턴스를 생성하지 않고도 호출이 가능한 static 메서드가 된다.
        *                |            | - static메서드 내에서는 인스턴스 멤버들을 직접 사용할 수 없다.
        * -------------------------------------------------------------------------------------
        *   class StaticTest {
        *       static int width = 200;                 // 클래스 변수(static 변수)
        *       static int height = 120;                // 클래스 변수(static 변수)
        *
        *       static {
        *           // static변수의 복잡한 초기화 수행      // 클래스 초기화 블럭
        *       }
        *
        *       static int max(int a, int b) {          // 클래스 메서드(static 메서드)
        *           return a > b ? a : b;   <-- iv 사용 불가, instance 메서드 사용 불가
        *       }
        *   }
        * */

       /* final - 마지막의, 변경될 수 없는
        *
        *      제어자     |    대상     |                         의미
        * ------------------------------------------------------------------------------------
        *                |            | - 변경될 수 없는 클래스, 확장될 수 없는 클래스가 된다.
        *                |   클래스    | - 그래서 final로 지정된 클래스는 다른 클래스의 조상이 될 수 없다.
        *                |------------|--------------------------------------------------------
        *                |   메서드    | - 변경될 수 없는 메서드
        *     final      |            | - final로 지정된 메서드는 오버라이딩을 통해 재정의 될 수 없다.
        *                |------------|--------------------------------------------------------        *
        *                |   멤버변수   |
        *                |------------| - 변수 앞에 final이 붙으면, 값을 변경할 수 없는 상수가 된다.
        *                |   지역변수   |
        * _______________|____________|________________________________________________________
        *   final class FinalTest {                     // 조상이 될 수 없는 클래스
        *       final int MAX_SIZE = 10;                // 값을 변경할 수 없는 멤버변수(상수)
        *
        *       final void getMaxSize() {               // 오버라이딩 할 수 없는 메서드(변경 불가)
        *           final int LV = MAX_SIZE;            // 값을 변경할 수 없는 지역변수(상수)
        *           return MAX_SIZE;
        *       }
        *   }
        * */

        /* abstract - 추상의, 미완성의
        *      제어자     |    대상     |                         의미
        * --------------------------------------------------------------------------------------
        *                |   클래스    | - 클래스 내에 추상 메서드가 선언되어 있음을 의미한다.
        *    abstract    |------------|---------------------------------------------------------
        *                |   메서드    | - 선언부만 작성하고 구현부는 작성하지 않은 추상 메서드임을 알린다.
        * --------------------------------------------------------------------------------------
        *   abstract class AbstractTest {       // 추상 클래스(추상 메서드를 포함한 클래스)
        *       abstract void move();           // 추상 메서드(구현부 { } 가 없는 메서드
        *   }
        *
        *   미완성 클래스 = 미완성 설계도 : 제품 생산 불가
        *   AbstractTest a = new AbstractTest(); // ❌❌에러. 추상 클래스의 인스턴스 생성불가
        *   ✅ 추상클래스를 상속받아서 완전한 클래스를 만든 후에 객체 생성 가능
        *     (미완성설계도)         (완성된 설계도)         (제품)
        * */

        /* 접근제어자(access modifier)
        *   private     : 같은 클래스 내에서만 접근이 가능하다.
        *   (default)   : 같은 패키지 내에서만 접근이 가능하다.
        *   protected   : 같은 패키지 내에서, 그리고 다른 패키지의 자손클래스에서 접근이 가능하다.
        *   public      : 접근 제한이 전혀 없다.
        *
        *   public > protected > (default) > private
        * */

        /* 캡슐화와 접근 제어자
        *   ✅접근 제어자를 사용하는 이유
        *       - 외부로부터 데이터를 보호하기 위해서
        *       - 외부에는 불필요한, 내부적으로만 사용되는 부분을 감추기 위해서
        *
        *       public class Time {
        *           public int hour;
        *           public int minute;
        *           public int second;
        *       }
        *
        *       Time t = new Time();
        *       t.hour = 25;  // 멤버변수에 직접 접근(데이터 보호가 안됨)
        * --------------------------------------------------------------------------------------
        *       public class Time {
        *           private int hour;
        *           private int minute;     // 접근제어자를 private으로 하여 외부에서 직접 접근하지 못하도록 한다.
        *           private int second;
        *
        *           public int getHour() {
        *                   return hour;
        *           }
        *           public void setHour(int hour) {     // public으로 메서드를 통한 간접접근은 허용
        *               if (hour < 0 || hour > 23) {
        *                   return;
        *               }
        *               this.hour = hour;
        *           }
        *       Time t = new Time();
        *       t.setHour(25);
        *
        * */

        /* 다형성(polymorphism)✨✨✨✨✨✨✨✨
        *   - 여러가지 형태를 가질 수 있는 능력
        *   - 조상타입 참조 변수로 자손타입 객체를 다루는 것 ✨
        *
        *   class Tv {
        *       boolean power;      // 전원(on/off)
        *       int channel;        // 채널
        *
        *       void power() {
        *           power != power;
        *       }
        *       void channelUp() {
        *           ++channel;
        *       }
        *       void channelDown() {
        *           --channel;
        *       }
        *   }
        * --------------------------------------------------------------------------------------
        *           자식          부모
        *   class SmartTv extends Tv {
        *       String text;        // 캡션(자막)을 보여주기 위한 문자열
        *
        *       void caption() {
        *           내용생략
        *       }
        *   }
        * --------------------------------------------------------------------------------------
        *   Tv t = new Tv();                // 타입(Tv) 일치
        *   SmartTv s = new SmartTv();      // 타입(SmartTv) 일치
        *   Tv t = new SmartTv();           // 타입 불일치 (조상타입으로 자손타입객체를 다룬다)
        * (조상타입)     (자손타입)
        * --------------------------------------------------------------------------------------
        *   - 객체와 참조변수의 타입이 일치할 때와 일치하지 않을 때의 차이?
        *   SmartTv s = new SmartTv();      // 참조 변수와 인스턴스의 타입이 일치
        *   Tv t = new SmartTv();           // 조상 타입 참조변수로 자손 타입 인스턴스 참조
        * --------------------------------------------------------------------------------------
        *   - 자손 타입의 참조변수로 조상 타입의 객체를 가리킬 수 없다.
        *   Tv t = new SmartTv();           // 허용⭕ 조상 5개 < 자손 7개 OK
        *   SmartTv s = new Tv();           // 에러❌ 자손 7개 > 5개 조상 NO
        * */

        /* 다형성(polymorphism)
        *   Q. 참조변수의 타입은 인스턴스의 타입과 반드시 일치해야 하는가?
        *   A. 아니다. 일치하는 것이 보통이지만 일치하지 않을 수도 있다.
        *       SmartTv s = new SmartTv();      // 참조변수와 인스턴스의 타입이 일치
        *       Tv      t = new SmartTv();      // 조상타입 참조변수로 자손타입 인스턴스 참조
        *
        *   Q. 참조변수가 조상타입일 때 자손타입일 때의 차이?
        *   A. 참조변수로 사용할 수 있는 멤버의 갯수가 달라진다.
        *       SmartTv s = new SmartTv();      // 멤버 7개 사용 가능
        *       Tv      t = new SmartTv();      // 멤버 5개 사용 가능
        *
        *   Q. 자손 타입의 참조변수로 조상 타입의 객체를 가리킬 수 있는가?
        *   A. No. 허용 안됨
        * */

        /* 참조변수의 형변환
        *   - 사용할 수 있는 ✨멤버의 갯수✨를 조절하는 것
        *   - 조상, 자손 관계의 참조변수는 서로 형변환 가능
        *
        *   class Car { }
        *   class FireEngine extends Car { }
        *   class Ambulance extends Car { }
        * --------------------------------------------------------------------------------------
        *   class Car {
        *       String color;
        *       int door;
        *
        *       void drive() {
        *           System.out.println("drive, Brrr~");
        *       }
        *       void stop() {
        *           System.out.println("stop!!!");
        *       }
        *   }
        *
        *   class FireEngine extends Car {
        *       void water() {
        *           System.out.println("water!!!");
        *       }
        *   }
        * --------------------------------------------------------------------------------------
        *   FireEngine f = new FireEngine();
        *
        *   Car c = (Car)f;                 // 조상인 Car타입으로 형변환(생략가능)
        *   FireEngine f2 = (FireEngine)c;  // 자손인 FireEngine타입으로 형변환(생략불가능)
        *   Ambulance a = (Ambulance)f;     // 에러. 상속관계가 아닌 클래스 간의 형변환 불가능
        * --------------------------------------------------------------------------------------
        *   Car c = new Car();
        *   FireEngine fe = (FireEngine) c;     // 형변환 실행 에러 java.lang.ClassCastException
        *   fe.water(); // 컴파일은 가능
        *       ✨✨형변환은 가능하지만, 생성하는 인스턴스의 갯수를 초과할 수 없다.✨✨
        * */

        /* instanceof 연산자
        *   - 참조변수의 형변환 가능 여부 확인에 사용 가능. 가능하면 true 반환
        *             (조상 < - > 자손)
        *   - 형변환 전에 반드시 instanceof로 확인해야 함.
        *       void doWork(Car c) {                                              doWork(new Car());
        *           if(c instanceof FireEngine) {       // 형변환이 가능한지 확인     doWork(new FireEngine());   = Car c = new FireEngine();
        *               FireEngine fe = (FireEngine)c;  // 형변환                  doWork(new Ambulance());          doWork(c);
        *               fe.water();                                                 위의 3문장이 모두 가능
        *               ...
        *           }
        *       }
        *   ✅ 형변환을 하는 이유는 인스턴스의 원래 기능을 모두 사용하려고.
        *   ✅ Car타입의 리모콘인 c로는 water()를 호출할 수 없으니까,
        *   ✅ FireEngine타입의 리모콘으로 바꿔서 water()를 호출
        *
        *   FireEngine fe = new FireEngine();
        *   System.out.println(fe instanceof Object);       // true
        *   System.out.println(fe instanceof Car);          // true
        *   System.out.println(fe instanceof FireEngine);   // true
        *       Object obj = (Object)fe;    // ok
        *       Car     c  = (Car)fe;       // ok
        * */

        /* instanceof 연산자
        *   Q. 참조변수의 형변환은 왜 하는가?
        *   A. 참조변수(리모콘)을 변경함으로써 사용할 수 있는 멤버의 갯수를 조절하기 위해서
        *
        *   Q. instanceof 연산자는 언제 사용하는가?
        *   A. 참조변수를 형변환 하기 전에 형변환 가능 여부를 확인할 때
        * */

        /* 매개변수의 다형성
        *   다형성의 장점 ⓘ 다형적 매개변수(polymorphismofparameters 참고)
        *               ② 하나의 배열로 여러종류 객체 다루기
        *
        *   - 참조형 매개변수는 메서드 호출시, 자신과 같은 타입 또는 자손타입의 인스턴스를 넘겨줄 수 있다.
        * --------------------------------------------------------------------------------------
        *   class Product {
        *       int price;              // 제품가격
        *       int bonusPoint;         // 보너스 점수
        *   }
        *
        *   class Tv extends Product { }
        *   class Computer extends Product { }
        *   class Audio extends Product { }
        *
        *   class Buyer {               // 물건사는 사람
        *       int money = 1000;       // 소유금액                      Product p1 = new Tv();
        *       int bonusPoint = 0;     // 보너스점수                    Product p2 = new Computer();
        *   }                                                          Product p3 = new Audio();
        *                                                              ↓이 메서드 하나로 Tv, Computer, Audio 가능.
        *       void buy(Tv t) {                    --->    void buy(Product p) {
        *           money -= t.price;               --->        money -= p.price;
        *           bonusPoint += t.bonusPoint;     --->        bonusPoint += p.bonusPoint;
        *       }                                   --->    }
        * */

        /* 여러 종류의 객체를 배열로 다루기
        *   - 조상타입의 배열에 자손들의 객체를 담을 수 있다.
        *       Product p1 = new Tv();              --->        Product[] p = new Product[3];
        *       Product p2 = new Computer();        --->        p[0] = new Tv();
        *       Product p3 = new Audio();           --->        p[1] = new Computer();
        *                                           --->        p[2] = new Audio();
        * --------------------------------------------------------------------------------------
        *       class Buyer {               // 물건사는 사람
        *           int money = 1000;       // 소유금액
        *           int bonusPoint = 0;     // 보너스점수
        *
        *           Product[] cart = new Product[10];   // 구입한 물건을 담을 배열
        *                   (장바구니)
        *           int i = 0;
        *
        *           void buy(Product p) {
        *               if(money < p.price) {
        *                   System.out.println("잔액부족");
        *                   return;
        *               }
        *               money -= p.price;
        *               bonusPoint += p.bonusPoint;
        *               cart[i++] = p;
        *           }
        *       }
        * --------------------------------------------------------------------------------------
        * */





    }

}
