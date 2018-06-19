package poomaternidade;

import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.JOptionPane;

public class PooMaternidade {

    public static void main(String[] args) {
        ArrayList<clsMae> maess = new ArrayList<clsMae>();
        clsMae[] maes = new clsMae[10];
        clsRecemNascido[] bebes = new clsRecemNascido[10];
        String[] pacientes = new String[20];
        int menu = 1;
        int m = 0;
        int b = 0;

        while (menu > 0 && menu < 11) {

            menu = Integer.parseInt(JOptionPane.showInputDialog("MENU\n\n"
                    + "1 - Cadastrar novo paciente.\n"
                    + "2 - Exibir Pacientes"
                    + "3 - Pesquisar pacientes por data de nascimento."));

            switch (menu) {
                case 1:
                    menu = Integer.parseInt(JOptionPane.showInputDialog("Cadastro de paciente\n"
                            + "qual o tipo de paciente?\n"
                            + "1 - Mãe.\n"
                            + "2 - Recém nascido."
                    ));
                    if (menu == 1) {
                        //maess.add();
                        int semana = Integer.parseInt(JOptionPane.showInputDialog("Qual semana de gestação a mãe está?"));
                        String nome = JOptionPane.showInputDialog("Qual o nome da mãe?");
                        String sangue = JOptionPane.showInputDialog("Qual o tipo sanguíneo da mãe?");
                        String convenio = JOptionPane.showInputDialog("Tem convênio? se sim, qual?");
                        int ano = Integer.parseInt(JOptionPane.showInputDialog("Qual o ano de nacimento?(yyyy)"));
                        int mes = Integer.parseInt(JOptionPane.showInputDialog("Qual o mes de nacimento?(mm)"));
                        int dia = Integer.parseInt(JOptionPane.showInputDialog("Qual o dia de nacimento?(dd)"));
                        maes[m] = new clsMae(semana, nome, sangue, convenio, ano, mes, dia);
                        m++;
                    }
                    if (menu == 2) {
                        double altura = Double.parseDouble(JOptionPane.showInputDialog("Qual a altura do bebe?"));
                        double peso = Double.parseDouble(JOptionPane.showInputDialog("Qual o peso do bebe?"));
                        String sexo = JOptionPane.showInputDialog("Qual o sexo do bebe?");
                        String saude = JOptionPane.showInputDialog("Qual o estado de saúde do bebe?");
                        String nome = JOptionPane.showInputDialog("Qual o nome do bebe?");
                        String sangue = JOptionPane.showInputDialog("Qual o tipo sanguíneo do bebe?");
                        String convenio = JOptionPane.showInputDialog("Tem convênio? se sim, qual?");
                        int ano = Integer.parseInt(JOptionPane.showInputDialog("Qual o ano de nacimento?(yyyy)"));
                        int mes = Integer.parseInt(JOptionPane.showInputDialog("Qual o mes de nacimento?(mm)"));
                        int dia = Integer.parseInt(JOptionPane.showInputDialog("Qual o dia de nacimento?(dd)"));
                        bebes[b] = new clsRecemNascido(altura, peso, sexo, saude, nome, sangue, convenio, ano, mes, dia); 
                        b++;
                    }
                    break;
                case 2:
                    String status = "";
                    for (int i = 0; i < m; i++) {
                        status = status + "\n\n" + maes[i].status();
                    }
                    for (int i = 0; i < m; i++) {
                        status = status + "\n\n" + bebes[i].status();
                    }
                    JOptionPane.showMessageDialog(null, status);
                    break;
                case 3:
                    Calendar nascimento = Calendar.getInstance();
                    SimpleDateFormat dma = new SimpleDateFormat("dd/MM/yyyy");
                    nascimento.set(Calendar.YEAR, Integer.parseInt(JOptionPane.showInputDialog("Qual o ano de nacimento?(yyyy)")));
                    nascimento.set(Calendar.MONTH, Integer.parseInt(JOptionPane.showInputDialog("Qual o mês de nacimento?(mm)")));
                    nascimento.set(Calendar.DAY_OF_MONTH, Integer.parseInt(JOptionPane.showInputDialog("Qual o dia de nacimento?(dd)")));
                    dma.format(nascimento);
                    String resultadoNasc = "";
                    for (int i = 0; i < m; i++) {
                        if (maes[i].getNascimento() == nascimento) {
                            resultadoNasc = resultadoNasc + "\n\n" + maes[i].status();
                        }
                    }
                    for (int i = 0; i < m; i++) {
                        if (bebes[i].getNascimento() == nascimento) {
                            resultadoNasc = resultadoNasc + "\n\n" + bebes[i].status();
                        }
                    }
                    break;
            }
        }
    }
}
