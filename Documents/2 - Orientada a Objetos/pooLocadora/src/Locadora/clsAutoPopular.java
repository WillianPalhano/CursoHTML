package Locadora;

public class clsAutoPopular {
    private boolean status;
    private boolean tanque;
    private double preco;
    
    public clsAutoPopular(){
        this.status = true;
        this.tanque = true;
        this.preco = 300.0;
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
