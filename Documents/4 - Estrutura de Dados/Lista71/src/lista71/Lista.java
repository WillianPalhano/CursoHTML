package lista71;

import javax.swing.JOptionPane;

public class Lista {

    private No inicio;
    private int qtd;

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public Lista() {
        setInicio(null);
    }

    public No getInicio() {
        return inicio;
    }

    public void setInicio(No inicio) {
        this.inicio = inicio;
    }

    public No ateFim() {
        No atual = getInicio();
        while (atual.getProximo() != null) {
            atual = atual.getProximo();
        }
        return atual;
    }

    public String listar() {
        String temp = "";
        temp = temp + "Lista:\n";
        temp = temp + "Início: " + getInicio();
        No atual = getInicio();
        while (atual != null) {
            temp = temp + "\n\nID: " + atual
                    + "\n   Anterior: " + atual.getAnterior()
                    + "\nNome: " + atual.getP().getNome()
                    + "\nIdade: " + atual.getP().getIdade()
                    + "\nSalário: " + atual.getP().getSalario()
                    + "\n   Próximo: " + atual.getProximo();
            atual = atual.getProximo();
        }
        return temp;
    }

    public boolean incluirInicio(String nome, int idade, double salario) {
        No novo = new No();
        Pessoa people = new Pessoa();
        people.setNome(nome);
        people.setIdade(idade);
        people.setSalario(salario);
        novo.setP(people);
        if (getInicio() == null){
            novo.setProximo(getInicio());
            setInicio(novo);
        } else {
            getInicio().setAnterior(novo);
            novo.setProximo(getInicio());
            setInicio(novo);
        }
        

        qtd++;
        return true;
    }

    public boolean excluirInicio() {
        if (getInicio() != null) {
            setInicio(inicio.getProximo());
            getInicio().setAnterior(null);
            qtd--;
            return true;
        } else {
            System.out.println("Lista vazia");
            return false;
        }
    }

    public boolean incluirFim(String nome, int idade, double salario) {
        No novo = new No();
        Pessoa people = new Pessoa();
        people.setNome(nome);
        people.setIdade(idade);
        people.setSalario(salario);
        novo.setP(people);
        if (getInicio() == null) {
            setInicio(novo);
            qtd++;
            return true;
        } else if (getInicio() != null){
            No atual = ateFim();
            novo.setAnterior(atual);
            atual.setProximo(novo);
            qtd++;
            return true;
        } else {
            return false;
        }
    }

    public boolean excluirFim() {
        if (getInicio() != null) {
            if (getInicio().getProximo() != null) {
                No atual = getInicio();
                No anterior = null;
                while (atual.getProximo() != null) {
                    anterior = atual;
                    atual = atual.getProximo();
                }
                anterior.setProximo(null);
                qtd--;
                return true;
            } else {
                setInicio(null);
                qtd--;
                return true;
            }
        } else {
            return false;
        }
    }

    public boolean incluirPosicao(int conteudo, int posicao) {
        return true;
    }

    public boolean excluirPosicao(int conteudo, int posicao) {
        return true;
    }
}
