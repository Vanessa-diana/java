package orientacaoObjetos;

import java.util.Locale;
import java.util.Scanner;

public class retangulo {

	public static void main(String[] args) {
		
		Calculo retangulo = new Calculo();
		
		System.out.println("Digite altura e Largura");
		Locale.setDefault(Locale.US);
		Scanner dado = new Scanner(System.in);
		retangulo.altura = dado.nextDouble();
		retangulo.largura = dado.nextDouble();
		
		System.out.println("AREA = " + retangulo.Area());
		System.out.println("PERIMETRO = " + retangulo.Perimetro());
		System.out.printf("DIAGONAL = %.2f%n" , retangulo.Diagonal());
		 
		
		
		
		
		
		
		
		dado.close();

	}

}
