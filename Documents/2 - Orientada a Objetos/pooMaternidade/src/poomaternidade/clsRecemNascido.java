package poomaternidade;

public class clsRecemNascido extends clsPaciente {
    private double altura;
    private double peso;
    private String sexo;
    private String saude;

    public clsRecemNascido(double altura, double peso, String sexo, String saude, String nome, String tipoSangue, String convenio, int ano, int mes, int dia) {
        super(nome, tipoSangue, convenio, ano, mes, dia);
        this.altura = altura;
        this.peso = peso;
        this.sexo = sexo;
        this.saude = saude;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSaude() {
        return saude;
    }

    public void setSaude(String saude) {
        this.saude = saude;
    }
    
    public String status() {
        String status = "-- Recém Nascido"
                + "\nNome: " + getNome()
                + "\nTipo sanguíneo: " + getTipoSangue()
                + "\nConvênio: " + getConvenio()
                + "\nAltura: " + getAltura()
                + "\nPeso: " + getPeso()
                + "\nSexo: " + getSexo()
                + "\nSaúde: " + getSaude();
        
        return status;
    }
    
}
