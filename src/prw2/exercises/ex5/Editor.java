package prw2.exercises.ex5;

import prw2.exercises.ex1.Article;

public class Editor {

    Magazine writeMagazine() {
        Magazine magazine = new Magazine("Favorite Albums");

        magazine.add(new Article("Glory Sound Prep", "Jon Bellion"));
        magazine.add(new Article("SYRE", "Jaden Smith"));
        magazine.add(new Article("ONEPOINTFIVE", "Aminé"));

        return magazine;

    }

}
