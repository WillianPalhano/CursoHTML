package l9_exe2;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int menu = 1;
        Fila lst = new Fila();
        while (menu > 0 && menu < 10) {

            menu = Integer.parseInt(JOptionPane.showInputDialog("FILA\n\n"
                    + "1 - Consutar.\n"
                    + "2 - Incluir no inicio.\n"
                    + "3 - Excluir do fim.\n"
                    + "4 - Quantidade de Nós.\n"
                    + "0 - Sair.\n"));

            switch (menu) {
                case 1: {
                    JOptionPane.showMessageDialog(null, lst.listar());
                    break;
                }
                case 2: {
                    int conteudo = Integer.parseInt(JOptionPane.showInputDialog("Insira o conteudo: "));
                    lst.enfileirar(conteudo);
                    break;
                }

                case 3: {
                    lst.desenfileirar();
                    break;
                }
                case 4: {
                    JOptionPane.showMessageDialog(null, "Quantidade de Nós: " + lst.getQuantidade());
                    break;
                }

            }
        }
    }
}
