package com.like_lions.quest;

import java.util.*;

/*# 문제 : 아래와 같이 작동하도록 해보세요.

        숫자를 입력해주세요(-1 : 종료) : 11
        숫자를 입력해주세요(-1 : 종료) : 2
        숫자를 입력해주세요(-1 : 종료) : 3
        숫자를 입력해주세요(-1 : 종료) : 44
        숫자를 입력해주세요(-1 : 종료) : 5
        숫자를 입력해주세요(-1 : 종료) : 6
        숫자를 입력해주세요(-1 : 종료) : 7
        숫자를 입력해주세요(-1 : 종료) : -1
        입력을 종료합니다.
        입력한 숫자(오름차순) : 2, 3, 5, 6, 7, 11, 44
        프로그램을 종료합니다.

 */

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        int idx = 0;
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("숫자를 입력해주세요(-1: 종료) : ");
            int a = sc.nextInt();
            if(a == -1)
                break;
            arr.add(a);



        }
        Collections.sort(arr);
        System.out.print("입력한 숫자(오름차순) : ");
        for(int num : arr){
            System.out.print(num + " ");
        }
        sc.close();
    }
}
