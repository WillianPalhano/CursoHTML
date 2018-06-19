package pooConta;

public class clsContaCorrente extends clsConta  {

	double txManutencao;

	public clsContaCorrente(clsConta objconta) {
		// repasso as informa��es da conta
		this.titular = objconta.getTitular();
		this.numBanco = objconta.getNumBanco();
		this.numAgencia = objconta.getNumAgencia();
		this.numConta = objconta.getNumConta();
		this.saldo = objconta.saldo;
		
	}
		
	public double getTxManutencao() {
		return txManutencao;
	}

	public void setTxManutencao(double txManutencao) {
		this.txManutencao = txManutencao;
	}

	@Override
	public void saqueConta(double quantidade) {
		// Deixa na conta o valor da taxa de Manutencao
		double valorFinal = this.saldo - quantidade;
		
		if (valorFinal >= 0) {
			if (valorFinal >= this.txManutencao){
				super.saqueConta(quantidade);	
			} else {
				this.saldo = this.saldo - (quantidade - txManutencao);
			}	
		}
		
	}

	
}
