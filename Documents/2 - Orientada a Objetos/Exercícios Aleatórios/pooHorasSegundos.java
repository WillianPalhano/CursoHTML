import javax.swing.*;

public class pooHorasSegundos {
    static double VALOR[] = new double[3];
    
    public static double segundos(){
        double minutos = (VALOR[0] * 60) + VALOR[1];
        double segundos = (minutos * 60) + VALOR[2];
    return segundos;
    }

    public static void main(String args[]){

        VALOR[0] = Double.parseDouble(JOptionPane.showInputDialog(null,"Insira a hora: "));
        VALOR[1] = Double.parseDouble(JOptionPane.showInputDialog(null,"Insira o minuto: "));
        VALOR[2] = Double.parseDouble(JOptionPane.showInputDialog(null,"Insira o segundo: "));
        
        double resultado = segundos();
        JOptionPane.showMessageDialog(null, "Segundos: " + resultado);
    }
}