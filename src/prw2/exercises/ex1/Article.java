package exercises.ex1;

public class Article {
    private String title;
    private String text;

    public Article(String title, String text) {
        this.title = title;
        this.text = text;
    }

    String getTitle() {
        return title;
    }

    String getText() {
        return text;
    }
}
