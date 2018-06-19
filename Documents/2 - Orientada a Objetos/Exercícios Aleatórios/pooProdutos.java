import javax.swing.*;

public class pooProdutos {

    public static void main(String args[]) {
        String nome = JOptionPane.showInputDialog("Insira seu nome: ");
                    int produtos  = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de produtos vendidos: "));
                    double precoProduto = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor dos produtos: "));

                    double total = produtos * precoProduto;

                    JOptionPane.showMessageDialog(null, "Nome: " + nome + "\n"
                            + "Valor total das vendas: R$" + total);
    }
}