package l1_exe3;

import javax.swing.*;

public class L1_exe3 {

    static final int TAMANHO = 100;
    static int ponteiro;

    public static String listar(int lista[]) {
        String conteudoLista = "Lista:\n";
        for (int i = 0; i < ponteiro; i++) {
            conteudoLista += lista[i] + "\n";
        }
        return conteudoLista;
    }

    public static boolean incluirLista(int lista[], int conteudo) {
        for (int i = 0; i < ponteiro; i++) {
            if (lista[i] == conteudo) {
                return false;
            }
        }

        lista[ponteiro] = conteudo;
        int t = 0, x = 1;

        while (x == 1) {
            x = 0;
            for (int i = 0; i < ponteiro; i++) {
                if (lista[i] > lista[i + 1]) {
                    t = lista[i + 1];
                    lista[i + 1] = lista[i];
                    lista[i] = t;
                    x = 1;
                }
            }
        }
        ponteiro++;
        if (x == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean excluirLista(int lista[], int exclusao) {
        int x = 0;
        if (ponteiro != 0) {
            for (int i = 0; i < ponteiro; i++) {
                if (exclusao == lista[i]) {
                    for (int j = i; j < ponteiro; j++) {
                        lista[j] = lista[j + 1];
                        x = 1;
                    }
                }
            }
        }
        ponteiro = ponteiro - 1;
        if (x == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static void trocaElemento(int lista[], int a, int b) {
        int t;
        t = lista[a];
        lista[a] = lista[b];
        lista[b] = t;

    }

    public static void main(String[] args) {
        ponteiro = 0;
        int menu = 1;
        int[] lista = new int[TAMANHO];
        incluirLista(lista, 10);
        incluirLista(lista, 32);
        incluirLista(lista, 41);
        incluirLista(lista, 12);
        incluirLista(lista, 53);
        incluirLista(lista, 14);
        incluirLista(lista, 52);
        incluirLista(lista, 65);
        incluirLista(lista, 76);

        while (menu > 0 && menu < 6) {
            menu = Integer.parseInt(JOptionPane.showInputDialog("Menu - Lista linear\n\n"
                    + "Selecione a opcao desejada:\n"
                    + "1 - Listar elementos\n"
                    + "2 - Inserir elemento de forma ordenada\n"
                    + "3 - Remover elemento pelo valor\n"
                    + "4 - Troca elemento de posicao\n"
                    + "0 - Sair\n"));
            switch (menu) {
                case 1:
                    JOptionPane.showMessageDialog(null, listar(lista));
                    break;
                case 2:
                    int conteudo = Integer.parseInt(JOptionPane.showInputDialog("Qual número você deseja inserir?"));
                    if (incluirLista(lista, conteudo) == false) {
                        JOptionPane.showMessageDialog(null, "Não foi possível realizar a operação.\n O conteúdo solicitado já existe ou a lista está cheia.");
                    }
                    break;
                case 3:
                    int exclusao = Integer.parseInt(JOptionPane.showInputDialog("Qual número você deseja excluir?"));
                    if (excluirLista(lista, exclusao) == false) {
                        JOptionPane.showMessageDialog(null, "Não foi possível realizar a operação.");
                    }
                    break;
                case 4:
                    int a = Integer.parseInt(JOptionPane.showInputDialog("Qual a posição do elemento que você quer mudar?(A)"));
                    int b = Integer.parseInt(JOptionPane.showInputDialog("para onde o elemento deve ir?(B)"));
                    JOptionPane.showMessageDialog(null, "Você selecionou as posições:\n A - " + lista[a] + "\nB - " + lista[b]);
                    trocaElemento(lista, a, b);
                    break;
            }
        }
    }
}
