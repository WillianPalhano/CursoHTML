package poomaternidade;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class clsPaciente {

    private String nome;
    private String tipoSangue;
    private String convenio;
    private Calendar nascimento = Calendar.getInstance();

    public clsPaciente(String nome, String tipoSangue, String convenio, int ano, int mes, int dia) {
        this.nome = nome;
        this.tipoSangue = tipoSangue;
        this.convenio = convenio;
        this.nascimento.set(Calendar.YEAR, ano);
        this.nascimento.set(Calendar.MONTH, mes);
        this.nascimento.set(Calendar.DAY_OF_MONTH, ano);
        setNascimento();
    }

    public Calendar getNascimento() {
        return nascimento;
    }

    public void setNascimento() {
        SimpleDateFormat dma = new SimpleDateFormat("dd/MM/yyyy");
        dma.format(nascimento);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoSangue() {
        return tipoSangue;
    }

    public void setTipoSangue(String tipoSangue) {
        this.tipoSangue = tipoSangue;
    }

    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

}
