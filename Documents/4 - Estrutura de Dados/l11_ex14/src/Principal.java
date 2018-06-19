
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        Arvore ipe = new Arvore();

        //Menu para controle da lista
        int opcao = -1;
        while (opcao != 99) {
            //Monta o menu de opcoes
            opcao = Integer.parseInt(JOptionPane.showInputDialog(">>> Árvore Binária <<<"
                    + "\n1 - Inserir   	  "
                    + "\n2 - Pre Ordem ED"
                    + "\n3 - Pre Ordem String ED"
                    + "\n4 - Mostrar as folhas"
                    + "\n99 - Sair"));
            switch (opcao) {
                case 1: {
                    int dado = Integer.parseInt(JOptionPane.showInputDialog("Digite o dado"));
                    ipe.setRaiz(ipe.inserir(ipe.getRaiz(), dado));
                    break;
                }
                case 2: {
                    ipe.preOrdemED(ipe.getRaiz());
                    break;
                }
                case 3: {
                    JOptionPane.showMessageDialog(null, " Dado:" + ipe.preOrdemEDString(ipe.getRaiz()));
                    break;
                }
                case 13: {
                    ipe.setRaiz(ipe.inserir(ipe.getRaiz(), 50));
                    ipe.setRaiz(ipe.inserir(ipe.getRaiz(), 30));
                    ipe.setRaiz(ipe.inserir(ipe.getRaiz(), 70));
                    ipe.setRaiz(ipe.inserir(ipe.getRaiz(), 20));
                    ipe.setRaiz(ipe.inserir(ipe.getRaiz(), 40));
                    ipe.setRaiz(ipe.inserir(ipe.getRaiz(), 60));
                    ipe.setRaiz(ipe.inserir(ipe.getRaiz(), 80));
                    System.out.println("INSERIDO COM SUCESSO");
                    break;
                }
                case 4:{
                    ipe.folha(ipe.getRaiz());
                    break;}
                case 5:{
                    No no1 = new No(Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do nó 1: ")));
                    No no2 = new No(Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do nó 2: ")));
                    ipe.irmaos(ipe.getRaiz(), no1, no2);
                    break;}
                default:
                    break;
            }
        }//Fim While
    }
}
