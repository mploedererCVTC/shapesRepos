package edu.cvtc.java;

import javax.swing.JOptionPane;

public class Sphere extends Shape {
	
	// Attributes
	private float radius = 0;
	
	// Constructor
	public Sphere (float radius) {
		this.radius = radius;
	}
	
	// Getter & Setter
	public float getRadius() {
		return radius;
	}

	private void setRadius(float radius) {
		this.radius = radius;
	}
	
	// Methods for Calulations on  given shape
	@Override
	public float surfaceArea() {
		
		float surfaceArea =(float) (4 * Math.PI * Math.pow(radius, 2));
		
		return surfaceArea;
	}
	
	@Override
	public float volume() {
		
		float volume = (float) ((4 / 3) * Math.PI * Math.pow(radius, 3));
		
		return volume;
	}
	
	@Override
	public void render() {
		
		//  Output Message for Sphere
		JOptionPane.showMessageDialog(null,"Sphere Surface Area " + surfaceArea() + "Sphere Volume " + volume(), "Sphere Calculation", JOptionPane.INFORMATION_MESSAGE);
	}

}
