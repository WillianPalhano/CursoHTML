package questoesextras;

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
                    + "QUESTÕES EXTRAS\n"
                    + "7 - Inverter Lista.\n"
                    + "8 - Passar a vez.\n"
                    + "9 - Furar fila.\n"
                    + "0 - Sair.\n"));

            switch (menu) {
                case 1: {
                    JOptionPane.showMessageDialog(null, lst.listar());
                    break;
                }
                case 2: {
                    int conteudo = Integer.parseInt(JOptionPane.showInputDialog("Insira o conteudo: "));
                    if (lst.incluirInicio(conteudo) == false) {
                        JOptionPane.showMessageDialog(null, "Não foi possível realizar a operação.");
                    }

                    break;
                }
                case 3: {
                    if (lst.excluirInicio() == false) {
                        JOptionPane.showMessageDialog(null, "Não foi possível realizar a operação.");
                    }
                    break;
                }
                case 4: {
                    int conteudo = Integer.parseInt(JOptionPane.showInputDialog("Insira o conteudo: "));
                    if (lst.incluirFim(conteudo) == false) {
                        JOptionPane.showMessageDialog(null, "Não foi possível realizar a operação.");
                    }
                }
                break;
                case 5: {
                    if (lst.excluirFim() == false) {
                        JOptionPane.showMessageDialog(null, "Não foi possível realizar a operação.");
                    }
                }
                break;
                case 6: {
                    JOptionPane.showMessageDialog(null, "Quantidade de Nós: " + lst.getQtd());
                }
                break;
                case 7: {
                    lst.inverterLista();
                }
                break;

                case 8: {
                    lst.passarVez();
                }
                break;
                case 9: {
                    lst.furarFila();
                }
                break;
            }
        }
    }
}
