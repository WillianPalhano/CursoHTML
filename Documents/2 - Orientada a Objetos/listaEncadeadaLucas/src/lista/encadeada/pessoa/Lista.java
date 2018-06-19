package lista.encadeada.pessoa;

public class Lista {
	public No primeiro;
	public No ultimo;

	public Lista() {
		this.primeiro = null;
		this.ultimo = null;
	}

	public void listar() {
		System.out.println(">>>>>Exibindo Lista<<<<<<");
		No percorrer = primeiro; // percorrer é igual ao primeiro Nó
		while (percorrer != null) {
			System.out.println(percorrer.getPessoa().toString()); // imprimi o valor inserido
			percorrer = percorrer.getProximo(); // percorrer recebe o próximo nó
		}
	}
	
	public void inserirInicio(No novoNo){
		if(primeiro == null){
			primeiro = novoNo; // primeiro referência para o novo Nó
			ultimo = novoNo;   // ultimo referênia para o mesmo Nó 
		}else{
			novoNo.setProximo(primeiro);
			primeiro = novoNo;
		}
	}

	public void inserirFim(No novoNo) {
		novoNo.setProximo(null); 
		if (primeiro == null) {
			primeiro = novoNo; // primeiro referência para o novo nó
		} else {
			ultimo.setProximo(novoNo); 

		}
		ultimo = novoNo;

	}
	
	public int contarNos(){
		int quant = 0;
		No noTemp = primeiro;
		while(noTemp != null){
			quant +=1;
			noTemp = noTemp.getProximo();
		}
		return quant;
	}
	
	public void inserirPosicao(No novoNo, int posicao){
		No noTemp = primeiro;
		int posAux, numPos = contarNos();
		
		if(posicao == 0){
			inserirInicio(novoNo);
		}else if(posicao > numPos){
			inserirFim(novoNo);
		}else{
			posAux = 1;
			while(posicao > posAux){
				noTemp = noTemp.getProximo();
				posAux +=1;
			}
			novoNo.setProximo(noTemp.getProximo());
			noTemp.setProximo(novoNo);
		}
	}
	
	public String excluirNo(int posicao){
		No noTemp = new No(null);
		noTemp.setProximo(primeiro); // noTempo referência a primeiro Nó
		
		int posAux = 0;
		String msg = "";
		
		while(noTemp.getProximo() != null && posicao != posAux){ // percorre a lista
			noTemp = noTemp.getProximo();
			posAux +=1;
		}
		if(noTemp.getProximo() == null){ // se noTemp igual a null a lista está vazia
			msg = "Valor não encontrado";
		}else{
			if(ultimo == noTemp.getProximo()){
				ultimo = noTemp;
			}if(primeiro == noTemp.getProximo()){
				primeiro = noTemp.getProximo().getProximo();
			}
			msg = "valor: " + noTemp.getProximo().getPessoa();
			noTemp.setProximo(noTemp.getProximo().getProximo());
		
		}
		return msg;
	}
	
	

	public No getPrimeiro() {
		return primeiro;
	}

	public void setPrimeiro(No primeiro) {
		this.primeiro = primeiro;
	}

	public No getUltimo() {
		return ultimo;
	}

	public void setUltimo(No ultimo) {
		this.ultimo = ultimo;
	}

}
