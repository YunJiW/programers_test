package org.example.warrior;


// 문제 : 아래가 실행되도록 해주세요.

class Main {
    public static void main(String[] args) {
        전사 a전사1 = new 전사();

        a전사1.a왼손무기 = new 칼();
        a전사1.공격();
        // 출력 => 전사가 왼손으로 칼(을)를 사용합니다.

        전사 a전사2 = new 전사();
        a전사2.a왼손무기 = new 창();
        a전사2.a오른손무기 = new 도끼();
        a전사2.공격();
        // 출력 => 전사가 왼손으로 창(을)를 사용합니다.
        // 출력 => 전사가 오른손으로 도끼(을)를 사용합니다.
    }
}
class 전사{
    무기 a왼손무기;
    무기 a오른손무기;

    void 공격(){
        //왼손에 들고있으면 공격실행
        if(a왼손무기 != null){
            a왼손무기.사용("왼손","전사");
        }

        //오른손에 들고있으면 공격 실행
        if(a오른손무기 != null){
            a오른손무기.사용("오른손","전사");
        }
    }

}
class 무기{
    String 무기명;
    void 사용(String 팔,String 직업){
        System.out.println(직업+"가 " +팔+"으로 " +무기명+"(을)를 사용합니다.");
    }
}
class 칼 extends 무기{
    칼(){
        this.무기명 = "칼";
    }
}

class 도끼 extends 무기{
    도끼(){
        this.무기명 = "도끼";
    }

}

class 창 extends 무기{
    창(){
        this.무기명 = "창";
    }
}