package org.example.soldier.no3;

// 문제 : 아래가 실행되도록 해주세요.

class Main {
    public static void main(String[] args) {
        전사 a전사 = new 홍길동();
        a전사 = new 홍길순();
    }
}
class 전사{
    String name;
    void 공격(){

    }
}

class 홍길동 extends 전사{
    홍길동(){
        this.name = "홍길동";
    }
}
class 홍길순 extends 전사{
    public 홍길순() {
        this.name = "홍길순";
    }

}