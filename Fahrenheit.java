package solid;

public class Fahrenheit {

	double fahrenheit;
	double resultado;
	
	public double fToc(double fahrenheit) {
		
		resultado=  5*(fahrenheit-32)/9;
		return resultado;
	}
	
	public double fTok(double fahrenheit) {
		resultado=  5*(fahrenheit-32) /9 + 273.15;
		return resultado;
	}
}
