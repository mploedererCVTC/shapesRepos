package edu.cvtc.java;

public class ShapesTest extends ShapeFactory {
	
	public ShapesTest(Dialog dialog) {
		super(dialog);
		// TODO Auto-generated constructor stub
	}

	public static void main (String[] args) {
		ShapeFactory newShapeFactory = new ShapeFactory(new MessageBox());
		
		Cuboid cuboid96 = (Cuboid) newShapeFactory.make(ShapeType.CUBOID);
		cuboid96.getMessageBox().show("This returns a Cuboid", "confusedAF Success");
		
		Cylinder cylinder96 = (Cylinder) newShapeFactory.make(ShapeType.CYLINDER);
		cylinder96.getMessageBox().show("This returns a Cylinder", "cylinder96 Success");
		
		Sphere sphere96 = (Sphere) newShapeFactory.make(ShapeType.SPHERE);
		sphere96.getMessageBox().show("This returns a Sphere", "sphere96 Success");
		
		// Cylinder
		//Cylinder newCylinder = new Cylinder(new MessageBox(), 10 , 2);
		
		//newCylinder.render();
		
		// Cuboid
		//Cuboid newCuboid = new Cuboid(new MessageBox(),12 , 3 , 9);
		
		//newCuboid.render();
		
		// Sphere
		//Sphere newSphere = new Sphere (new MessageBox(), 14);
		
		//newSphere.render();
		
		//System.out.println(newShapeFactory.getDialog());
		
	
			}
}
