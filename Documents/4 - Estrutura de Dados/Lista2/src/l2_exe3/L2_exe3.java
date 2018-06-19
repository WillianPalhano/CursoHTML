package l2_exe3;

import javax.swing.JOptionPane;

public class L2_exe3 {

    static final int TAMANHO = 10;
    static int[] fila = new int[TAMANHO];
    static int fim = 0;

    public static boolean enqueue(int conteudo) {
        if (fim < TAMANHO) {
            fila[fim] = conteudo;
            fim = fim + 1;
            return true;
        } else {
            return false;
        }
    }

    public static boolean dequeue() {
        if (fim < TAMANHO) {
            for (int i = 0; i < fim; i++) {
                fila[i] = fila[i + 1];
            }
            fim = fim - 1;
            return true;
        } else {
            return false;
        }
    }

    public static int contador() {
        int qtd = 0;
        if (fim < TAMANHO) {
            for (int i = 0; i < fim; i++) {
                qtd++;
                System.out.println("Contou " + (i + 1));
            }
        }
        return qtd;
    }

    public static int inicio() {
        int inicio = fila[0];
        return inicio;
    }

    public static void main(String[] args) {
        int menu = 1;

        while (menu > 0 && menu < 6) {

            menu = Integer.parseInt(JOptionPane.showInputDialog("MENU\n\n"
                    + "1 - Incluir na fila\n"
                    + "2 - Remover da fila\n"
                    + "3 - Contador\n"
                    + "4 - Consultar início da fila\n"
                    + "0 - Sair\n"));

            switch (menu) {
                case 1:
                    int conteudo = Integer.parseInt(JOptionPane.showInputDialog("Qual número você deseja inserir?"));
                    enqueue(conteudo);
                    break;
                case 2:
                    dequeue();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Existem " + contador() + " elementos na lista.");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "O valor no inicio da fila é: " + inicio());
                    break;
            }
        }
    }
}
