import javax.swing.*;

public class pooNomeMediaPeso {
    
    public static void main(String args[]) {
        String nome = JOptionPane.showInputDialog("Insira o nome do aluno: ");
        double notas[] = new double[3];
        double peso[] = new double[3];
        double media = 0;
        for(int i = 0; i<3; i++){
            notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota " + (i+1) +": "));
            peso[i] = Double.parseDouble(JOptionPane.showInputDialog("Insira o peso da nota " + (i+1) +": "));
        }
        media = (((notas[0] * peso[0])+(notas[1] * peso[1])+(notas[2] * peso[2]))/(peso[0]+peso[1]+peso[2]));
        JOptionPane.showMessageDialog(null, "Aluno: " + nome +
                                            "\nMédia: " + media);
    }
}