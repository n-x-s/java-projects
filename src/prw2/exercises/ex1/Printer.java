package prw2.exercises.ex1;

import prw2.exercises.ex5.Magazine;

import java.util.List;

public class Printer {
    public void print(Article article) {
        System.out.println("TITLE:" + article.getTitle() + "\nCONTENT:" + article.getText());
    }
    public void printMagazine(Magazine magazine) {
        System.out.println("Magazine Edition 001: " + magazine.getTitle());
        List<Article> allArticles = magazine.getArticles();

        for (int article_num = 0; article_num < allArticles.size(); article_num++) {
            System.out.println(article_num+1 + ": " + allArticles.get(article_num).getTitle() + "\n" + allArticles.get(article_num).getText() + "\n");
        }
    }
}
