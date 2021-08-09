/*
 * Direitos Autorais, 2021, Marco Mangan.
 */
package exemplos.figuras;

/**
 * A classe <code>Triangulo</code> representa um triangulo
 *  com base e altura.

 * 
 * @author marco
 *
 */
public class Triangulo extends Figura {

	/*
	 * 
	 */
	private double base;

	/*
	 * 
	 */
	private double altura;

	/**
	 * Cria um triangulo com base <code>base</code> e altura <code>altura</code>.
	 * @param base
	 * @param altura
	 * @throws IllegalArgumentException
	 * 			Quando o valor da base ou da altura é menor ou igual a zero.
	 */
	public Triangulo(double base, double altura) {
		super();
		if (base <= 0.0) {
			throw new IllegalArgumentException();
		}
		if (altura <= 0.0) {
			throw new IllegalArgumentException();
		}		
		this.base = base;
		this.altura = altura;
	}	
	
	/**
	 * 
	 * @return the area
	 */
	@Override
	public double getArea() {
		return base * altura / 2.0;
	}
	
}
