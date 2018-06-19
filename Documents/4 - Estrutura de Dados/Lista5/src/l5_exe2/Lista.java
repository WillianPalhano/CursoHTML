package l5_exe2;

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
            list = list + "\nID: " + atual + "\n  Nome: " + atual.getPeople().getNome() + "\n  Idade: " + atual.getPeople().getIdade() + "\n  Salário: " + atual.getPeople().getSalario() + "\n  Próximo: " + atual.getProximo() + "\n---------------------------------";
            atual = atual.getProximo();
        }
        list = list + "\nFim: " + getFim() + "\nQuantidade: " + getQuantidade();
        return list;
    }

    public void inserirInicio(String nome, int idade, double salario) {
        No novo = new No();
        Pessoa people = new Pessoa();
        people.setNome(nome);
        people.setIdade(idade);
        people.setSalario(salario);
        novo.setPeople(people);
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
        if (getQuantidade() == 0) {
            setFim(null);
        }
        System.gc();
    }

    public void incluirFim(String nome, int idade, double salario) {
        No novo = new No();
        Pessoa people = new Pessoa();
        people.setNome(nome);
        people.setIdade(idade);
        people.setSalario(salario);
        novo.setPeople(people);
        getFim().setProximo(novo);
        setFim(novo);
        setQuantidade(getQuantidade() + 1);
    }

    public void excluirFim() {
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
