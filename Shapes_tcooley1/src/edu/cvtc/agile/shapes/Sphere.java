/**
 * 
 */
package edu.cvtc.agile.shapes;

/**
 * @author Tyler
 *
 */
public class Sphere extends Shape implements Renderer {
	// Field for holding the incoming radius value
	private float radius = 0.0f;
	
	// Constructor for the Sphere class
	public Sphere(Dialog dialog) {
		super(dialog);
	}
	
	public Sphere(float radius, Dialog dialog) {
		super(dialog);
		
		if (radius > 0) {
			setRadius(radius);
		} else {
			System.out.println("Please make sure to enter valid values!");
		}
	}
	
	// surfaceArea method adjusted for sphere formula
	@Override
	public float surfaceArea() {
		float sphereSurfaceArea = (float)(4 * Math.PI * Math.pow(getRadius(), 2));
		
		return sphereSurfaceArea;
	}

	// volume method adjusted for sphere formula
	@Override
	public float volume() {
		float sphereVolume = (float)(1.33 * Math.PI * Math.pow(getRadius(), 3));
		
		return sphereVolume;
	}

	// render method for displaying message box with sphere values
	@Override
	public void render() {
		getDialog().displayMessage("Unit", "Test");
	}

	public float getRadius() {
		return radius;
	}

	private void setRadius(float radius) {
		this.radius = radius;
	}	
}
