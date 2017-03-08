/**
 * 
 */
package edu.cvtc.agile.shapes;

/**
 * @author Tyler
 *
 */
public class ShapesFactory {
	private Dialog dialog;
	
	public ShapesFactory(Dialog dialog) {
		setDialog(dialog);
	}
	
	public Shape makeCuboid(float width, float height, float depth) {
		return new Cuboid(width, height, depth, getDialog());
	}
	
	public Shape makeCylinder(float radius, float height) {
		return new Cylinder(radius, height, getDialog());
	}
	
	public Shape makeSphere(float radius) {
		return new Sphere(radius, getDialog());
	}

	private Dialog getDialog() {
		return dialog;
	}

	private void setDialog(Dialog dialog) {
		this.dialog = dialog;
	}
	
	
}
