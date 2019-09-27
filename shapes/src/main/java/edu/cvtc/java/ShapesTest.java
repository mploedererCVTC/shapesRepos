package edu.cvtc.java;

public class ShapesTest {
	
	public static void main (String[] args) {
		// Cylinder
		Cylinder newCylinder = new Cylinder(new MessageBox(), 10 , 2);
		
		newCylinder.render();
		
		// Cuboid
		Cuboid newCuboid = new Cuboid(new MessageBox(),12 , 3 , 9);
		
		newCuboid.render();
		
		// Sphere
		Sphere newSphere = new Sphere (new MessageBox(), 14);
		
		newSphere.render();
			}
}
