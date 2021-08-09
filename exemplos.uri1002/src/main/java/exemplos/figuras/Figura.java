package exemplos.figuras;

public abstract class Figura {

	public Figura() {
		super();
	}

	/**
	 * @return the area
	 */
	public abstract double getArea();

	public static void checkValue(double value) {
		if (value <= 0.0) {
			throw new IllegalArgumentException();
		}
	}	
	
}