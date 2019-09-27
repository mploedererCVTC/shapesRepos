package edu.cvtc.java;

import javax.swing.JOptionPane;

public class MessageBox implements Dialog{

	public int show(String message, String title) {
		JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
		return JOptionPane.OK_OPTION;
	}
	
	public MessageBox() {
		
	}

}
