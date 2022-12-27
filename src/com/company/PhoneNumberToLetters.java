package com.company;

/*Standard telephone keypads contain the zero through nine.
* the numbers two through nine each have three letters associated with them.
* for example  , whose number 686-2377 might use the corresponds (2- A B C, 3 - D E F, 4 - G H I ...)
* java code with recursion....
* */

public class PhoneNumberToLetters {
    private static final String[] DIGIT_LETTERS = {
            "0", "1", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"
    };

    public static void generateWords(String phoneNumber, String word) {
        if (phoneNumber.isEmpty()) {
            System.out.println(word);
            return;
        }
        for (int i = 0; i < DIGIT_LETTERS[phoneNumber.charAt(0) - '0'].length(); i++) {
            char c = DIGIT_LETTERS[phoneNumber.charAt(0) - '0'].charAt(i);
            generateWords(phoneNumber.substring(1), word + c);
        }
    }

}

