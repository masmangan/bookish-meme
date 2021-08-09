package exemplos.figuras;

public class Retangulo extends Figura {
	
	/*
	 * 
	 */
	private double base;

	/*
	 * 
	 */
	private double altura;


	/**
	 * @param base
	 * @param altura
	 */
	public Retangulo(double base, double altura) {
		super();
		checkValue(base);
		checkValue(altura);
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double getArea() {
		return base * altura;
	}

}
