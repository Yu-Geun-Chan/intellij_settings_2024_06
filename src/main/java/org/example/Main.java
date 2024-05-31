package org.example;


import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int n = 10, firstTerm = 0, secondTerm = 1;

        for (int i = 1; i <= n; ++i) {
            System.out.println(firstTerm + ", ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
            // 피보나치 수열
        }
    }
}





