package pooConta;

public interface ifcContaBancaria {

    void saqueConta(double quantidade);

    void depositoConta(double quantidade);

    void transferenciaConta(double quantidade, clsConta contaDestino);

    public String imprimeSaldo();

}
