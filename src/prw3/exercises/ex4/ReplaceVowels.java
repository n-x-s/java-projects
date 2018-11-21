package prw3.exercises.ex4;

import java.util.Arrays;
import java.util.List;

public class ReplaceVowels {

    private List<String> search = Arrays.asList("a", "A", "e", "E", "i", "I", "o", "O", "u", "U");
    private List<String> replace = Arrays.asList("4", "4", "3", "3", "1", "1", "8", "8", "9", "9");
    private SearchAndReplace encrypter = new SearchAndReplace();

    String encrypt(String text) {
        text = encrypter.start(text, search, replace);
        return text;
    }

    String decrypt(String text) {
        text = encrypter.start(text, replace, search);
        return text;
    }

}
