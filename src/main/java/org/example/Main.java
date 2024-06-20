package org.example;


import java.util.ArrayList;
import java.util.List;


class Main {
    public static void main(String[] args) {
        v4();
    }

    // 실제로 사용하는 ArrayList 활용
    static void v4() {
        System.out.println("== v4 ==");
        List<Article> articles = new ArrayList<>();
        // <Article> : 제네릭(제약사항), 이제 Article 타입만 들어가야해.

        articles.add(new Article()); // 0번 Index
        articles.add(new Article()); // 1번 Index
        articles.add(new Article()); // 2번 Index
        articles.add(new Article()); // 3번 Index

        for (int i = 0; i < articles.size(); i++) { // article.size(); : 몇개 들어 있는지 함수로 호출
            Article article = articles.get(i);
            // Article 타입만 들어가라고 제약사항을 걸어놨기 때문에 수동형변환(캐스팅)을 하지 않아도 된다.
            System.out.println(article.id);
        }
    }

    // ArrayList 활용 버전 2
    static void v3() {
        System.out.println("== v3 ==");
        ArrayList<Article> articles = new ArrayList<>();
        // <Article> : 제네릭(제약사항), 이제 Article 타입만 들어가야해.

        articles.add(new Article()); // 0번 Index
        articles.add(new Article()); // 1번 Index
        articles.add(new Article()); // 2번 Index
        articles.add(new Article()); // 3번 Index

        for (int i = 0; i < articles.size(); i++) { // article.size(); : 몇개 들어 있는지 함수로 호출
            Article article = articles.get(i);
            // Article 타입만 들어가라고 제약사항을 걸어놨기 때문에 수동형변환(캐스팅)을 하지 않아도 된다.
            System.out.println(article.id);
        }
    }

    // ArrayList 활용 버전
    static void v2() {
        System.out.println("== v2 ==");
        ArrayList articles = new ArrayList<>(); // 가변적!

        articles.add(new Article()); // 0번 Index
        articles.add(new Article()); // 1번 Index
        articles.add(new Article()); // 2번 Index
        articles.add(new Article()); // 3번 Index

        for (int i = 0; i < articles.size(); i++) { // article.size(); : 몇개 들어 있는지 함수로 호출
            Article article = (Article) articles.get(i);
            // 무슨 타입을 넣겠다고 정해놓은 적이 없어서 Article 타입으로 수동형변환(캐스팅)을 진행해야한다.
            System.out.println(article.id);
        }
    }

    // 배열 쓴 버전
    static void v1() {
        System.out.println("== v1 ==");
        Article[] articles = new Article[100];

        int articleSize = 0;

        articles[0] = new Article();
        articleSize++;
        // 사용자가 제목과 내용을 입력하고 글쓰기 버튼을 눌렀다.
        // 방금 얘가 쓴 글을 내 DB에 저장시켜.
        articles[1] = new Article();
        articleSize++;
        // 사용자가 제목과 내용을 입력하고 글쓰기 버튼을 눌렀다.
        // 방금 얘가 쓴 글을 내 DB에 저장시켜.
        articles[2] = new Article();
        articleSize++;
        // 사용자가 제목과 내용을 입력하고 글쓰기 버튼을 눌렀다.
        // 방금 얘가 쓴 글을 내 DB에 저장시켜.
        articles[3] = new Article();
        articleSize++;
        // 사용자가 제목과 내용을 입력하고 글쓰기 버튼을 눌렀다.
        // 방금 얘가 쓴 글을 내 DB에 저장시켜.


        for (int i = 0; i < articleSize; i++) {
            System.out.println(articles[i].id);
        }
    }
}

class Article {
    static int lastId;

    int id;
    String regDate;

    static {
        lastId = 0;
    }

    Article() {
        this(lastId + 1, "2024-12-12 12:12:12");
        lastId++;

    }

    Article(int id, String regDate) {
        this.id = id;
        this.regDate = regDate;
    }
}
