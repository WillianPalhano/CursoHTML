package l2_exe5;

import javax.swing.JOptionPane;

public class L2_exe5 {

    static final int TAMANHO = 10;
    static int[] fila = new int[TAMANHO];
    static int fim = 0;
    static int inicio = 0;
    static int qtd = 0;

    public static String listar() {
        String conteudoLista = "Lista:\n";
        for (int i = 0; i < TAMANHO ; i++) {
            if(i < fim && i >= inicio){
                conteudoLista += fila[i] + "\n";
            }
        }
        return conteudoLista;
    }

    public static boolean inserirFim(int conteudo) {
        if (qtd < TAMANHO) {
            fila[fim] = conteudo;
            fim = (fim % TAMANHO) + 1;
            qtd++;
            System.out.println("INSERIR\nfim: " + fim + "\ninicio: " + inicio + "\nqtd: " + qtd);
            return true;
        } else {
            return false;
        }
    }

    public static boolean excluirInicio() {
        if (fim < TAMANHO) {
            fila[inicio] = 0;
            inicio = (inicio % TAMANHO) + 1;
            qtd--;
            System.out.println("EXCLUIR\nfim: " + fim + "\ninicio: " + inicio + "\nqtd: " + qtd);
            return true;
        } else {
            return false;
        }
    }
    
    public static int consultarElemento(){
        int elemento = 0;
        elemento = fila[inicio];
    return elemento;
    }


    public static void main(String[] args) {
        int menu = 1;

        while (menu > 0 && menu < 11) {

            menu = Integer.parseInt(JOptionPane.showInputDialog("MENU\n"
                    + "\n1 - Incluir no fim da fila."
                    + "\n2 - Excluir do inicio da fila."
                    + "\n3 - Contar número de elementos"
                    + "\n4 - Listar."
                    + "\n5 - Consultar elemento no início da fila."
                    + ""));

            switch (menu) {
                case 1:
                    int conteudo = Integer.parseInt(JOptionPane.showInputDialog("Qual número você deseja inserir?"));
                    if (inserirFim(conteudo) == false) {
                        JOptionPane.showMessageDialog(null, "Não foi possível realizar a operação.");
                    }
                    break;
                case 2:
                    if (excluirInicio() == false) {
                        JOptionPane.showMessageDialog(null, "Não foi possível realizar a operação.");
                    }
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Número de elementos na fila: " + qtd);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, listar());
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Elemento no início da fila: " + consultarElemento());
                    break;
            }
        }
    }

}
