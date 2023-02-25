package org.example;
// 문제 : 구성(전사는 무기로 구성된다.)을 사용하여 중복을 제거해주세요.
// Main 클래스는 수정불가능
public class Main {
    public static void main(String[] args) {
        전사타입A a전사타입A = new 전사타입A();
        a전사타입A.공격();

        전사타입B a전사타입B = new 전사타입B();
        a전사타입B.공격();

        전사타입C a전사타입C = new 전사타입C();
        a전사타입C.공격();

        전사타입D a전사타입D = new 전사타입D();
        a전사타입D.공격();
    }
}
abstract class 전사{
    무기 a무기;
    void 공격() {
        a무기.작동();
    }
}
class 전사타입A extends 전사 {
   전사타입A(){
       a무기 = new 칼();
   }
}
class 전사타입B extends 전사 {
    전사타입B(){
        a무기 = new 칼();
    }
}
class 전사타입C extends 전사 {
    전사타입C(){
        a무기 = new 활();
    }
}
class 전사타입D extends 전사 {
    전사타입D(){
        a무기 = new 활();
    }
}

abstract class 무기{
    String 무기이름;
    void 작동() {
        System.out.println(무기이름 + "로 공격");
    }
}
class 칼 extends 무기{
    칼() {
        무기이름 = "칼";
    }
}
class 활 extends 무기{
    활() {
        무기이름 = "활";
    }
}