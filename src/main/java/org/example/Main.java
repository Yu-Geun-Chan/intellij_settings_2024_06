package org.example;


class Main {
    public static void main(String[] args) {

        boolean[] arr1 = new boolean[3];
        arr1[0] = true;
        arr1[1] = false;
        arr1[2] = true;
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);

        double[] arr2 = new double[3];
        arr2[0] = 3.14;
        arr2[1] = 7.77;
        arr2[2] = 11.11;
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);

        int[] arr3 = new int[10];
        for (int i = 0; i <= arr3.length -1; i++) {
            arr3[i] = i + 1;
            System.out.printf("arr3 : %d\n", arr3[i]);
        }

    }
}





