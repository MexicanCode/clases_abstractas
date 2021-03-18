package web.app.mexicancode;

public class Componedor {

	public FiguraGeometrica crearFigura(TipoFigura tipoFigura, 
			double base, double altura) {
		FiguraGeometrica fg=null;
			if(tipoFigura==TipoFigura.CUADRADO) {
				fg = new Cuadrado(base, altura);
			}else if(tipoFigura==TipoFigura.RECTANGULO) {
				fg = new Rectangulo(base,altura);
			}else if(tipoFigura==TipoFigura.TRIANGULO) {
				fg = new Triangulo(base,altura);
			}
		return fg;
	}
}
