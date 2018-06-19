import javax.swing.*;

public class questoes345 {
    
    static class cadastro{
        String nome;
        double salarioBruto;
        double salarioLiquido;
        double descontoAcrecimo;
        double horas;
        double valorHora;
    }
    
    public static void main(String args[]) {
        int questao = 3;
        while(questao >2 && questao <6){
            questao = Integer.parseInt(JOptionPane.showInputDialog("Qual é a questão?\n\n" +
                                                                   "3. Peça para o usuário digitar: Nome, salário bruto e o percentual de desconto de um funcionário qualquer.\n"
                                                                 + "Após, imprima no vídeo o nome digitado, salário bruto e o salário líquido.​\n\n"
                                                                 + "4. Peça para o usuário digitar: Nome, salário bruto e o percentual de acréscimo de um funcionário qualquer.\n"
                                                                 + "Após, imprima no vídeo o nome digitado, salário bruto e o salário líquido.\n\n"
                                                                 + "5. Peça para o usuário digitar: Nome, quantidade de horas trabalhadas, o valor pago pôr hora de trabalho e\n"
                                                                 + "o percentual de desconto de um funcionário qualquer. Após, imprima no vídeo o nome digitado, salário bruto e o salário líquido"));
            switch(questao){
                case 3: 
                    cadastro resultado3 = new cadastro();

                    resultado3.nome = JOptionPane.showInputDialog("Insira seu nome: ");
                    resultado3.salarioBruto = Integer.parseInt(JOptionPane.showInputDialog("Insira seu salario: "));
                    resultado3.descontoAcrecimo = Double.parseDouble(JOptionPane.showInputDialog("Insira o percentual de desconto: "));


                    double apoio3 = resultado3.salarioBruto * resultado3.descontoAcrecimo;
                    double precoDesconto3 = apoio3 / 100;
                    resultado3.salarioLiquido = resultado3.salarioBruto - precoDesconto3;

                    JOptionPane.showMessageDialog(null, "Nome: " + resultado3.nome + "\n" +
                                                 "Salário Bruto: " + resultado3.salarioBruto + "\n" +
                                                 "Salário Líquido: " + resultado3.salarioLiquido);
                break;
                case 4: 
                    cadastro resultado4 = new cadastro();

                    resultado4.nome = JOptionPane.showInputDialog("Insira seu nome: ");
                    resultado4.salarioBruto = Integer.parseInt(JOptionPane.showInputDialog("Insira seu salario: "));
                    resultado4.descontoAcrecimo = Double.parseDouble(JOptionPane.showInputDialog("Insira o percentual de Acrécimo: "));


                    double apoio4 = resultado4.salarioBruto * resultado4.descontoAcrecimo;
                    double precoAcrecimo4 = apoio4 / 100;
                    resultado4.salarioLiquido = resultado4.salarioBruto + precoAcrecimo4;

                    JOptionPane.showMessageDialog(null, "Nome: " + resultado4.nome + "\n" +
                                                 "Salário Bruto: " + resultado4.salarioBruto + "\n" +
                                                 "Salário Líquido: " + resultado4.salarioLiquido);
                break;
                case 5:
                    cadastro resultado5 = new cadastro();

                    resultado5.nome = JOptionPane.showInputDialog("Insira seu nome: ");
                    resultado5.horas = Double.parseDouble(JOptionPane.showInputDialog("Insira a quantidade de horas trabalhadas: "));
                    resultado5.valorHora = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor das horas trabalhadas: "));
                    resultado5.descontoAcrecimo = Double.parseDouble(JOptionPane.showInputDialog("Insira o percentual de desconto: "));
                    
                    resultado5.salarioBruto = resultado5.valorHora * resultado5.horas;

                    double apoio5 = resultado5.salarioBruto * resultado5.descontoAcrecimo;
                    double precoDesconto5 = apoio5 / 100;
                    resultado5.salarioLiquido = resultado5.salarioBruto - precoDesconto5;

                    JOptionPane.showMessageDialog(null, "Nome: " + resultado5.nome + "\n" +
                                                 "Salário Bruto: " + resultado5.salarioBruto + "\n" +
                                                 "Salário Líquido: " + resultado5.salarioLiquido);
                break;
                default:break;
            }
        }
    }
}