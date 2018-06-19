package l7_exe1;

public class Lista {

    private No inicio;

    public No getInicio() {
        return inicio;
    }

    public void setInicio(No inicio) {
        this.inicio = inicio;
    }

    public String listar() {
        String list = "LISTA\nInício: " + getInicio() + "\n---------------------------------";
        No atual = getInicio();
        while (atual != null) {
            list = list + "\nID: " + atual + "\n  Anterior: " + atual.getAnterior() + "\n  Nome: " + atual.getNome() + "\n  Idade: " + atual.getIdade() + "\n  Próximo: " + atual.getProximo() + "\n---------------------------------";
            atual = atual.getProximo();
        }
        return list;
    }

    public void inserirInicio(String nome, int idade) {
        No novo = new No();
        novo.setNome(nome);
        novo.setIdade(idade);
        novo.setAnterior(null);
        if (getInicio() != null) {
            getInicio().setAnterior(novo);
            novo.setProximo(getInicio());
            setInicio(novo);
        } else {
            setInicio(novo);
        }
    }

    public void excluirInicio() {
        setInicio(getInicio().getProximo());
        getInicio().setAnterior(null);
        System.gc();
    }

    public void inserirFim(String nome, int idade) {
        No novo = new No();
        novo.setNome(nome);
        novo.setIdade(idade);
        if (getInicio() == null) {
            setInicio(novo);
        } else {
            No atual = getInicio();
            while (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
        
        novo.setAnterior(atual);
        atual.setProximo(novo);
        }
    }
}
