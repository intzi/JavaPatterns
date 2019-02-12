package com.intzi.template_method;

public class WriteXML extends FileProcessor {
	
	protected void openFile() {
		System.out.println("Open XML");
	}
	
	protected void writeFile() {
		System.out.println("Write XML");
	}
	
	public void xmlMethod() {
		System.out.println("XML Method");
	}
	
}
