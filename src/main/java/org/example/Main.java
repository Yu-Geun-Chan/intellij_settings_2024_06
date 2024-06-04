package org.example;

class Main {
    public static void main(String[] args) {
        계산기.합(10, 20);
        계산기.합(20, 50);
        계산기.합(30, 40);

//        계산기.합();
//        계산기.합(true, 40);
//        계산기.합(10, 40, 40);
//        계산기.합(9);



    }
}

class 계산기 {
    int a = 40;

    static void 합(int i, int j) {
        System.out.println("i : " + i);
        System.out.println("j : " + j);
    }
}




