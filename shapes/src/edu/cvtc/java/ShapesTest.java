package edu.cvtc.java;

public class ShapesTest {
	
	public static void main (String[] args) {
		
		// Cylinder
		Cylinder newCylinder = new Cylinder(10 , 2);
		
		newCylinder.render();
		
		// Cuboid
		Cuboid newCuboid = new Cuboid(12 , 3 , 9);
		
		newCuboid.render();
		
		// Sphere
		Sphere newSphere = new Sphere (14);
		
		newSphere.render();
		
			}
}
