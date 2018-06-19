package poopublicacao;
import java.util.Date;

public class clsInformacao implements itfTexto{
    private Date dataInformacao;
    private clsEmpresa empresa;
    private int numCaracteres;
    private String txtMsg;

    public Date getDataInformacao() {
        return dataInformacao;
    }

    public void setDataInformacao(Date dataInformacao) {
        this.dataInformacao = dataInformacao;
    }

    public clsEmpresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(clsEmpresa empresa) {
        this.empresa = empresa;
    }

    public int getNumCaracteres() {
        return numCaracteres;
    }

    public void setNumCaracteres(int numCaracteres) {
        this.numCaracteres = numCaracteres;
    }

    public String getTxtMsg() {
        return txtMsg;
    }

    public void setTxtMsg(String txtMsg) {
        this.txtMsg = txtMsg;
    }
    
    

    @Override
    public void editar() {
    }

    @Override
    public String publicar() {
        String inf = "";
        return inf;
    }
    
}
