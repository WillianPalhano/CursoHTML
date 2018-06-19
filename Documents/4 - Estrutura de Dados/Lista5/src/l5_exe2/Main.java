package l5_exe2;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int menu = 1;
        Lista lst = new Lista();
        while (menu > 0 && menu < 10) {

            menu = Integer.parseInt(JOptionPane.showInputDialog("MENU EXERCICIO 2\n\n"
                    + "1 - Listar.\n"
                    + "2 - Incluir no inicio.\n"
                    + "3 - Excluir do início.\n"
                    + "4 - Incluir no fim.\n"
                    + "5 - Excluir do fim.\n"
                    + "6 - Quantidade de Nós.\n"
                    + "7 - Incluir em uma posição específica.\n"
                    + "8 - Excluir de uma posição específica.\n"
                    + "0 - Sair.\n"));

            switch (menu) {
                case 1: {
                    JOptionPane.showMessageDialog(null, lst.listar());
                    break;
                }
                case 2: {
                    String nome = JOptionPane.showInputDialog("Insira o nome: ");
                    int idade = Integer.parseInt(JOptionPane.showInputDialog("Insira a idade: "));
                    double salario = Double.parseDouble(JOptionPane.showInputDialog("Insira o salário: "));
                    lst.inserirInicio(nome, idade, salario);
                    break;
                }
                case 3: {
                    lst.excluirInicio();
                    break;
                }
                case 4: {
                    String nome = JOptionPane.showInputDialog("Insira o nome: ");
                    int idade = Integer.parseInt(JOptionPane.showInputDialog("Insira a idade: "));
                    double salario = Double.parseDouble(JOptionPane.showInputDialog("Insira o salário: "));
                    lst.incluirFim(nome, idade, salario);
                    break;
                }
                case 5: {
                    lst.excluirFim();
                    break;
                }
                case 6: {
                    JOptionPane.showMessageDialog(null, "Quantidade de Nós: " + lst.getQuantidade());
                    break;
                }
                case 7: {
                    System.out.println("Não fiz");
                    break;
                }
                case 8: {
                    System.out.println("Não fiz");
                    break;
                }
            }
        }
    }
}
