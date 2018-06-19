package l4_exe1;

import javax.swing.*;

public class Main {

    public static void main(String args[]) {
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

                    if (lst.incluirInicio(Integer.parseInt(JOptionPane.showInputDialog("Qual número você deseja inserir?"))) == false) {
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

                    if (lst.incluirFim(Integer.parseInt(JOptionPane.showInputDialog("Qual número você deseja inserir?"))) == false) {
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
                    
                    if (lst.incluirPosicao(Integer.parseInt(JOptionPane.showInputDialog("Qual número você deseja inserir?")), 
                                           Integer.parseInt(JOptionPane.showInputDialog("Em qual posição você deseja inserir?"))) == false) {
                        JOptionPane.showMessageDialog(null, "Não foi possível realizar a operação.");
                    }
                }
                break;
                
                case 8: {
                    
                    if (lst.excluirPosicao(Integer.parseInt(JOptionPane.showInputDialog("Qual número você deseja inserir?")), 
                                           Integer.parseInt(JOptionPane.showInputDialog("Em qual posição você deseja inserir?"))) == false) {
                        JOptionPane.showMessageDialog(null, "Não foi possível realizar a operação.");
                    }
                }
                break;
            }
        }
    }
}

