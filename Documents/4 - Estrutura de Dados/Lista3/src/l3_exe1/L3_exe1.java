package l3_exe1;

import javax.swing.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class L3_exe1 {

    static final int TAMANHO = 100;
    static int[] lista = new int[TAMANHO];
    static int i = 0;
    static int chave;
    static double inicio, fim;
    static String resultado = "";
    static int meio = 0;

    public static double dataAtual() {
        Date tempo = new Date();
        SimpleDateFormat BR = new SimpleDateFormat("ss.SS");
        double tempoAtual = Double.parseDouble(BR.format(tempo));
        return tempoAtual;
    }

    public static String resultadoCronometro() {
        resultado = "O tempo desta pesquisa foi de: ";
        double result = fim - inicio;
        resultado += "" + result + " milisegundos.";
        return resultado;
    }

    public static void incluir() {
        for (int i = 0; i < (TAMANHO); i++) {
            int x = (int) ((Math.random() * 90) + 10);// Gera números inteiro de 10 até 99
            lista[i] = x;
        }
    }

    public static String listar() {
        String conteudoLista = "Lista:\n" + lista[0] + "  ";
        for (int i = 1; i < TAMANHO; i++) {
            if ((i % 50) == 0 || (i % 25) == 0) {
                conteudoLista += "\n";
            } else {
                conteudoLista += lista[i] + "  ";
            }
        }
        return conteudoLista;
    }

    public static boolean pesquisa() {
        inicio = dataAtual();
        i = 0;
        while (i < TAMANHO && lista[i] != chave) {
            i++;
        }
        fim = dataAtual();
        System.out.println(resultadoCronometro());
        if (i == TAMANHO) {
            return false;
        } else {
            return true;
        }

    }

    public static boolean pesquisaRapida() {
        inicio = dataAtual();
        i = 0;
        while (lista[i] != chave) {
            i++;
        }
        fim = dataAtual();
        System.out.println(resultadoCronometro());
        if (i == TAMANHO) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean pesquisaRapidassa() {
        inicio = dataAtual();
        i = 0;
        while (lista[i] != chave) {
            if (lista[i + 1] != chave) {
                i = i + 2;
            } else {
                i++;
            }
        }
        fim = dataAtual();
        System.out.println(resultadoCronometro());
        if (i == TAMANHO) {
            return false;
        } else {
            return true;
        }
    }

    public static void pesquisaOrdenada() { //boolean
        /*
        lista[TAMANHO - 1] = Integer.MAX_VALUE;
        inicio = dataAtual();
        i = 0;
        while(lista[i] < chave){
            i++;
        }
        fim = dataAtual();
        System.out.println(resultadoCronometro());
        if (lista[i] > chave) {
            return false;
        } else {
            return true;
        }
         */
    }

    private static boolean pesquisaBinInterativa() {
        int comeco = 0;
        int fin = TAMANHO;
        meio = 0;
        inicio = dataAtual();
        while (comeco <= fin) {
            meio = ((comeco + fin) / 2) + 1;
            if (chave < lista[meio]) {
                fin = meio - 1;
            } else if (chave > lista[meio]) {
                comeco = meio + 1;
            } else {
                comeco = fin + 1;
            }
        }

        fim = dataAtual();
        System.out.println(resultadoCronometro());
        if (chave != lista[meio]) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {

        int menu = 1;

        while (menu > 0 && menu < 10) {

            menu = Integer.parseInt(JOptionPane.showInputDialog("MENU\n\n"
                    + "1 – Incluir\n"
                    + "2 – Listar\n"
                    + "4 – Pesquisa\n"
                    + "5 – Pesquisa Rápida\n"
                    + "6 – Pesquisa Mais Rápida\n"
                    + "7 – Pesquisa Ordenada\n"
                    + "8 – Pesquisa Binária Iterativa\n"
                    + "9 – Pesquisa Binária Recursiva\n"
                    + "0 – Sair."));

            switch (menu) {
                case 1:
                    incluir();
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, listar());
                    break;
                case 4:
                    chave = Integer.parseInt(JOptionPane.showInputDialog("PESQUISA LENTA OU SÓ PESQUISA MSM\nInsira o valor que deseja procurar: "));
                    if (pesquisa() == false) {
                        JOptionPane.showMessageDialog(null, "Não foi possível encontrar a localização do valor.");
                    } else {
                        JOptionPane.showMessageDialog(null, "O valor foi encontrado na posição " + i + " do vetor.");
                    }
                    break;
                case 5:
                    chave = Integer.parseInt(JOptionPane.showInputDialog("PESQUISA RAPIDA\nInsira o valor que deseja procurar: "));
                    if (pesquisaRapida() == false) {
                        JOptionPane.showMessageDialog(null, "Não foi possível encontrar a localização do valor.");
                    } else {
                        JOptionPane.showMessageDialog(null, "O valor foi encontrado na posição " + i + " do vetor.");
                    }
                    break;
                case 6:
                    chave = Integer.parseInt(JOptionPane.showInputDialog("PESQUSA RAPIDASSA\nInsira o valor que deseja procurar: "));
                    if (pesquisaRapidassa() == false) {
                        JOptionPane.showMessageDialog(null, "Não foi possível encontrar a localização do valor.");
                    } else {
                        JOptionPane.showMessageDialog(null, "O valor foi encontrado na posição " + i + " do vetor.");
                    }
                    break;
                case 7:
                    System.out.println("EM MANUTENÇÃO");
                    /*
                    chave = Integer.parseInt(JOptionPane.showInputDialog("PESQUSA ORDENADA\nInsira o valor que deseja procurar: "));
                    if (pesquisaOrdenada() == false) {
                        JOptionPane.showMessageDialog(null, "Não foi possível encontrar a localização do valor.");
                    } else {
                        JOptionPane.showMessageDialog(null, "O valor foi encontrado na posição " + i + " do vetor.");
                    }
                     */
                    break;
                case 8:
                    chave = Integer.parseInt(JOptionPane.showInputDialog("PESQUSA RAPIDASSA\nInsira o valor que deseja procurar: "));
                    if (pesquisaBinInterativa() == false) {
                        JOptionPane.showMessageDialog(null, "Não foi possível encontrar a localização do valor.");
                    } else {
                        JOptionPane.showMessageDialog(null, "O valor foi encontrado na posição " + meio + " do vetor.");
                    }

                    break;
                case 9:
                    break;

            }
        }
    }

}
