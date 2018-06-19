package lista41;

public class Lista {

    private No inicio;
    private int qtd = 0;

    public No getInicio() {
        return inicio;
    }

    public void setInicio(No inicio) {
        this.inicio = inicio;
    }

    public void inserirInicio(String nome, int idade) {
        No novo = new No();
        novo.setIdade(idade);
        novo.setNome(nome);
        novo.setProximo(inicio);
        setInicio(novo);
        qtd++;
    }

    public void removerInicio() {
        //setInicio(inicio.getProximo());
        //System.gc();
        //qtd--;
        if (getInicio() != null) {
            setInicio(inicio.getProximo());
            qtd--;
        } else {
            System.out.println("Lista vazia");
        }
    }

    public String listar() {
        String show = "LISTA SIMPLESMENTE ENCADEADA\nInício: " + getInicio();
        No atual = getInicio();
        while (atual != null) {
            show = show + "\n\nID: " + atual + "\n    Nome: " + atual.getNome() + "\n    Idade: " + atual.getIdade() + "\n    Próximo: " + atual.getProximo();
            atual = atual.getProximo();
        }
        return show;
    }

    public void inserirFim(String nome, int idade) {
        No novo = new No();
        novo.setNome(nome);
        novo.setIdade(idade);
        No atual = getInicio();
        if (getInicio() == null) {
            inserirInicio(nome, idade);
        } else {
            while (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
            atual.setProximo(novo);
        }
    }
    
    public void removerFim(){
        No atual = getInicio();
        No anterior = new No();
        while(atual.getProximo() != null){
            anterior = atual;
            atual = atual.getProximo();
        }
        anterior.setProximo(null);
    }
    
    public void inserirPosicao(String nome, int idade, int posicao){
        No novo = new No();
        novo.setNome(nome);
        novo.setIdade(idade);
        No atual = getInicio();
        No proximo = getInicio().getProximo();
        for(int i = 1; i<posicao; i++){
            atual = atual.getProximo();
            proximo = proximo.getProximo();
        }
        atual.setProximo(novo);
        novo.setProximo(proximo);
    }
    
    public void removerPosicao(int posicao){
        No anterior = getInicio();
        No atual = getInicio().getProximo();
        for(int i = 1; i<posicao;i++){
            anterior = anterior.getProximo();
            atual = atual.getProximo();
        }
        anterior.setProximo(atual.getProximo());
        
    }
}
