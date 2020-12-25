package com.brandon;

public class CipherClass {

    public String Encryption(String input, int key){

        StringBuilder encrypted = new StringBuilder(input);
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String alphabet2 = alphabet.toLowerCase();

        String keyedAlphabet = alphabet.substring(key) + alphabet.substring(0, key);

        for (int i = 0; i < encrypted.length(); i++) {
            char currChar = encrypted.charAt(i);
            int index = alphabet.indexOf(currChar);
            if (index != -1){
                char newChar = keyedAlphabet.charAt(index);
                encrypted.setCharAt(i, newChar);
            }

            index = alphabet2.indexOf(currChar);
            if (index != -1){
                String keyedAlphabet2 = keyedAlphabet.toLowerCase();
                char newChar = keyedAlphabet2.charAt(index);
                encrypted.setCharAt(i, newChar);
            }
        }

        return encrypted.toString();
    }

}
