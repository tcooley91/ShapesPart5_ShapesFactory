package edu.cvtc.agile.shapes.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.cvtc.agile.shapes.Cuboid;
import edu.cvtc.agile.shapes.Dialog;
import edu.cvtc.agile.shapes.MessageBox;
import edu.cvtc.agile.shapes.Shape;
import edu.cvtc.agile.shapes.ShapesFactory;
import edu.cvtc.agile.shapes.Sphere;
import edu.cvtc.agile.tests.substitutes.MessageBoxSubstitute;

public class SphereTest {

	@Test
	public void testSurfaceArea1() {
		Sphere sphere = new Sphere(10, null);
		
		float expected = (float)(4 * Math.PI * Math.pow(10, 2));
		
		float actual = sphere.surfaceArea();
		
		assertEquals(expected, actual, 0);
	}
	
	@Test
	public void testSurfaceArea2() {
		Sphere sphere = new Sphere(5.725f, null);
		
		float expected = (float)(4 * Math.PI * Math.pow(5.725f, 2));
		
		float actual = sphere.surfaceArea();
		
		assertEquals(expected, actual, 0);
	}
	
	@Test
	public void testSurfaceArea3() {
		Sphere sphere = new Sphere(1.25750f, null);
		
		float expected = (float)(4 * Math.PI * Math.pow(1.25750f, 2));
		
		float actual = sphere.surfaceArea();
		
		assertEquals(expected, actual, 0);
	}

	@Test
	public void testVolume1() {
		Sphere sphere = new Sphere(10, null);
		
		float expected = (float)(1.33 * Math.PI * Math.pow(10, 3));
		
		float actual = sphere.volume();
		
		assertEquals(expected, actual, 0);
	}
	
	@Test
	public void testVolume2() {
		Sphere sphere = new Sphere(7.725f, null);
		
		float expected = (float)(1.33 * Math.PI * Math.pow(7.725f, 3));
		
		float actual = sphere.volume();
		
		assertEquals(expected, actual, 0);
	}
	
	@Test
	public void testVolume3() {
		Sphere sphere = new Sphere(7.725f, null);
		
		float expected = (float)(1.33 * Math.PI * Math.pow(7.725f, 3));
		
		float actual = sphere.volume();
		
		assertEquals(expected, actual, 0);
	}

	@Test
	public void testSphere1() {
		float expectedRadius = 6.275f;
		
		Sphere sphere = new Sphere(6.275f, null);
		
		assertEquals(expectedRadius, sphere.getRadius(), 0);
	}
	
	@Test
	public void testSphere2() {
		float unexpected = -6.275f;
		
		Sphere sphere = new Sphere(-6.275f, null);
		
		assertNotEquals("Please make sure to enter valid values!", unexpected, sphere.getRadius());
	}

	@Test
	public void testGetRadius() {
		Sphere sphere = new Sphere(10.250f, null);
		
		float expected = 10.250f;
		
		float actual = sphere.getRadius();
		
		assertEquals(expected, actual, 0);
	}
	
	@Test
	public void testRender() {
		Dialog dialog = new MessageBox();
		
		MessageBoxSubstitute dialogSubstitute = new MessageBoxSubstitute();
		
		Sphere sphere = new Sphere(dialogSubstitute);
		
		sphere.render();
	}
	
	@Test
	public void testSurfaceAreaFromShapesFactory1() {
		Dialog dialog = null;
		
		ShapesFactory shapesFactory = new ShapesFactory(dialog);
		
		Shape sphere = shapesFactory.makeSphere(5.5f);
		
		float expected = (float)(4 * Math.PI * Math.pow(5.5f, 2));
		
		float actual = sphere.surfaceArea();
		
		assertEquals(expected, actual, 0);
	}
	
	@Test
	public void testSurfaceAreaFromShapesFactory2() {
		Dialog dialog = null;
		
		ShapesFactory shapesFactory = new ShapesFactory(dialog);
		
		Shape sphere = shapesFactory.makeSphere(5);
		
		float expected = (float)(4 * Math.PI * Math.pow(5, 2));
		
		float actual = sphere.surfaceArea();
		
		assertEquals(expected, actual, 0);
	}
	
	@Test
	public void testVolumeFromShapesFactory1() {
		Dialog dialog = null;
		
		ShapesFactory shapesFactory = new ShapesFactory(dialog);
		
		Shape sphere = shapesFactory.makeSphere(25);
		
		float expected = (float)(1.33 * Math.PI * Math.pow(25, 3));
		
		float actual = sphere.volume();
		
		assertEquals(expected, actual, 0);
	}
	
	@Test
	public void testVolumeFromShapesFactory2() {
		Dialog dialog = null;
		
		ShapesFactory shapesFactory = new ShapesFactory(dialog);
		
		Shape sphere = shapesFactory.makeSphere(10);
		
		float expected = (float)(1.33 * Math.PI * Math.pow(10, 3));
		
		float actual = sphere.volume();
		
		assertEquals(expected, actual, 0);
	}
	
	/*@Test
	public void testRenderFromShapesFactory() {		
		Dialog dialog = new MessageBox();
		
		Dialog dialogSubstitute = new MessageBoxSubstitute();
		
		ShapesFactory shapesFactory = new ShapesFactory(dialogSubstitute);
		
		Shape cuboid = dialogSubstitute.displayMessage("Test", "test");
	}*/
}
