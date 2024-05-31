package org.example;


import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String[] arr = s.split("");

        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print("[" + arr[i] + "]");
        }

    }
}




