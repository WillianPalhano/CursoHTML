import javax.swing.*;

public class pooNomeMedia {
    
    public static void main(String args[]) {
        String nome = JOptionPane.showInputDialog("Insira o nome do aluno: ");
        double notas[] = new double[3];
        double somatoria = 0;
        double media = 0;
        for(int i = 0; i<3; i++){
            notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota " + (i+1) +": "));
            somatoria += notas[i];
        }
        media = somatoria / 3;
        JOptionPane.showMessageDialog(null, "Aluno: " + nome +
                                            "\nMédia: " + media);
    }
}