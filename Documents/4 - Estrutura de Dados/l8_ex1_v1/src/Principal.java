
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        Lista lst = new Lista();

        //Menu para controle da lista
        int opcao = -1;
        while (opcao != 10) {
            //Monta o menu de opcoes
            opcao = Integer.parseInt(JOptionPane.showInputDialog("1 - Inserir Inicio  \n2 - Inserir K\n"
                    + "3 - Inserir Fim  	  \n4 - Remover Inicio\n"
                    + "5 - Remover K		  \n6 - Remover Fim\n"
                    + "7 - Pesquisar              \n8 - Listar\n"
                    + "9- Listar Endereços        \n10 - Sair"));
            switch (opcao) {
                case 1: {
                    int dado = Integer.parseInt(JOptionPane.showInputDialog("Digite o dado"));
                    lst.inserirInicio(dado);
                    break;
                }
                case 2: {
                    int dado = Integer.parseInt(JOptionPane.showInputDialog("Digite o dado"));
                    int k = Integer.parseInt(JOptionPane.showInputDialog("Digite posicao K a ser inserida"));
                    lst.inserirK(dado, k);
                    break;
                }
                case 3: {
                    int dado = Integer.parseInt(JOptionPane.showInputDialog("Digite o dado"));
                    lst.inserirFim(dado);
                    break;
                }
                case 4: {
                    lst.removerInicio();
                    break;
                }
                case 5: {
                    int k = Integer.parseInt(JOptionPane.showInputDialog("Digite posicao K a ser removida"));
                    lst.removerK(k);
                    break;
                }
                case 6:
                    lst.removerFim();
                    break;
                case 7: {
                    int chave = Integer.parseInt(JOptionPane.showInputDialog("Digite posicao a ser consultado"));
                    if (lst.pesquisar(chave) != true) {

                    }
                    break;
                }
                case 8: {
                    lst.listar();
                    break;
                }
                case 9: {
                    lst.listarEndereco();
                    break;
                }

                default:
                    break;
            }
        }//Fim While
    }
}
