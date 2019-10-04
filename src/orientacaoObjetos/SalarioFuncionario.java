package orientacaoObjetos;

import java.util.Locale;
import java.util.Scanner;

public class SalarioFuncionario {
	
	public static void main(String[] args) {
		
		
		Funcionario funcionario = new Funcionario();
		
		Locale.setDefault(Locale.US);
		Scanner dado = new Scanner(System.in);
		
		System.out.print("Nome: ");
		funcionario.nome = dado.nextLine();
		System.out.print("Salário Bruto: ");
		funcionario.salarioBruto = dado.nextDouble();
		System.out.print("Imposto:");
		funcionario.imposto = dado.nextDouble();
		
		
		
		System.out.println("Funcionário: " + funcionario.nome +", R$ "+ funcionario.SalarioLiquido());
		
		System.out.print("Escreva a porcentagem dada ao salário: ");
		double porcentagem = dado.nextDouble();
		
		funcionario.AdicionaPorcentagem(porcentagem);
		
		System.out.println();
		
		System.out.println("Update" + funcionario);
		
		dado.close();
	}

}
