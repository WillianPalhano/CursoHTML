package Locadora;

import javax.swing.*;

public class clsNacional {
    private String CPF;

    public clsNacional(String cpf){
        setCPF(cpf);
    }
    
    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
}
