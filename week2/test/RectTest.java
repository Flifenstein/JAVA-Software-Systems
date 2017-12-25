package ss.week2.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import ss.week2.Rectangle;

public class RectTest {
	// test variables
	private Rectangle rect1;
	private Rectangle rect2;
	private Rectangle rect3;
	
	// setup the new rectangles
	@Before
	public void setUp() {
		rect1 = new Rectangle(3,6);
		rect2 = new Rectangle(3,0);
		rect3 = new Rectangle(0,0);
	}
	
	//test if the initial conditions are correct
	@Test
	public void testInitialCondition() {
		assertEquals(3, rect1.length());
		assertEquals(0, rect2.width());
		assertEquals(0, rect3.area());
		assertEquals(6, rect2.perimeter());
		assertEquals(18, rect1.perimeter());
	}

}
