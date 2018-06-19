package lista.encadeada.pessoa;

public class No {
	private Pessoa pessoa;
	private No proximo;		
	
	
	public No(Pessoa pessoa) {
		this.pessoa = pessoa;
		proximo = null;
	}
	

	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	public No getProximo() {
		return proximo;
	}
	
	public void setProximo(No proximo){
		this.proximo = proximo;
	}
	
	

}
