package Locadora;

import javax.swing.*;

public class clsAutomovel {

    private String placa;
    private String renavan;
    private int diasAlugado;
    private double valor;
    private String categoria;

    public clsAutomovel(String p, String r, int menu, int dias) {
        this.placa = p;
        this.renavan = r;
        calculaValorLocacao(menu, dias);
    }

    void calculaValorLocacao(int menu, int dias) {
        boolean multa;
        
        switch(menu){
            case 1:
                clsAutoPopular popular = new clsAutoPopular();
                this.categoria = "Popular";
                popular.setStatus(false);
                multa = popular.getTanque();
                if(multa == false){
                    this.valor = (dias * popular.getPreco()) + 100; 
                }else {
                    this.valor = dias * popular.getPreco();
                }
                break;
            case 2:
                clsAutoSUV SUV = new clsAutoSUV();
                this.categoria = "SUV";
                SUV.setStatus(false);
                multa = SUV.getTanque();
                if(multa == false){
                    this.valor = (dias * SUV.getPreco()) + 100; 
                }else {
                    this.valor = dias * SUV.getPreco();
                }
                break;
            case 3:
                clsAutoUtilitario utilitario = new clsAutoUtilitario();
                this.categoria = "Utilitario";
                utilitario.setStatus(false);
                multa = utilitario.getTanque();
                if(multa == false){
                    this.valor = (dias * utilitario.getPreco()) + 100; 
                }else {
                    this.valor = dias * utilitario.getPreco();
                }
                break;
            default:
                JOptionPane.showMessageDialog(null,"Opção incorreta! tente novamente.");
                calculaValorLocacao(menu, dias);
                break;
        }
    }
    public String status(int dias){
        String status = "\nCategoria do carro: " + this.categoria 
                + "\nPlaca: " + this.placa 
                + "\nRenavan " + this.renavan 
                + "\nDias alugados: " + dias 
                + "\nValor: R$" + this.valor;
        return status;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getRenavan() {
        return renavan;
    }

    public void setRenavan(String renavan) {
        this.renavan = renavan;
    }

    public int getDias() {
        return diasAlugado;
    }

    public void setDias(int dias) {
        this.diasAlugado = dias;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
