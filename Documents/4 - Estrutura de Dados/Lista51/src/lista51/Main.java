package lista51;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int menu = 1;
        Lista l = new Lista();

        while (menu > 0 && menu < 11) {

            menu = Integer.parseInt(JOptionPane.showInputDialog("MENU\n"
                    + "\n1 - Listar"
                    + "\n2 - Inserir no Início"
                    + "\n3 - Remover do início"
                    + "\n4 - Inserir no Fim"
                    + "\n5 - Remover do Fim"
                    + "\n6 - Inserir na posição específica"
                    + "\n7 - Remover da posição específica"
                    + "\n8 - Encontrar pessoa pelo nome"
                    + "\n9 - Mostrar ultimo nó incluido"));

            switch (menu) {
                case 1:{
                    JOptionPane.showMessageDialog(null, l.listar());
                }break;
                case 2:{
                    String nome = JOptionPane.showInputDialog("Insira o nome: ");
                    int idade = Integer.parseInt(JOptionPane.showInputDialog("Insira a idade: "));
                    l.inserirInicio(nome, idade);
                }break;
                case 3:{
                    l.removerInicio();
                }break;
                case 4:{
                    String nome = JOptionPane.showInputDialog("Insira o nome: ");
                    int idade = Integer.parseInt(JOptionPane.showInputDialog("Insira a idade: "));
                    l.inserirFim(nome, idade);
                }break;
                case 5:{
                    l.removerFim();
                }break;
                case 6:{
                    String nome = JOptionPane.showInputDialog("Insira o nome: ");
                    int idade = Integer.parseInt(JOptionPane.showInputDialog("Insira a idade: "));
                    int posicao = Integer.parseInt(JOptionPane.showInputDialog("Insira a posição onde deseja inserir: "));
                    l.inserirPosicao(nome, idade, posicao);
                }break;
                case 7:{
                    int posicao = Integer.parseInt(JOptionPane.showInputDialog("Insira a posição onde deseja remover: "));
                    l.removerPosicao(posicao);
                }break;
                case 8:{
                    String nome = JOptionPane.showInputDialog("Insira o nome da pessoa que deseja encontrar: ");
                    JOptionPane.showMessageDialog(null, l.encontrarPessoa(nome));
                }break;
                case 9:{
                    JOptionPane.showMessageDialog(null, l.ultimo());
                }break;
                
            }
        }
    }
}