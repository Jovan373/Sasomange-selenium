package Base;

import java.util.Random;

public class CharacterGenerator{

    private static final String letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String numbers = "0123456789";
    private static final String validCharacters = letters + numbers;
    private static final Random r = new Random();

    public static String generateCharacters(int length) {
        StringBuilder randomPassword = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index = r.nextInt(validCharacters.length());
            randomPassword.append(validCharacters.charAt(index));
        }
        return randomPassword.toString();
    }
}
