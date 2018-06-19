import javax.swing.*;

public class pooCompraVenda {

    public static void main(String args[]) {
        String nome = JOptionPane.showInputDialog("Insira seu nome: ");
        double compra = Double.parseDouble(JOptionPane.showInputDialog("Por quanto você comprou esse produto?"));
        double venda = Double.parseDouble(JOptionPane.showInputDialog("Por quanto você vendeu esse produto?"));
        double lucro = (compra - venda);
        if(lucro < 0){
            lucro = lucro * -1;
            JOptionPane.showMessageDialog(null, "Você lucrou R$" + lucro + " vendendo esse produto");
        } else{
            JOptionPane.showMessageDialog(null, "Você perdeu R$" + lucro + " vendendo esse produto");
        }
    }
}