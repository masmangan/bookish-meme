/*
 * Direitos Autorais, 2021, Marco Mangan.
 */
package exemplos.figuras;

/**
 * A classe <code>Circulo</code> representa um círculo com raio.
 * 
 * @author marco
 *
 */
public class Circulo extends Figura {
	
	/*
	 * 
	 */
	private double raio;

	/*
	 * 
	 */
	private static final double PI = 3.14159;

	/**
	 * Cria um círculo com raio <code>raio</code>.
	 * 
	 * @param raio o raio do novo círculo
	 * @throws IllegalArgumentException
	 * 			Quando o valor do raio é menor ou igual a zero.
	 */
	public Circulo(double raio) {
		super();
		if (raio <= 0.0) {
			throw new IllegalArgumentException();
		}
		this.raio = raio;
	}

	/**
	 * @return the area
	 */
	@Override
	public double getArea() {
		return raio * raio * PI;
	}

}
