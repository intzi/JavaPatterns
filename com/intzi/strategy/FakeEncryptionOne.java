package com.intzi.strategy;

public class FakeEncryptionOne implements EncryptStrategy {
    @Override
    public String encrypt(String text) {
        String encryptedText = "";

        for(char c : text.toCharArray()){
            encryptedText += (char)(c+2);
        }

        return encryptedText;
    }
}
