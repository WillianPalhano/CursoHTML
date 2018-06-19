package l5_exe1;

public class Lista {

    private No inicio;
    private No fim;
    private int quantidade;

    public No getInicio() {
        return inicio;
    }

    public void setInicio(No inicio) {
        this.inicio = inicio;
    }

    public No getFim() {
        return fim;
    }

    public void setFim(No fim) {
        this.fim = fim;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String listar() {
        String list = "LISTA\nInício: " + getInicio() + "\n---------------------------------";
        No atual = getInicio();
        while (atual != null) {
            list = list + "\nID: " + atual + "\n  Nome: " + atual.getNome() + "\n  Idade: " + atual.getIdade() + "\n  Próximo: " + atual.getProximo() + "\n---------------------------------";
            atual = atual.getProximo();
        }
        list = list + "\nFim: " + getFim() + "\nQuantidade: " + getQuantidade();
        return list;
    }

    public void inserirInicio(String nome, int idade) {
        No novo = new No();
        novo.setNome(nome);
        novo.setIdade(idade);
        novo.setProximo(getInicio());
        setInicio(novo);
        if (getFim() == null) {
            setFim(novo);
        }
        setQuantidade(getQuantidade() + 1);
    }

    public void excluirInicio() {
        setInicio(getInicio().getProximo());
        setQuantidade(getQuantidade() - 1);
        System.gc();
    }
    
    public void incluirFim(String nome, int idade){
        No novo = new No();
        novo.setNome(nome);
        novo.setIdade(idade);
        getFim().setProximo(novo);
        setFim(novo);
        setQuantidade(getQuantidade() + 1);
    }
    
    public void excluirFim(){
        No pont = getInicio();
        if (getQuantidade() > 1) {
            for (int i = 1; i < (getQuantidade() - 1); i++) {
                pont = pont.getProximo();
            }
            pont.setProximo(null);
            setFim(pont);
            System.gc();
            setQuantidade(getQuantidade() - 1);
        } else {
            setFim(null);
            setInicio(null);
            System.gc();
            setQuantidade(getQuantidade() - 1);
        }
    }
}
