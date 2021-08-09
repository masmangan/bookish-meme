package exemplos.figuras;

/**
 * 
 * @author marco
 *
 */
public class Trapezio extends Figura {

	/*
	 * 
	 */
	private double base1;
	
	/*
	 * 
	 */
	private double base2;
	
	/*
	 * 
	 */
	private double altura;
	
	/**
	 * @param base1
	 * @param base2
	 * @param altura
	 */
	public Trapezio(double base1, double base2, double altura) {
		super();
		if (base1 <= 0.0) {
			throw new IllegalArgumentException();
		}
		if (base2 <= 0.0) {
			throw new IllegalArgumentException();
		}
		if (altura <= 0.0) {
			throw new IllegalArgumentException();
		}
		this.base1 = base1;
		this.base2 = base2;
		this.altura = altura;
	}

	/**
	 * @return 
	 */
	@Override
	public double getArea() {
		return (base1 + base2) * altura / 2.0;
	}

}
