package pooConta;
/**
 * Conta investimento é um tipo de conta que serve apenas para guardar dinheiro e fazer render.
 *
 * @author daniella vieira
 *
 */
public class clsContaInvestimento extends clsConta  {

	double vlRentabilidade;
	double vlInvestimento;
	
	public clsContaInvestimento(clsConta objconta) {
		// repasso as informa��es da conta
		this.titular = objconta.getTitular();
		this.numBanco = objconta.getNumBanco();
		this.numAgencia = objconta.getNumAgencia();
		this.numConta = objconta.getNumConta();
		this.saldo = objconta.saldo;
	}		
	
	public double getVlRentabilidade() {
		return vlRentabilidade;
	}
	public void setVlRentabilidade(double vlRentabilidade) {
		this.vlRentabilidade = vlRentabilidade;
	}
	
	public double getVlInvestimento() {
		return vlInvestimento;
	}
	
	public void setVlInvestimento(double vlInvestimento) {
		this.vlInvestimento = vlInvestimento;
	}
	
	public double atribuiRentabilidade() {
		// calcular a rentabilidade - adicionar a rentabilidade por periodo
		this.vlInvestimento = (this.vlInvestimento * this.vlRentabilidade) + this.vlInvestimento;
		return this.vlInvestimento;
	}
	
	public String consultaInvestimento() {
		// retorna valor investido com a rentabilidade 
		// imprimir por periodo
		String valor = "A rentabilidade do investimento: " + getVlRentabilidade() + ". " + 
				"Adicional ao valor investido: " + atribuiRentabilidade() + ". ";
				
		return valor;
	}
	
}
