package Assignments.Arrays;

import java.security.SecureRandom;

public class WriteAAlpaNumericstringShouldBeLength6Charater {

//    write a AlphaNumeric String that should be length 6 character
private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private static final SecureRandom random = new SecureRandom();

   private static final int lenght = 6;

    public static void main(String[] args) {
          System.out.println(alphanumericString());
}

static String alphanumericString(){
StringBuilder stringBuilder = new StringBuilder(lenght);
    for (int i = 0; i < lenght; i++) {
            int index = random.nextInt(CHARACTERS.length());
            stringBuilder.append(CHARACTERS.charAt(index));
    }
    return stringBuilder.toString();
}

}
