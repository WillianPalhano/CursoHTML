package l7_exe1;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int menu = 1;
        Lista lst = new Lista();
        while (menu > 0 && menu < 10) {

            menu = Integer.parseInt(JOptionPane.showInputDialog("MENU EXERCICIO 1\n\n"
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
                    lst.inserirInicio(nome, idade);
                    break;
                }
                case 3: {
                    lst.excluirInicio();
                    break;
                }
                case 4: {
                    String nome = JOptionPane.showInputDialog("Insira o nome: ");
                    int idade = Integer.parseInt(JOptionPane.showInputDialog("Insira a idade: "));
                    lst.inserirFim(nome, idade);
                    break;
                }
                case 5: {
                    break;
                }
                case 6: {
                    break;
                }
                case 7: {
                    break;
                }
                case 8: {
                    break;
                }
            }
        }
    }
}
