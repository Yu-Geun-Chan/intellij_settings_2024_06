package org.example;


class Main {
    public static void main(String[] args) {

        boolean[] arr1 = new boolean[3];
        arr1[0] = true;
        arr1[1] = false;
        arr1[2] = true;
        for (int i = 0; i <= arr1.length - 1; i++) {
            System.out.printf("arr1 : %s\n", arr1[i]);
        }


        double[] arr2 = new double[3];
        arr2[0] = 3.14;
        arr2[1] = 7.77;
        arr2[2] = 11.11;
        for (int i = 0; i <= arr2.length - 1; i++) {
            System.out.printf("arr2 : %s\n", arr2[i]);
        }


        int[] arr3 = new int[10];
        for (int i = 0; i <= arr3.length - 1; i++) {
            arr3[i] = i + 1;
            System.out.printf("arr3 : %d\n", arr3[i]);
        }

    }
}





