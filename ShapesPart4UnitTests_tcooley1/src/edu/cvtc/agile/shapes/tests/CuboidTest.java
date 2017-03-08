package edu.cvtc.agile.shapes.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.cvtc.agile.shapes.Cuboid;
import edu.cvtc.agile.shapes.Dialog;
import edu.cvtc.agile.shapes.MessageBox;
import edu.cvtc.agile.shapes.Shape;
import edu.cvtc.agile.shapes.ShapesFactory;
import edu.cvtc.agile.tests.substitutes.MessageBoxSubstitute;

public class CuboidTest {

	@Test
	public void testSurfaceArea1() {
		Cuboid cuboid = new Cuboid(3, 2, 5, null);
		
		float expected = (2 * ((5 * 3) + (3 * 2) + (2 * 5)));
		
		float actual = cuboid.surfaceArea();
		
		assertEquals(expected, actual, 0);
	}
	
	@Test
	public void testSurfaceArea2() {
		Cuboid cuboid = new Cuboid(5, 10, 5, null);
		
		float expected = (2 * ((5 * 5) + (5 * 10) + (10 * 5)));
		
		float actual = cuboid.surfaceArea();
		
		assertEquals(expected, actual, 0);
	}
	
	@Test
	public void testSurfaceArea3() {
		Cuboid cuboid = new Cuboid(5.5f, 8.97f, 2.2f, null);
		
		float expected = (2 * ((2.2f * 5.5f) + (5.5f * 8.97f) + (8.97f * 2.2f)));
		
		float actual = cuboid.surfaceArea();
		
		assertEquals(expected, actual, 0);
	}

	@Test
	public void testVolume1() {
		Cuboid cuboid = new Cuboid(5, 10, 4, null);
		
		float expected = (5 * 10 * 4);
		
		float actual = cuboid.volume();
		
		assertEquals(expected, actual, 0);
	}
	
	@Test
	public void testVolume2() {
		Cuboid cuboid = new Cuboid(10, 20, 30, null);
		
		float expected = (10 * 20 * 30);
		
		float actual = cuboid.volume();
		
		assertEquals(expected, actual, 0);
	}
	
	@Test
	public void testVolume3() {
		Cuboid cuboid = new Cuboid(6.75f, 10.6f, 4.94f, null);
		
		float expected = (6.75f * 10.6f * 4.94f);
		
		float actual = cuboid.volume();
		
		assertEquals(expected, actual, 0);
	}

	@Test
	public void testCuboid1() {
		float expectedWidth = 100;
		
		Cuboid cuboid = new Cuboid(100, 1, 1, null);
		
		assertEquals(expectedWidth, cuboid.getWidth(), 0);
	}
	
	@Test
	public void testCuboid2() {
		float unexpected = -100;
		
		Cuboid cuboid = new Cuboid(-100, 1, 1, null);
		
		assertNotEquals("Please make sure to enter valid values!", unexpected, cuboid.getWidth());
	}

	@Test
	public void testGetWidth() {
		Cuboid cuboid = new Cuboid(10, 1, 1, null);
		
		float expected = 10;
		
		float actual = cuboid.getWidth();
		
		assertEquals(expected, actual, 0);
	}

	@Test
	public void testGetHeight() {
		Cuboid cuboid = new Cuboid(1, 10, 1, null);
		
		float expected = 10;
		
		float actual = cuboid.getHeight();
		
		assertEquals(expected, actual, 0);
	}

	@Test
	public void testGetDepth() {
		Cuboid cuboid = new Cuboid(1, 1, 10, null);
		
		float expected = 10;
		
		float actual = cuboid.getDepth();
		
		assertEquals(expected, actual, 0);
	}
	
	@Test
	public void testRender() {
		Dialog dialog = new MessageBox();
		
		MessageBoxSubstitute dialogSubstitute = new MessageBoxSubstitute();
		
		Cuboid cuboid = new Cuboid(dialogSubstitute);
		
		cuboid.render();
	}
	
	@Test
	public void testSurfaceAreaFromShapesFactory1() {
		Dialog dialog = null;
		
		ShapesFactory shapesFactory = new ShapesFactory(dialog);
		
		Shape cuboid = shapesFactory.makeCuboid(5.5f,  8.97f, 2.2f);
		
		float expected = (2 * ((2.2f * 5.5f) + (5.5f * 8.97f) + (8.97f * 2.2f)));
		
		float actual = cuboid.surfaceArea();
		
		assertEquals(expected, actual, 0);
	}
	
	@Test
	public void testSurfaceAreaFromShapesFactory2() {
		Dialog dialog = null;
		
		ShapesFactory shapesFactory = new ShapesFactory(dialog);
		
		Shape cuboid = shapesFactory.makeCuboid(5, 10, 5);
		
		float expected = (2 * ((5 * 5) + (5 * 10) + (10 * 5)));
		
		float actual = cuboid.surfaceArea();
		
		assertEquals(expected, actual, 0);
	}
	
	@Test
	public void testVolumeFromShapesFactory1() {
		Dialog dialog = null;
		
		ShapesFactory shapesFactory = new ShapesFactory(dialog);
		
		Shape cuboid = shapesFactory.makeCuboid(25, 25, 10.75f);
		
		float expected = (25 * 25 * 10.75f);
		
		float actual = cuboid.volume();
		
		assertEquals(expected, actual, 0);
	}
	
	@Test
	public void testVolumeFromShapesFactory2() {
		Dialog dialog = null;
		
		ShapesFactory shapesFactory = new ShapesFactory(dialog);
		
		Shape cuboid = shapesFactory.makeCuboid(10, 20, 30);
		
		float expected = (10 * 20 * 30);
		
		float actual = cuboid.volume();
		
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


