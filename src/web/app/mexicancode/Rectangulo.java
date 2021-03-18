package web.app.mexicancode;

public class Rectangulo extends FiguraGeometrica {
	
	public Rectangulo(double base, double altura) {
		this.base=base;
		this.altura=altura;
	}
	@Override
	public double area() {
		return(double)this.base*this.altura;
	}
	@Override
	public double perimetro() {
		return (double) (2*this.base)+(2*this.altura);
	}
}
