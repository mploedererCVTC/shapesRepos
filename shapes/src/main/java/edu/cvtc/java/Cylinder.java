package edu.cvtc.java;



public class Cylinder extends Shape implements Renderer {
	
	// Attributes
	private float radius = 0;
	private float height = 0;
	
	// Constructor
	public Cylinder (Dialog messageBox, float radius, float height) {
		super(messageBox);
		if(radius <= 0 || height <= 0) {
			System.out.println("Please enter a positive value greater than 0!");
		}else {
		this.radius = radius;
		this.height = height;
		}
	}
	
	// Getters & Setters
	public float getRadius() {
		return radius;
	}
	
	private void setRadius(float radius) {
		this.radius = radius;
	}
	
	public float getHeight() {
		return height;
	}
	
	private void setHeight(float height) {
		this.height = height;
	}
	
	// Methods for Calculations on  given shape
	@Override
	public float surfaceArea() {
		
		float surfaceArea = (float) ((2 * Math.PI * radius * height) + (2 * Math.PI *Math.pow(radius, 2)));
		return surfaceArea;
	}
	
	@Override
	public float volume() {
		
		float volume = (float) (Math.PI *Math.pow(radius, 2) * height);
		return volume;
	}
	
	
	public void render() {
		Dialog messageBox = getMessageBox();
		// Output Message for Cylinder
		//JOptionPane.showMessageDialog(null,"Cylinder Surface Area " + surfaceArea() + "Cylinder Volume " + volume(), "Cylinder Calculation", JOptionPane.INFORMATION_MESSAGE);
		messageBox.show("Cylinder Surface Area " + surfaceArea() + " Cylinder Volume " + volume(), "Cylinder Calculation");
	}


}
