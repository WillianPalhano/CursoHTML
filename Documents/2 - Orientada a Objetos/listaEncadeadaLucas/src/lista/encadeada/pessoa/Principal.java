package lista.encadeada.pessoa;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lista lista = new Lista();

		int opc = -1;
		int posicao;
		while (opc != 0) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Ecolha a op��o desejada\n" 
																+ "1 - Inserir no in�cio\n"
																+ "2 - Inserir no fim\n"
																+ "3 - Inserir Posic�o Espec�fica\n" 
																+ "4 - listar\n"
																+ "5 - Exibir a quantidade de elementos\n"
																+ "6 - Excluir posi��o especifica\n"
																+ "0 - sair"));
			switch (opc) {
				case 1: {
					String nome = JOptionPane.showInputDialog("Digite um nome");
					String sexo = JOptionPane.showInputDialog("Digite o sexo");
					int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
					Pessoa pessoa = new Pessoa(nome, sexo, idade);
					lista.inserirInicio(new No(pessoa)); // cria um novo N�
					break;
				}
				case 2:{
					String nome = JOptionPane.showInputDialog("Digite um nome");
					String sexo = JOptionPane.showInputDialog("Digite o sexo");
					int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
					Pessoa pessoa = new Pessoa(nome, sexo, idade);
					lista.inserirFim(new No(pessoa)); // criar um novo N�
					break;
				}
				case 3:{
					String nome = JOptionPane.showInputDialog("Digite um nome");
					String sexo = JOptionPane.showInputDialog("Digite o sexo");
					int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
					Pessoa pessoa = new Pessoa(nome, sexo, idade);
					posicao = Integer.parseInt(JOptionPane.showInputDialog("Digite uma posic�o"));
					lista.inserirPosicao(new No(pessoa), posicao);
					break;
				}
				case 4:{
					lista.listar();
					break;
				}
				case 5:{
					JOptionPane.showMessageDialog(null, "Quantidade de elementos: " + lista.contarNos());
					break;
				}
				case 6:{
					if(lista.contarNos() == 0){
						JOptionPane.showMessageDialog(null, "Lista Vazia!");
					}else{
						posicao = Integer.parseInt(JOptionPane.showInputDialog("Digite a posi��o para remover"));
						JOptionPane.showMessageDialog(null, lista.excluirNo(posicao));
					}
				}
			}
		}

	}

}
