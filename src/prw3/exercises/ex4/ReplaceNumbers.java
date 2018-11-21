package prw3.exercises.ex4;

import java.util.Arrays;
import java.util.List;

public class ReplaceNumbers {

    private List<String> search = Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9");
    private List<String> replace = Arrays.asList("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine");
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
