package l4_exe2;

import javax.swing.JOptionPane;

public class Lista {

    private No inicio;
    private int N;
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

    public int getN() {
        return N;
    }

    public void setN(int N) {
        this.N = N;
        System.out.println("que sono. 19/04/2018");
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
            temp = temp + "\nNome: " + atual.getPeople().getNome()
                    + "\nIdade: " + atual.getPeople().getIdade()
                    + "\nSalário: " + atual.getPeople().getSalario()
                    + "\n   Atual: " + atual
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
        novo.setPeople(people);
        novo.setProximo(getInicio());
        setInicio(novo);
        qtd++;
        return true;
    }

    public boolean excluirInicio() {
        if (getInicio() != null) {
            No temp = getInicio();
            setInicio(inicio.getProximo());
            temp = null;
            System.gc();
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
        novo.setPeople(people);
        if (getInicio() == null) {
            setInicio(novo);
            qtd++;
            return true;
        } else if (getInicio() != null) {
            No atual = ateFim();
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
                System.gc();
                qtd--;
                return true;
            } else {
                setInicio(null);
                System.gc();
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
