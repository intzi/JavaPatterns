package com.intzi.strategy;

public class FakeEncryptionTwo implements EncryptStrategy {
    @Override
    public String encrypt(String text) {
        String encryptedText = "";

        for(char c : text.toCharArray()){
            if((int)c > 80){
                encryptedText += (char)(c+2);
            }else{
                encryptedText += (char)(c-3);
            }
        }

        return encryptedText;
    }
}
