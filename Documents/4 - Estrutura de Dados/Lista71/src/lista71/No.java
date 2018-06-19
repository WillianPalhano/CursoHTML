package lista71;

public class No {
    
    private No anterior;
    private Pessoa p;
    private No proximo;

    public No() {

    }

    public No getAnterior() {
        return anterior;
    }

    public void setAnterior(No anterior) {
        this.anterior = anterior;
    }

    public Pessoa getP() {
        return p;
    }

    public void setP(Pessoa p) {
        this.p = p;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

}
