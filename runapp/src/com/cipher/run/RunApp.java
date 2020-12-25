package com.cipher.run;

import com.brandon.CipherClass;

public class RunApp {

    public static void main(String[] args) {

        CipherClass cipherClass = new CipherClass();
        String result = cipherClass.Encryption("This is java", 1);
        System.out.println("Encrypted : " + result);
    }

}
