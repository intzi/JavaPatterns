package com.intzi.strategy;

public class TextFile {

    private String text;
    private EncryptStrategy encrypt;

    public TextFile(String text){
        this.text = text;
        encrypt = new FakeEncryptionOne();
    }

    public void encrypt(){
        text = encrypt.encrypt(text);
    }

    public void setEncrypt(EncryptStrategy encrypt){
        this.encrypt = encrypt;
    }

    @Override
    public String toString() {
        return text;
    }
}
