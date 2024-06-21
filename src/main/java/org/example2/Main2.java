package org.example2;

import java.util.Scanner;

class Main2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] strs = sc.nextLine().split(" ");

        long sum = 0;

//        for(int i = 0; i < strs.length; i++) {
//            sum += Long.parseLong(strs[i]);
//        }

        for (String strData : strs) { // 향상된 for 문
            sum += Long.parseLong(strData);
        }

        System.out.println(sum);

        sc.close();
    }
}
