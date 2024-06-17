package org.example2;

public class Main2 {
    public static void main(String[] args) {
        boolean rs = Math.isEvenNumber(2);
        System.out.println(rs);

        rs = Math.isEvenNumber(3);
        System.out.println(rs);

        rs = Math.isEvenNumber(5);
        System.out.println(rs);
        //true
    }
}
class Math {

    public static boolean isEvenNumber(int n) { //짝수 판별기
        return n % 2 == 0;
    }
}
