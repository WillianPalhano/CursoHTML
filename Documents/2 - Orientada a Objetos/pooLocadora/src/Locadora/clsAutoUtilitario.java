package Locadora;

public class clsAutoUtilitario {
    private boolean status;
    private boolean tanque;
    private double preco;
    
    public clsAutoUtilitario(){
        this.status = true;
        this.tanque = true;
        this.preco = 450.0;
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
