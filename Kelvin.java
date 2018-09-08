package solid;

public  class Kelvin {
	double kelvin;
	double resultado;
	
	public double kToc(double kelvin) {
		resultado=  kelvin - 273.15;
		return resultado;
		
	}
	
	public double kTof(double kelvin) {
		resultado= 9*(kelvin - 273.15)/5 +32;
		return resultado;
	}

}
