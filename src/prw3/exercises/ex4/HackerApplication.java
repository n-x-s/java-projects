package prw3.exercises.ex4;

public class HackerApplication {
    public static void main(String[] args) {
        Encrypter encrypter = new Encrypter();
        String encryptionText = encrypter.encrypt("Hello World! 1 / 2 is my favorite equasion. 4 * 2 equals 8. Is this it?");
        System.out.print(encryptionText + "\n");

        Decrypter decrypter = new Decrypter();
        String decryptedText = decrypter.decrypt(encryptionText);
        System.out.print(decryptedText);
    }
}
