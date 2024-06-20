package org.example2;

import java.util.HashMap;
import java.util.Map;

public class Main2 {
    public static void main(String[] args) {

        Map<String, Integer> agesMap = new HashMap<>();
        agesMap.put("철수", 20); // index : 철수(key가 맞다, 이해를 돕기 위해 index라고 표현)
        agesMap.put("영희", 22); // index : 영희(key가 맞다, 이해를 돕기 위해 index라고 표현)
        agesMap.put("영수", 33); // index : 영수(key가 맞다, 이해를 돕기 위해 index라고 표현)


        agesMap.remove("영희");


        System.out.println("철수 나이 : " + agesMap.get("철수"));
        System.out.println("영희 나이 : " + agesMap.get("영희"));
        System.out.println("영수 나이 : " + agesMap.get("영수"));


        System.out.println(agesMap.size());
    }
}
