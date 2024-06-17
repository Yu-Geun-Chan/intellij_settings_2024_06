package org.example;


class Main {
    public static void main(String[] args) {
//        boolean rs = Math.isPrimeNumber(1);
//        System.out.println("1은(는) 소수인가? : " + rs);
//
//        rs = Math.isPrimeNumber(2);
//        System.out.println("2은(는) 소수인가? : " + rs);
//
//        rs = Math.isPrimeNumber(4);
//        System.out.println("4은(는) 소수인가? : " + rs);
//
//        rs = Math.isPrimeNumber(7);
//        System.out.println("7은(는) 소수인가? : " + rs);
//
//        rs = Math.isPrimeNumber(5);
//        System.out.println("5은(는) 소수인가? : " + rs);


        int rs2 = Math.one_to_n_prime_numbers(10);
        System.out.println("rs2 : " + rs2);
        // rs = 4;
        rs2 = Math.one_to_n_prime_numbers(13);
        System.out.println("rs2 : " + rs2);
        // rs = 6;
    }
}

class Math {
    public static int one_to_n_prime_numbers(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (isPrimeNumber(i)) {
                System.out.println(i + "은(는) 소수이다.");
                count++;
            }
        }
        return count;
    }


    public static boolean isPrimeNumber(int num) {
        if (num == 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}




















