package l9_exe1;

public class Pilha {
    private No inicio;
    private int qtd;

    public No getInicio() {
        return inicio;
    }

    public void setInicio(No inicio) {
        this.inicio = inicio;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
    
    
    public String listar() {
        String temp = "";
        temp = temp + "Lista:\n";
        //temp = temp + "Início: " + getInicio();
        No atual = getInicio();
        while (atual != null) {
            temp = temp + "\nDado: " + atual.getDado();
            atual = atual.getProximo();
        }
        return temp;
    }

    public boolean incluirInicio(int conteudo) {
        No novo = new No();
        novo.setDado(conteudo);
        novo.setProximo(getInicio());
        setInicio(novo);
        qtd++;
        return true;
    }

    public boolean excluirInicio() {
        if (getInicio() != null) {
            setInicio(inicio.getProximo());
            System.gc();
            qtd--;
            return true;
        } else {
            System.out.println("Lista vazia");
            return false;
        }
    }
}
