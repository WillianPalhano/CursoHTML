import javax.swing.*;

public class questoes678 {

    public static void main(String args[]) {
        String nome = "";
        double notas[] = new double[3];
        double media = 0;
        int menu = 6;

        while (menu > 5 && menu < 9) {

            menu = Integer.parseInt(JOptionPane.showInputDialog("Selecione a questão: "
                    + "6. Dado nome e as três (3) notas de um aluno imprima: Nome e a média deste aluno.​\n" 
                    + "7.Dado nome e as três (3) notas de um aluno, onde as notas tem os respectivos pesos: 1, 2 e 3, "
                    + "imprima o nome e a média do aluno."
                    + "8. Dado nome, as três (3) notas de um aluno, e o peso de cada uma das notas, "
                    + "imprima o nome e a média do aluno."));

            switch (menu) {
                case 6:
                    nome = JOptionPane.showInputDialog("Insira o nome do aluno: ");
                    double somatoria = 0;
                    for (int i = 0; i < 3; i++) {
                        notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota " + (i + 1) + ": "));
                        somatoria += notas[i];
                    }
                    media = somatoria / 3;
                    JOptionPane.showMessageDialog(null, "Aluno: " + nome
                            + "\nMédia: " + media);
                    break;
                case 7:
                    nome = JOptionPane.showInputDialog("Insira o nome do aluno: ");
                    for (int i = 0; i < 3; i++) {
                        notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota " + (i + 1) + ": "));
                    }
                    media = ((notas[0] * 1) + (notas[1] * 2) + (notas[2] * 3)) / (1+2+3);
                    JOptionPane.showMessageDialog(null, "Aluno: " + nome
                            + "\nMédia: " + media);
                    break;
                case 8:
                    nome = JOptionPane.showInputDialog("Insira o nome do aluno: ");
                    double peso[] = new double[3];
                    for (int i = 0; i < 3; i++) {
                        notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota " + (i + 1) + ": "));
                        peso[i] = Double.parseDouble(JOptionPane.showInputDialog("Insira o peso da nota " + (i + 1) + ": "));
                    }
                    media = (((notas[0] * peso[0]) + (notas[1] * peso[1]) + (notas[2] * peso[2])) / (peso[0] + peso[1] + peso[2]));
                    JOptionPane.showMessageDialog(null, "Aluno: " + nome
                            + "\nMédia: " + media);
                    break;
            }
        }
        
    }
}