package com.company;


public class NumGenerator {

/*
* Standard telephone keypads contain the zero through nine.
* the numbers two through nine each have three letters associated with them.
* for example  , whose number 686-2377 might use the corresponds (2- A B C, 3 - D E F, 4 - G H I ...)
* */


    char[][] numberLetters = {
            {'0', '0', '0'}, {'1', '1', '1'}, {'A', 'B', 'C'},
            {'D', 'E', 'F'}, {'G', 'H', 'I'}, {'J', 'K', 'L'},
            {'M', 'N', 'O'}, {'P', 'R', 'S'},
            {'T', 'U', 'V'}, {'W', 'X', 'Y'}};
    char[] wordNum = new char [7];



    public void phoneNum( String phoneNumber) {

        try {
            char[] chars = phoneNumber.toCharArray();
            int[] digit = new int[chars.length];


            int count = 0;
            for (int i = 0; i < chars.length; i++) {
                digit[i] = Integer.parseInt(String.valueOf(chars[i]));

            }

            for (int i = 0; i < 3; i++) {
                wordNum[0] = numberLetters[digit[0]][i];

                for (int j = 0; j < 3; j++) {
                    wordNum[1] = numberLetters[digit[1]][j];
                    for (int k = 0; k < 3; k++) {
                        wordNum[2] = numberLetters[digit[2]][k];
                        for (int l = 0; l < 3; l++) {
                            wordNum[3] = numberLetters[digit[3]][l];
                            for (int m = 0; m < 3; m++) {
                                wordNum[4] = numberLetters[digit[4]][m];
                                for (int n = 0; n < 3; n++) {
                                    wordNum[5] = numberLetters[digit[5]][n];
                                    for (int o = 0; o < 3; o++) {
                                        wordNum[6] = numberLetters[digit[6]][o];
                                        count++;

                                        System.out.println(wordNum);

                                    }
                                }
                            }

                        }
                    }
                }
                System.out.println(count+ " elements");
            }

        }catch (Exception exception){
            System.err.println( "Error !! The number must be seven digit.");
        }

    }

}
