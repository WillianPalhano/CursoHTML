package lista51;

public class Lista {

    private No inicio;
    private int qtd;
    private No fim;
    private No ultimoIncluido;

    public No getUltimoIncluido() {
        return ultimoIncluido;
    }

    public void setUltimoIncluido(No ultimoIncluido) {
        this.ultimoIncluido = ultimoIncluido;
    }
    
    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

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

    public void inserirInicio(String nome, int idade) {
        Pessoa p = new Pessoa();
        No novo = new No();
        p.setNome(nome);
        p.setIdade(idade);
        novo.setP(p);
        novo.setProximo(getInicio());
        setInicio(novo);
        if (getFim() == null) {
            setFim(novo);
        }
        setQtd(getQtd() + 1);
        setUltimoIncluido(novo);
    }

    public String listar() {
        String show = "LISTA SIMPLESMENTE ENCADEADA COM DESCRITOR\n\nInicio: " + getInicio() + "\nQuantidade: " + getQtd();
        No atual = getInicio();
        while (atual != null) {
            show = show + "\n\nID: " + atual + "\n   Nome: " + atual.getP().getNome() + "\n   Idade: " + atual.getP().getIdade() + "\n   Próximo: " + atual.getProximo();
            atual = atual.getProximo();
        }
        show = show + "\n\nFim: " + getFim();
        return show;
    }

    public void removerInicio() {
        setInicio(getInicio().getProximo());
        setQtd(getQtd() - 1);
    }

    public void inserirFim(String nome, int idade) {
        Pessoa p = new Pessoa();
        p.setNome(nome);
        p.setIdade(idade);
        No novo = new No();
        novo.setP(p);
        if (getFim() == null) {
            setFim(novo);
        } else {
            getFim().setProximo(novo);
            setFim(novo);
        }
        if (getInicio() == null) {
            setInicio(novo);
        }
        setQtd(getQtd() + 1);
        setUltimoIncluido(novo);
    }

    public void removerFim() {
        No anterior = getInicio();
        No atual = getInicio().getProximo();
        while (atual.getProximo() != null) {
            anterior = atual;
            atual = atual.getProximo();
        }
        anterior.setProximo(null);
        setFim(anterior);
        setQtd(getQtd() - 1);
    }

    public void inserirPosicao(String nome, int idade, int posicao) {
        Pessoa p = new Pessoa();
        p.setNome(nome);
        p.setIdade(idade);
        No novo = new No();
        novo.setP(p);
        No atual = getInicio();
        No proximo = getInicio().getProximo();
        for (int i = 1; i < posicao; i++) {
            atual = proximo;
            proximo = proximo.getProximo();
        }
        novo.setProximo(proximo);
        atual.setProximo(novo);
        setQtd(getQtd() + 1);
        setUltimoIncluido(novo);
    }

    public void removerPosicao(int posicao) {
        No anterior = getInicio();
        No atual = getInicio().getProximo();
        for (int i = 1; i < posicao; i++) {
            anterior = atual;
            atual = atual.getProximo();
        }
        anterior.setProximo(atual.getProximo());
        setQtd(getQtd() - 1);
    }

    public String encontrarPessoa(String nome) {
        No comparador = getInicio();
        String show = "Não existe pessoa com esse nome na lista.";
        try {
            while (!nome.toUpperCase().equals(comparador.getP().getNome().toUpperCase())) {
                System.out.println("Nome: " + nome + "  Nome comparador: " + comparador.getP().getNome().toUpperCase());
                comparador = comparador.getProximo();
            }
            show = "PESSOA ENCONTRADA\n\nID: " + comparador + "\n   Nome: " + comparador.getP().getNome() + "\n   Idade: " + comparador.getP().getIdade() + "\n   Próximo: " + comparador.getProximo();
            return show;
        } catch (NullPointerException e) {
            System.out.println("erro: nullPointerException");
        } finally {
            return show;
        }

    }
    
    public String ultimo(){
        No comparador = getUltimoIncluido();
        String show = "Último incluido\n\nID: " + comparador + "\n   Nome: " + comparador.getP().getNome() + "\n   Idade: " + comparador.getP().getIdade() + "\n   Próximo: " + comparador.getProximo();
        return show;    
    }
}
