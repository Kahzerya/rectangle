package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import rectangle.Rectangle;
import rectangle.RectangleType;

public class RectangleTest {
	
	private Rectangle r1, r2, r3;

	@Before
	public void setUp() {
		r1 = new Rectangle(2, 4, 2, 4);
		r2 = new Rectangle(1, 1, 1, 1);
		r3 = new Rectangle(5, 6, 8, 2);
		
	}

	@Test
	public void test() {
		assertNotNull("r1 non null", r1);
		assertNotNull("r2 non null", r2);
		assertNotNull("r3 non null", r3);
	}
	
	@Test
	public void testVerifRectangle() {
		assertEquals(r1.getType(), RectangleType.Rectangle);
		System.out.println("Rectangle r1 est " + r1.getType());

		assertSame(r2.getType(), RectangleType.Carre);
		System.out.println("Rectangle r2 est " + r2.getType());

		assertTrue(r3.getType().equals(RectangleType.Quadrilatere));
		System.out.println("Rectangle r3 est " + r3.getType());
	}

}
