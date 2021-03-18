package principal;

import web.app.mexicancode.Componedor;
import web.app.mexicancode.FiguraGeometrica;
import web.app.mexicancode.TipoFigura;

public class Main {

	public static void main(String[] args) {
	
		Componedor c = new Componedor();
		FiguraGeometrica fg = c.crearFigura(TipoFigura.CUADRADO, 3, 3);
		double area = fg.area();
		double perimetro = fg.perimetro();
		System.out.println("Datos del cuadrado");
		System.out.println("El area es: "+area+"");
		System.out.println("El perimetro es: "+perimetro+"");
		fg = c.crearFigura(TipoFigura.RECTANGULO, 5, 3);
		area = fg.area();
		perimetro = fg.perimetro();
		System.out.println("Datos del rectangulo");
		System.out.println("El area es: "+area+"");
		System.out.println("El perimetro es: "+perimetro+"");
		fg = c.crearFigura(TipoFigura.TRIANGULO, 5, 3);
		area = fg.area();
		perimetro = fg.perimetro();
		System.out.println("Datos del triangulo");
		System.out.println("El area es: "+area+"");
		System.out.println("El perimetro es: "+perimetro+"");

	}

}
