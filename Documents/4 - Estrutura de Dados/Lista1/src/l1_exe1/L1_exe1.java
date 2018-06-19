package l1_exe1;

import javax.swing.*;

public class L1_exe1 {

    public static void main(String args[]) {
        int menu = 1;
        Lista lst = new Lista();
        while (menu > 0 && menu < 10) {

            menu = Integer.parseInt(JOptionPane.showInputDialog("MENU\n\n"
                    + "1 - Listar\n"
                    + "2 - Inserir no fim da lista\n"
                    + "3 - Excluir do fim da lista\n"
                    + "4 - Incluir no inicio da lista\n"
                    + "5 - Excluir do inicio da lista\n"
                    + "6 - Inserir numa posição específica\n"
                    + "7 - Excluir de uma posição específica\n"
                    + "8 - Furar a fila.\n"
                    + "9 - Questão 1.\n"
                    + "0 - Sair\n"));

            switch (menu) {
                case 1: {
                    JOptionPane.showMessageDialog(null, lst.listar());

                    break;
                }
                case 2: {
                    ;
                    if (lst.incluirFim(Integer.parseInt(JOptionPane.showInputDialog("Qual número você deseja inserir?"))) == false) {
                        JOptionPane.showMessageDialog(null, "Não foi possível realizar a operação.");
                    }

                    break;
                }
                case 3: {
                    if (lst.excluirFim() == false) {
                        JOptionPane.showMessageDialog(null, "Não foi possível realizar a operação.");
                    }

                    break;
                }
                case 4: {
                    No conteudo = new No();
                    conteudo.setDado(Integer.parseInt(JOptionPane.showInputDialog("Qual número você deseja inserir?")));
                    if (lst.incluirInicio(conteudo) == false) {
                        JOptionPane.showMessageDialog(null, "Não foi possível realizar a operação.");
                    }

                    break;
                }
                case 5: {
                    if (lst.excluirInicio() == false) {
                        JOptionPane.showMessageDialog(null, "Não foi possível realizar a operação.");
                    }

                    break;
                }
                case 6: {
                    No conteudo = new No();
                    int posicao = Integer.parseInt(JOptionPane.showInputDialog("Em qual posição você deseja inserir?"));
                    conteudo.setDado(Integer.parseInt(JOptionPane.showInputDialog("Qual número você deseja inserir?")));
                    if (lst.incluirPosicao(conteudo, posicao) == false) {
                        JOptionPane.showMessageDialog(null, "Não foi possível realizar a operação.");
                    }

                    break;
                }
                case 7: {
                    int posicao2 = Integer.parseInt(JOptionPane.showInputDialog("Qual posição você deseja apagar?"));
                    if (lst.excluirPosicao(posicao2) == false) {
                        JOptionPane.showMessageDialog(null, "Não foi possível realizar a operação.");
                    }

                    break;

                }
                case 8: {
                    if (lst.furarFila() == false) {
                        JOptionPane.showMessageDialog(null, "Não foi possível realizar a operação.");
                    }
                }
                break;
                case 9: {
                    if (lst.questao1() == false) {
                        JOptionPane.showMessageDialog(null, "Não foi possível realizar a operação.");
                    }

                }
                break;
            }
        }
    }
}
