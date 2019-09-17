package edu.cvtc.java;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

//import junit.framework.Test;
//import junit.framework.TestCase;
//import junit.framework.TestSuite;
import org.junit.Test;
/**
 * Unit test for simple App.
 */
public class AppTest 
    //extends TestCase
{
	//Cuboids
	Cuboid cuboid1 = new Cuboid(2,3,4);
	Cuboid cuboid2 = new Cuboid(3,4,5);
	Cuboid cuboid3 = new Cuboid(4,5,6);
	
	//Cylinders
	Cylinder cylinder1 = new Cylinder(2,3);
	Cylinder cylinder2 = new Cylinder(3,4);
	Cylinder cylinder3 = new Cylinder(4,5);
	
	//Spheres
	Sphere sphere1 = new Sphere(2);
	Sphere sphere2 = new Sphere(3);
	Sphere sphere3 = new Sphere(4);
	
	
@Test
//Cuboid Tests
public void testGetWidthCube() {
	assertTrue (cuboid1.getWidth() == 2);
}
@Test
public void testGetHeightCube() {
	assertTrue (cuboid1.getHeight() == 3);
}
@Test
public void testGetDepth() {
	assertTrue (cuboid1.getDepth() == 4);
}
@Test
public void testCuboidCon() {
	assertNotNull(cuboid1);
}
@Test
public void testNot0Cub() {
	assertTrue (cuboid1.getWidth() != 0 || cuboid1.getHeight() != 0 || cuboid1.getDepth() !=0 );
}
@Test
public void testGetSurfaceArea() {
	assertTrue (cuboid1.surfaceArea() == 52);
}
@Test
public void testGetSurfaceArea2() {
	assertTrue (cuboid2.surfaceArea() == 94);
}
@Test
public void testGetSurfaceArea3() {
	assertTrue (cuboid3.surfaceArea() == 148);
}
@Test
public void testGetVolume() {
	assertTrue (cuboid1.volume() == 24);
}
@Test
public void testGetVolume2() {
	assertTrue (cuboid2.volume() == 60);
}
@Test
public void testGetVolume3() {
	assertTrue (cuboid3.volume() == 120);
}


//Cylinder Tests
@Test
public void testGetHeightCyl() {
	assertTrue (cylinder1.getHeight() == 3);
}
@Test
public void testGetRadiusCyl() {
	assertTrue (cylinder1.getRadius() == 2);
}
@Test
public void testCylinderCon() {
	assertNotNull(cylinder1);
}
@Test
public void testNot0Cylinder() {
	assertTrue (cylinder1.getRadius() != 0 || cylinder1.getHeight() != 0);
}
@Test
public void testGetSurfaceAreaCyl() {
	assertTrue (cylinder1.surfaceArea() == (float) ((2 * Math.PI * 2 * 3) + (2 * Math.PI *Math.pow(2, 2))));
}
@Test
public void testGetSurfaceAreaCyl2() {
	assertTrue (cylinder2.surfaceArea() == (float) ((2 * Math.PI * 3 * 4) + (2 * Math.PI *Math.pow(3, 2))));
}
@Test
public void testGetSurfaceAreaCyl3() {
	assertTrue (cylinder3.surfaceArea() == (float) ((2 * Math.PI * 4 * 5) + (2 * Math.PI *Math.pow(4, 2))));
}
@Test
public void testGetVolumeCyl() {
	assertTrue (cylinder1.volume() == (float) (Math.PI *Math.pow(2, 2) * 3) );
}
@Test
public void testGetVolumeCyl2() {
	assertTrue (cylinder2.volume() == (float) (Math.PI *Math.pow(3, 2) * 4));
}
@Test
public void testGetVolumeCyl3() {
	assertTrue (cylinder3.volume() == (float) (Math.PI *Math.pow(4, 2) * 5));
}

//Sphere Tests
@Test
public void testGetRadiusSphere() {
	assertTrue (sphere1.getRadius() == 2);
}
@Test
public void testSphereCon() {
	assertNotNull (sphere1);
}
@Test
public void testNot0Sph() {
	assertTrue (sphere1.getRadius() !=0 );
}
@Test
public void testGetSurfaceAreaSph() {
	assertTrue (sphere1.surfaceArea() == (float) (4 * Math.PI * Math.pow(2, 2)));
}
@Test
public void testGetSurfaceAreaSph2() {
	assertTrue (sphere2.surfaceArea() == (float) (4 * Math.PI * Math.pow(3, 2)));
}
@Test
public void testGetSurfaceAreaSph3() {
	assertTrue (sphere3.surfaceArea() == (float) (4 * Math.PI * Math.pow(4, 2)));
}
@Test
public void testGetVolumeSph() {
	assertTrue(sphere1.volume() == (float) ((4 / 3) * Math.PI * Math.pow(2, 3)));
}
@Test
public void testGetVolumeSph2() {
	assertTrue(sphere2.volume() == (float) ((4 / 3) * Math.PI * Math.pow(3, 3)));
}
@Test
public void testGetVolumeSph3() {
	assertTrue(sphere3.volume() == (float) ((4 / 3) * Math.PI * Math.pow(4, 3)));
}

}
