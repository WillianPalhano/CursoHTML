package poomaternidade;


public class clsMae extends clsPaciente {

    private int semanasGestacao;

    public clsMae(int semanasGestacao, String nome, String tipoSangue, String convenio, int ano, int mes, int dia) {
        super(nome, tipoSangue, convenio, ano, mes, dia);
        this.semanasGestacao = semanasGestacao;
    }

    public int getSemanasGestacao() {
        return semanasGestacao;
    }

    public void setSemanasGestacao(int semanasGestacao) {
        this.semanasGestacao = semanasGestacao;
    }

    public String status() {
        String status = "-- Mãe"
                + "\nNome: " + getNome()
                + "\nTipo sanguíneo: " + getTipoSangue()
                + "\nConvênio: " + getConvenio()
                + "\nSemana de gestação: " + getSemanasGestacao();
        return status;
    }
}
