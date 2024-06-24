package org.example2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Main2 {
    public static void main(String[] args) {
        // 일반
        int[] arr = {33, 2, 55, 4, 51, 6, 71, 18, 29, 10};

        List<Integer> resultAl = new ArrayList<Integer>();

        // filter
        for(int n : arr) if (n % 2 == 0) resultAl.add(n);

        // map
        for (int i = 0; i < resultAl.size(); i++) {
            int newValue = resultAl.get(i) * 2;
            resultAl.set(i, newValue);
        }
        System.out.println(resultAl);

        // Stream
        arr = new int[]{33, 2, 55, 4, 51, 6, 71, 18, 29, 10};

        resultAl = Arrays.stream(arr)
                .filter(e -> e % 2 == 0)
                .map(e -> e * 2)
                .boxed()
                // 밑에 .collect(Collectors.toList());를 썼을 때
                // no instance(s) of type variable(s)가 뜨면 boxed();를 넣어주면 된다.(new Integer의 기능)
                .collect(Collectors.toList());

        System.out.println(resultAl);
    }
}



