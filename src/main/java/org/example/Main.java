package org.example;

class Main {
    public static void main(String[] args) {
        v2();
    }

    static void v2() {
        Article[] articles = new Article[100];

        articles[0] = new Article();
        // 사용자가 제목과 내용을 입력하고 글쓰기 버튼을 눌렀다.
        // 방금 얘가 쓴 글을 내 DB에 저장시켜.
        articles[1] = new Article();
        // 사용자가 제목과 내용을 입력하고 글쓰기 버튼을 눌렀다.
        // 방금 얘가 쓴 글을 내 DB에 저장시켜.
        articles[2] = new Article();
        // 사용자가 제목과 내용을 입력하고 글쓰기 버튼을 눌렀다.
        // 방금 얘가 쓴 글을 내 DB에 저장시켜.
        articles[3] = new Article();
        // 사용자가 제목과 내용을 입력하고 글쓰기 버튼을 눌렀다.
        // 방금 얘가 쓴 글을 내 DB에 저장시켜.
        articles[4] = new Article();
        // 사용자가 제목과 내용을 입력하고 글쓰기 버튼을 눌렀다.
        // 방금 얘가 쓴 글을 내 DB에 저장시켜.

        for (int i = 0; i < Article.lastId; i++) {
            System.out.println(articles[i].id);
        }
    }

    static void v1() {
        Article[] articles = new Article[100];

        articles[0] = new Article();
        // 사용자가 제목과 내용을 입력하고 글쓰기 버튼을 눌렀다.
        // 방금 얘가 쓴 글을 내 DB에 저장시켜.
        articles[1] = new Article();
        // 사용자가 제목과 내용을 입력하고 글쓰기 버튼을 눌렀다.
        // 방금 얘가 쓴 글을 내 DB에 저장시켜.
        articles[2] = new Article();
        // 사용자가 제목과 내용을 입력하고 글쓰기 버튼을 눌렀다.
        // 방금 얘가 쓴 글을 내 DB에 저장시켜.
        articles[3] = new Article();
        // 사용자가 제목과 내용을 입력하고 글쓰기 버튼을 눌렀다.
        // 방금 얘가 쓴 글을 내 DB에 저장시켜.
        articles[4] = new Article();
        // 사용자가 제목과 내용을 입력하고 글쓰기 버튼을 눌렀다.
        // 방금 얘가 쓴 글을 내 DB에 저장시켜.

        for (int i = 0; i < Article.lastId; i++) {
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
