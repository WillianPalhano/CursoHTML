/*
1) Implemente as definições necessárias para obter a seguinte lista duplamente encadeada com descritor.
a) Implemente uma sub-rotina para incluir um novo nó no início da lista.
b) Implemente uma sub-rotina para incluir um novo nó no final da lista.
c) Implemente uma sub-rotina contar o número de nós da lista.
d) Implemente uma sub-rotina para incluir um novo nó em uma posição específica a ser lida.
e) Implemente uma sub-rotina para remover um nó do início da lista.
f) Implemente uma sub-rotina para remover um nó do final da lista.
g) Implemente uma sub-rotina para remover um nó de uma posição específica a ser lida.
h) Implemente uma sub-rotina para listar todos os dados de todos os nós da lista.
i) Implemente uma sub-rotina para encontrar uma pessoa na lista pelo nome.
j) Implemente uma sub-rotina que mostre o ultimo nó incluído. Para isto altere o descritor para guardar além do início e fim quem foi o ultimo incluído.
k) Inclua todas as sub-rotinas em menu para poder acessá-las.
 */
import javax.swing.*;

public class Lista {

    // Inicio da lista encadeada
    private No inicio;

    private int qtde;

    private No fim;

    //Construtor sem Argumento
    public Lista() {
        inicio = null; //Inicializa a lista com null
        fim = null;
        qtde = 0;
    }

    //Set's
    /**
     * Modificador do inicio
     *
     * @param inicio O primeiro nó da lista
     */
    public void setInicio(No inicio) {
        this.inicio = inicio;
    }

    /**
     * Modificador do fim
     *
     * @param fim O último nó da lista
     */
    public void setFim(No fim) {
        this.fim = fim;
    }

    /**
     * Modificador da quantidade.
     *
     * @param qtde A quantidade de nós da lista.
     */
    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    //Get's
    /**
     * Recuperador do início
     *
     * @return O primeiro nó da lista
     */
    public No getInicio() {
        return inicio;
    }

    /**
     * Recuperador do fim
     *
     * @return O último nó da lista
     */
    public No getFim() {
        return fim;
    }

    /**
     * Recuperador de quantidade.
     *
     * @return A quantidade de nós da lista
     */
    public int getQtde() {
        return qtde;
    }

    /**
     * Letra a)
     */
    public void inserirInicio(int dado) {
        No novo = new No(); //Instacia um novo no
        novo.setDado(dado); // Define o dado do No

        novo.setProximo(getInicio());
        novo.setAnterior(null);

        if (getFim() == null) {
            setFim(novo);
        } else {
            getInicio().setAnterior(novo);
        }
        setInicio(novo);

        setQtde(getQtde() + 1);
        JOptionPane.showMessageDialog(null, "Elemento inserido início com Sucesso!");
    }

    /**
     * Letra b)
     */
    public void inserirFim(int dado) {
        No novo = new No(); //Instacia um novo no
        novo.setDado(dado); // Define o dado do No

        novo.setAnterior(getFim());
        novo.setProximo(null);

        if (getInicio() == null) {
            setInicio(novo);
        } else {
            getFim().setProximo(novo);
        }
        setFim(novo);

        setQtde(getQtde() + 1);
        JOptionPane.showMessageDialog(null, "Elemento inserido no fim com Sucesso!");
    }

       /**
     * Letra d)
     */
    public boolean inserirK(int dado, int k) {

        return true;
    }

    /**
     * Letra e)
     */
    public void removerInicio() {
        if (getInicio() != null) {
            setInicio(getInicio().getProximo());
            if (getInicio() != null) {
                getInicio().setAnterior(null);
            } else {
                setFim(null);
            }
            setQtde(getQtde() - 1);
            JOptionPane.showMessageDialog(null, "Elemento removido do in~icio com Sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Lista Vazia!");
        }
    }

    /**
     * Letra f)
     */
    public void removerFim() {

        if (getFim() != null) {
            setFim(getFim().getAnterior());
            if (getFim() != null) {
                getFim().setProximo(null);
            } else {
                setInicio(null);
            }
            setQtde(getQtde() - 1);
            JOptionPane.showMessageDialog(null, "Elemento removido com Sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Lista Vazia!");
        }
    }

    /**
     * Letra g)
     */
    public boolean removerK(int k) {

        return true;
    }

    /**
     * Letra h)
     */
    public void listar() {
        No atual = getInicio();
        int cont = 0;
        String temp = "";
        while (atual != null) {
            cont = cont + 1;
            temp = temp + (cont) + "-" + atual.getDado() + "\n";
            atual = atual.getProximo();
        }
        JOptionPane.showMessageDialog(null, "Lista Simplesmente Encadeada \n" + temp + "Total de Elementos : " + getQtde());
    }

    /**
     *
     * Letra i)
     */
    public boolean pesquisar(int chave) {
        return true;
    }

    /**
     * Lista os valores e os enderecos de mem�ria
     *
     */
    public void listarEndereco() {
        No atual = getInicio();
        int cont = 0;
        String temp = "";
        temp = temp + "Inicio = " + getInicio() + "\n";
        while (atual != null) {
            cont = cont + 1;
            temp = temp + " Anterior = " + atual.getAnterior() + " / " + (cont) + "- Dado = " + atual.getDado() + " / Endereço = " + atual + " / Proximo = " + atual.getProximo() + "\n";
            atual = atual.getProximo();
        }
        temp = temp + "Fim = " + getFim() + "\n";
        JOptionPane.showMessageDialog(null, "Lista Duplamente Encadeada com Descritor \n" + temp + "Total de Elementos : " + getQtde());
    }
}
