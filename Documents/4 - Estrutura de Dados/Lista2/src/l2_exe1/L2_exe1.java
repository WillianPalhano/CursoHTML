package l2_exe1;

import javax.swing.*;

public class L2_exe1 {

    static final int TAMANHO = 10;
    static int[] pilha = new int[TAMANHO];
    static int ponteiro = 0;

    public static boolean push(int conteudo) {
        if (ponteiro < TAMANHO) {
            pilha[ponteiro] = conteudo;
            ponteiro = ponteiro + 1;
            return true;
        } else {
            return false;
        }
    }

    public static boolean pop() {
        if (ponteiro > 0) {
            pilha[ponteiro - 1] = 0;
            ponteiro = ponteiro - 1;
            return true;
        } else {
            return false;
        }
    }

    public static int contador() {
        int qtd = 0;
        if (ponteiro < TAMANHO) {
            for (int i = 0; i < ponteiro; i++) {
                qtd++;
                System.out.println("Contou " + (i + 1));
            }
        }
        return qtd;
    }

    public static int peek() {
        int topo = pilha[ponteiro - 1];
        return topo;
    }

    public static void main(String[] args) {

        int menu = 1;

        while (menu > 0 && menu < 6) {
            menu = Integer.parseInt(JOptionPane.showInputDialog("Menu - Lista linear\n\n"
                    + "Selecione a opcao desejada:\n"
                    + "1 - Inserir no topo da pilha(PUSH)\n"
                    + "2 - Excluir do topo da pilha(POP)\n"
                    + "3 - Contar quantos elementos existem na pilha\n"
                    + "4 - Consultar o valor no topo da pilha\n"
                    + "0 - Sair\n"));
            switch (menu) {
                case 1:
                    int conteudo = Integer.parseInt(JOptionPane.showInputDialog("Qual número você deseja inserir?"));
                    if (push(conteudo) == false) {
                        JOptionPane.showMessageDialog(null, "Não foi possível realizar a operação.\nO conteúdo solicitado já existe ou a lista está cheia.");
                    }
                    break;
                case 2:
                    if (pop() == false) {
                        JOptionPane.showMessageDialog(null, "Não foi possível realizar a operação.");
                    }
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Existem " + contador() + " elementos na lista.");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "O valor no topo da pilha é: " + peek());
                    break;
            }
        }
    }
}
