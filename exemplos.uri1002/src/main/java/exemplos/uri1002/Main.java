/**
 * 
 */
package exemplos.uri1002;

import java.util.Scanner;

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
		double raio;
		Circulo c1;
		double area;
		
		teclado = new Scanner(System.in);
		raio = teclado.nextDouble();
		teclado.close();
		
		c1 = new Circulo(raio);
		area = c1.getArea();
		
		System.out.printf("A = %.4f\n", area);
	}

}
