package org.example;

import java.awt.*;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {

        String msg = greet("jin");
        // String 타입만을 갖는 msg라는 변수를 만들어서 greet라는 메서드를 호출하여 매개변수 name에 "jin"이라는 값을 넣겠다.
        System.out.println(msg);
        // msg의 값을 출력하겠다.

        Point point = createPoint(5, 10);
        // Point 타입만을 갖는 point라는 변수를 만들어 createPoint라는 메서드를 호출하여 매개변수 x와 y에 5와 10이라는 값을 넣겠다.
        System.out.println("Point create at(" + point.x + ", " + point.y + ")");
        // 문자열인 Point create at(" x의 값 , y의 값 ")을 출력하겠다.

        int[] evens = firstNEvenNumber(5);
        // 정수들 만을 갖는 evens라는 변수를 만들어 firstNEvenNumber라는 메서드를 호출하여 매개변수 n에 5라는 값을 넣겠다.
        System.out.println("frist 5 even numbers : " + Arrays.toString(evens));
        // 문자열인 frist 5 even numbers : + evens 배열의 값을 출력하겠다.
    }

    public static String greet(String name) {
    // String 타입만을 받을 수 있는 name이라는 매개변수를 가진 greet라는 메서드를 만들겠다.
        return "Hello, " + name + "!";
    // 리턴값으로 "Hello, " + name + "!"이라는 값을 남기겠다.
    }

    public static Point createPoint(int x, int y) {
    // 정수만을 받을 수 있는 x, y라는 매개변수를 가진 createPoint라는 메서드를 만들겠다.
        return new Point(x, y);
        // 리턴값으로 객체 Point(x, y)을 남기겠다.
    }

    public static int[] firstNEvenNumber(int n) {
        // 정수만을 받을 수 있는 n이라는 매개변수를 가진 firstNEvenNumber라는 메서드를 만들겠다.
        int[] evenNumbers = new int[n];
        // 정수들만을 가질 수 있는 evenNumbers라는 변수에 객체 int[n]을 컨트롤 할 수 있는 리모컨을 넣겠다.

        for (int i = 0, num = 2; i < n; num += 2) {
            // 시작조건 : 정수만을 가질 수 있는 i라는 변수와 num이라는 변수에 0과 2의 값을 넣는 것
            // 종료조건 : i의 값이 n의 값보다 작을 때 까지 -> 현상황에선 무한루프이다. 왜냐, i = 0, n = 5니까
            // 스텝 : num의 값은 2씩 계속 커진다.
            evenNumbers[i] = num;
            // evenNumbers i번째 인덱스에 num의 값을 넣겠다.
        }
        return evenNumbers;
        // 리턴값으로 evenNumbers를 남기겠다.
    }

}









