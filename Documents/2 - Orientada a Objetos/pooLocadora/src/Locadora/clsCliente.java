package Locadora;

import javax.swing.JOptionPane;

public class clsCliente {

    private String nome;
    private int cnh;
    private int idade;
    private String endereco;
    private String nacionalidade;

    public clsCliente(String nome, int cnh, int idade, String endereco, String nacionalidade) {
        this.nome = nome;
        this.cnh = cnh;
        this.idade = idade;
        this.endereco = endereco;
        setNacionalidade(nacionalidade);

    }

    public void status(String placa, String renavan, int carro, int dias) {
        clsAutomovel alugar = new clsAutomovel(placa, renavan, carro, dias);
        
        JOptionPane.showMessageDialog(null, "Cliente\n\nNome: " + this.nome
                + "\nCNH: " + this.cnh
                + "\nDocumento: " + this.nacionalidade
                + "\nIdade: " + this.idade
                + "\nEndereço: " + this.endereco
                + alugar.status(dias));
    }

    public void setNacionalidade(String nacionalidade) {
        switch (nacionalidade) {
            case "1":
                clsNacional nacion2 = new clsNacional(JOptionPane.showInputDialog("Qual o número do CPF?"));
                this.nacionalidade = nacion2.getCPF();
                break;
            case "2":
                clsEstrangeiro nacion1 = new clsEstrangeiro(JOptionPane.showInputDialog("Qual o número do passaporte?"));
                this.nacionalidade = nacion1.getPassaporte();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção incorreta! tente novamente.");
                setNacionalidade(nacionalidade);
                break;
        }
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCnh() {
        return cnh;
    }

    public void setCnh(int cnh) {
        this.cnh = cnh;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
