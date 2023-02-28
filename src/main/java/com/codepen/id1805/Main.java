package com.codepen.id1805;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;

        machine machines[] = new machine[N];
        for(int idx = 0; idx <N;idx++){
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            int gas = Integer.parseInt(st.nextToken());
            machines[idx] = new machine(num,gas);
        }
        Arrays.sort(machines,new Comparator<machine>(){

            @Override
            public int compare(machine o1, machine o2) {
                return o1.getnumber() - o2.getnumber();
            }
        });

        for(int idx= 0; idx < N;idx++)
        {
            System.out.print(machines[idx].getnumber() + " " + machines[idx].getgas());
            System.out.println();
        }

    }
}

class machine implements Comparable<machine>{
    private int number;
    private int gas;

    machine(int number, int gas){
        this.number = number;
        this.gas = gas;
    }

    int getnumber(){
        return number;
    }
    int getgas(){
        return gas;
    }

    @Override
    public int compareTo(machine o) {
        if(this.number > o.getnumber())
            return 1;
        else
            return -1;
    }
}

/*




        HashMap<Integer,Integer> map = new HashMap<>();

        List<Integer> key = new ArrayList<>(map.keySet());

        Collections.sort(key);
        for(int keys : key){
            System.out.print(keys + " " + map.get(keys));
            System.out.println();
        }




 */
