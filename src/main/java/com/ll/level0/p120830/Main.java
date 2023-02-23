package com.ll.level0.p120830;

public class Main {
    public static void main(String[] args) {

    }
}
class Solution{
    public int solution(int n,int k){
        if(n >= 10)
            return (n*12000) + (k - n/10) *2000;
        else
            return n*12000 + k*2000;
    }
}