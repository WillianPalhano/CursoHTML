package appPizzaria;

import java.util.ArrayList;

public class clsPizza implements infPizzaria {
	
	public  ArrayList<String> strPreparo;
	public int tempo;
	public double valor;
	
	
	/*
	 * Produção de qualquer tipo de pizza 
	 * O método Producao da classe clsPizzaria usa uma referência polimórfica. 
	 * A referência polimórfica pode apontar para qualquer objeto que tenha implementado a interface infPizzaria
	 */

	public void Producao(infPizzaria pizza){
		pizza.preparar();
	}

	@Override
	public void preparar() {
		// TODO Auto-generated method stub
		
	}
	
	public ArrayList<String> getStrPreparo() {
		return strPreparo;
	}

	public void setStrPreparo(ArrayList<String> strPreparo) {
		this.strPreparo = strPreparo;
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	
	
}
