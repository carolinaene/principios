package solid;

public  class Celsius {

	double centigrados;
	double resultado;

	
	public double cTof(double centigrados) {
		resultado= (9*centigrados/5) +32;
		
		return resultado;
	}
	
	public double cTok(double centigrados) {
		resultado= ((centigrados) + 273.15);
		
		return resultado;
	}
	
}
