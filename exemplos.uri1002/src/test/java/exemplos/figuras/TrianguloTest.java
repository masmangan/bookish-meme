package exemplos.figuras;

import static org.junit.Assert.*;

import org.junit.Test;

import exemplos.figuras.Circulo;
import exemplos.figuras.Triangulo;

public class TrianguloTest {

	@Test
	public void testGetArea() {
		Triangulo t1 = new Triangulo(3.0, 5.2);
		double expected = 7.8;
		double actual = t1.getArea();
		assertEquals(expected, actual, 0.001);
	}

	@Test
	public void testGetArea12Dot7And15Dot2Gives96Dot52() {
		Triangulo t1 = new Triangulo(12.7, 15.2);
		double expected = 96.52;
		double actual = t1.getArea();
		assertEquals(expected, actual, 0.001);
	}	
	
}
