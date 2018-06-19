package l9_exe1;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int menu = 1;
        Pilha pilha = new Pilha();
        while (menu > 0 && menu < 10) {

            menu = Integer.parseInt(JOptionPane.showInputDialog("MENU EXERCICIO 1\n\n"
                    + "1 - Consultar topo.\n"
                    + "2 - Push.\n"
                    + "3 - Pop.\n"
                    + "4 - Quantidade de Nós.\n"
                    + "0 - Sair.\n"));

            switch (menu) {
                case 1: {
                    JOptionPane.showMessageDialog(null, pilha.listar());
                    break;
                }
                case 2: {

                    if (pilha.incluirInicio(Integer.parseInt(JOptionPane.showInputDialog("Qual número você deseja inserir?"))) == false) {
                        JOptionPane.showMessageDialog(null, "Não foi possível realizar a operação.");
                    }

                    break;
                }
                case 3: {
                    if (pilha.excluirInicio() == false) {
                        JOptionPane.showMessageDialog(null, "Não foi possível realizar a operação.");
                    }
                    break;
                }
                case 4: {
                    JOptionPane.showMessageDialog(null, "Quantidade de nós: " + pilha.getQtd());
                    break;
                }
            }
        }
    }
}
