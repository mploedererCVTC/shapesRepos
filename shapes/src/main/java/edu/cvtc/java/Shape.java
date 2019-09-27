package edu.cvtc.java;

abstract public class Shape {
	
	private Dialog messageBox;
	
	protected Dialog getMessageBox() {
		return messageBox;
	}
	private void setMessageBox(Dialog messageBox) {
		this.messageBox = messageBox;
	}
	public Shape(Dialog messageBox) {
		this.messageBox = messageBox;
	}
	
	// Abstract Methods
	abstract public float surfaceArea();
	abstract public float volume();

}
