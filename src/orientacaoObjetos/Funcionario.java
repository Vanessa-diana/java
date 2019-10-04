package orientacaoObjetos;

public class Funcionario {

	String nome;
	double salarioBruto;
	double imposto;
	
	
	public double SalarioLiquido() {
		
		return this.salarioBruto - this.imposto;
		
		
	}
	
	public void AdicionaPorcentagem(double porcentagem) {
		
		this.salarioBruto += this.salarioBruto* porcentagem /100;
		
	}
	
	
	
	
}
