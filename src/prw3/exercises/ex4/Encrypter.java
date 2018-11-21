package prw3.exercises.ex4;

import java.util.Arrays;
import java.util.List;

public class Encrypter {

    public String encrypt(String originalText) {

        String encryptedText = "";

        ReplaceNumbers replaceNumbers = new ReplaceNumbers();
        encryptedText = replaceNumbers.encrypt(originalText);

        ReplaceMathSymbols replaceMathSymbols = new ReplaceMathSymbols();
        encryptedText = replaceMathSymbols.encrypt(encryptedText);

        ReplaceVowels replaceVowels = new ReplaceVowels();
        encryptedText = replaceVowels.encrypt(encryptedText);

        encryptedText = removePunctuation(encryptedText);

        Rubbish rubbish = new Rubbish();
        encryptedText = rubbish.generate(encryptedText);

//        System.out.print(encryptedText);
        return encryptedText;
    }

    String removePunctuation(String text) {
        List<String> punctuationList = Arrays.asList("\\:", "\\;", "\\?", "\\!", "\\_", "\\-");

        for (int position = 0; position < punctuationList.size(); position++) {
            text = text.replaceAll(punctuationList.get(position), "");
        }
        return text;

    }

}