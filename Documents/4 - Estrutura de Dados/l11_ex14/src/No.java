
/**
 * No para uma Arvore
 *
 */
public class No {

    //Subárvore da esquerda
    private No esquerda;
    // Dado do nó
    private int dado;
    //Subárvore da direita
    private No direita;

    /**
     * Construtor sem Argumento
     */
    public No() {
        this.esquerda = null;
        this.dado = 0;
        this.direita = null;
    }

    /**
     * Construtor com Argumento
     *
     * @param _dado Um valor do tipo inteiro a ser armazenado
     */
    public No(int _dado) {
        setDado(_dado);
        setEsquerda(null);
        setDireita(null);
    }
    //Set's

    /**
     * Modificador de dado
     *
     * @param dado Um valor inteiro
     */
    public void setDado(int dado) {
        this.dado = dado;
    }

    public void setEsquerda(No esquerda) {
        this.esquerda = esquerda;
    }

    public int getDado() {
        return dado;
    }

    public No getEsquerda() {
        return esquerda;
    }

    public No getDireita() {
        return direita;
    }

    public void setDireita(No direita) {
        this.direita = direita;
    }

    //Retorna o dado em String
    public String paraString() {
        return "OID: " + this + " / dado: " + getDado();
    }
}
