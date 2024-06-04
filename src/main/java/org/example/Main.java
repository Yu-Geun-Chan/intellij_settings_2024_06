package org.example;

class Main {
    public static void main(String[] args) {


        int rs = 계산기.합(10, 20);
        System.out.println(rs);

        boolean rs2 = 계산기.is_bigger_than_b(10, 20);
        System.out.println(rs2);
        rs2 = 계산기.is_bigger_than_b(240, 20);
        System.out.println(rs2);
        rs2 = 계산기.is_bigger_than_b(20, 20);
        System.out.println(rs2);
    }
}

class 계산기 {

    static boolean is_bigger_than_b(int a, int b) {
        if (a > b) {
            return true;
        }
        return false;
    }

    static int 합(int a, int b) {
        return a + b;
    }

}





