package edu.cvtc.java;

public class ShapeFactory {
	
	private Dialog dialog;
	
	private void setDialog(Dialog dialog) {
		this.dialog = dialog;
	}
	
	private Dialog getDialog() {
		return dialog;
	}
	
	public  ShapeFactory(Dialog dialog) {
		setDialog(dialog);
	}
	
public Shape make(ShapeType type) {
		if(type == null) {
			return null;
		}
		if (type == ShapeType.CUBOID) {
			
		return new Cuboid(new MessageBox(), 12 , 3 , 9);
		
		} else if (type == ShapeType.CYLINDER) {
			return new Cylinder(new MessageBox(), 10 , 2);
		} else if (type == ShapeType.SPHERE) {
			return new Sphere(new MessageBox(), 14);
		}

		return null;
	}
}
