package edu.cvtc.java;

public class Sphere extends Shape implements Renderer {
	
	// Attributes
	private float radius = 0;
	
	// Constructor
	public Sphere (Dialog messageBox, float radius) {
		super (messageBox);
		if(radius <= 0) {
			System.out.println("Please enter a positive value greater than 0!");
		}else {
		this.radius = radius;
		}
	}
	// Getter & Setter
	public float getRadius() {
		return radius;
	}

	private void setRadius(float radius) {
		this.radius = radius;
	}
	
	// Methods for Calculations on  given shape
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
	
	
	public void render() {
		
		//  Output Message for Sphere  
		//JOptionPane.showMessageDialog(null,"Sphere Surface Area " + surfaceArea() + "Sphere Volume " + volume(), "Sphere Calculation", JOptionPane.INFORMATION_MESSAGE);
		Dialog messageBox = getMessageBox();
		messageBox.show("Sphere Surface Area " + surfaceArea() + " Sphere Volume " + volume(), "Sphere Calculation");
	}

}
