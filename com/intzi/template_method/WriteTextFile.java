package com.intzi.template_method;

public class WriteTextFile extends FileProcessor {
	
	protected void openFile() {
		System.out.println("Open Text File");
	}
	
	protected void writeFile() {
		System.out.println("Write Text File");
	}
	
	public void textMethod() {
		System.out.println("Text Method");
	}
	
}
