package com.intzi.template_method;

//Template method pattern. The subclass determines the implementation of the algorithm.
public abstract class FileProcessor {
	
	public void fileOpenEditAndSave() {
		openFile();
		writeFile();
		saveToTheDB();
	}
	
	protected abstract void writeFile();
	protected abstract void openFile();
	
	protected void saveToTheDB() {
		System.out.println("Save to the Database");
	}
	
}
