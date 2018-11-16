package exercises.ex5;

import exercises.ex1.Article;

public class Editor {

    Magazine writeMagazine() {
        Magazine magazine = new Magazine("Favorite Albums");

        magazine.add(new Article("Flowerboy", "flowers and stuff"));
        magazine.add(new Article("SYRE", "Story of a Sunset"));
        magazine.add(new Article("ONEPOINTFIVE", "strange things"));

        return magazine;

    }

}
