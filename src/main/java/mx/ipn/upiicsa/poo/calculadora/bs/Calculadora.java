package mx.ipn.upiicsa.poo.calculadora.bs;

public class Calculadora {
	
	public static double suma(double a, double b) {
		return a+b;
	}
	
	public static double resta(double a, double b) {
		return a-b;
	}
	
	public static double multiplicacion(double a, double b) {
		return a*b;
	}
	
	public static double division(double a, double b) {
		return a/b;
	}
	
	//Porcentaje de a con respecto de b
	public static double porcentaje(double a, double b) {
		return (a*100)/b;
	}
	
	public static double piso(double a) {
		return Math.floor(a);
	}
	
	public static double techo(double a) {
		return Math.ceil(a);
	}
	
	public static double redondeo(double a) {
		return Math.round(a);
	}
	
	
	
	
	
}
