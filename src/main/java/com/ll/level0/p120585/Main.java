package com.ll.level0.p120585;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

    }
}
class Solution{
    public int solution(int[] array,int height){
        int check =0;
        for(int idx =0 ;idx <array.length;idx++){
            if(height < array[idx])
                check+=1;
        }
        return check;
    }
}