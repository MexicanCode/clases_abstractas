package web.app.mexicancode;

public class Triangulo extends FiguraGeometrica{
		
	public Triangulo(double base, double altura) {
		this.base=base;
		this.altura=altura;
	}
	@Override
	public double area() {
		return(double)(this.base*this.altura)/2;
	}
	@Override
	public double perimetro() {
		//equilatero
		return (double) (3*this.base);
	}
}
