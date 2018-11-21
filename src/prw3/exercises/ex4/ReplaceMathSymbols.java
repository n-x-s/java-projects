package prw3.exercises.ex4;

import java.util.Arrays;
import java.util.List;

public class ReplaceMathSymbols {

    private List<String> search = Arrays.asList("\\+", "\\-", "\\*", "\\/");
    private List<String> replace = Arrays.asList("plus", "minus", "times", "divided by");
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
