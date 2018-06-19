package pooConta;

/**
 * Conta salário é um tipo de conta que apenas transfere um valor para a conta
 * Corrente de outro banco.
 *
 * @author daniella vieira
 *
 */
public class clsContaSalario extends clsConta {

    public clsContaSalario(clsConta objconta) {
        // repasso as informa��es da conta
        this.titular = objconta.getTitular();
        this.numBanco = objconta.getNumBanco();
        this.numAgencia = objconta.getNumAgencia();
        this.numConta = objconta.getNumConta();
        this.saldo = objconta.saldo;

    }

    @Override
    public void transferenciaConta(double quantidade, clsConta contaDestino) {
        // repassa o valor
        this.saldo = this.saldo - quantidade;
        contaDestino.setSaldo(quantidade);

    }

}
