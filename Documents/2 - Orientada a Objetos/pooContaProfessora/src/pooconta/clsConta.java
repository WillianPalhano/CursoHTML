package pooConta;

public class clsConta implements ifcContaBancaria {

    String titular;
    int numConta;
    int numBanco;
    int numAgencia;
    double saldo;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public int getNumBanco() {
        return numBanco;
    }

    public void setNumBanco(int numBanco) {
        this.numBanco = numBanco;
    }

    public int getNumAgencia() {
        return numAgencia;
    }

    public void setNumAgencia(int numAgencia) {
        this.numAgencia = numAgencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String imprimeSaldo() {
        return "Saldo final: " + this.saldo;
    }

    @Override
    public void saqueConta(double quantidade) {
        this.saldo = this.saldo - quantidade;
    }

    @Override
    public void depositoConta(double quantidade) {
        this.saldo = this.saldo + quantidade;
    }

    @Override
    public void transferenciaConta(double quantidade, clsConta contaDestino) {
        this.saqueConta(quantidade);
        //this.depositoConta(quantidade, contaDestino);
    }

}
