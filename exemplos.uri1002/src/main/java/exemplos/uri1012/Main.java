/**
 * 
 */
package exemplos.uri1012;

import java.util.Scanner;

import exemplos.figuras.Circulo;
import exemplos.figuras.Figura;
import exemplos.figuras.Quadrado;
import exemplos.figuras.Retangulo;
import exemplos.figuras.Trapezio;
import exemplos.figuras.Triangulo;

/**
 * @author marco
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner teclado;
		double a;
		double b;
		double c;
		Figura[] fs;

		teclado = new Scanner(System.in);
		a = teclado.nextDouble();
		b = teclado.nextDouble();
		c = teclado.nextDouble();
		teclado.close();

		fs = new Figura[]{ 
				new Triangulo(a, c), 
				new Circulo(c),  
				new Trapezio(a, b, c),
				new Quadrado(b),
				new Retangulo(a, b)
				};
		// TODO: QuadradoTest
		// TODO: RetanguloTest
		
		for (Figura f : fs) {
			System.out.printf("%s: %.3f\n", 
					f.getClass().getName().toUpperCase().replace("EXEMPLOS.FIGURAS.", ""), 
					f.getArea());
		}
	}
}
