package prw3.exercises.ex4;

import java.util.List;

public class SearchAndReplace {

    public String start(String originalText, List<String> search, List<String> replace) {
        String replacedText = originalText;

        for (int position = 0; position < search.size(); position++) {
            replacedText = replacedText.replaceAll(search.get(position), replace.get(position));
        }
        return replacedText;
    }

}
