package Locadora;

public class clsAutoSUV {
    private boolean status;
    private boolean tanque;
    private double preco;
    
    public clsAutoSUV(){
        this.status = true;
        this.tanque = true;
        this.preco = 400.0;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean getTanque() {
        return tanque;
    }

    public void setTanque(boolean tanque) {
        this.tanque = tanque;
    }
    
}
