
/**
 * No para uma Lista Duplamente Encadeadada
 *
 */
public class No {

    // Dado do nó
    private int dado;
    private No anterior;
    private No proximo;

    /**
     * Construtor sem Argumento
     */
    public No() {
        this.anterior = null;
        this.dado = 0;
        this.proximo = null;
    }

    /**
     * Construtor com Argumento
     *
     * @param _dado Um valor do tipo inteiro a ser armazenado
     */
    public No(int _dado) {
        setAnterior(null);
        setDado(_dado);
        setProximo(null);
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

    /**
     * Modificador de próximo
     *
     * @param proximo Um nó da lista
     */
    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    public void setAnterior(No anterior) {
        this.anterior = anterior;
    }

    //Get's
    /**
     * Recuperador de dado
     *
     * @return Um valor inteiro
     */
    public int getDado() {
        return dado;
    }

    /**
     * Recuperador de nó
     *
     * @return Um nó da lista
     */
    public No getProximo() {
        return proximo;
    }

    public No getAnterior() {
        return anterior;
    }

    //Retorna o dado em String
    public String paraString() {
        return "OID: " + this + " / dado: " + getDado();
    }
}
