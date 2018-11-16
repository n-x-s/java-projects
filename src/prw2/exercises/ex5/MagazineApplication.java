package prw2.exercises.ex5;

import prw2.exercises.ex1.Printer;

public class MagazineApplication {
    public static void main(String[] args) {
        Editor editor = new Editor();
        Printer printer = new Printer();

        Magazine favoriteAlbums = editor.writeMagazine();
        printer.printMagazine(favoriteAlbums);
    }
}
