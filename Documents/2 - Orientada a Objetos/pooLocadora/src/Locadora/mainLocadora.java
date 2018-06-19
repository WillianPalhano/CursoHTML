package Locadora;

import javax.swing.JOptionPane;

public class mainLocadora {

    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Qual o nome do cliente?");
        int cnh = Integer.parseInt(JOptionPane.showInputDialog("Qual a CNH do cliente?"));
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a idade do cliente?"));
        String endereco = JOptionPane.showInputDialog("Qual o endereço do cliente?");
        String nacionalidade = JOptionPane.showInputDialog("Qual a nacionalidade do cliente?\n"
                + "1 - Brasileiro\n"
                + "2 - Estrangeiro\n");
        clsCliente cliente = new clsCliente(nome, cnh, idade, endereco, nacionalidade);
        
        String placa = JOptionPane.showInputDialog("Insira a Placa do veículo: ");
        String renavan = JOptionPane.showInputDialog("Insira o renavan do veículo: ");
        int carro = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual tipo de carro você deseja alugar?\n"
                + "1 - Popular\n"
                + "2 - SUV\n"
                + "3 - Utilitário\n"));
        int dias = Integer.parseInt(JOptionPane.showInputDialog("Insira o número de dias que o veículo deve ficar alugado: "));
        cliente.status(placa, renavan, carro, dias);
    }
}
