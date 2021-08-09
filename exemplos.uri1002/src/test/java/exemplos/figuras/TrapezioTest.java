package exemplos.figuras;

import static org.junit.Assert.*;

import org.junit.Test;

public class TrapezioTest {

	@Test
	public void testGetArea() {
		Trapezio t1 = new Trapezio(3.0, 4.0, 5.2);
		double expected = 18.2;
		double actual = t1.getArea();
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void test12Dot2And10Dot4And15Dot2() {
		Trapezio t1 = new Trapezio(12.7, 10.4, 15.2);
		double expected = 175.56;
		double actual = t1.getArea();
		assertEquals(expected, actual, 0.001);
	}

}
