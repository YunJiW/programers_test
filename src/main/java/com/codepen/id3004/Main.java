package com.codepen.id3004;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int number[] = new int[N];
        int sortnum[] = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int idx = 0; idx <N;idx++){
            int num = Integer.parseInt(st.nextToken());
            number[idx] = num;
            sortnum[idx] =num;
        }
        Arrays.sort(sortnum);
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int idx= 0; idx <N;idx++)
        {
            map.put(sortnum[idx],idx);
        }
        for(int idx = 0; idx <N;idx++){
            System.out.print(map.get(number[idx])+" ");
        }
    }
}
