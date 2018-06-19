package pooConta;

import java.text.NumberFormat;
import java.text.ParseException;
import javax.swing.JOptionPane;

public class prjBanco {
	
	public static void main(String[] args) {
		try {
			
			/* Cria��o da conta */	
			clsConta objConta = new clsConta();
			
			/* Defini��o dos atributos */	
			String nome = JOptionPane.showInputDialog("Digite seu nome: ");
			objConta.setTitular(nome);
			
			int numeroDigitado =  Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero do Banco: "));
			objConta.setNumBanco(numeroDigitado);
			
			numeroDigitado =  Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero de sua Ag�ncia: "));
			objConta.setNumAgencia(numeroDigitado);
			
			numeroDigitado =  Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero de sua conta: "));
			objConta.setNumConta(numeroDigitado);
					
			objConta.depositoConta(1000.00); // valor b�nus
			
			System.out.println(objConta.imprimeSaldo());
	
			int menu = Integer.parseInt(JOptionPane.showInputDialog("Qual conta deseja operar: "
                                + "\n(1) conta sal�rio"
                                + "\n(2) investimento"
                                + "\n(3) conta corrente"));
	
			switch (menu) {
			case 1: // conta Salario - conta sendo passada para o construtor
				
				trataContaSalario(objConta);
	
			    break;
			case 2: // conta Investimento
				
				trataContaInvestimento(objConta);
			    
				break;
			default: // conta Corrente
				
				trataContaCorrente(objConta);
			    
				break;
			}
			
		}catch (Exception e){
			System.out.println(e.getMessage());
		}
		
    }
	
	
	private static void trataContaCorrente(clsConta objConta) {
		clsContaCorrente CC = new clsContaCorrente(objConta);
	    
		System.out.println(CC.getTitular());
		System.out.println(CC.getNumAgencia());
		System.out.println(CC.getNumBanco());
		System.out.println(CC.getNumConta());
		System.out.println(CC.getSaldo());
	    
	   
		double valor;
	    String vlDigitado;
	    
	    switch (menuContaCorrete()) {
			case 1:
				try {
					vlDigitado = JOptionPane.showInputDialog("Qual valor retirar?");
					valor = NumberFormat.getInstance().parse(vlDigitado).doubleValue();

					CC.saqueConta(valor);
				
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			break;
			default:
				try {
					vlDigitado = JOptionPane.showInputDialog("Qual valor depositar?");
					valor = NumberFormat.getInstance().parse(vlDigitado).doubleValue();
					
					CC.depositoConta(valor);
				
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
					
			break;
		};
		System.out.println(CC.imprimeSaldo());
	    
		
	}


	private static void trataContaInvestimento(clsConta objConta) {
		clsContaInvestimento CI = new clsContaInvestimento(objConta);
	    
		System.out.println(CI.getTitular());
		System.out.println(CI.getNumAgencia());
		System.out.println(CI.getNumBanco());
		System.out.println(CI.getNumConta());
		System.out.println(CI.getSaldo());

		CI.setVlInvestimento(CI.saldo); // supondo que o valor investido seja o saldo da conta - apenas exemplo
		CI.setVlRentabilidade(0.1); // suponto que seja este valor
		
	    System.out.println(CI.consultaInvestimento());
		
	}


	private static void trataContaSalario(clsConta objConta) {

		clsContaSalario CS = new clsContaSalario(objConta);
	    
		System.out.println(CS.getTitular());
		System.out.println(CS.getNumAgencia());
		System.out.println(CS.getNumBanco());
		System.out.println(CS.getNumConta());
		System.out.println(CS.getSaldo());
	    
			
		String vlUsuario = JOptionPane.showInputDialog("Transferir valor para:");
		
		// Conta que receber� o valor da conta sal�rio
		clsConta contaDestino = new clsConta();
		contaDestino.setTitular(vlUsuario);
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("Banco:"));
		contaDestino.setNumBanco(num);
		num = Integer.parseInt(JOptionPane.showInputDialog("Ag�ncia:"));
		contaDestino.setNumAgencia(num);
		num = Integer.parseInt(JOptionPane.showInputDialog("Conta:"));
		contaDestino.setNumConta(num);
		
		// transfer�ncia dos valores
		CS.transferenciaConta(CS.getSaldo(), contaDestino);
		
	    System.out.println("Transfer�ncia executada: " + contaDestino.getSaldo());
	}


	public static int menuContaCorrete(){
		int num = Integer.parseInt(JOptionPane.showInputDialog("Qual opera��o deseja fazer: (1) para saque, (2) para dep�sito "));

        return num;
		
	}

}
