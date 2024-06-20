package org.example;

import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {

        List<Integer> ages = new ArrayList<Integer>();
        ages.add(20); // index : 0
        ages.add(22); // index : 1
        ages.add(33); // index : 2


        ages.remove(1);

        ages.add(1, 55);

        System.out.println("철수 나이 : " + ages.get(0));
        System.out.println("영희 나이 : " + ages.get(1));
        System.out.println("영수 나이 : " + ages.get(2));


        System.out.println(ages.size());

    }
}