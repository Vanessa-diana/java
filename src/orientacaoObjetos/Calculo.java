package orientacaoObjetos;

public class Calculo {

	double altura;
	double largura;
	



public double Area() {
	
	double area = this.largura * this.altura;
	return area;
}


public double Perimetro() {
	
	double p = 2*(this.altura + this.largura);
	return p;
	
}

public double Diagonal() {
	
	double d= Math.sqrt(Math.pow(this.largura, 2) + Math.pow(this.altura, 2));
	return d;
	
	
}


}