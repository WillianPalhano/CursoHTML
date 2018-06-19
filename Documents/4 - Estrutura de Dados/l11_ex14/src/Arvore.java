
public class Arvore {

    // Inicio da árvore
    private No raiz;

    //Construtor sem Argumento
    public Arvore() {
        raiz = null; //Inicializa a arvore  com null
    }

    public No getRaiz() {
        return raiz;
    }

    public void setRaiz(No raiz) {
        this.raiz = raiz;
    }

    /**
     * Insere o dado em uma árvore binária.
     *
     * @param _raiz Raiz da árvore.
     * @param dado Dadoa ser inserido.
     * @return A raiz com o dado inserido.
     */
    public No inserir(No _raiz, int dado) {
        if (_raiz == null) {
            No novo = new No();
            novo.setEsquerda(null);
            novo.setDado(dado);
            novo.setDireita(null);
            _raiz = novo;
        } else {
            if (dado < _raiz.getDado()) {
                _raiz.setEsquerda(inserir(_raiz.getEsquerda(), dado));
            } else {
                if (dado > _raiz.getDado()) {
                    _raiz.setDireita(inserir(_raiz.getDireita(), dado));
                } else {
                    System.out.println("Elemento já existe na árvore");
                }
            }
        }
        return _raiz;
    }

    /**
     * Mostra os dados de camimhamento em pré ordem na árvore. E visitado
     * primeiro a raiz, depois a esquerda da subárvore e por fim a direita da
     * subárvore.
     *
     * @param _raiz Início da subárvore
     */
    public void preOrdemED(No _raiz) {
        if (_raiz != null) {
            System.out.println("Dado:" + _raiz.getDado());
            preOrdemED(_raiz.getEsquerda());
            preOrdemED(_raiz.getDireita());
        }
    }

    /**
     * Retorna uma String com os dados de camimhamento em pré ordem na árvore. E
     * visitado primeiro a raiz, depois a esquerda da subárvore e por fim a
     * direita da subárvore.
     *
     * @param _raiz Início da subárvore
     * @return Uma string com os dados da árvore.
     */
    public String preOrdemEDString(No _raiz) {
        String temp = "";
        if (_raiz != null) {
            temp = " - " + _raiz.getDado();
            temp = temp + preOrdemEDString(_raiz.getEsquerda());
            temp = temp + preOrdemEDString(_raiz.getDireita());
        }
        return temp;
    }

    public String mostraFolhas(No _raiz) {
        String result = "";
        if (_raiz.getEsquerda() != null) {
            _raiz.setEsquerda(_raiz.getEsquerda());
            System.out.println("esquerda da raiz: " + _raiz.getEsquerda());
        }
        return result;
    }

    public void folha(No _raiz) {
        if (_raiz != null) {
            if (_raiz.getEsquerda() == null && _raiz.getDireita() == null) {
                System.out.println("Dado:" + _raiz.getDado());
            }
            folha(_raiz.getEsquerda());
            folha(_raiz.getDireita());
        }
    }
    
    public void irmaos(No _raiz, No no1, No no2){
        System.out.println(_raiz.getDado());
        System.out.println(_raiz.getDireita().getDado());
        System.out.println(_raiz.getEsquerda().getDado());
        System.out.println(no1.getDado());
        System.out.println(no2.getDado());
        if(_raiz.getDireita().getDado() == no1.getDado() && _raiz.getEsquerda().getDado() == no2.getDado()){
            System.out.println("SAO IRMAOS");
        } else if(_raiz.getDireita().getDado() == no2.getDado() && _raiz.getEsquerda().getDado() == no1.getDado()){
            System.out.println("SAO IRMAOS");
        } else {
            System.out.println("NAO SAO IRMAOS");
        }
    }
}
