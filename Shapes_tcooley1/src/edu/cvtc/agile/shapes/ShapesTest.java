/**
 * 
 */
package edu.cvtc.agile.shapes;

/**
 * @author Tyler
 *
 */
public class ShapesTest {
	public static void main(String[] args) {
		// Test values to make sure the formula methods work for each class
		final float TEST_RADIUS = 5.0f;
		final float TEST_HEIGHT = 10.0f;
		final float TEST_DEPTH = 8.5f;
		final float TEST_WIDTH = 4.5f;
		
		Dialog dialog = new MessageBox();
		
		ShapesFactory shapesFactory = new ShapesFactory(dialog);
	
		// New instances of the Cylinder, Sphere, and Cuboid classes with the Test values inputed in
		Shape cuboid = shapesFactory.makeCuboid(TEST_WIDTH, TEST_HEIGHT, TEST_DEPTH);
		Shape cylinder = shapesFactory.makeCylinder(TEST_RADIUS, TEST_HEIGHT);
		Shape sphere = shapesFactory.makeSphere(TEST_RADIUS);

		cuboid.getDialog().displayMessage("Surface Area: " + cuboid.surfaceArea() + "\nVolume: " + cuboid.volume(), "Cuboid Factory Object");
		cylinder.getDialog().displayMessage("Surface Area: " + cylinder.surfaceArea() + "\nVolume: " + cylinder.volume(), "Cylinder Factory Object");
		sphere.getDialog().displayMessage("Surface Area: " + sphere.surfaceArea() + "\nVolume: " + sphere.volume(), "Sphere Factory Object");
	}
}
