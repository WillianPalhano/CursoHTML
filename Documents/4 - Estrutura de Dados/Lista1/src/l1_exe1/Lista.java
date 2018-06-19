package l1_exe1;

import javax.swing.JOptionPane;

public class Lista {

    private final int TAMANHO = 10;
    private int N = 0;
    private No[] lista = new No[TAMANHO];

    public int getN() {
        return N;
    }

    public void setN(int N) {
        this.N = N;
        System.out.println("que sono. 19/04/2018");
    }

    public boolean incluirFim(int conteudo) {
        No novo = new No();
        novo.setDado(conteudo);
        if (N < TAMANHO) {
            lista[getN()] = novo;
            N = N + 1;
            return true;
        } else {
            return false;
        }
    }

    public String listar() {
        String conteudoLista = "Lista:\n";
        for (int i = 0; i < N; i++) {
            if (i < N) {
                conteudoLista += lista[i].getDado() + "\n";
            }
        }
        return conteudoLista;
    }

    public boolean excluirFim() {
        if (N > 0) {
            N = N - 1;
            return true;
        } else {
            return false;
        }
    }

    public boolean incluirInicio(No conteudo) {
        if (N < TAMANHO) {
            for (int i = N; i > 0; i--) {
                lista[i] = lista[i - 1];
            }
            lista[0] = conteudo;
            N = N + 1;
            return true;
        } else {
            return false;
        }
    }

    public boolean excluirInicio() {
        if (N < TAMANHO) {
            for (int i = 0; i < N; i++) {
                lista[i] = lista[i + 1];
            }
            N = N - 1;
            return true;
        } else {
            return false;
        }
    }

    public boolean incluirPosicao(No conteudo, int posicao) {
        if (posicao < (N - 1) && N < TAMANHO) {
            for (int i = (N - 1); i > posicao; i--) {
                lista[i] = lista[i - 1];
            }
            lista[posicao] = conteudo;
            N = N + 1;
            return true;
        } else {
            return false;
        }
    }

    public boolean excluirPosicao(int posicao) {
        if (posicao < (N - 1)) {
            for (int i = posicao; i < N; i++) {
                lista[i] = lista[i + 1];
            }
            N = N - 1;
            return true;
        } else {
            return false;
        }
    }

    public boolean furarFila() {
        if (N >= 2) {
            No amigo = lista[N - 1];
            System.out.println(amigo);
            for (int i = N; i > 0; i--) {
                lista[i] = lista[i - 1];
            }
            lista[0] = amigo;
            return true;
        } else {
            return false;
        }
    }

    public boolean questao1() {
        if (N >= 0) {/*
            incluirFim(new No(6));
            incluirFim(new No(2));
            incluirFim(new No(8));
            incluirFim(new No(5));
            incluirFim(new No(5));
            incluirFim(new No(2));
            excluirInicio();
            No dez = new No();
            dez.setDado(10);
            incluirFim(dez);
            excluirInicio();
            No vinte = new No();
            vinte.setDado(20);
            incluirFim(vinte);
            excluirInicio();
            No trinta = new No();
            trinta.setDado(30);
            incluirFim(trinta);*/
            return true;
        } else {
            return false;
        }

    }
}
