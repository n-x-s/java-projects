package prw3.exercises.ex4;

public class Decrypter {

    public String decrypt(String originalText) {

        String decryptedText = "";

        Rubbish rubbish = new Rubbish();
        decryptedText = rubbish.remove(originalText);

        ReplaceVowels replaceVowels = new ReplaceVowels();
        decryptedText = replaceVowels.decrypt(decryptedText);


        ReplaceMathSymbols replaceMathSymbols = new ReplaceMathSymbols();
        decryptedText = replaceMathSymbols.decrypt(decryptedText);

        ReplaceNumbers replaceNumbers = new ReplaceNumbers();
        decryptedText = replaceNumbers.decrypt(decryptedText);

//        decryptedText = removePunctuation(decryptedText);


        return decryptedText;
    }

}
