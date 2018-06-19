import javax.swing.*;

public class pooFahrenheit {
    static double FAHRENHEIT, CELSIUS;
    
    public static double fahParaCel(){
        FAHRENHEIT = Double.parseDouble(JOptionPane.showInputDialog("Insira a temperatura em Fahrenheit: "));
        double celsius = ((FAHRENHEIT - 32) * 5 ) / 9;
        return celsius;
    }
    
        public static double celParaFah(){
        CELSIUS = Double.parseDouble(JOptionPane.showInputDialog("Insira a temperatura em Celsius: "));
        double fahrenheit = ((CELSIUS* 9 )/5) + 32;
        return fahrenheit;
    }

    public static void main(String args[]) {
        double resultado = 0;
        int menu = 1;

        while (menu > 0 && menu < 3) {

            menu = Integer.parseInt(JOptionPane.showInputDialog("Selecione qual conversão você deseja fazer:\n\n"
                    + "1 - Fahrenheit para Celsius.\n"
                    + "2 - Celsius para Fahrenheit.\n"
                    + "3 - Sair."));

            switch (menu) {
                case 1:
                    resultado = fahParaCel();
                    JOptionPane.showMessageDialog(null, FAHRENHEIT + "°F são "+ resultado+ "°C");
                    break;
                case 2:
                    
                    resultado = celParaFah();
                    JOptionPane.showMessageDialog(null, CELSIUS + "°C são "+ resultado+ "°F");
                    break;
            }
        }
    }
}