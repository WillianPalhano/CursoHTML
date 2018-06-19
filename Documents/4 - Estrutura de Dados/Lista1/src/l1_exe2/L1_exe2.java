package l1_exe2;

import javax.swing.*;

public class L1_exe2 {

    static final int TAMANHO = 100;
    static int ponteiro;

    public static void listar(int lista[]) {
        String conteudoLista = "Lista:\n";
        for (int i = 0; i < ponteiro; i++) {
            conteudoLista += lista[i] + "\n";
        }
        JOptionPane.showMessageDialog(null, conteudoLista);
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

    public static void main(String[] args) {
        ponteiro = 0;
        int[] lista = new int[TAMANHO];
        int menu = 1;

        while (menu > 0 && menu < 11) {

            menu = Integer.parseInt(JOptionPane.showInputDialog("MENU\n\n"
                    + "1 - Listar\n"
                    + "2 - Incluir na lista\n"
                    + "3 - Excluir da lista\n"));

            switch (menu) {
                case 1:
                    listar(lista);
                    break;
                case 2:
                    int conteudo = Integer.parseInt(JOptionPane.showInputDialog("Qual número você deseja inserir?"));
                    if (incluirLista(lista, conteudo) == false) {
                        JOptionPane.showMessageDialog(null, "Não foi possível realizar a operação.\n O conteúdo solicitado já existe ou a lista está cheia.");
                    }
                    ;
                    break;
                case 3:
                    int exclusao = Integer.parseInt(JOptionPane.showInputDialog("Qual número você deseja excluir?"));
                    if (excluirLista(lista, exclusao) == false) {
                        JOptionPane.showMessageDialog(null, "Não foi possível realizar a operação.");
                    }
                    ;
                    break;

            }
        }
    }
}
