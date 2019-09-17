package edu.cvtc.java;

import javax.swing.JOptionPane;

public class Cuboid extends Shape {

	// Attributes
	private float width = 0;
	
	private float height = 0;

	private float depth = 0;
	
	// Constructor
	public Cuboid (float width, float height, float depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	// Getters & Setters
	public float getWidth() {
		return width;
	}

	private void setWidth(float width) {
		this.width = width;
	}

	public float getHeight() {
		return height;
	}

	private void setHeight(float height) {
		this.height = height;
	}

	public float getDepth() {
		return depth;
	}

	private void setDepth(float depth) {
		this.depth = depth;
	}
	
	// Methods for Calulations on  given shape
	@Override
	public float surfaceArea() {
		float surfaceArea = 2 * (depth * width) + 2 * (width * height) + 2 * (depth * height);
		return surfaceArea;
	}
	
	@Override
	public float volume() {
		
		float volume = depth * width * height;
		return volume;
	}
	
	@Override
	public void render() {
		
		// Output Message for Cuboid
		JOptionPane.showMessageDialog(null,"Cuboid Surface Area " + surfaceArea() + "Cuboid Volume " + volume(), "Cuboid Calculation", JOptionPane.INFORMATION_MESSAGE);
	}
}
