package prw3.exercises.ex4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Rubbish {

    private List<String> rubbish = Arrays.asList("!", "@", "#", "$", "%", "&", "*", "+", "-", "=");
    private List<String> replaceRubbish = Arrays.asList("\\!", "\\@", "\\#", "\\$", "\\%", "\\&", "\\*", "\\+", "\\-", "\\=");
    private List<String> removeRubbish = Arrays.asList("", "", "", "", "", "", "", "", "", "");
    private String randomRubbish;


    public String generate(String text) {
        randomRubbish = encryptWithRubbish(text);
        return randomRubbish;
    }

    private String encryptWithRubbish(String text) {

        List<String> splitText = splitIntoLetters(text);
        String encryptedText = "";

        for (int position = 0; position < splitText.size(); position++) {
            encryptedText += splitText.get(position) + generateRubbish();
        }

        return encryptedText;
    }

    private String generateRubbish() {

        Random random = new Random();
        Integer randomRubbishAmount = random.nextInt(5) + 1;
        String randomRubbish = "";

        for (int position = 0; position < randomRubbishAmount; position++) {
//            Integer randomRubbishCharPos = random.nextInt(rubbish.size());
            String randomRubbishChar = rubbish.get(0);
            Collections.shuffle(rubbish);
            randomRubbish += randomRubbishChar;
        }

//        System.out.print(randomRubbishAmount);

        return randomRubbish;
    }

    public String remove(String originalText) {

        SearchAndReplace searchAndReplace = new SearchAndReplace();
        String text = searchAndReplace.start(originalText, replaceRubbish, removeRubbish);

        return text;
    }


    private List<String> splitIntoLetters(String text) {
        String[] split = text.split("");
        return Arrays.asList(split);

    }

}
