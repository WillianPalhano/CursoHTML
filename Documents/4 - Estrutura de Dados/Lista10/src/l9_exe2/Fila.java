package l9_exe2;

public class Fila {

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
        String list = "LISTA\nInício: ";
        No atual = getInicio();
        list = list + atual.getDado();
        while (atual != null) {
            list = list + "\nDado: " + atual.getDado();
            atual = atual.getProximo();
        }
        list = list + "\nQuantidade: " + getQuantidade();
        return list;
    }

    public void desenfileirar() {
        setInicio(getInicio().getProximo());
        setQuantidade(getQuantidade() - 1);
        System.gc();
    }

    public void enfileirar(int conteudo) {
        No novo = new No();
        novo.setDado(conteudo);
        getFim().setProximo(novo);
        setFim(novo);
        setQuantidade(getQuantidade() + 1);
    }
}
