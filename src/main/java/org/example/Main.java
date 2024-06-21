package org.example;
// 문제 : 아래가 실행되도록 해주세요.
// 조건 : 배열을 사용할 수 없습니다.

class Main {
    public static void main(String[] args) {
        사람인력관리소 a사람인력관리소 = new 사람인력관리소();

        a사람인력관리소.add사람("홍길순", 33);
        // 나이가 33살인 1번째 사람(홍길순)이 추가되었습니다.
        a사람인력관리소.add사람("홍길동", 20);
        // 나이가 20살인 2번째 사람(홍길동)이 추가되었습니다.
        a사람인력관리소.add사람("임꺽정", 30);
        // 나이가 30살인 3번째 사람(임꺽정)이 추가되었습니다.

        사람 a사람1 = a사람인력관리소.get사람(1);
        a사람1.자기소개();
        // 저는 1번, 홍길순, 33살 입니다.

        사람 a사람2 = a사람인력관리소.get사람(2);
        a사람2.자기소개();
        // 저는 2번, 홍길동, 20살 입니다.

        사람 a사람3 = a사람인력관리소.get사람(3);
        a사람3.자기소개();
        // 저는 3번, 임꺽정, 30살 입니다.
    }
}
class 사람인력관리소 {
    사람 a1번사람;
    사람 a2번사람;
    사람 a3번사람;

    int lastId;
    void add사람(String name, int age) {
        사람 a사람 = new 사람();
        a사람.id = lastId + 1;
        a사람.age = age;
        a사람.name = name;
        System.out.printf("나이가 %d살인 %d번째 사람(%s)가 추가되었습니다.\n", a사람.age, a사람.id, a사람.name);
        if (a사람.id == 1) {
            a1번사람 = a사람;
        }
        if (a사람.id == 2) {
            a2번사람 = a사람;
        }
        if (a사람.id == 3) {
            a3번사람 = a사람;
        }

        this.lastId = a사람.id;

    }
    사람 get사람(int num) {
        if (num == 1) {
            return a1번사람;
        }
        if (num == 2) {
            return a2번사람;
        }
        if (num == 3) {
            return a3번사람;
        }
        return null;
    }
}
class 사람 {
    String name;
    int age;
    int id;
    void 자기소개() {
        System.out.printf("저는 %d번, %s, %d살 입니다.\n", this.id, this.name, this.age);
    }
}
