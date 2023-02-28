package com.like_lions.quest.list;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        // new Sol1().run();
        // new Sol2().run();
        new Sol3().run();
    }
}

class Sol1 {

    public void run() {
        Scanner sc = new Scanner(System.in);

        System.out.printf("숫자를 입력해주세요(-1 : 종료) : ");
        int n1 = sc.nextInt();

        System.out.printf("숫자를 입력해주세요(-1 : 종료) : ");
        int n2 = sc.nextInt();

        System.out.println("입력을 종료합니다.");

        System.out.printf("입력한 숫자(오름차순) : %d, %d\n", n1, n2);

        System.out.println("프로그램을 종료합니다.");

        sc.close();
    }
}

class Sol2 {

    public void run() {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[20];
        Arrays.fill(numbers, -1);
        int numbersLastIndex = -1;

        while (true) {
            System.out.printf("숫자를 입력해주세요(-1 : 종료) : ");
            int num = sc.nextInt();

            if (num == -1) {
                System.out.println("입력을 종료합니다.");
                break;
            }

            numbersLastIndex++;
            numbers[numbersLastIndex] = num;
        }

        System.out.println(Arrays.toString(numbers));

        sc.close();
    }
}

class Sol3 {

    public void run() {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>();

        while (true) {
            System.out.printf("숫자를 입력해주세요(-1 : 종료) : ");
            int num = sc.nextInt();

            if (num == -1) {
                System.out.println("입력을 종료합니다.");
                break;
            }
            arr.add(num);
        }

        String s = arr.stream().sorted().map(e -> "" + e).collect(Collectors.joining(", "));



        System.out.printf("입력한 숫자(오름차순) : %s\n", s);
        System.out.println("프로그램을 종료합니다.");

        sc.close();
    }
}